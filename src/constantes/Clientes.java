package constantes;

public enum Clientes {

	MSG_TIPO_DOCUMENTO("Tipo documento "), 
	MSG_DOCUMENTO("Documento "),
	MSG_TIPO("Ingrese el tipo de documento del cliente"), 
	MSG_DOCUMENTO_EDITAR("Ingrese el documento del cliente"), 
	MSG_DOCUMENTO_ELIMINAR("Ingrese el documento del cliente"), 
	MSG_CLIENTE("Cliente "), 
	MSG_CONSULTA("La información del cliente es: "), 
	MSG_NOMBRE("Nombre "), 
	MSG_TELEFONO("Teléfono "), 
	MSG_DIRECCION("Dirección "),
	MSG_PRODUCTOS("Productos "),
	MSG_CREADO("Registro agregado correctamente"), 
	MSG_ACTUALIZADO("Se ha actualizado el cliente correctamente"), 
	MSG_ELIMINADO("Se ha actualizado el cliente correctamente"), 
	ERROR("No se agregó"),
	MSG_GRACIAS("Muchas gracias por usar nuestra app, hasta luego"),
	MSG_NO_OPCION("El valor ingresado no es una opcion de menu"), 
	MSG_NO_EXISTE("El cliente no fue encontrado");
	private String lista;

	private Clientes(String lista) {
		this.lista = lista;
	}

	public String getLista() {
		return lista;
	}

}
