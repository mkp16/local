package com.containerSyncUnifiedAPI.batch.models.po;

import java.util.List;

public class Result{
    public String id;
    public String orderType;
    public String orderIdentifier;
    public List<AdditionalOrderIdentifier> additionalOrderIdentifiers;
    public List<OrderTag> orderTags;
    public String subject;
    public String statusCode;
    public String orderSubmissionDateTime;
    public SupplierReadyDateTimeWindow supplierReadyDateTimeWindow;
    public OriginalDeliveryDateTimeWindow originalDeliveryDateTimeWindow;
    public VendorLocation vendorLocation;
    public OriginLocation originLocation;
    public DestinationLocation destinationLocation;
    public BillToLocation billToLocation;
    public FreightTerms freightTerms;
    public TotalCost totalCost;
    public TotalRetailValue totalRetailValue;
    public List<String> shipmentIds;
    public List<String> relatedOrderIds;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getOrderType() {
		return orderType;
	}
	public void setOrderType(String orderType) {
		this.orderType = orderType;
	}
	public String getOrderIdentifier() {
		return orderIdentifier;
	}
	public void setOrderIdentifier(String orderIdentifier) {
		this.orderIdentifier = orderIdentifier;
	}
	public List<AdditionalOrderIdentifier> getAdditionalOrderIdentifiers() {
		return additionalOrderIdentifiers;
	}
	public void setAdditionalOrderIdentifiers(List<AdditionalOrderIdentifier> additionalOrderIdentifiers) {
		this.additionalOrderIdentifiers = additionalOrderIdentifiers;
	}
	public List<OrderTag> getOrderTags() {
		return orderTags;
	}
	public void setOrderTags(List<OrderTag> orderTags) {
		this.orderTags = orderTags;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(String statusCode) {
		this.statusCode = statusCode;
	}
	public String getOrderSubmissionDateTime() {
		return orderSubmissionDateTime;
	}
	public void setOrderSubmissionDateTime(String orderSubmissionDateTime) {
		this.orderSubmissionDateTime = orderSubmissionDateTime;
	}
	public SupplierReadyDateTimeWindow getSupplierReadyDateTimeWindow() {
		return supplierReadyDateTimeWindow;
	}
	public void setSupplierReadyDateTimeWindow(SupplierReadyDateTimeWindow supplierReadyDateTimeWindow) {
		this.supplierReadyDateTimeWindow = supplierReadyDateTimeWindow;
	}
	public OriginalDeliveryDateTimeWindow getOriginalDeliveryDateTimeWindow() {
		return originalDeliveryDateTimeWindow;
	}
	public void setOriginalDeliveryDateTimeWindow(OriginalDeliveryDateTimeWindow originalDeliveryDateTimeWindow) {
		this.originalDeliveryDateTimeWindow = originalDeliveryDateTimeWindow;
	}
	public VendorLocation getVendorLocation() {
		return vendorLocation;
	}
	public void setVendorLocation(VendorLocation vendorLocation) {
		this.vendorLocation = vendorLocation;
	}
	public OriginLocation getOriginLocation() {
		return originLocation;
	}
	public void setOriginLocation(OriginLocation originLocation) {
		this.originLocation = originLocation;
	}
	public DestinationLocation getDestinationLocation() {
		return destinationLocation;
	}
	public void setDestinationLocation(DestinationLocation destinationLocation) {
		this.destinationLocation = destinationLocation;
	}
	public BillToLocation getBillToLocation() {
		return billToLocation;
	}
	public void setBillToLocation(BillToLocation billToLocation) {
		this.billToLocation = billToLocation;
	}
	public FreightTerms getFreightTerms() {
		return freightTerms;
	}
	public void setFreightTerms(FreightTerms freightTerms) {
		this.freightTerms = freightTerms;
	}
	public TotalCost getTotalCost() {
		return totalCost;
	}
	public void setTotalCost(TotalCost totalCost) {
		this.totalCost = totalCost;
	}
	public TotalRetailValue getTotalRetailValue() {
		return totalRetailValue;
	}
	public void setTotalRetailValue(TotalRetailValue totalRetailValue) {
		this.totalRetailValue = totalRetailValue;
	}
	public List<String> getShipmentIds() {
		return shipmentIds;
	}
	public void setShipmentIds(List<String> shipmentIds) {
		this.shipmentIds = shipmentIds;
	}
	public List<String> getRelatedOrderIds() {
		return relatedOrderIds;
	}
	public void setRelatedOrderIds(List<String> relatedOrderIds) {
		this.relatedOrderIds = relatedOrderIds;
	}
    
    
    
    
}
