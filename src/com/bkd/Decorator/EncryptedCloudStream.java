package com.bkd.Decorator;

// decorator -- adds additional behavior to wrtie()
public class EncryptedCloudStream  implements Stream {
    private Stream stream;

    public EncryptedCloudStream(Stream stream) {
        this.stream = stream;
    }
    @Override
    public void write(String data) {
        String encrypted = encrypt(data);
        stream.write(encrypted);
    }

    private String encrypt(String data) {
        return  "!^%*(&^^%**";
    }
}
