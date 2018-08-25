package com.cg.mpa.dao;

import com.cg.mpa.dto.PurchaseDetail;
import com.cg.mpa.exception.MobilePurchaseException;

public interface PurchaseDetailsdao {
	public int addPurchaseDetail(PurchaseDetail pd) throws MobilePurchaseException;

}
