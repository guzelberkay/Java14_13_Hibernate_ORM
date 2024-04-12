package com.berkayg.pu_Hibernate.entity;

import jakarta.persistence.*;

@Entity
@Table(name="tbluser")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // id yi kendiliğinden artışlı yapar
    Long id;

    String name;
    String surname;
    String email;
    String phone;
    String username;
    String password;

    public User() {
    }

    public User(String name, String surname, String email, String phone, String username, String password) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public User(Long id, String name, String surname, String email, String phone, String username, String password) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.username = username;
        this.password = password;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("User{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", surname='").append(surname).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", phone='").append(phone).append('\'');
        sb.append(", username='").append(username).append('\'');
        sb.append(", password='").append(password).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
