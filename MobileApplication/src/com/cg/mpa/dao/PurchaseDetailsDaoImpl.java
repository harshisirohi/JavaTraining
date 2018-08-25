package com.cg.mpa.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Timestamp;
import java.util.Date;

import com.cg.mpa.dto.PurchaseDetail;
import com.cg.mpa.exception.MobilePurchaseException;
import com.cg.mpa.util.DButil;

public class PurchaseDetailsDaoImpl implements PurchaseDetailsdao
{		Connection con=null;
		Statement st=null;
		PreparedStatement pst=null;
		ResultSet rs=null;	

	@Override
	public int addPurchaseDetail(PurchaseDetail pd) throws MobilePurchaseException 
	{     
		int data;
		String decquant;
		try {
			con=DButil.getConn();
			Timestamp date=new Timestamp(new Date().getTime());
				String quant="Select quantity from mobile where mobileid="+pd.getMobileId();
				st=con.createStatement();
				rs=st.executeQuery(quant);
				rs.next();
				int quantity= Integer.parseInt(rs.getString(quant));
					if(quantity>0)
					{  
						String insertqry="INSERT INTO purchasedetail VALUES (purchase.nextVal,?,?,?,?,?)";
						pst=con.prepareStatement(insertqry);
						pst.setString(1, pd.getCname());
						pst.setString(2, pd.getMailid());
						pst.setString(3, pd.getPhoneno());
						pst.setTimestamp(4, date);
						pst.setInt(5, pd.getMobileId());
						data=pst.executeUpdate();
						
						decquant="Update mobile set quantity= quantity-1 where mobile id="+pd.getMobileId();
						pst=con.prepareStatement(decquant);
						rs=pst.executeQuery();
					}
						else
						{   	
					throw new MobilePurchaseException("Mobile is out of stock");
			
						}
		}
		catch (Exception e) 
		{     
			e.printStackTrace();
			throw new MobilePurchaseException(e.getMessage());
		}
			
		return data;
	}

}
