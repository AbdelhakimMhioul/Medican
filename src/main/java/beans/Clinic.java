package beans;

public class Clinic {
	private int id_clinic;
	private String nom_clinic;
	private String adresse_clinic;
	private String ville_clinic;
	private String tel_clinic;
	private String description;
	private String nbr_etoiles;
	private String image_clinic;
	private int id_prs;
	
	public Clinic() {
		super();
	}

	public Clinic(int id_clinic, String nom_clinic, String adresse_clinic, String ville_clinic, String tel_clinic,
			String description, String nbr_etoiles, String image_clinic, int id_prs) {
		super();
		this.id_clinic = id_clinic;
		this.nom_clinic = nom_clinic;
		this.adresse_clinic = adresse_clinic;
		this.ville_clinic = ville_clinic;
		this.tel_clinic = tel_clinic;
		this.description = description;
		this.nbr_etoiles = nbr_etoiles;
		this.image_clinic = image_clinic;
		this.id_prs = id_prs;
	}

	public Clinic(int id_clinic, String nom_clinic, String adresse_clinic, String ville_clinic, String tel_clinic,
			String description, String nbr_etoiles, String image_clinic) {
		super();
		this.id_clinic = id_clinic;
		this.nom_clinic = nom_clinic;
		this.adresse_clinic = adresse_clinic;
		this.ville_clinic = ville_clinic;
		this.tel_clinic = tel_clinic;
		this.description = description;
		this.nbr_etoiles = nbr_etoiles;
		this.image_clinic = image_clinic;
	}
	
	public Clinic(String ville_clinic) {
		this.ville_clinic = ville_clinic;
	}

	public int getId_clinic() {
		return id_clinic;
	}
	public void setId_clinic(int id_clinic) {
		this.id_clinic = id_clinic;
	}
	public String getNom_clinic() {
		return nom_clinic;
	}
	public void setNom_clinic(String nom_clinic) {
		this.nom_clinic = nom_clinic;
	}
	public String getAdresse_clinic() {
		return adresse_clinic;
	}
	public void setAdresse_clinic(String adress_clinic) {
		this.adresse_clinic = adress_clinic;
	}
	public String getVille_clinic() {
		return ville_clinic;
	}
	public void setVille_clinic(String ville_clinic) {
		this.ville_clinic = ville_clinic;
	}
	public String getTel_clinic() {
		return tel_clinic;
	}
	public void setTel_clinic(String tel_clinic) {
		this.tel_clinic = tel_clinic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	public String getNbr_etoiles() {
		return nbr_etoiles;
	}
	public void setNbr_etoiles(String i) {
		this.nbr_etoiles = i;
	}
	public String getImage_clinic() {
		return image_clinic;
	}
	public void setImage_clinic(String image_clinic) {
		this.image_clinic = image_clinic;
	}
	public int getId_prs() {
		return id_prs;
	}
	public void setId_prs(int id_prs) {
		this.id_prs = id_prs;
	}
	
	
	
	
}
