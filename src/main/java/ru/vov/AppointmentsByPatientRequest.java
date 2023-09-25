package ru.vov;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "AppointmentsByPatientRequest")

public class AppointmentsByPatientRequest {
    private Long patientId;

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getPatientId() {
        return patientId;
    }
}
