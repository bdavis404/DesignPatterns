package com.bkd.Decorator;

public class CloudStreamClient {

    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-4567-8907-5423");
    }
}
