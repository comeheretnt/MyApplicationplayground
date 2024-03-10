package com.example.myapplicationplayground;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.ArrayList;

public class DetailsActivity extends AppCompatActivity {
    private EditText tv_detail;
    private Button buttonOk;

    private ArrayList<Integer> arrayList;
    private ArrayAdapter<Integer> arrayAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);
        buttonOk = findViewById(R.id.button);
        tv_detail = findViewById(R.id.tv_detail);
        Intent receivedIntent =getIntent();
        if (receivedIntent != null){
            String data = receivedIntent.getStringExtra("number");
            tv_detail.setText(data);
        }

        buttonOk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String stringok = tv_detail.getText().toString().trim();
                app.buttonOk =stringok;

//                finish();
//                startActivityForResult(intent, buttonOk);

            }

//            protected void onResume(){
//                DetailsActivity.super.onResume();//               tv_detail.setText(app.buttonOk);
//            }
        });
    }

    private void onClickBackToMain(String stringok) {
        Intent intent = new Intent(this, MainActivity.class);
        intent.putExtra("data_result", stringok);
        setResult(RESULT_OK, intent);
        finish();
    }

}