package beans;

import java.io.Serializable;

public class Personne implements Serializable {
	private static final long serialVersionUID = 1L;
	private int id_prs;
	private String nom_prs;
	private String prenom_prs;
	private String email;
	private String tel_prs;
	private String type_prs;
	private String password_prs;
	
	public Personne() {
		super();
	}
	
	public int getId_prs() {
		return id_prs;
	}
	public void setId_prs(int id_prs) {
		this.id_prs = id_prs;
	}
	public String getNom_prs() {
		return nom_prs;
	}
	public void setNom_prs(String nom_prs) {
		this.nom_prs = nom_prs;
	}
	public String getPrenom_prs() {
		return prenom_prs;
	}
	public void setPrenom_prs(String prenom_prs) {
		this.prenom_prs = prenom_prs;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTel_prs() {
		return tel_prs;
	}
	public void setTel_prs(String tel_prs) {
		this.tel_prs = tel_prs;
	}
	public String getType_prs() {
		return type_prs;
	}
	public void setType_prs(String type_prs) {
		this.type_prs = type_prs;
	}
	public String getPassword_prs() {
		return password_prs;
	}
	public void setPassword_prs(String password_prs) {
		this.password_prs = password_prs;
	}
	
}
