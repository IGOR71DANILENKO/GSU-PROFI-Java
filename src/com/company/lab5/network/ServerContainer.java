package com.company.lab5.network;


import com.company.lab5.model.domain.PublicTransport;
import com.company.lab5.network.Request;
import com.company.lab5.network.Response;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerContainer {

    private static ExecutorService executorService;
    private static CopyOnWriteArrayList<PublicTransport<?>> list = new CopyOnWriteArrayList<>();

    public static void main(String[] args) throws IOException {
        executorService = Executors.newCachedThreadPool();
        ServerSocket serverSocket = new ServerSocket(8080);
        System.out.println("server started");

        while (true) {
            Socket socket = serverSocket.accept();
            System.out.println("new connection opened");
            process(socket);
        }
    }

    private static void process(Socket socket) {
        executorService.submit(new Runnable() {
            @Override
            public void run() {
                try {
                    ObjectInputStream ois = new ObjectInputStream(socket.getInputStream());
                    ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream());

                    System.out.println("ready to communicate");

                    while (true) {
                        communicate(ois, oos);
                    }
                }  catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private static void communicate(ObjectInputStream ois, ObjectOutputStream oos) throws Exception {


        Request request = (Request) ois.readObject();

        System.out.println(request);

        switch (request.getType()) {
            case ADD: {
                PublicTransport<?> element = (PublicTransport<?>) request.getPayload();
                list.add(element);
                oos.flush();
                break;
            }
            case GET: {
                Response response = new Response(new ArrayList<>(list));
                oos.writeObject(response);
                oos.flush();
                break;
            }
            case DELETE: {
                int index = (Integer) request.getPayload();
                list.remove(index);
//                Response response = new Response(null);
//                oos.writeObject(response);
                oos.flush();
                break;
            }
            case UPDATE: {
                UpdatePayload updateData = (UpdatePayload) request.getPayload();
                PublicTransport<?> element = (PublicTransport<?>) updateData.getElement();
                list.set(updateData.getIndex(), element);
                oos.flush();
                break;
            }
        }


    }
}

