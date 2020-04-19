package com.bkd;

import com.bkd.Decorator.CloudStream;
import com.bkd.Decorator.EncryptedCloudStream;
import com.bkd.Decorator.Stream;
import com.bkd.state.*;

public class Main {

    public static void main(String[] args) {
        storeCreditCard(new EncryptedCloudStream(new CloudStream()));
    }

    public static void storeCreditCard(Stream stream) {
        stream.write("1234-4567-8907-5423");
    }

}
