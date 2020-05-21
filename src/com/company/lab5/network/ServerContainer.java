package com.company.lab5.network;


import com.company.lab5.model.domain.PublicTransport;
import com.company.lab5.network.Request;
import com.company.lab5.network.Response;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ServerContainer {

    private static ExecutorService executorService;
    private static ArrayList<PublicTransport> list = new ArrayList<>();

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
                }  catch (IOException| ClassNotFoundException e) {
                    e.printStackTrace();
                }
            }
        });
    }

    private  static void communicate(ObjectInputStream ois, ObjectOutputStream oos) throws IOException, ClassNotFoundException {


        Request request = (Request) ois.readObject();

        System.out.println(request);

        switch (request.getType()) {
            case ADD: {
                PublicTransport element = (PublicTransport) request.getPayload();
                list.add(element);
                break;
            }
            case GET: {
                Response response = new Response(list);
                oos.writeObject(response);
                oos.flush();
            }
        }


    }
}

