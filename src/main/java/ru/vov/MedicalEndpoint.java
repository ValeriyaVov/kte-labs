package ru.vov;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;


@Endpoint
public class MedicalEndpoint {

    private static final String NAMESPACE_URI = "http://example.com/medicaldata";

    private final MedicalService medicalService;

    @Autowired
    public MedicalEndpoint(MedicalService medicalService) {
        this.medicalService = medicalService;
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AppointmentsByDoctorRequest")
    @ResponsePayload
    AppointmentResponse getAppointments(@RequestPayload AppointmentsByDoctorRequest request) {
        return new AppointmentResponse(medicalService.getAppointments(request.getDoctorId(), request.getDate()));
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "OccupyAppointmentRequest")
    @ResponsePayload
    void occupyAppointment(@RequestPayload OccupyAppointmentRequest request) {
        medicalService.occupyAppointment(request.getPatientId(), request.getAppointmentId());
    }

    @PayloadRoot(namespace = NAMESPACE_URI, localPart = "AppointmentsByPatientRequest")
    @ResponsePayload
    AppointmentResponse getAppointments(@RequestPayload AppointmentsByPatientRequest request) {
        return new AppointmentResponse(medicalService.getAppointments(request.getPatientId()));
    }
}