package ru.vov;

import jakarta.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "OccupyAppointmentRequest")

public class OccupyAppointmentRequest {
    private Long patientId;
    private Long appointmentId;

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public Long getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(Long appointmentId) {
        this.appointmentId = appointmentId;
    }
}
