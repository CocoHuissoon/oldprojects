
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;

import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity

@Table(name = "gebruiker")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="gebruikerid")
	private long id;
	@Column(name="gebruikersnaam")
	private String username;

	
	@Column(name="emailaddres")
	private String email;
	@Column(name="wachtwoord")
	private String password;
	@OneToMany(cascade = { CascadeType.ALL })
	@JoinTable(name = "gebruikersnotities", joinColumns = { @JoinColumn(name = "gebruikerid") }, inverseJoinColumns = {
			@JoinColumn(name = "note-id") })
	private List<Note>notes;
	public User() {}

	public User(String username, String email,String password) {
		super();
		this.username = username;
		this.email = email;
		this.password=password;
	}
	public void adNote(Note note) {
		notes.add(note);
	}
	public String getUsername() {
		return username;
	}

	

}
