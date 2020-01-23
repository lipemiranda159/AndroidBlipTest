package com.example.testblip;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import net.take.blipchat.BlipClient;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        BlipClient.openBlipThread(this, "dGVzdGVib3Q2OTo2MTI1MDA4Zi05OTcwLTRiNWYtYTVjNi1lZjYxY2Y4N2IyZmM=");
    }
}
