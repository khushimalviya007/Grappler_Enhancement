package com.Grappler.enhancement.Entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Project_Entity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private String name;
    @OneToMany(mappedBy = "projectEntity")
    private List<Ticket_Entity> ticketList;

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

    public List<Ticket_Entity> getTicketList() {
        return ticketList;
    }

    public void setTicketList(List<Ticket_Entity> ticketList) {
        this.ticketList = ticketList;
    }




    public Project_Entity(Long id, String name, List<Ticket_Entity> ticketList) {
        this.id = id;
        this.name = name;
        this.ticketList = ticketList;

    }

    public Project_Entity() {
    }

    @Override
    public String toString() {
        return "Project_Entity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ticketList=" + ticketList +
                '}';
    }
}
