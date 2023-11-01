package arrays.buecherei;

import java.util.Objects;

public class Buch {

	private String autor;
	
	private String titel;
	
	private String jahr;
	
	private String isbn;
	
	private int auflage;

	public Buch() {
	}

	public Buch(String autor, String titel, String jahr, String iSBN) {
		this.autor = autor;
		this.titel = titel;
		this.jahr = jahr;
		isbn = iSBN;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getTitel() {
		return titel;
	}

	public void setTitel(String titel) {
		this.titel = titel;
	}

	public String getJahr() {
		return jahr;
	}

	public void setJahr(String jahr) {
		this.jahr = jahr;
	}

	public String getIsbn() {
		return isbn;
	}

	public int getAuflage() {
		return auflage;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public void setAuflage(int auflage) {
		this.auflage = auflage;
	}

	@Override
	public int hashCode() {
		return Objects.hash(auflage, autor, isbn, jahr, titel);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Buch other = (Buch) obj;
		return auflage == other.auflage && Objects.equals(autor, other.autor) && Objects.equals(isbn, other.isbn)
				&& Objects.equals(jahr, other.jahr) && Objects.equals(titel, other.titel);
	}

	@Override
	public String toString() {
		return "Buch [autor=" + autor + ", titel=" + titel + ", jahr=" + jahr + ", isbn=" + isbn + ", auflage="
				+ auflage + "]";
	}
}
