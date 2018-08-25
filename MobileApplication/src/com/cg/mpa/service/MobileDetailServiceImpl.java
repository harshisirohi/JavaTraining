package com.cg.mpa.service;

import java.util.ArrayList;

import com.cg.mpa.dao.MobileDetailsDao;
import com.cg.mpa.dto.MobileDetail;
import com.cg.mpa.exception.MobilePurchaseException;

public class MobileDetailServiceImpl implements MobileDetailService 
{
    MobileDetailServiceImpl mdDao=null;
	public MobileDetailServiceImpl() 
	{
		mdDao=new MobileDetailServiceImpl();
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public ArrayList<MobileDetail> viewMobileDetail() throws MobilePurchaseException 
	{
		// TODO Auto-generated method stub
		return mdDao.viewMobileDetail();
	}

	@Override
	public int deleteMobileDetail(int mobileId) throws MobilePurchaseException 
	{
		// TODO Auto-generated method stub
		return mdDao.deleteMobileDetail(mobileId);
	}

	@Override
	public ArrayList<MobileDetail> searchMobileDetail(int min, int max) throws MobilePurchaseException 
	{
		// TODO Auto-generated method stub
		return mdDao.searchMobileDetail(min,max);
	}
	

}
