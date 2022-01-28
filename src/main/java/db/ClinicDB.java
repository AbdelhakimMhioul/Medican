package db;

import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Clinic;

public class ClinicDB implements Serializable{
	private static final long serialVersionUID = 1L;
	
	public ArrayList<Clinic> clinics = new ArrayList<Clinic>();
	public ArrayList<Clinic> getClinics(){
		return clinics;
	}
	//Extract clinics by city or stars 
	public ArrayList<Clinic> findvilles(String ville) {
		ArrayList<Clinic> list_clinics = new ArrayList<Clinic>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from clinic where ville_clinic=?");
			ps.setString(3, ville);
			ResultSet res = ps.executeQuery();
			while(res.next()) {
				Clinic clinic = new Clinic();
				clinic.setId_clinic(res.getInt("id_clinic"));
	        	clinic.setNom_clinic(res.getString("nom_clinic"));
	        	clinic.setAdresse_clinic(res.getString("adresse_clinic"));
	        	clinic.setDescription(res.getString("description"));
	            clinic.setTel_clinic(res.getString("tel_clinic"));
	            clinic.setNbr_etoiles(res.getString("nbr_etoiles"));
	            clinic.setImage_clinic(res.getString("image_clinic"));
	            
	            list_clinics.add(clinic);
			}
			cnx.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		return list_clinics;	
	}

	//Get all clinics
	public List<Clinic> getAll(){

		ArrayList<Clinic> list_clinics = new ArrayList<Clinic>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from clinic");
			ResultSet st = ps.executeQuery();
			while(st.next()) {
				Clinic h = new Clinic();
				h.setId_clinic(st.getInt("id_clinic"));
	        	h.setNom_clinic(st.getString("nom_clinic"));
	            h.setVille_clinic(st.getString("ville_clinic"));
	            h.setNbr_etoiles(st.getString("nbr_etoiles"));
	            h.setImage_clinic(st.getString("image_clinic"));
	            h.setAdresse_clinic(st.getString("adresse_clinic"));
	            h.setDescription(st.getString("description"));
	            h.setTel_clinic(st.getString("tel_clinic"));
	            list_clinics.add(h);
			}
			cnx.close();
		
		}catch(Exception e) {
			e.printStackTrace();
		}
	return list_clinics;	
	}
	//Find an clinic
	public Clinic find(int id) {
		Clinic clinic = null;
		try {
			Connection conn = ConnectionDB.loadDatabase();
			System.out.println("hi");
			PreparedStatement ps = conn.prepareStatement("SELECT * from clinic where id_clinic=?");
			ps.setInt(1, id);
			System.out.println("lol2");
			ResultSet rs = ps.executeQuery();
			System.out.println("helo");
			while (rs.next()) {
				String nom = rs.getString("nom_clinic");
				String adresse = rs.getString("adresse_clinic");
				String description = rs.getString("description");
				String ville = rs.getString("ville_clinic");
				String tel = rs.getString("tel_clinic");
				String image = rs.getString("image_clinic") ;
				String etoiles = rs.getString("nbr_etoiles");
				System.out.println("cool");
				clinic = new Clinic(id, nom, adresse, ville, tel, description, etoiles, image);
				System.out.println("piw");
			}
		}catch(Exception e) {
			System.out.println("die");
			e.printStackTrace();
		}
		return clinic;
	}
	
	//Insert an clinic
	public String AddClinic(Clinic h) {
		int rslt = 0;
		Connection cnx = ConnectionDB.loadDatabase();
		System.out.println("coll");
		try {
			System.out.println("hey");
			PreparedStatement ht = cnx.prepareStatement("Insert into clinic(nom_clinic,ville_clinic,adresse_clinic,tel_clinic,description,nbr_etoiles,image_clinic,id_prs) values(?,?,?,?,?,?,?,?);");
			System.out.println(ht);
			System.out.println("hello tttt");
			ht.setString(1, h.getNom_clinic());
			ht.setString(2, h.getVille_clinic());
			ht.setString(3, h.getAdresse_clinic());
			ht.setString(4, h.getTel_clinic().substring(0,20));
			ht.setString(5, h.getDescription());
			ht.setString(6, h.getNbr_etoiles());
			ht.setString(7, h.getImage_clinic());
			ht.setInt(8, h.getId_prs());
			System.out.println("pe");
			rslt =  ht.executeUpdate();
			System.out.println("cooooool");
		}catch(Exception e) {
			System.out.println("sorry");
			e.printStackTrace();
		}
		if(rslt!=0) {
			return "sc";
		}else return "nn";
		
		
	}
	
	
	//Delete an clinic
	public boolean delete(int id) {
		try {
			Connection connex  = ConnectionDB.loadDatabase();
			PreparedStatement ps = connex.prepareStatement("DELETE from clinic where id_clinic="+id+";");
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
	
	//Update an clinic
	public boolean update(Clinic clinic) {
		try {
			Connection conn = ConnectionDB.loadDatabase();
			PreparedStatement ps = conn.prepareStatement("UPDATE clinic set nom_clinic=?, adresse_clinic=?, ville_clinic=?,"
					+ " tel_clinic=?, description=?,"
					+ "nbr_etoiles=?, image_clinic=? where id_clinic=?;");
			ps.setString(1, clinic.getNom_clinic());
			ps.setString(2, clinic.getAdresse_clinic());
			ps.setString(3, clinic.getVille_clinic());
			ps.setString(4, clinic.getTel_clinic());
			ps.setString(5, clinic.getDescription());
			ps.setString(6, clinic.getNbr_etoiles());
			ps.setString(7, clinic.getImage_clinic());
			ps.setInt(8, clinic.getId_clinic());
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
}
