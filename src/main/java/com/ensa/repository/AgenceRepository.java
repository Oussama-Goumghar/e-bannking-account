package com.ensa.repository;

import com.ensa.domain.Agence;
import org.springframework.data.jpa.repository.*;
import org.springframework.stereotype.Repository;

/**
 * Spring Data SQL repository for the Agence entity.
 */
@SuppressWarnings("unused")
@Repository
public interface AgenceRepository extends JpaRepository<Agence, Long> {
    public Agence findByReference(String ref);
    public Boolean existsByReference(String ref);
}
