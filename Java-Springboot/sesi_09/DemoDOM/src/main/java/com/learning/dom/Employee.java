package com.learning.dom;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String location;

    @Override
    public String toString(){
        return "Employee {id="+id+", firstName="+firstName+", lastName="+lastName+", location"+location+"}";
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    public String getLastName(){
        return lastName;
    }
    
    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
}
