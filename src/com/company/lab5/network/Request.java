package com.company.lab5.network;
import com.company.lab5.network.Type;

import java.io.Serializable;

public class Request implements Serializable {
    private final Type type;
    private final Serializable payload;

    public Request(Type type, Serializable payload) {
        this.type = type;
        this.payload = payload;
    }

    public Type getType() {
        return type;
    }

    public Serializable getPayload() {
        return payload;
    }

    @Override
    public String toString() {
        return  "Request{" +
                "type=" + type +
                ", payload=" + payload +
                '}';
    }
}
