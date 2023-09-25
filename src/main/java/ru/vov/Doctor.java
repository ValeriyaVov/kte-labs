package ru.vov;

import jakarta.persistence.*;

@Entity
@Table(name = "doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "uuid")
    private String uuid;
    @Column(name = "specialization")
    private Specialization specialization;
    @Column(name = "name")
    private String name;
    @Column(name = "paternal_name")
    private String paternalName;
    @Column(name = "surname")
    private String surname;
}
