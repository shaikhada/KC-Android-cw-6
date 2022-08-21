package com.example.classwork6;

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class Studentsadapter extends ArrayAdapter {
    List<Students> studentsList;
    public Studentsadapter(@NonNull Context context, int resource, @NonNull List objects) {
        super(context, resource, objects);
        studentsList = objects;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
       View myview = LayoutInflater.from(getContext()).inflate(R.layout.studentsfile,parent,false);

       Students currentstudent = studentsList.get(position);

        TextView studentname = myview.findViewById(R.id.studentname);
        TextView studentage = myview.findViewById(R.id.studentage);
        TextView studentsgrade = myview.findViewById(R.id.studentgrade);
        ImageView studentImage = myview.findViewById(R.id.imageView2);

        studentname.setText(currentstudent.getStudentName());
        studentage.setText(String.valueOf(currentstudent.getStudentAge()));
        studentsgrade.setText(String.valueOf(currentstudent.getStudentgrade()));
        studentImage.setImageResource(currentstudent.getStudentphoto());


        ImageView deleteimageview = myview.findViewById(R.id.deletebtn);
        deleteimageview.setOnClickListener(new View.OnClickListener() {
            Students removestudent = studentsList.get(position);
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialogbuldier = new AlertDialog.Builder(getContext()).setMessage("do you want to delete this student ")
                        .setTitle( "Are you sure ?").setPositiveButton("delete", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                studentsList.remove(removestudent);
                                notifyDataSetChanged();
                            }
                        }).setNegativeButton("cancel", new DialogInterface.OnClickListener() {
                            @Override
                            public void onClick(DialogInterface dialogInterface, int i) {
                                dialogInterface.dismiss();
                            }
                        });

                dialogbuldier.show();

            }
        });

        return myview;
    }
}
