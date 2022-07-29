package com.googleAPI.google_api.Entity;


import javax.persistence.*;

@Entity
@Table(name = "tbl_users")
public class User {
    @Id
    @Column(name = "pk")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;



    private String email;


    private String username;


    public User()
    {

    }


    public User(int id, String email) {
        this.id = id;
        this.email = email;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }


}