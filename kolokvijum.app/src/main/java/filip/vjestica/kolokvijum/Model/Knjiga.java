package filip.vjestica.kolokvijum.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.Type;

@Entity
public class Knjiga {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Type(type = "text")
	private String isbn;
	
	@Column
	@Type(type = "text")
	private String naslov;
	
	@Column
	@Type(type = "text")
	private String autori;
	
	@ManyToOne(optional = false)
	private Biblioteka biblioteka;
	
	
	@ManyToOne(optional = false)
	private Iznajmljivanje iznajmljeno;


	public Knjiga() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Knjiga(Long id, String isbn, String naslov, String autori, Biblioteka biblioteka,
			Iznajmljivanje iznajmljeno) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.naslov = naslov;
		this.autori = autori;
		this.biblioteka = biblioteka;
		this.iznajmljeno = iznajmljeno;
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getIsbn() {
		return isbn;
	}


	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}


	public String getNaslov() {
		return naslov;
	}


	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}


	public String getAutori() {
		return autori;
	}


	public void setAutori(String autori) {
		this.autori = autori;
	}


	public Biblioteka getBiblioteka() {
		return biblioteka;
	}


	public void setBiblioteka(Biblioteka biblioteka) {
		this.biblioteka = biblioteka;
	}


	public Iznajmljivanje getIznajmljeno() {
		return iznajmljeno;
	}


	public void setIznajmljeno(Iznajmljivanje iznajmljeno) {
		this.iznajmljeno = iznajmljeno;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
