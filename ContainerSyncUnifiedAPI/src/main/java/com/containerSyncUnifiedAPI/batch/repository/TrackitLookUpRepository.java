package com.containerSyncUnifiedAPI.batch.repository;

import com.containerSyncUnifiedAPI.batch.entities.TrackitLookup;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrackitLookUpRepository extends JpaRepository<TrackitLookup, Integer> {
}
