package com.Grappler.enhancement.Entity;

import jakarta.persistence.*;

import java.util.List;
@Entity
public class User_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false )
    private String name;
    @Column(nullable = false )
    private String password;
    @Column(nullable = false )
    private String email;
    @Column(nullable = false)
    private String phoneNo;
    @ManyToMany
    private List<Notification_Entity> listOfNotifications;
    @ManyToMany
    private List<Alert_Entity> listOfAlerts;
    @ManyToMany
    private List<Ticket_Entity> listOfTickets;

    public User_Entity(Long id, String name, String password, String email, String phoneNo, List<Notification_Entity> listOfNotifications, List<Alert_Entity> listOfAlerts, List<Ticket_Entity> listOfTickets) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.email = email;
        this.phoneNo = phoneNo;
        this.listOfNotifications = listOfNotifications;
        this.listOfAlerts = listOfAlerts;
        this.listOfTickets = listOfTickets;
    }

    public User_Entity() {
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public List<Notification_Entity> getListOfNotifications() {
        return listOfNotifications;
    }

    public void setListOfNotifications(List<Notification_Entity> listOfNotifications) {
        this.listOfNotifications = listOfNotifications;
    }

    public List<Alert_Entity> getListOfAlerts() {
        return listOfAlerts;
    }

    public void setListOfAlerts(List<Alert_Entity> listOfAlerts) {
        this.listOfAlerts = listOfAlerts;
    }

    public List<Ticket_Entity> getListOfTickets() {
        return listOfTickets;
    }

    public void setListOfTickets(List<Ticket_Entity> listOfTickets) {
        this.listOfTickets = listOfTickets;
    }

    @Override
    public String toString() {
        return "User_Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", phoneNo='" + phoneNo + '\'' +
                ", listOfNotifications=" + listOfNotifications +
                ", listOfAlerts=" + listOfAlerts +
                ", listOfTickets=" + listOfTickets +
                '}';
    }
}
