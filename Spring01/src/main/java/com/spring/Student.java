package com.spring;

public class Student {
    private String ID;
    private String name;
    private String address;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Student(String address, String ID, String name) {
        this.address = address;
        this.ID = ID;
        this.name = name;
    }
    Student(){
        super();
    }

    @Override
    public String toString() {
        return "Student{" +
                "address='" + address + '\'' +
                ", ID='" + ID + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
