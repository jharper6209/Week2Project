package com.techelevator;

public class Department {

//Instance Variables
    private int departmentId;
    private String name;

//Constructors - 2 args
    public Department (int departmentId, String name){
        this.departmentId = departmentId;
        this.name = name;
    }
//Methods


//Getter/Setter
    public int getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(int departmentId) {
        this.departmentId = departmentId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }




}
