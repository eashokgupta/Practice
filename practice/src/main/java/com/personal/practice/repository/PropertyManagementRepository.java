package com.personal.practice.repository;

import com.personal.practice.entity.PropertyManagement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PropertyManagementRepository extends JpaRepository<PropertyManagement,Long> {
}
