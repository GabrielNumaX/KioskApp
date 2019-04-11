package kioskapp.controller;


import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TableView;
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
	private Button BtnBuscar;
	@FXML 
	private TextArea Txtarea;
	@FXML
	private TableView<Cliente> TableCliente;
	
	//Aca van los botones
	public void initialize(URL arg0, ResourceBundle arg1) {
		
		BtnBuscar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				buscarCliente();
			}
		});
		
		
		BtnGuardar.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent arg0) {
				crearCliente();
			}
		});
	}

	public void crearCliente(){
		String nombre = TxtNombre.getText();
		String apellido = TxtApellido.getText();
		String telefono = TxtTelefono.getText();
		String numero_cuenta = TxtNumeroCuenta.getText();
		Cliente cliente = new Cliente(nombre, apellido, telefono, numero_cuenta);
		try {
			cliente.guardarCliente(cliente);			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		//Esto de aca abajo es para ver si anda nada mas!
		Txtarea.appendText(cliente.getNombre() + '\n');
		Txtarea.appendText(cliente.getApellido() + '\n');
		Txtarea.appendText(cliente.getTelefono() + '\n');
		Txtarea.appendText(cliente.getNumeroCuenta() + '\n');
	}
	public void buscarCliente(){
		Cliente cliente = new Cliente();
		List<Cliente> lista_clientes = cliente.buscarTodos();
		
		for (int i = 0; i < lista_clientes.size(); i++) {
			TableCliente.getItems().add(lista_clientes.get(i));
		}
		
	}
	public void borrarCliente(){
		
	}
	public void editarCliente(int id){
		
	}
	

}
