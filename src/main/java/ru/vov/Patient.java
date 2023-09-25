package ru.vov;
import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "patient")
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "birthday")
    private Instant birthday;
    @Column(name = "name")
    private String name;
    @Column(name = "paternal_name")
    private String paternalName;
    @Column(name = "surname")
    private String surname;
    @Column(name = "insurance_number")
    private String insuranceNumber;
}
