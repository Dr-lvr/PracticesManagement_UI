package sample;

public class Pratica{
	private String Proprietario;
	private String Targa;
	private String Immatricolazione;
	private String Accessori;
	private boolean Benzina;
	private boolean Diesel;
	private boolean Elettrica;

	public Pratica(String proprietario, String targa, String immatricolazione, String accessori, boolean benzina, boolean diesel, boolean elettrica){
		Proprietario=proprietario;
		Targa=targa;
		Immatricolazione=immatricolazione;
		Accessori=accessori;
		Benzina=benzina;
		Diesel=diesel;
		Elettrica=elettrica;
	}
	public String getProprietario(){return Proprietario;}
	public void setProprietario(String proprietario){Proprietario=proprietario;}
	public String getTarga(){return Targa;}
	public void setTarga(String targa){Targa=targa;}
	public String getImmatricolazione(){return Immatricolazione;}
	public void setImmatricolazione(String immatricolazione){Immatricolazione=immatricolazione;}
	public String getAccessori(){return Accessori;}
	public void setAccessori(String accessori){Accessori=accessori;}
	public boolean isBenzina(){return Benzina;}
	public void setBenzina(boolean benzina){Benzina=benzina;}
	public boolean isDiesel(){return Diesel;}
	public void setDiesel(boolean diesel){Diesel=diesel;}
	public boolean isElettrica(){return Elettrica;}
	public void setElettrica(boolean elettrica){Elettrica=elettrica;}
	public String getAlimentazione(){
		if(isBenzina()) return "Benzina";
		if(isDiesel()) return "Diesel";
		if(isElettrica()) return "Elettrica";
		return "altro";
	}
}
