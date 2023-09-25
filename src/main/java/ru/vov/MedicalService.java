package ru.vov;

import org.springframework.stereotype.Service;

import java.time.Instant;
import java.util.List;

@Service
public class MedicalService {

    private final PatientRepository patientRepository;
    private final DoctorRepository doctorRepository;

    private final AppointmentRepository appointmentRepository;

    public MedicalService(PatientRepository patientRepository, DoctorRepository doctorRepository, AppointmentRepository appointmentRepository) {
        this.patientRepository = patientRepository;
        this.doctorRepository = doctorRepository;
        this.appointmentRepository = appointmentRepository;
    }

    List<Appointment> getAppointments(Long doctorId, Instant date) {
        return appointmentRepository.getAppointmentsByDoctorIdAndPatientIdAndDate(doctorId, null, date);
    }

    void occupyAppointment(Long patientId, Long appointmentId) {
        appointmentRepository.setPatientIdById(patientId, appointmentId);
    }

    List<Appointment> getAppointments(Long patientId) {
        return appointmentRepository.getAppointmentsByPatientId(patientId);
    }
}
