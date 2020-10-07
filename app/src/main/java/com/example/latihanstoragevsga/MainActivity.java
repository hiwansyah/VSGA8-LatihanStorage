package com.example.latihanstoragevsga;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    Button internal, external;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        internal = findViewById(R.id.btn_internal);
        external = findViewById(R.id.btn_external);

        internal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toInternal();
            }
        });

        external.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toExternal();
            }
        });
    }


    private void toInternal() {
        Intent intent = new Intent(this, InternalActivity.class);
        startActivity(intent);
    }

    private void toExternal() {
        Intent intent = new Intent(this, ExternalActivity.class);
        startActivity(intent);
    }

}