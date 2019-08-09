package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class FeedBackHomeActivity extends AppCompatActivity {

    private ImageButton imageButton;
    private ImageButton imageButton1;
    private ImageButton imageButton2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feed_back_home);

        imageButton=findViewById(R.id.BtnSug);
        imageButton1=findViewById(R.id.btnComplan);
        imageButton2=findViewById(R.id.btnContact);

        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start_suggestion_page();

            }
        });


        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start_Complain_page();

            }
        });



        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                start_ContactUs_page();

            }
        });

    }


    public  void start_suggestion_page(){

        Intent intent = new Intent(this,Suggestions_page.class);
        startActivity(intent);

    }



    public  void start_Complain_page(){

        Intent intent = new Intent(this,ComplainPage.class);
        startActivity(intent);

    }


    public  void start_ContactUs_page(){

        Intent intent = new Intent(this,ContactUS.class);
        startActivity(intent);

    }

}
