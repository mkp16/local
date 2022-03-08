package com.containerSyncUnifiedAPI.batch.repository;

import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_PO_CONTAINER_STOPS;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface Tmwstgpostopinforepo extends JpaRepository<TMW_STG_PO_CONTAINER_STOPS,Integer> {
}
