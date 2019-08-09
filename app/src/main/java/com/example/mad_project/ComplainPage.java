package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ComplainPage extends AppCompatActivity {

    private Button button;
    private Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complain_page);

        button= (Button) findViewById(R.id.complain_submit);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                viewComplainsPage();
            }
        });

        button1=(Button) findViewById(R.id.cancel2);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ViewFeedBackHomeAgain();
            }
        });

    }

    public  void viewComplainsPage(){
        Intent intent = new Intent(this,View_Complains_Activity.class);
        startActivity(intent);
    }

    public void ViewFeedBackHomeAgain(){
        Intent intent = new Intent(this,FeedBackHomeActivity.class);
        startActivity(intent);
    }
}
