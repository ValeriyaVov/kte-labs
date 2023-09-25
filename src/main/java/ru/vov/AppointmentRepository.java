package ru.vov;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.Instant;
import java.util.List;

public interface AppointmentRepository extends JpaRepository<Appointment, Long> {

   List<Appointment> getAppointmentsByDoctorIdAndPatientIdAndDate(Long doctorId, Long patientId, Instant date);
   @Modifying
   @Query("UPDATE Appointment a SET a.patientId = :patientId WHERE a.id = :id")
   void setPatientIdById(@Param("patientId") Long patientId, @Param("id") Long id);
   List<Appointment> getAppointmentsByPatientId(Long patientId);
}
