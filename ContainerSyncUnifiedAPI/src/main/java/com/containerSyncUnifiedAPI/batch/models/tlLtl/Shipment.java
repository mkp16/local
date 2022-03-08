package com.containerSyncUnifiedAPI.batch.models.tlLtl;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
@JsonIgnoreProperties(ignoreUnknown = true)
public class Shipment {

    private CarrierIdentifier carrierIdentifier;
    private List<ShipmentIdentifier> shipmentIdentifiers;
    private List<ShipmentStop> shipmentStops;
    private List<EquipmentIdentifier> equipmentIdentifiers;
    private List<String> sensors;
    private ShippingDetail shippingDetails;
    private List<TrackingDetail> trackingDetails;
    private ApiConfiguration apiConfiguration;
    private List<Attributes> attributes;
    private long id;
    private String shipmentLegId;
    private String masterShipmentId;
    private long IdleDuration;
    private CapacityProviderAccountGroup capacityProviderAccountGroup;
    private String ltlLegId;
    private List<ShipmentAttribute> shipmentAttributes;



    public CapacityProviderAccountGroup getCapacityProviderAccountGroup() {
        return capacityProviderAccountGroup;
    }

    public void setCapacityProviderAccountGroup(CapacityProviderAccountGroup capacityProviderAccountGroup) {
        this.capacityProviderAccountGroup = capacityProviderAccountGroup;
    }

    public String getLtlLegId() {
        return ltlLegId;
    }

    public void setLtlLegId(String ltlLegId) {
        this.ltlLegId = ltlLegId;
    }

    public List<ShipmentAttribute> getShipmentAttributes() {
        return shipmentAttributes;
    }

    public void setShipmentAttributes(List<ShipmentAttribute> shipmentAttributes) {
        this.shipmentAttributes = shipmentAttributes;
    }


    public CarrierIdentifier getCarrierIdentifier() {
        return carrierIdentifier;
    }

    public void setCarrierIdentifier(CarrierIdentifier carrierIdentifier) {
        this.carrierIdentifier = carrierIdentifier;
    }

    public List<ShipmentIdentifier> getShipmentIdentifiers() {
        return shipmentIdentifiers;
    }

    public void setShipmentIdentifiers(List<ShipmentIdentifier> shipmentIdentifiers) {
        this.shipmentIdentifiers = shipmentIdentifiers;
    }

    public List<ShipmentStop> getShipmentStops() {
        return shipmentStops;
    }

    public void setShipmentStops(List<ShipmentStop> shipmentStops) {
        this.shipmentStops = shipmentStops;
    }

    public List<EquipmentIdentifier> getEquipmentIdentifiers() {
        return equipmentIdentifiers;
    }

    public void setEquipmentIdentifiers(List<EquipmentIdentifier> equipmentIdentifiers) {
        this.equipmentIdentifiers = equipmentIdentifiers;
    }

    public List<String> getSensors() {
        return sensors;
    }

    public void setSensors(List<String> sensors) {
        this.sensors = sensors;
    }

    public ShippingDetail getShippingDetails() {
        return shippingDetails;
    }

    public void setShippingDetails(ShippingDetail shippingDetails) {
        this.shippingDetails = shippingDetails;
    }

    public List<TrackingDetail> getTrackingDetails() {
        return trackingDetails;
    }

    public void setTrackingDetails(List<TrackingDetail> trackingDetails) {
        this.trackingDetails = trackingDetails;
    }

    public ApiConfiguration getApiConfiguration() {
        return apiConfiguration;
    }

    public void setApiConfiguration(ApiConfiguration apiConfiguration) {
        this.apiConfiguration = apiConfiguration;
    }

    public List<Attributes> getAttributes() {
        return attributes;
    }

    public void setAttributes(List<Attributes> attributes) {
        this.attributes = attributes;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getShipmentLegId() {
        return shipmentLegId;
    }

    public void setShipmentLegId(String shipmentLegId) {
        this.shipmentLegId = shipmentLegId;
    }

    public String getMasterShipmentId() {
        return masterShipmentId;
    }

    public void setMasterShipmentId(String masterShipmentId) {
        this.masterShipmentId = masterShipmentId;
    }

    public long getIdleDuration() {
        return IdleDuration;
    }

    public void setIdleDuration(long idleDuration) {
        IdleDuration = idleDuration;
    }
}
