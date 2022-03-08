package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.SHIPMENT_INFO;

@Repository
public interface SHIPMENT_INFO_repo extends JpaRepository<SHIPMENT_INFO, Integer> {
}
