package com.learning.challange;

public class User {
    int id;
    private String firstName, lastName;

    public User() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // public String getRole() {
    //     return role;
    // }

    // public void setRole(String role) {
    //     this.role = role;
    // }

    @Override
    public String toString() {

        StringBuilder builder = new StringBuilder();
        builder.append("[").append("id=").append(id)
                .append(", name=").append(firstName)
                .append(", gender=").append(lastName)
                .append("]");

        return builder.toString();
    }
}
