package kioskapp.controller;


import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import kioskapp.model.Cliente;

public class ClienteController implements Initializable{
	//Todos los controladores tienen que implementar la interfaz Initializable
	@FXML
	private TextField TxtNombre;
	@FXML
	private TextField TxtApellido;
	@FXML
	private TextField TxtTelefono;
	@FXML
	private TextField TxtNumeroCuenta;
	@FXML
	private Button BtnGuardar;
	@FXML 
	private TextArea Txtarea;
	
	
	public void initialize(URL arg0, ResourceBundle arg1) {
		BtnGuardar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				String nombre = TxtNombre.getText();
				String apellido = TxtApellido.getText();
				String telefono = TxtTelefono.getText();
				String numero_cuenta = TxtNumeroCuenta.getText();
				
				crearCliente(nombre,apellido,telefono,numero_cuenta);
			}
		});
	}

	public void crearCliente(String nombre, String apellido, String telefono, String numero_cuenta) {
		Cliente cliente = new Cliente(nombre,apellido,telefono,numero_cuenta);
		Txtarea.appendText(cliente.getNombre() + '\n');
		Txtarea.appendText(cliente.getApellido() + '\n');
		Txtarea.appendText(cliente.getTelefono() + '\n');
		Txtarea.appendText(cliente.getNumeroCuenta() + '\n');
	}
	

}
