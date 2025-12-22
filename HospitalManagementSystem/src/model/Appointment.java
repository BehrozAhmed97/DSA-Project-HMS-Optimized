package model;

import java.time.LocalDateTime;

public class Appointment {

    private int id;
    private int patientId;
    private int doctorId;
    private String patientName;
    private String doctorName;
    private LocalDateTime dateTime;

    public Appointment(int id, int patientId, int doctorId, LocalDateTime dateTime) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.dateTime = dateTime;
    }

    public Appointment(int id, int patientId, int doctorId,
                       String patientName, String doctorName,
                       LocalDateTime dateTime) {
        this.id = id;
        this.patientId = patientId;
        this.doctorId = doctorId;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.dateTime = dateTime;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getDetails() {
        return "Appointment ID: " + id +
                ", Patient: " + patientName +
                ", Doctor: " + doctorName +
                ", Date & Time: " + dateTime;
    }
}
