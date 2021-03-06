package com.example.demo.bean;

public class Employee {
    private Integer id;
    private String lastName;
    private String email;
    private int gender;
    private int d_id;

    public Employee(Integer id, String lastName, String email, int gender, int d_id) {
        this.id = id;
        this.lastName = lastName;
        this.email = email;
        this.gender = gender;
        this.d_id = d_id;
    }
    public Employee(){

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public int getD_id() {
        return d_id;
    }

    public void setD_id(int d_id) {
        this.d_id = d_id;
    }
}
