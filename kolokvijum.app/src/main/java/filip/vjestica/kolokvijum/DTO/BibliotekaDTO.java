package filip.vjestica.kolokvijum.DTO;

import java.util.ArrayList;
import java.util.List;

import filip.vjestica.kolokvijum.Model.Biblioteka;
import filip.vjestica.kolokvijum.Model.Knjiga;



public class BibliotekaDTO {
	
	private Long id;
	
	private String naziv;
	
	private List<KnjigaDTO> knjige = new ArrayList<KnjigaDTO>();

	public BibliotekaDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BibliotekaDTO(Long id, String naziv) {
		super();
		this.id = id;
		this.naziv = naziv;
		
	}
	
	public BibliotekaDTO(Biblioteka biblioteka) {
		super();
		this.id = biblioteka.getId();
		this.naziv = biblioteka.getNaziv();
		for(Knjiga k : biblioteka.getKnjige()) {
			knjige.add(new KnjigaDTO(k.getId(),k.getIsbn(),k.getNaslov(),k.getAutori(),null,null));		
		}
		
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNaziv() {
		return naziv;
	}

	public void setNaziv(String naziv) {
		this.naziv = naziv;
	}

	public List<KnjigaDTO> getKnjige() {
		return knjige;
	}

	public void setKnjige(List<KnjigaDTO> knjige) {
		this.knjige = knjige;
	}
	
	

}
