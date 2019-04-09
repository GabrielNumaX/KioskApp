package interfaces;

import java.util.List;

import entity.Cliente;

public interface ICliente {
	
	public List<Cliente> listaClientes();
	public void CrearCliente(String nombre);
	public Cliente ClientePorIde(int id);
	public void ActualizarCliente(Cliente cliente);
	public void EliminarCliente(Cliente cliente);

}


