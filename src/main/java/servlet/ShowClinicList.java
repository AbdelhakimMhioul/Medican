package servlet;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import beans.Clinic;
import db.ConnectionDB;

public class ShowClinicList {
	public ArrayList<Clinic> ShowList() {
		ArrayList<Clinic> list_clinics = new ArrayList<Clinic>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement(
					"select id_clinic,nom_clinic, ville_clinic, nbr_etoiles, image_clinic, adresse_clinic,"
							+ "description, tel_clinic from clinic");
			ResultSet st = ps.executeQuery();
			System.out.println("sdmlfjk");
			while (st.next()) {
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

		} catch (Exception e) {
			e.printStackTrace();
		}
		return list_clinics;
	}

	public Clinic findClinicById(int id) {
		Clinic h = new Clinic();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement(
					"select id_clinic,nom_clinic, ville_clinic, nbr_etoiles, image_clinic, adresse_clinic,"
							+ "description, tel_clinic from clinic where id_clinic=?");
			ps.setInt(1, id);
			ResultSet st = ps.executeQuery();
			if (st.next()) {
				h.setId_clinic(st.getInt("id_clinic"));
				h.setNom_clinic(st.getString("nom_clinic"));
				h.setVille_clinic(st.getString("ville_clinic"));
				h.setNbr_etoiles(st.getString("nbr_etoiles"));
				h.setImage_clinic(st.getString("image_clinic"));
				h.setAdresse_clinic(st.getString("adresse_clinic"));
				h.setDescription(st.getString("description"));
				h.setTel_clinic(st.getString("tel_clinic"));

			}

		} catch (Exception e) {
		}
		return h;
	}

	public Clinic getClinicManager(int id_manager) {
		Clinic clinic = new Clinic();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement(
					"select personne.id_prs,clinic.id_clinic,clinic.nom_clinic, clinic.ville_clinic,clinic.adresse_clinic,clinic.tel_clinic"
							+ ", clinic.description, clinic.image_clinic,clinic.nbr_etoiles from clinic,personne where clinic.id_prs=personne.id_prs;");
			ResultSet rs = ps.executeQuery();

			if (rs.next()) {

				clinic.setId_clinic(rs.getInt("id_clinic"));
				clinic.setNom_clinic(rs.getString("nom_clinic"));
				clinic.setVille_clinic(rs.getString("ville_clinic"));
				clinic.setNbr_etoiles(rs.getString("nbr_etoiles"));
				clinic.setImage_clinic(rs.getString("image_clinic"));
				clinic.setAdresse_clinic(rs.getString("adresse_clinic"));
				clinic.setDescription(rs.getString("description"));
				clinic.setTel_clinic(rs.getString("tel_clinic"));
				clinic.setId_prs(rs.getInt("id_prs"));
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return clinic;
	}

	// Update clinic data
	public int updateClinic(Clinic h) {
		int rowUpdated = 0;
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("update clinic set nom_clinic=?, ville_clinic=?,nbr_etoiles=?,"
					+ "adresse_clinic=?,description=?, tel_clinic=?  where id_clinic=?;");
			ps.setString(1, h.getNom_clinic());
			ps.setString(2, h.getVille_clinic());
			ps.setString(3, h.getNbr_etoiles());

			ps.setString(4, h.getAdresse_clinic());
			ps.setString(5, h.getDescription());
			ps.setString(6, h.getTel_clinic());

			ps.setInt(7, h.getId_clinic());
			rowUpdated = ps.executeUpdate();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return rowUpdated;
	}

	public int deleteClinic(int id) {
		int status = 0;
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("delete from clinic where id_clinic=?;");
			ps.setInt(1, id);
			status = ps.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return status;
	}

}
