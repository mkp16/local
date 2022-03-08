package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_LTL_LATEST_STOP_STATUS;

@Repository
public interface TMW_STG_LTL_LATEST_STOP_STATUS_repo extends JpaRepository<TMW_STG_LTL_LATEST_STOP_STATUS, Integer> {
}
