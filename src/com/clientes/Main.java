package com.clientes;

import static constantes.Clientes.MSG_ACTUALIZADO;
import static constantes.Clientes.MSG_CLIENTE;
import static constantes.Clientes.MSG_CONSULTA;
import static constantes.Clientes.MSG_CREADO;
import static constantes.Clientes.MSG_DIRECCION;
import static constantes.Clientes.MSG_DOCUMENTO;
import static constantes.Clientes.MSG_DOCUMENTO_EDITAR;
import static constantes.Clientes.MSG_DOCUMENTO_ELIMINAR;
import static constantes.Clientes.MSG_ELIMINADO;
import static constantes.Clientes.MSG_GRACIAS;
import static constantes.Clientes.MSG_NOMBRE;
import static constantes.Clientes.MSG_NO_EXISTE;
import static constantes.Clientes.MSG_NO_OPCION;
import static constantes.Clientes.MSG_TELEFONO;
import static constantes.Clientes.MSG_TIPO;
import static constantes.Clientes.MSG_TIPO_DOCUMENTO;
import static constantes.Menu.MENU;
import static constantes.Menu.MENU_OPTION_0;
import static constantes.Menu.VACIO;
import static constantes.Productos.MSG_CARACTERISTICAS;
import static constantes.Productos.MSG_CONDICIONES;
import static constantes.Productos.MSG_CREAR;
import static constantes.Productos.MSG_ID_PRODUCTO;
import static constantes.Productos.MSG_NOMBRE_PRODUCTO;
import static constantes.Productos.MSG_PRODUCTO;
import static javax.swing.JOptionPane.showInputDialog;

import java.util.ArrayList;
import java.util.Scanner;

import javax.swing.JOptionPane;

import com.clases.Clientes;
import com.clases.Producto;

public class Main {

	static ArrayList<Producto> arrayProductos = new ArrayList<>();

