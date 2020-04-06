package filip.vjestica.kolokvijum.DTO;

import filip.vjestica.kolokvijum.Model.Clan;

public class ClanDTO {
	
	private Long id;
	
	private String ime;
	
	private String prezime;
	
	private IznajmljivanjeDTO iznajmljen;

	public ClanDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ClanDTO(Long id, String ime, String prezime, IznajmljivanjeDTO iznajmljen) {
		super();
		this.id = id;
		this.ime = ime;
		this.prezime = prezime;
		this.iznajmljen = iznajmljen;
	}
	
	public ClanDTO(Clan clan) {
		super();
		this.id = clan.getId();
		this.ime = clan.getIme();
		this.prezime = clan.getPrezime();
		this.iznajmljen = new IznajmljivanjeDTO();
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

	public IznajmljivanjeDTO getIznajmljen() {
		return iznajmljen;
	}

	public void setIznajmljen(IznajmljivanjeDTO iznajmljen) {
		this.iznajmljen = iznajmljen;
	}
	
	

}
