package com.example;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.println("Server socket in ascolto sulla porta 3000");
        ServerSocket ss = new ServerSocket(3000);
        Socket mioSocket = ss.accept();
        BufferedReader in = new BufferedReader(new InputStreamReader(mioSocket.getInputStream()));
        PrintWriter out = new PrintWriter(mioSocket.getOutputStream(), true);

        out.println("Welcome: v1.2");
        String s = in.readLine();
        String stringaTrasformata = s.toUpperCase();
        out.println(stringaTrasformata);
        ss.close();
    }
}