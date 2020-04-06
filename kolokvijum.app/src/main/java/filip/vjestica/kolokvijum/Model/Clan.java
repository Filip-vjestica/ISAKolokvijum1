package filip.vjestica.kolokvijum.Model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.OneToMany;

import org.hibernate.annotations.Type;



@Entity

public class Clan {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column
	@Type(type = "text")
	private String ime;
	
	@Column
	@Type(type = "text")
	private String prezime;
	
	@OneToMany(mappedBy = "clan")
	private Set<Iznajmljivanje> iznajmljen = new HashSet<Iznajmljivanje>();

	public Clan() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Clan(Long id, String ime, String prezime, Set<Iznajmljivanje> iznajmljen) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.iznajmljen = iznajmljen;
	}



	public Set<Iznajmljivanje> getIznajmljen() {
		return iznajmljen;
	}



	public void setIznajmljen(Set<Iznajmljivanje> iznajmljen) {
		this.iznajmljen = iznajmljen;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getIme() {
		return ime;
	}

	public void setIme(String ime) {
		this.ime = ime;
	}

	public String getPrezime() {
		return prezime;
	}

	public void setPrezime(String prezime) {
		this.prezime = prezime;
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
		Clan other = (Clan) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	

}
