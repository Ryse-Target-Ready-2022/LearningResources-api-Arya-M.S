package com.tgt.rysetii.learningresoursesapiarya.repository;

import com.tgt.rysetii.learningresoursesapiarya.entity.LearningResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LearningResourceRepository extends JpaRepository<LearningResource, Integer> {
}
