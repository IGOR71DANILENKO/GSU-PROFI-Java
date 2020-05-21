package com.company.lab5;
import java.awt.*;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.net.Socket;
import java.util.Collection;
import java.util.Collections;

public class NetworkClientContainer<T extends Serializable> {

        private final Socket socket;
        private final ObjectInputStream ois;
        private final ObjectOutputStream oos;

        public NetworkClientContainer(String host, int port) throws IOException {
            socket = new Socket(host, port);
            oos = new ObjectOutputStream(socket.getOutputStream());
            ois = new ObjectInputStream(socket.getInputStream());
        }


        @Override
    public void (T element) {
            Request request = new Request(Type.ADD, element);
            try {
                oos.writeObject(request);
                oos.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        @Override
    public void delete(int index) {

        }

        @Override
    @SuppressWarnings("unchecked");
    public Collection<T> getAll() {
        Request request = new Request(Type.GET, null);

        try {
            oos.writeObject(request);
            oos.flush();
            Response response = (Response) ois.readObject();
            return (Collection<T>) response.getPayload();
            } catch (IOException| ClassNotFoundException e) {
            e.printStackTrace();
            return Collections.emptyList();
        }
    }

}
