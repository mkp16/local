package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.containerSyncUnifiedAPI.batch.entities.TMW_STG_PO_CONTAINER_EVENTS;


@Repository
@Transactional(propagation = Propagation.REQUIRES_NEW)
public interface TMW_STG_PO_CONTAINER_EVENTS_REPO  extends JpaRepository<TMW_STG_PO_CONTAINER_EVENTS,Integer> {

}

