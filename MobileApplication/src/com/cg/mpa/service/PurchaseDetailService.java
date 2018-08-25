package com.cg.mpa.service;

import com.cg.mpa.dto.PurchaseDetail;
import com.cg.mpa.exception.MobilePurchaseException;

public interface PurchaseDetailService {
	public int addPurchaseDetail(PurchaseDetail pd) throws MobilePurchaseException;
}
