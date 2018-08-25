package com.cg.mpa.service;

import java.util.regex.Pattern;

import com.cg.mpa.dao.PurchaseDetailsDaoImpl;
import com.cg.mpa.dto.PurchaseDetail;
import com.cg.mpa.exception.MobilePurchaseException;

public class PurchaseDetailServiceImpl implements PurchaseDetailService  {
	PurchaseDetailsDaoImpl pdDao=null;
	public PurchaseDetailServiceImpl(){
		{     
			pdDao =new PurchaseDetailsDaoImpl();
		}
	}
	
	@Override
	public int addPurchaseDetail(PurchaseDetail pd) throws MobilePurchaseException 
	{      
		
		return pdDao.addPurchaseDetail(pd); 
		
	}
public boolean validateName(String ename) throws MobilePurchaseException
{
	String namepattern="[A-Z][a-z]+";
	if(Pattern.matches(namepattern, ename))
	return true;
	else
		throw new MobilePurchaseException("Invalid name. It should start with capitals");
}
public boolean validateMail(String email) throws MobilePurchaseException
{    	String emailpattern="[a-z]+[a-z]+.[a-z]+";
		if(Pattern.matches(emailpattern, email))
			return true;
		else
			throw new MobilePurchaseException("Invalid email.");

}
public boolean validatePhone(String phone) throws MobilePurchaseException
{
	String phoneNumber="^[0-9] {10}$";
	if(Pattern.matches(phoneNumber, phone))
		return true;
	else
		throw new MobilePurchaseException("Invalid phone number. It should be of exactly of 10 digits");
}
public boolean validateMobileId(String mobileId) throws MobilePurchaseException
{
	String mobileid="^[0-9] {4}$";
	if(Pattern.matches(mobileid, mobileId))
		return true;
	else
		throw new MobilePurchaseException("Invalid mobile Id. It should be of exactly of 4 digits");
}
}

