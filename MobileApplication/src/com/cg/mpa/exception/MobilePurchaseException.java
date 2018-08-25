package com.cg.mpa.exception;

public class MobilePurchaseException extends Exception
{
	String msg;

	public MobilePurchaseException(String msg)
	{
		super(msg);
	}

}
