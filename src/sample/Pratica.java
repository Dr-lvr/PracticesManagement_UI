package sample;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.awt.*;

public class Pratica{
	private String Proprietario;
	private String Targa;
	private String Immatricolazione;
	private String Access;
	private boolean Benzina;
	private boolean Diesel;
	private boolean Elettrica;

	public Pratica(String proprietario, String targa, String immatricolazione, /*String access,*/ boolean benzina, boolean diesel, boolean elettrica){
		Proprietario=proprietario;
		Targa=targa;
		Immatricolazione=immatricolazione;
		//Access=access;
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
	public String getAccess(){return Access;}
	public void setAccess(String access){Access=access;}
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
