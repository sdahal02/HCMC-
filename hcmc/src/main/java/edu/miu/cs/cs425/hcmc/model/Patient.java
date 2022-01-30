package edu.miu.cs.cs425.hcmc.model;


import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.time.LocalDate;

@Entity
@Table(name ="patients")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long patientId;
    @NotNull
    @NotBlank
    @Column(nullable =false, unique =true)
    private String patientNumber;
    @NotNull
    @NotBlank
    @Column(nullable =false)
    private String isOutPatient;
    @NotNull
    @NotBlank  //only applicable for String type not for date
    @Column(nullable =false)
    private String fullName;
    @Email
    private String emailAddress;
    private String contactPhoneNumber;
    @NotNull
    @Column(nullable =false)
    @DateTimeFormat(pattern ="yyyy-mm-dd")
    private LocalDate dateOfBirth;


    public Patient(){

    }

    public Patient(Long patientId, String patientNumber, String isOutPatient, String fullName, String emailAddress, String contactPhoneNumber, LocalDate dateOfBirth) {
        this.patientId = patientId;
        this.patientNumber = patientNumber;
        this.isOutPatient = isOutPatient;
        this.fullName = fullName;
        this.emailAddress = emailAddress;
        this.contactPhoneNumber = contactPhoneNumber;
        this.dateOfBirth = dateOfBirth;
    }

    public Long getPatientId() {
        return patientId;
    }

    public void setPatientId(Long patientId) {
        this.patientId = patientId;
    }

    public String getPatientNumber() {
        return patientNumber;
    }

    public void setPatientNumber(String patientNumber) {
        this.patientNumber = patientNumber;
    }

    public String getIsOutPatient() {
        return isOutPatient;
    }

    public void setIsOutPatient(String isOutPatient) {
        this.isOutPatient = isOutPatient;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactPhoneNumber() {
        return contactPhoneNumber;
    }

    public void setContactPhoneNumber(String contactPhoneNumber) {
        this.contactPhoneNumber = contactPhoneNumber;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(LocalDate dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Patient{" +
                "patientId=" + patientId +
                ", patientNumber='" + patientNumber + '\'' +
                ", isOutPatient='" + isOutPatient + '\'' +
                ", fullName='" + fullName + '\'' +
                ", emailAddress='" + emailAddress + '\'' +
                ", contactPhoneNumber='" + contactPhoneNumber + '\'' +
                ", dateOfBirth=" + dateOfBirth +
                '}';
    }
}

