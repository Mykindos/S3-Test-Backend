package me.mykindos.server;

import me.mykindos.server.server.Server;

public class Main {

    private static Server server;
    private static final int PORT = 1337;

    public static void main(String[] args){

        server = new Server(PORT);

    }
}
