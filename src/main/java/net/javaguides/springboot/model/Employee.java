package net.javaguides.springboot.model;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name="EMPLOYEES")
public class Employee {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lasName;

    @Column(name="email")
    private String email;
}
