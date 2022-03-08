package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class ShipmentStop {

    private long id;
    private String stopType;
    private long stopNumber;
    private AppointmentWindow appointmentWindow;
    private List<AdditionalAppointmentWindow> additionalAppointmentWindows;
    private Location location;
    private List<LocationIdentifier> locationIdentifiers;
    private String stopName;
    private GeoCoordinate geoCoordinates;
    private String uuid;

    public long getStopNumber() {
        return stopNumber;
    }

    public void setStopNumber(long stopNumber) {
        this.stopNumber = stopNumber;
    }

    public AppointmentWindow getAppointmentWindow() {
        return appointmentWindow;
    }

    public void setAppointmentWindow(AppointmentWindow appointmentWindow) {
        this.appointmentWindow = appointmentWindow;
    }

    public List<AdditionalAppointmentWindow> getAdditionalAppointmentWindows() {
        return additionalAppointmentWindows;
    }

    public void setAdditionalAppointmentWindows(List<AdditionalAppointmentWindow> additionalAppointmentWindows) {
        this.additionalAppointmentWindows = additionalAppointmentWindows;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public List<LocationIdentifier> getLocationIdentifiers() {
        return locationIdentifiers;
    }

    public void setLocationIdentifiers(List<LocationIdentifier> locationIdentifiers) {
        this.locationIdentifiers = locationIdentifiers;
    }

    public String getStopName() {
        return stopName;
    }

    public void setStopName(String stopName) {
        this.stopName = stopName;
    }

    public GeoCoordinate getGeoCoordinates() {
        return geoCoordinates;
    }

    public void setGeoCoordinates(GeoCoordinate geoCoordinates) {
        this.geoCoordinates = geoCoordinates;
    }

    public String getUuid() {
        return uuid;
    }

    public void setUuid(String uuid) {
        this.uuid = uuid;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getStopType() {
        return stopType;
    }

    public void setStopType(String stopType) {
        this.stopType = stopType;
    }
}
