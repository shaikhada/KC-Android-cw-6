package com.example.classwork6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_details);


        Bundle b = getIntent().getExtras();

        TextView text1 = findViewById(R.id.itemtextview);
        TextView text2 = findViewById(R.id.detailstextview);
        TextView text3 = findViewById(R.id.gradetextview);
        ImageView image1 = findViewById(R.id.itemimageview);

        Students deleviredstudent = (Students) b.getSerializable("Students");

        text1.setText(deleviredstudent.getStudentName());
        text2.setText(String.valueOf(deleviredstudent.getStudentAge()));
        text3.setText(String.valueOf(deleviredstudent.getStudentgrade()));
        image1.setImageResource(deleviredstudent.getStudentphoto());

    }
}