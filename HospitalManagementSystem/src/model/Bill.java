package model;

public class Bill {

    private int id;
    private int patientId;
    private String patientName;
    private double amount;
    private String description;

    public Bill(int id, int patientId, double amount, String description) {
        this.id = id;
        this.patientId = patientId;
        this.amount = amount;
        this.description = description;
    }

    public Bill(int id, int patientId, String patientName,
                double amount, String description) {
        this.id = id;
        this.patientId = patientId;
        this.patientName = patientName;
        this.amount = amount;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public double getAmount() {
        return amount;
    }

    public String getDescription() {
        return description;
    }

    public String getDetails() {
        return "Bill ID: " + id +
                ", Patient: " + patientName +
                ", Amount: " + amount +
                ", Description: " + description;
    }
}
