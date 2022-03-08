package com.containerSyncUnifiedAPI.batch.repository;

import com.containerSyncUnifiedAPI.batch.entities.OrderContainerLookup;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Project44ContainerSyncRepo extends CrudRepository<OrderContainerLookup,Long> {

    @Procedure
    public void P44_CONTAINER_SYNC();
}
