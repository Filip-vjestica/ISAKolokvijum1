package filip.vjestica.kolokvijum.DTO;

import filip.vjestica.kolokvijum.Model.Knjiga;

public class KnjigaDTO {
	
	private Long id;
	
	private String isbn;
	
	private String naslov;
	
	private String autori;
	
	private BibliotekaDTO biblioteka;
	
	private IznajmljivanjeDTO iznajmljeno;

	public KnjigaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public KnjigaDTO(Long id, String isbn, String naslov, String autori, BibliotekaDTO biblioteka,
			IznajmljivanjeDTO iznajmljeno) {
		super();
		this.id = id;
		this.isbn = isbn;
		this.naslov = naslov;
		this.autori = autori;
		this.biblioteka = biblioteka;
		this.iznajmljeno = iznajmljeno;
	}
	
	public KnjigaDTO(Knjiga knjiga) {
		super();
		this.id = knjiga.getId();
		this.isbn = knjiga.getIsbn();
		this.naslov = knjiga.getNaslov();
		this.autori = knjiga.getAutori();
		this.biblioteka = new BibliotekaDTO(knjiga.getBiblioteka().getId(),knjiga.getBiblioteka().getNaziv());
		
		
		
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

	public BibliotekaDTO getBiblioteka() {
		return biblioteka;
	}

	public void setBiblioteka(BibliotekaDTO biblioteka) {
		this.biblioteka = biblioteka;
	}

	public IznajmljivanjeDTO getIznajmljeno() {
		return iznajmljeno;
	}

	public void setIznajmljeno(IznajmljivanjeDTO iznajmljeno) {
		this.iznajmljeno = iznajmljeno;
	}
	
	

}
