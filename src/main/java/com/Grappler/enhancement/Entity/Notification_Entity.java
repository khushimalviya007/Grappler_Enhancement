package com.Grappler.enhancement.Entity;

import jakarta.persistence.*;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Entity
public class Notification_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false )
    private String title;
    @Column(nullable = false )
    private String description;
    @ElementCollection
    @CollectionTable(name = "notification_channels", joinColumns = @JoinColumn(name = "notification_id"))
    @Column(name = "channel")
    private List<String> channels;
    @Column(nullable = false )
    private LocalDateTime dateAndTime;
    @Column(nullable = false ,columnDefinition = "boolean default false")
    private boolean isRead;
    @ManyToMany(mappedBy="listOfNotifications")
    private List<User_Entity> listOfUser;
    @OneToOne
    private Template_Entity template;
    @ManyToOne(optional = false)
    private Ticket_Entity ticket;

    public Template_Entity getTemplate() {
        return template;
    }

    public void setTemplate(Template_Entity template) {
        this.template = template;
    }

    public Notification_Entity(Long id, String title, String description, List<String> channels, LocalDateTime dateAndTime, boolean isRead, List<User_Entity> listOfUsers, Template_Entity template) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.channels = channels;
        this.dateAndTime = dateAndTime;
        this.isRead = isRead;
        this.listOfUser = listOfUsers;
        this.template = template;
    }

    public Notification_Entity() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
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

    public boolean isRead() {
        return isRead;
    }

    public void setRead(boolean read) {
        isRead = read;
    }

//    public List<User_Entity> getListOfUsers() {
//        return listOfUser;
//    }
//
//    public void setListOfUsers(List<User_Entity> listOfUsers) {
//        this.listOfUser = listOfUsers;
//    }

    @Override
    public String toString() {
        return "Notification_Entity{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", channels=" + channels +
                ", dateAndTime=" + dateAndTime +
                ", isRead=" + isRead +
//                ", listOfUsers=" + listOfUser +
                ", template=" + template +
                '}';
    }
}
