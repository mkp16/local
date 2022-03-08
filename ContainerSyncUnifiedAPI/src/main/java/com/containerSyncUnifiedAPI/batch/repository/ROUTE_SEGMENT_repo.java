package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.ROUTE_SEGMENT;

@Repository
public interface ROUTE_SEGMENT_repo extends JpaRepository<ROUTE_SEGMENT, Integer> {
}
