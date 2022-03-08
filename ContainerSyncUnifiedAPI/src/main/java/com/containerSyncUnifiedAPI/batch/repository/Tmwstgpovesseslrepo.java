package com.containerSyncUnifiedAPI.batch.repository;

import com.containerSyncUnifiedAPI.batch.entities.Tmw_trackit_stg_vessel;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface Tmwstgpovesseslrepo extends JpaRepository<Tmw_trackit_stg_vessel,Integer> {
}
