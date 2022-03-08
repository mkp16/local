package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.ROUTE_STOP;

@Repository
public interface ROUTE_STOP_repo extends JpaRepository<ROUTE_STOP, Integer> {
}
