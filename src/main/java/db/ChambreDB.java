package db;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import beans.Chambre;

public class ChambreDB {
	public List<Chambre> getRoomsById(int id_clinic){
		List<Chambre> rooms = new ArrayList<Chambre>();
		try {
			Connection cnx = ConnectionDB.loadDatabase();
			PreparedStatement ps = cnx.prepareStatement("select * from chambre where id_clinic=? and etat_ch=0;");
			ps.setInt(1, id_clinic);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Chambre room = new Chambre();
				room.setId_ch(rs.getInt("id_ch"));
				room.setId_clinic(rs.getInt("id_clinic"));
				room.setId_deal(rs.getInt("id_deal"));
				room.setEtat_ch(rs.getInt("etat_ch"));
				room.setDate_end(rs.getDate("date_end"));
				room.setDate_init(rs.getDate("date_init"));
				room.setNbr_pers(rs.getInt("nbr_pers"));
				room.setSuperfice(rs.getString("superfice"));
				room.setDescp_ch(rs.getString("descp_ch"));
				room.setPrix_ch(rs.getString("prix_ch"));
				room.setType_ch(rs.getInt("type_ch"));
				room.setImage_ch(rs.getString("image_ch"));
				room.setTitre_ch(rs.getString("titre_ch"));
				rooms.add(room);
			}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return rooms;
	}
}