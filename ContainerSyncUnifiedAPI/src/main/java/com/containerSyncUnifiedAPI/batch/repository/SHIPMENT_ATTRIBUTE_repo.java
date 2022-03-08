package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.SHIPMENT_ATTRIBUTE;

@Repository
public interface SHIPMENT_ATTRIBUTE_repo extends JpaRepository<SHIPMENT_ATTRIBUTE, Integer> {
}
