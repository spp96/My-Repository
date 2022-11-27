package com.masai.Entities;

import javax.persistence.*;
import java.util.*;

@Entity
public class Collage {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int collageId;
    private String collageName;
    private String collageAddress;
    @OneToMany(cascade =  CascadeType.ALL,mappedBy = "collage")
    private List<Student> students = new ArrayList<Student>();

    public Collage() {
    }

    public Collage(String collageName, String collageAddress, List<Student> students) {
        this.collageName = collageName;
        this.collageAddress = collageAddress;
        this.students = students;
    }

    public int getCollageId() {
        return collageId;
    }

    public void setCollageId(int collageId) {
        this.collageId = collageId;
    }

    public String getCollageName() {
        return collageName;
    }

    public void setCollageName(String collageName) {
        this.collageName = collageName;
    }

    public String getCollageAddress() {
        return collageAddress;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public void setCollageAddress(String collageAddress) {
        this.collageAddress = collageAddress;
    }

    @Override
    public String toString() {
        return "Collage{" +
                "collageId=" + collageId +
                ", collageName='" + collageName + '\'' +
                ", collageAddress='" + collageAddress + '\'' +
                '}';
    }
}
