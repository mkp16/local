package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.VESSELS;

@Repository
public interface VESSELS_repo extends JpaRepository<VESSELS, Integer> {
}
