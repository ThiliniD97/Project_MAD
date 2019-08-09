package com.example.mad_project;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;

public class Suggestions_page extends AppCompatActivity {


    private static Button buttonS;
    private static TextView textViewS;
    private static RatingBar ratingBars;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions_page);

        RatingBarWorking();
        onButtonClickListener();
    }

    public  void RatingBarWorking(){

        ratingBars=(RatingBar)findViewById(R.id.ratingBar);
        textViewS=findViewById(R.id.text1);


        ratingBars.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float T, boolean b) {

                textViewS.setText(String.valueOf(T));
            }
        });

    }

    public void onButtonClickListener(){

        ratingBars=(RatingBar)findViewById(R.id.ratingBar);
        buttonS=(Button)findViewById(R.id.RsubmitBtn);

        buttonS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Suggestions_page.this,String.valueOf(ratingBars.getRating()),Toast.LENGTH_SHORT).show();
            }
        });


    }

}
