
import javax.persistence.*;


@Entity
@Table(name = "notitie")
public class Note {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="note-id")
	private long id;
	@Column(name="titel")
	private String title;
	@Column(name="beschrijving")
	private String content;
	

	public Note() {}
	
	
	public Note( String title, String content) {
		super();
		this.id = id;
		this.title = title;
		this.content = content;
		
	}

}
