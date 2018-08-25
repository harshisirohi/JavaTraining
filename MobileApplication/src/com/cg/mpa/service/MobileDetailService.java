package com.cg.mpa.service;

import java.util.ArrayList;

import com.cg.mpa.dto.MobileDetail;
import com.cg.mpa.exception.MobilePurchaseException;

public interface MobileDetailService {
	public ArrayList<MobileDetail> viewMobileDetail() throws MobilePurchaseException;
	public int deleteMobileDetail(int mobileId) throws MobilePurchaseException;
	public ArrayList<MobileDetail> searchMobileDetail(int min, int max) throws MobilePurchaseException;
}
