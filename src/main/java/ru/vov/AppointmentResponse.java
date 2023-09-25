package ru.vov;

import java.util.List;

public class AppointmentResponse {
    private List<Appointment> appointments;

    public AppointmentResponse(List<Appointment> appointments) {
        this.appointments = appointments;
    }

    public List<Appointment> getAppointments() {
        return appointments;
    }

    public void setAppointments(List<Appointment> appointments) {
        this.appointments = appointments;
    }
}
