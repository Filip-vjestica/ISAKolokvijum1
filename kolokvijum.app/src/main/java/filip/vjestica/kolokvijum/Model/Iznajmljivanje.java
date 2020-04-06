package filip.vjestica.kolokvijum.Model;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;


@Entity
public class Iznajmljivanje {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(columnDefinition = "DATE")
	private LocalDateTime datumIznajmljivanja;
	
	@Column(columnDefinition = "DATE")
	private LocalDateTime datumVracanja;
	
	
	@OneToMany(fetch = FetchType.LAZY,mappedBy = "iznajmljeno" )
	private List<Knjiga> knjige = new ArrayList<Knjiga>();
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Clan clan;

	public Iznajmljivanje() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Iznajmljivanje(Long id, LocalDateTime datumIznajmljivanja, LocalDateTime datumVracanja, List<Knjiga> knjige,
			Clan clan) {
		super();
		this.id = id;
		this.datumIznajmljivanja = datumIznajmljivanja;
		this.datumVracanja = datumVracanja;
		this.knjige = knjige;
		this.clan = clan;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public LocalDateTime getDatumIznajmljivanja() {
		return datumIznajmljivanja;
	}

	public void setDatumIznajmljivanja(LocalDateTime datumIznajmljivanja) {
		this.datumIznajmljivanja = datumIznajmljivanja;
	}

	public LocalDateTime getDatumVracanja() {
		return datumVracanja;
	}

	public void setDatumVracanja(LocalDateTime datumVracanja) {
		this.datumVracanja = datumVracanja;
	}

	public List<Knjiga> getKnjige() {
		return knjige;
	}

	public void setKnjige(List<Knjiga> knjige) {
		this.knjige = knjige;
	}

	public Clan getClan() {
		return clan;
	}

	public void setClan(Clan clan) {
		this.clan = clan;
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
		Iznajmljivanje other = (Iznajmljivanje) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}
	
	
	
	

}
