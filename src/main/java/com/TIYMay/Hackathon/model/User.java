package com.TIYMay.Hackathon.model;

import javax.persistence.*;
import java.util.List;

/**
 * Created by duhlig on 8/9/17.
 */
@Entity
@Table(name = "users")
public class User {
    private int id;
    private String username;
    private String firstName;
    private String lastName;
    private String password;
    private String email;
    private String phone;
    private Boolean isAdmin;
    private List<User> acquaintances;
    private List<Event> eventsAttending;
    private List<User> incomingRequests;
    private List<User> outgoingRequests;

    public User() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int getId() {
        return id;
    }

    @Column(name = "username")
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Column(name = "firstname")
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @Column(name = "lastname")
    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Column(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Column(name = "email")
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Column(name = "phone")
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Column(name = "isadmin")
    public Boolean getAdmin() {
        return isAdmin;
    }

    public void setAdmin(Boolean admin) {
        isAdmin = admin;
    }

    @ManyToMany(mappedBy = "users")
    public List<User> getAcquaintances() {
        return acquaintances;
    }

    public void setAcquaintances(List<User> acquaintances) {
        this.acquaintances = acquaintances;
    }

    @ManyToMany(mappedBy = "users")
    public List<Event> getEventsAttending() {
        return eventsAttending;
    }

    public void setEventsAttending(List<Event> eventsAttending) {
        this.eventsAttending = eventsAttending;
    }

    @ManyToMany(mappedBy = "users")
    public List<User> getIncomingRequests() {
        return incomingRequests;
    }

    public void setIncomingRequests(List<User> incomingRequests) {
        this.incomingRequests = incomingRequests;
    }

    @ManyToMany(mappedBy = "users")
    public List<User> getOutgoingRequests() {
        return outgoingRequests;
    }

    public void setOutgoingRequests(List<User> outgoingRequests) {
        this.outgoingRequests = outgoingRequests;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;

        User user = (User) o;

        return getId() == user.getId();
    }

    @Override
    public int hashCode() {
        return getId();
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                '}';
    }
}
