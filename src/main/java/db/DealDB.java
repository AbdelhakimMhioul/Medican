package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.Deal;

public class DealDB {
	
	//Ajouter un Deal
	
	public String AjouterDeal(Deal d) {
		int result=0;
		Connection cnx = ConnectionDB.loadDatabase();
		try {
		PreparedStatement st = cnx.prepareStatement("Insert into deals (id_deal,desc_deal,type_deal) values (?,?,?);");
		st.setString(1, null);
		st.setString(2, d.getDesc_deal());
		st.setString(3, d.getType_deal());
		result = st.executeUpdate();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		if(result!=0) {
			return "sc";
		}else return "nn";
	}
	
	//Select deals
	
	public ArrayList<Deal> ShowDeal(){
		ArrayList<Deal> list_deals = new ArrayList<Deal>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from deals where id_deal=?");
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				Deal deal = new Deal();
				deal.setId_deal(res.getInt("id_deal"));
				deal.setDesc_deal(res.getString("desc_deal"));
				deal.setType_deal(res.getString("type_deal"));
	            list_deals.add(deal);
			}
			cnx.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
		return list_deals;
	}

	//Mettre a jour un deal 
	public boolean updateDeal(Deal deal) {
		try {
			Connection conn = ConnectionDB.loadDatabase();
			PreparedStatement ps = conn.prepareStatement("UPDATE deals set desc_deal=?, type_deal=? where id_deal=?");
			ps.setString(1, deal.getDesc_deal());
			ps.setString(2, deal.getType_deal());
			ps.setInt(3, deal.getId_deal());
			int i = ps.executeUpdate();
			if(i == 1) {
				conn.close();
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
	
	//Supprimer un deal
	
	public boolean deleteDeal(int id) {
		try {
			Connection connex  = ConnectionDB.loadDatabase();
			PreparedStatement ps = connex.prepareStatement("DELETE from deals where id_deal="+id+";");
			int i = ps.executeUpdate();
			if(i ==1) {
				connex.close();
				return true;
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}
}

