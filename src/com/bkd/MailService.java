package com.bkd;

public class MailService {
    public void sendEmail() {
        connect();
        authenticate();
        // send email
        disconnect();
    };

    private void connect () {
        System.out.println("Connected");
    }

    private void disconnect() {
        System.out.println("Disconnected");
    }

    private void authenticate() {
        System.out.println("Authenticated");
    }
}
