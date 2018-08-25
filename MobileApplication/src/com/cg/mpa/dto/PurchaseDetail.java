package com.cg.mpa.dto;

public class PurchaseDetail {
	int mobileid;
	String cname;
	String mailid;
	String phoneno;
	public int getMobileId() {
		return mobileid;
	}
	public void setMobileId(int purchaseid) {
		this.mobileid = purchaseid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public String getMailid() {
		return mailid;
	}
	public void setMailid(String mailid) {
		this.mailid = mailid;
	}
	public String getPhoneno() {
		return phoneno;
	}
	public void setPhoneno(String phoneno) {
		this.phoneno = phoneno;
	}
	@Override
	public String toString() {
		return "PurchaseDetail [purchaseid=" + mobileid + ", cname=" + cname + ", mailid=" + mailid + ", phoneno="
				+ phoneno + "]";
	}
	public PurchaseDetail(String cname, String mailid, String phoneno, int mobileid) {
		super();
		this.mobileid = mobileid;
		this.cname = cname;
		this.mailid = mailid;
		this.phoneno = phoneno;
	}
	public PurchaseDetail() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
