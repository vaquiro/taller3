package constantes;

public enum Menu {
	MENU("         * 1 Agregar cliente\n" + "         * 2 Editar cliente\n" + "         * 3 Eliminar cliente\n"
			+ "         * 4 Agregar productos\n"
			+ "         * 5 Consultar clientes con documento y tipo de documento \n"
			+ "         * 0 salir de la aplicacion"),
	VACIO(""), 
	MENU_OPTION_0("0");
	private String lista;

	private Menu(String lista) {
		this.lista = lista;
	}

	public String getLista() {
		return lista;
	}

}
