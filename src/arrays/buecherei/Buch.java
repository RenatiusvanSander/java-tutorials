package arrays.buecherei;

import java.util.Objects;

public class Buch {

	private String autor;
	
	private String titel;
	
	private String jahr;
	
	private String ISBN;

	public Buch() {
	}

	public Buch(String autor, String titel, String jahr, String iSBN) {
		this.autor = autor;
		this.titel = titel;
		this.jahr = jahr;
		ISBN = iSBN;
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

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	@Override
	public int hashCode() {
		return Objects.hash(ISBN, autor, jahr, titel);
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
		return Objects.equals(ISBN, other.ISBN) && Objects.equals(autor, other.autor)
				&& Objects.equals(jahr, other.jahr) && Objects.equals(titel, other.titel);
	}

	@Override
	public String toString() {
		return "Buch [autor=" + autor + ", titel=" + titel + ", jahr=" + jahr + ", ISBN=" + ISBN + "]";
	}
}
