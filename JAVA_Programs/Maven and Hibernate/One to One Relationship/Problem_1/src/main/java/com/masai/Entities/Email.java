package com.masai.Entities;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.time.LocalDate;

@Entity
public class Email {

    @Id
    private String mail_id;
    private  String email;
    private LocalDate created_date;
    @OneToOne(cascade = CascadeType.ALL)
    private User user;

    public Email() {
    }

    public Email(String mail_id, String email, LocalDate created_date, User user) {
        this.mail_id = mail_id;
        this.email = email;
        this.created_date = created_date;
        this.user = user;
    }

    public String getMail_id() {
        return mail_id;
    }

    public void setMail_id(String mail_id) {
        this.mail_id = mail_id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getCreated_date() {
        return created_date;
    }

    public void setCreated_date(LocalDate created_date) {
        this.created_date = created_date;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    @Override
    public String toString() {
        return "Email{" +
                "mail_id='" + mail_id + '\'' +
                ", email='" + email + '\'' +
                ", created_date=" + created_date +
                '}';
    }
}
