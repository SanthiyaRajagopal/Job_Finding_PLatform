package com.JobFindingPlatform.DTO;

public class ApplicationStatusDTO {
	public int totalShortlisted;
	public int totalRejected;
	public int totalPending;
	public int totalApplications;
	
	
	public ApplicationStatusDTO() {}
	public ApplicationStatusDTO(int totalApplications,int totalShortlisted,int totalRejected,int totalPending) {
		
		this.totalApplications=totalApplications;
		this.totalShortlisted=totalShortlisted;
		this.totalRejected=totalRejected;
		this.totalPending=totalPending;
	}
	public void totalApplications(int i) {
		// TODO Auto-generated method stub
		
	}
	public void totalShortlisted(int i) {
		// TODO Auto-generated method stub
		
	}
	public void totalRejected(int i) {
		// TODO Auto-generated method stub
		
	}
	public void totalPending(int i) {
		// TODO Auto-generated method stub
		
	}
	

}
