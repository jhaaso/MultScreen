package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Screen2 extends AppCompatActivity
{
    private String name;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_screen2);

        TextView nameTV = this.findViewById(R.id.nameTV);
        //Intent myIntent = this.getIntent();
        //this.name = myIntent.getStringExtra("name");
        //int counter = myIntent.getIntExtra("counter", -1);
        nameTV.setText(MySingleton.name + ": " + MySingleton.counter);
    }

    @Override
    protected void onPause()
    {
        super.onPause();

    }

    @Override
    protected void onStop() {
        super.onStop();
        TextView nameTV = this.findViewById(R.id.nameTV);
        nameTV.setText("WOOT");
    }

    public void onNextScreenButtonPressed(View v)
    {
        Intent i = new Intent(this, Screen3.class);
        //i.putExtra("name", this.name);
        this.startActivity(i);
    }
    {
        private TextView myLabelTV;

        @Override
        protected void onCreate(Bundle savedInstanceState)
        {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_page2);
            this.myLabelTV = this.findViewById(R.id.myLabelTV);
            //int myNumber = this.getIntent().getIntExtra("myNumber", -1);
            this.myLabelTV.setText("" + Core.myNumber);
        }

        public void onGoBackButtonPressed(View v)
        {
            super.onBackPressed();
        }

        @Override
        public void onBackPressed()
        {
            //super.onBackPressed();
            this.myLabelTV.setText("Back button pressed");
            Toast t = Toast.makeText(this, "back pressed", Toast.LENGTH_LONG);
            t.show();
        }
    }
}