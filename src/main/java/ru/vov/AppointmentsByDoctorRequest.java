package ru.vov;

import jakarta.xml.bind.annotation.XmlRootElement;

import java.time.Instant;

@XmlRootElement(name = "AppointmentsByDoctorRequest")

public class AppointmentsByDoctorRequest {
    private Long doctorId;
    private Instant date;

    public Long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(Long doctorId) {
        this.doctorId = doctorId;
    }

    public Instant getDate() {
        return date;
    }

    public void setDate(Instant date) {
        this.date = date;
    }
}