	public static void main(String[] args) {

		ArrayList<Clientes> arrayClientes = new ArrayList<>();

		Scanner in = new Scanner(System.in);
		String numeroMenu = VACIO.getLista();
		while (!numeroMenu.equals(MENU_OPTION_0.getLista())) {
			numeroMenu = showInputDialog(MENU.getLista());

			switch (numeroMenu) {

			case "1":
				String tipoDocumento;
				String documento;
				String nombre;
				String telefono;
				String direccion;
				ArrayList<Producto> productos = new ArrayList<>();

				tipoDocumento = showInputDialog(MSG_TIPO_DOCUMENTO.getLista());
				documento = showInputDialog(MSG_DOCUMENTO.getLista());
				nombre = showInputDialog(MSG_NOMBRE.getLista());
				telefono = showInputDialog(MSG_TELEFONO.getLista());
				direccion = showInputDialog(MSG_DIRECCION.getLista());

				int opcion = JOptionPane.showOptionDialog(null, MSG_CREAR.getLista(), MSG_PRODUCTO.getLista(),
						JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, null, null, null);

				if (opcion == JOptionPane.YES_OPTION) {
					crearProductos();
				}

				arrayClientes.add(new Clientes(tipoDocumento, documento, nombre, telefono, direccion, productos));

				for (int i = 0; i < arrayClientes.size(); i++) {
					System.out.println(MSG_CREADO.getLista());
					System.out.println(MSG_CLIENTE.getLista() + i + ":");
					System.out.println(MSG_TIPO_DOCUMENTO.getLista() + arrayClientes.get(i).getDocumento());
					System.out.println(MSG_DOCUMENTO.getLista() + arrayClientes.get(i).getDocumento());
					System.out.println(MSG_NOMBRE.getLista() + arrayClientes.get(i).getNombre());
					System.out.println(MSG_TELEFONO.getLista() + arrayClientes.get(i).getTelefono());
					System.out.println(MSG_DIRECCION.getLista() + arrayClientes.get(i).getDireccion());
					verProductos();

				}

				break;

			case "2":
				documento = showInputDialog(MSG_DOCUMENTO_EDITAR.getLista());
				if (!arrayClientes.isEmpty()) {
					for (int i = 0; i < arrayClientes.size();) {
						if (arrayClientes.get(i).getDocumento().equals(documento)) {
							arrayClientes.get(i).setDocumento(documento);
							arrayClientes.get(i).setNombre(showInputDialog(MSG_NOMBRE.getLista()));
							arrayClientes.get(i).setTelefono(showInputDialog(MSG_TELEFONO.getLista()));
							arrayClientes.get(i).setDireccion(showInputDialog(MSG_DIRECCION.getLista()));

							System.out.println(MSG_ACTUALIZADO.getLista());
							for (int j = 0; j < arrayClientes.size(); j++) {
								System.out.println(MSG_CLIENTE.getLista() + j + ":");
								System.out.println(MSG_TIPO_DOCUMENTO.getLista() + arrayClientes.get(j).getDocumento());
								System.out.println(MSG_DOCUMENTO.getLista() + arrayClientes.get(j).getDocumento());
								System.out.println(MSG_NOMBRE.getLista() + arrayClientes.get(j).getNombre());
								System.out.println(MSG_TELEFONO.getLista() + arrayClientes.get(j).getTelefono());
								System.out.println(MSG_DIRECCION.getLista() + arrayClientes.get(j).getDireccion());
							}

							break;
						} else {
							System.out.println(MSG_NO_EXISTE.getLista());
							break;
						}
					}

				}
				break;

			case "3":
				documento = showInputDialog(MSG_DOCUMENTO_ELIMINAR.getLista());
				if (!arrayClientes.isEmpty()) {
					for (int i = 0; i < arrayClientes.size(); i++) {
						if (arrayClientes.get(i).getDocumento().equals(documento)) {
							arrayClientes.remove(i);
							System.out.println(MSG_ELIMINADO.getLista());

							break;
						} else {
							System.out.println(MSG_NO_EXISTE.getLista());
							break;
						}
					}
					break;
				}

			case "4":
				crearProductos();
				verProductos();
				break;
			case "5":
				tipoDocumento = showInputDialog(MSG_TIPO.getLista());
				documento = showInputDialog(MSG_DOCUMENTO_EDITAR.getLista());

				if (!arrayClientes.isEmpty()) {
					for (int i = 0; i < arrayClientes.size(); i++) {
						if (arrayClientes.get(i).getDocumento().equals(documento)
								&& arrayClientes.get(i).getTipoDocumento().equals(tipoDocumento)) {

							for (int j = 0; j < arrayClientes.size(); j++) {
								System.out.println(MSG_CONSULTA.getLista() + j + ":");
								System.out.println(MSG_TIPO_DOCUMENTO.getLista() + arrayClientes.get(j).getDocumento());
								System.out.println(MSG_DOCUMENTO.getLista() + arrayClientes.get(j).getDocumento());
								System.out.println(MSG_NOMBRE.getLista() + arrayClientes.get(j).getNombre());
								System.out.println(MSG_TELEFONO.getLista() + arrayClientes.get(j).getTelefono());
								System.out.println(MSG_DIRECCION.getLista() + arrayClientes.get(j).getDireccion());
							}

							break;
						}
					}
					break;
				}

				break;
			case "0":
				System.out.println(MSG_GRACIAS.getLista());
				break;
			default:
				System.out.println(MSG_NO_OPCION.getLista());
				break;
			}

		}
		in.close();

	}

	public static void crearProductos() {

		String nombreProducto;
		String carateristicas;
		String idProducto;
		String condiciones;

		nombreProducto = showInputDialog(MSG_NOMBRE_PRODUCTO.getLista());
		carateristicas = showInputDialog(MSG_CARACTERISTICAS.getLista());
		idProducto = showInputDialog(MSG_ID_PRODUCTO.getLista());
		condiciones = showInputDialog(MSG_CONDICIONES.getLista());

		arrayProductos.add(new Producto(nombreProducto, carateristicas, idProducto, condiciones));

	}

	public static void verProductos() {

		for (int i = 0; i < arrayProductos.size(); i++) {
			System.out.println(MSG_CREADO.getLista());
			System.out.println(MSG_PRODUCTO.getLista() + i + ":");
			System.out.println(MSG_NOMBRE_PRODUCTO.getLista() + arrayProductos.get(i).getNombre());
			System.out.println(MSG_CARACTERISTICAS.getLista() + arrayProductos.get(i).getCarateristicas());
			System.out.println(MSG_ID_PRODUCTO.getLista() + arrayProductos.get(i).getIdProducto());
			System.out.println(MSG_CONDICIONES.getLista() + arrayProductos.get(i).getCondiciones());
		}
	}

}
