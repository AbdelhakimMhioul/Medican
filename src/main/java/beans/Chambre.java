package beans;

import java.sql.Date;

public class Chambre {
	private int id_ch;
	private int id_clinic;
	private int id_deal;
	private int type_ch;
	private String descp_ch;
	private String superfice;
	private String prix_ch;
	private int etat_ch;
	private int nbr_pers;
	private Date date_init;
	private Date date_end;
	private String titre_ch;
	private String image_ch;
	
	public int getId_ch() {
		return id_ch;
	}
	public void setId_ch(int id_ch) {
		this.id_ch = id_ch;
	}
	public int getId_clinic() {
		return id_clinic;
	}
	public void setId_clinic(int id_clinic) {
		this.id_clinic = id_clinic;
	}
	public int getId_deal() {
		return id_deal;
	}
	public void setId_deal(int id_deal) {
		this.id_deal = id_deal;
	}
	public int getType_ch() {
		return type_ch;
	}
	public void setType_ch(int type_ch) {
		this.type_ch = type_ch;
	}
	public String getDescp_ch() {
		return descp_ch;
	}
	public void setDescp_ch(String descp_ch) {
		this.descp_ch = descp_ch;
	}
	public String getSuperfice() {
		return superfice;
	}
	public void setSuperfice(String superfice) {
		this.superfice = superfice;
	}
	public String getPrix_ch() {
		return prix_ch;
	}
	public void setPrix_ch(String prix_ch) {
		this.prix_ch = prix_ch;
	}
	public int getEtat_ch() {
		return etat_ch;
	}
	public void setEtat_ch(int etat_ch) {
		this.etat_ch = etat_ch;
	}
	public int getNbr_pers() {
		return nbr_pers;
	}
	public void setNbr_pers(int nbr_pers) {
		this.nbr_pers = nbr_pers;
	}
	public Date getDate_init() {
		return date_init;
	}
	public void setDate_init(Date date_init) {
		this.date_init = date_init;
	}
	public Date getDate_end() {
		return date_end;
	}
	public void setDate_end(Date date_end) {
		this.date_end = date_end;
	}
	public String getImage_ch() {
		return image_ch;
	}
	public void setImage_ch(String image_ch) {
		this.image_ch = image_ch;
	}
	public String getTitre_ch() {
		return titre_ch;
	}
	public void setTitre_ch(String titre_ch) {
		this.titre_ch = titre_ch;
	}
}