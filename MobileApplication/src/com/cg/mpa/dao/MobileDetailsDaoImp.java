package com.cg.mpa.dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import com.cg.mpa.dto.MobileDetail;
import com.cg.mpa.exception.MobilePurchaseException;
import com.cg.mpa.util.DButil;

public class MobileDetailsDaoImp implements MobileDetailsDao 
{
	Connection con=null;
	Statement st=null;
	PreparedStatement pst=null;
	ResultSet rs=null;
	ArrayList<MobileDetail> mobList=null;
	@Override
	public ArrayList<MobileDetail> viewMobileDetail() throws MobilePurchaseException 
	{ 
		try
		{
		mobList= new ArrayList<MobileDetail>();
		con=DButil.getConn();
		String selectquery="Select * From mobile";
		st=con.createStatement();
		rs=st.executeQuery(selectquery);
		while(rs.next())
		{
			mobList.add(new MobileDetail(rs.getInt("mobileid"),rs.getString("name"),rs.getInt("price"),rs.getString("quantity")));
		}
		}
	 catch (Exception e) 
		{
		 throw new MobilePurchaseException(e.getMessage());
		// TODO: handle exception
		}
		
		return mobList;
	
	}
	@Override
	public int deleteMobileDetail(int mobileId) throws MobilePurchaseException 
	{ 
		int data;
		try {
			
			con=DButil.getConn();
			String query="DELETE FROM mobile WHERE mobileid="+mobileId;
			pst=con.prepareStatement(query);
			data=pst.executeUpdate();
		} 
		catch (Exception e) 
		{
			throw new MobilePurchaseException(e.getMessage());
		}
		// TODO Auto-generated method stub
		return data;
	}
	@Override
	public ArrayList<MobileDetail> searchMobileDetail(int min, int max) throws MobilePurchaseException 
	{
		mobList =new ArrayList<MobileDetail>();
		try 
		{
			con=DButil.getConn();
			
			String selectquery="Select * from mobile where price>="+min+ "and price<="+max;
			st=con.createStatement();
			rs=st.executeQuery(selectquery);
		} 
		catch (Exception e) 
		{
			throw new MobilePurchaseException(e.getMessage());
		}
		
		
		return mobList;
	}

}
