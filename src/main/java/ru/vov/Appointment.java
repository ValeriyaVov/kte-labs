package ru.vov;

import jakarta.persistence.*;

import java.time.Instant;

@Entity
@Table(name = "appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(name = "reception_start_time")
    private Instant receptionStartTime;
    @Column(name = "cabinet_number")
    private int cabinetNumber;
    @Column(name = "doctor_id")
    private Long doctorId;
    @Column(name = "patient_id")
    private Long patientId;
    @Column(name = "date")
    private Instant date;
}
