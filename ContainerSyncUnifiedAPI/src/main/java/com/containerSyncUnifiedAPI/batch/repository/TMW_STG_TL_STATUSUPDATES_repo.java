package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_TL_STATUSUPDATES;

@Repository
public interface TMW_STG_TL_STATUSUPDATES_repo extends JpaRepository<TMW_STG_TL_STATUSUPDATES, Integer> {
	
}
