package com.containerSyncUnifiedAPI.batch.config;

import com.containerSyncUnifiedAPI.batch.entities.TrackitLookup;
import com.containerSyncUnifiedAPI.batch.repository.TrackitLookUpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Service
public class TrackitLookUpService {

    @Autowired
    private TrackitLookUpRepository trackitLookUpRepository;

    private Map<String, String> propertyMap;

    @PostConstruct
    public void loadShipmentProperties() {

        List<TrackitLookup> properties = trackitLookUpRepository.findAll();

        propertyMap = properties.stream()
                .collect(Collectors.toMap(TrackitLookup::getPROPERTY, TrackitLookup::getVALUE));

    }

    public Map<String, String> getTrackitLookUpRepository() {
        return propertyMap;
    }

}
