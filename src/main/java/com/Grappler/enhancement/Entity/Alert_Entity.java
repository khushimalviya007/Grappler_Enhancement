package com.Grappler.enhancement.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.List;

   @Entity
    public class Alert_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false )
    private AlertType type;
    @Column(nullable = false )
    private String description;
    @Column(nullable = false )
    private List<String> channels;
    @Column(nullable = false )
    private LocalDateTime dateAndTime;
    private String response;
    @ManyToMany(mappedBy = "listOfAlerts")
    private List<User_Entity> listOfUsers;
    @OneToOne(optional = false)
    private Ticket_Entity ticket;
    @OneToOne
    private Template_Entity template;

//    public Alert_Entity(Long id, AlertType type, String description, List<String> channels, LocalDateTime dateAndTime, String response, List<User_Entity> listOfUsers, Template_Entity template) {
//        this.id = id;
//        this.type = type;
//        this.description = description;
//        this.channels = channels;
//        this.dateAndTime = dateAndTime;
//        this.response = response;
//        this.listOfUsers = listOfUsers;
//        this.template = template;
//    }

    public Alert_Entity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public AlertType getType() {
        return type;
    }

    public void setType(AlertType type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<String> getChannels() {
        return channels;
    }

    public void setChannels(List<String> channels) {
        this.channels = channels;
    }

    public LocalDateTime getDateAndTime() {
        return dateAndTime;
    }

    public void setDateAndTime(LocalDateTime dateAndTime) {
        this.dateAndTime = dateAndTime;
    }

    public String getResponse() {
        return response;
    }

    public void setResponse(String response) {
        this.response = response;
    }

//    public List<User_Entity> getListOfUsers() {
//        return listOfUsers;
//    }
//
//    public void setListOfUsers(List<User_Entity> listOfUsers) {
//        this.listOfUsers = listOfUsers;
//    }

    public Template_Entity getTemplate() {
        return template;
    }

    public void setTemplate(Template_Entity template) {
        this.template = template;
    }

    @Override
    public String toString() {
        return "Alert_Entity{" +
                "id=" + id +
                ", type=" + type +
                ", description='" + description + '\'' +
                ", channels=" + channels +
                ", dateAndTime=" + dateAndTime +
                ", response='" + response + '\'' +
//                ", listOfUsers=" + listOfUsers +
                ", template=" + template +
                '}';
    }
}
