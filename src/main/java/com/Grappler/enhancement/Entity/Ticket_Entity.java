package com.Grappler.enhancement.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Ticket_Entity
{
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false ,columnDefinition = "VARCHAR(255) default 'TODO'")
    private Stages stage;
//    @ManyToMany(mappedBy = "listOfTickets")
//    List<User_Entity> listOfUser;
@OneToOne
private User_Entity userEntity;

    @Column(nullable = false)
    private String creationDate;
    @Column(nullable = false)
    private String endDate;
    @ManyToOne(optional = false)
    private Project_Entity projectEntity;

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

    public Stages getStage() {
        return stage;
    }

    public void setStage(Stages stage) {
        this.stage = stage;
    }

//    public List<User_Entity> getListOfUser() {
//        return listOfUser;
//    }
//
//    public void setListOfUser(List<User_Entity> listOfUser) {
//        this.listOfUser = listOfUser;
//    }
//
//    public User_Entity getCreator() {
//        return creator;
//    }
//
//    public void setCreator(User_Entity creator) {
//        this.creator = creator;
//    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Project_Entity getProjectEntity() {
        return projectEntity;
    }

    public void setProjectEntity(Project_Entity projectEntity) {
        this.projectEntity = projectEntity;
    }

//    public Ticket_Entity(Long id, String name, Stages stage, List<User_Entity> listOfUser, User_Entity creator, String creationDate, String endDate, Project_Entity projectEntity) {
//        this.id = id;
//        this.name = name;
//        this.stage = stage;
//        this.listOfUser = listOfUser;
//        this.creator = creator;
//        this.creationDate = creationDate;
//        this.endDate = endDate;
//        this.projectEntity = projectEntity;
//    }

    public Ticket_Entity() {
    }

    @Override
    public String toString() {
        return "Ticket_Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", stage=" + stage +
//                ", listOfUser=" + listOfUser +
//                ", creator=" + creator +
                ", creationDate='" + creationDate + '\'' +
                ", endDate='" + endDate + '\'' +
                ", projectEntity=" + projectEntity +
                '}';
    }
}