package filip.vjestica.kolokvijum.DTO;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import filip.vjestica.kolokvijum.Model.Iznajmljivanje;
import filip.vjestica.kolokvijum.Model.Knjiga;

public class IznajmljivanjeDTO {
	
	private Long id;
	
	private LocalDateTime datumIznajmljivanja;
	
	private LocalDateTime datumVracanja;
	
	private List<KnjigaDTO> knjige = new ArrayList<KnjigaDTO>();
	
	private ClanDTO clan;

	public IznajmljivanjeDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public IznajmljivanjeDTO(Long id, LocalDateTime datumIznajmljivanja, LocalDateTime datumVracanja,ClanDTO clan) {
		super();
		this.id = id;
		this.datumIznajmljivanja = datumIznajmljivanja;
		this.datumVracanja = datumVracanja;
		this.clan = clan;
	}
	
	public IznajmljivanjeDTO(Iznajmljivanje iznajmljivanje) {
		super();
		this.id = iznajmljivanje.getId();
		this.datumIznajmljivanja = iznajmljivanje.getDatumIznajmljivanja();
		this.datumVracanja = iznajmljivanje.getDatumVracanja();
		this.clan = new ClanDTO(iznajmljivanje.getClan().getId(),iznajmljivanje.getClan().getIme(),iznajmljivanje.getClan().getPrezime(),null);
		for(Knjiga k : iznajmljivanje.getKnjige()) {
			knjige.add(new KnjigaDTO(k.getId(),k.getIsbn(),k.getNaslov(),k.getAutori(),null,null));
		}
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

	public List<KnjigaDTO> getKnjige() {
		return knjige;
	}

	public void setKnjige(List<KnjigaDTO> knjige) {
		this.knjige = knjige;
	}

	public ClanDTO getClan() {
		return clan;
	}

	public void setClan(ClanDTO clan) {
		this.clan = clan;
	}
	
	

}
