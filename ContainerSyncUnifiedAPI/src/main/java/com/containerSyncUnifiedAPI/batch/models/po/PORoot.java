package com.containerSyncUnifiedAPI.batch.models.po;

import java.util.List;

public class PORoot {
    public PaginationInfo paginationInfo;
    public List<Result> results;
	public PaginationInfo getPaginationInfo() {
		return paginationInfo;
	}
	public void setPaginationInfo(PaginationInfo paginationInfo) {
		this.paginationInfo = paginationInfo;
	}
	public List<Result> getResults() {
		return results;
	}
	public void setResults(List<Result> results) {
		this.results = results;
	}
    
    
    
    
}
