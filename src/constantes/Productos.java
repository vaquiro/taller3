package constantes;

public enum Productos {

	MSG_PRODUCTO("Producto "), 
	MSG_NOMBRE_PRODUCTO("Nombre producto "), 
	MSG_CARACTERISTICAS("Caracter�sticas "), 
	MSG_ID_PRODUCTO("Id Producto "),
	MSG_CONDICIONES("Condiciones "),
	MSG_CREAR("�Quieres crear un producto?");


	private String lista;

	private Productos(String lista) {
		this.lista = lista;
	}

	public String getLista() {
		return lista;
	}
}
