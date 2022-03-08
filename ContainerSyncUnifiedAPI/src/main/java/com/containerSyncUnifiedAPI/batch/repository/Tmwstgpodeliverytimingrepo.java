package com.containerSyncUnifiedAPI.batch.repository;

import com.containerSyncUnifiedAPI.batch.entities.Tmw_trackit_stg_dlvry_timing;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;


@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface Tmwstgpodeliverytimingrepo extends JpaRepository<Tmw_trackit_stg_dlvry_timing, Integer> {

}

