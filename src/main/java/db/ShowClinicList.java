package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import beans.Clinic;

public class ShowClinicList {
	public ArrayList<Clinic> SearchClinics(String ville, String date_init, String date_end, String prs, String ch) {
		ArrayList<Clinic> clinics_list = new ArrayList<Clinic>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement(
					"select clinic.id_clinic, clinic.nom_clinic, clinic.ville_clinic, clinic.nbr_etoiles, clinic.image_clinic,"
							+ " clinic.adresse_clinic, clinic.description, clinic.tel_clinic, clinic.id_prs from clinic,chambre where clinic.id_clinic=chambre.id_clinic "
							+ "and clinic.ville_clinic=? and chambre.date_init=?  and chambre.date_end=?"
							+ " and chambre.nbr_pers=? and chambre.type_ch=?;");
			ps.setString(1, ville);
			ps.setString(2, date_init);
			ps.setString(3, date_end);
			ps.setString(4, prs);
			ps.setString(5, ch);
			System.out.println("hello world");
			ResultSet st = ps.executeQuery();
			System.out.println("hello world 1");
			while (st.next()) {
				System.out.println("hello world 2");
				Clinic hot = new Clinic();
				System.out.println("hello world 3");
				hot.setId_clinic(st.getInt("id_clinic"));
				hot.setNom_clinic(st.getString("nom_clinic"));
				hot.setVille_clinic(st.getString("ville_clinic"));
				hot.setNbr_etoiles(st.getString("nbr_etoiles"));
				System.out.println("hello world 4");
				hot.setImage_clinic(st.getString("image_clinic"));
				hot.setAdresse_clinic(st.getString("adresse_clinic"));
				hot.setDescription(st.getString("description"));
				hot.setTel_clinic(st.getString("tel_clinic"));
				hot.setId_prs(st.getInt("id_prs"));
				System.out.println("hello world 5");
				clinics_list.add(hot);
				System.out.println("hello world 6");

			}
			cnx.close();

		} catch (Exception e) {
			e.printStackTrace();
		}
		return clinics_list;
	}

	public ArrayList<Clinic> ShowList() {
		ArrayList<Clinic> list_clinics = new ArrayList<Clinic>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement(
					"select id_clinic,nom_clinic, ville_clinic, nbr_etoiles, image_clinic, adresse_clinic,"
							+ "description, tel_clinic from clinic");
			ResultSet st = ps.executeQuery();
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
			System.out.println("plala");
			PreparedStatement ps = cnx.prepareStatement(
					"select personne.id_prs,clinic.id_clinic,clinic.nom_clinic, clinic.ville_clinic,clinic.adresse_clinic,clinic.tel_clinic, clinic.description, clinic.image_clinic,clinic.nbr_etoiles from clinic,personne where clinic.id_prs=personne.id_prs;");
			ResultSet rs = ps.executeQuery();
			System.out.println(rs.next());

			if (rs.next()) {
				System.out.print(rs.getInt("id_clinic") + "JJJJJSJSJSJ");
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
			System.out.println("cole");
			ps.setString(1, h.getNom_clinic());
			ps.setString(2, h.getVille_clinic());
			ps.setString(3, h.getNbr_etoiles());

			ps.setString(4, h.getAdresse_clinic());
			ps.setString(5, h.getDescription());
			ps.setString(6, h.getTel_clinic());

			ps.setInt(7, h.getId_clinic());
			System.out.println("colee");
			rowUpdated = ps.executeUpdate();

		} catch (Exception e) {
			System.out.println("so sorry");
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
