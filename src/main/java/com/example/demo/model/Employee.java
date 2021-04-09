package com.example.demo.model;

import com.sun.istack.NotNull;

import javax.persistence.Column;
import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name = "first_name")
    @NotEmpty
    @Size(min=5, max = 34)
    private String firstName;

    @Column(name = "last_name")
    @NotEmpty
    @Size(min=5, max = 34)
    private String lastName;

    @Column(name = "email")
    @NotEmpty
    @Email
    private String email;

    public Employee() {
    }

    public Employee(@NotEmpty @Size(min = 5, max = 34) String firstName, @NotEmpty @Size(min = 5, max = 34) String lastName, @NotEmpty @Email String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
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
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
}