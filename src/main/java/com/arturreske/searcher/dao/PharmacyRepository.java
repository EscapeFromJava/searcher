package com.arturreske.search_for_medicines.dao;

import com.arturreske.search_for_medicines.entity.Pharmacy;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PharmacyRepository extends JpaRepository<Pharmacy, Integer> {
}
