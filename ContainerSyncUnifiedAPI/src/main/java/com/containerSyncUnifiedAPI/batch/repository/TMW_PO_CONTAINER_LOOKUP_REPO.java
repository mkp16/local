package com.containerSyncUnifiedAPI.batch.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.containerSyncUnifiedAPI.batch.entities.OrderContainerLookup;


@Repository
public interface TMW_PO_CONTAINER_LOOKUP_REPO extends JpaRepository<OrderContainerLookup,Integer> {
}

