package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {
	//componenti dell'interfaccia come attributi della classe
	@FXML private TextField proprietario;
	@FXML private TextField targa;
	@FXML private TextField immatricolazione;
	@FXML private TextField proprietarioOut;
	@FXML private TextField targaOut;
	@FXML private TextField immatricolazioneOut;
	@FXML private TextField alimentazioneOut;
	@FXML private TextArea Accesso;
	@FXML private RadioButton benzina;
	@FXML private RadioButton diesel;
	@FXML private RadioButton elettrica;
	@FXML private Button sub;
	@FXML private Button res;

	@FXML private Label out;

	private Queue<Pratica> pratiche;
	//costruttore che istanzia il Model
	public Controller(){
		pratiche = new Queue<Pratica>();
	}
	public void Submit(ActionEvent actionEvent){
		pratiche.Enqueue(new Pratica(
				proprietario.getText(),
				targa.getText(),
				immatricolazione.getText(),
				benzina.isSelected(),
				diesel.isSelected(),
				elettrica.isSelected()
		));
		proprietario.setText("");
		targa.setText("");
		immatricolazione.setText("");
		benzina.setSelected(false);
		diesel.setSelected(false);
		elettrica.setSelected(false);
	}
	public void Reset(ActionEvent actionEvent){
		proprietario.setText("");
		targa.setText("");
		immatricolazione.setText("");
		benzina.setSelected(false);
		diesel.setSelected(false);
		elettrica.setSelected(false);
	}
	public void Get(ActionEvent actionEvent){
		try{
			Pratica tmp = pratiche.Dequeue();
			proprietarioOut.setText(tmp.getProprietario());
			targaOut.setText(tmp.getTarga());
			immatricolazioneOut.setText(tmp.getImmatricolazione());
			alimentazioneOut.setText(tmp.getAlimentazione());
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	public void Discard(ActionEvent actionEvent){
		proprietarioOut.setText("");
		targaOut.setText("");
		immatricolazioneOut.setText("");
		alimentazioneOut.setText("");
	}
	public void ReSubmit(ActionEvent actionEvent){

		this.Submit(actionEvent);
	}
	public void Modify(ActionEvent actionEvent){
	}
}
