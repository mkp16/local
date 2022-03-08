package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.SHIPMENT_IDENTIFIER;

@Repository
public interface SHIPMENT_IDENTIFIER_repo extends JpaRepository<SHIPMENT_IDENTIFIER, Integer> {
}
