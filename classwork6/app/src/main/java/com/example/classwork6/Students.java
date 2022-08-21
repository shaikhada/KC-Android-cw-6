package com.example.classwork6;

import java.io.Serializable;

public class Students implements Serializable {

    private String studentName;
    private int studentAge;
    private int studentphoto;
    private int studentgrade;

    public Students(String studentName,int studentAge ,int studentgrade ,int studentphoto ){
        this.studentName = studentName;
        this.studentgrade = studentgrade;
        this.studentphoto = studentphoto;
        this.studentAge = studentAge;

    }



    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentAge(int studentAge) {
        this.studentAge = studentAge;
    }

    public void setStudentphoto(int studentphoto) {
        this.studentphoto = studentphoto;
    }

    public void setStudentgrade(int studentgrade) {
        this.studentgrade = studentgrade;
    }

    public String getStudentName() {
        return studentName;
    }

    public int getStudentAge() {
        return studentAge;
    }

    public int getStudentphoto() {
        return studentphoto;
    }

    public int getStudentgrade() {
        return studentgrade;
    }
}
