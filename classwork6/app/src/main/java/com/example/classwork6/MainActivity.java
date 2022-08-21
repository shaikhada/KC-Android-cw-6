package com.example.classwork6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
     ArrayList<Students>studentsinfo = new ArrayList<>();
//     int mycounter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        TextView c = findViewById(R.id.textView3);




        Students s1 = new Students("Salman",28,95 ,R.drawable.salman);
        Students s2 = new Students("Hamad",20,97,R.drawable.hamad);
        Students s3 = new Students("Mohamad",24 ,92 ,R.drawable.mohamad);
        Students s4 = new Students("Jawan",20,94 ,R.drawable.jawan);


//        b.setText(s1.getStudentName());
//        c.setText(String.valueOf(s1.getStudentAge()));
//        d.setText(String.valueOf(s1.getStudentgrade()));
//        a.setImageResource(s1.getStudentphoto());

        studentsinfo.add(s1);
        studentsinfo.add(s2);
        studentsinfo.add(s3);
        studentsinfo.add(s4);



        ListView studentlistview = findViewById(R.id.listview);

        Studentsadapter myadapter = new Studentsadapter(this,0 , studentsinfo);

        studentlistview.setAdapter(myadapter);


        studentlistview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Students currentstudents = studentsinfo.get(i);


                Intent studentintent = new Intent(MainActivity.this , DetailsActivity.class);
                studentintent.putExtra("Students" , currentstudents);
                startActivity(studentintent);
            }
        });


//        a.setImageResource(studentsinfo.get(mycounter).getStudentphoto());
//        b.setText(studentsinfo.get(mycounter).getStudentName());
//        c.setText(String.valueOf(studentsinfo.get(mycounter).getStudentAge()));
//        d.setText(String.valueOf(studentsinfo.get(mycounter).getStudentgrade()));
//
//        e.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                mycounter++;
//                if (mycounter == studentsinfo.size()) {
//                    mycounter = 0;
//                }
//
//                a.setImageResource(studentsinfo.get(mycounter).getStudentphoto());
//                b.setText(studentsinfo.get(mycounter).getStudentName());
//                c.setText(String.valueOf(studentsinfo.get(mycounter).getStudentAge()));
//                d.setText(String.valueOf(studentsinfo.get(mycounter).getStudentgrade()));
//
//            }
        };











    }
