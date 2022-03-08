package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.RELATED_SHIPMENT;

@Repository
public interface RELATED_SHIPMENT_repo extends JpaRepository<RELATED_SHIPMENT, Integer> {
}
