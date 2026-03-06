package com.model;

import javax.persistence.*;

@Entity
@Table(name="stu")
public class Student {

    @Id
    private int sno;

    private String sname;

    public int getSno() {
        return sno;
    }

    public void setSno(int sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    @Override
    public String toString() {
        return sno + " " + sname;
    }
}
