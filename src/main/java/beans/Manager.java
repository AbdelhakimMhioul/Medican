package beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Manager {
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int id_manager;
	private String nom_manager;
	private String email_manager;
	private String cin_manager;
	private String prenom_manager;
	private String password_manager;
	@OneToOne(mappedBy="manager")
	private Clinic clinic;
}
