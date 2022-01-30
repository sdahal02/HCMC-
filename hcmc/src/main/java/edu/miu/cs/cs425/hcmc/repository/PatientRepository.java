package edu.miu.cs.cs425.hcmc.repository;

import edu.miu.cs.cs425.hcmc.model.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long> {
}
