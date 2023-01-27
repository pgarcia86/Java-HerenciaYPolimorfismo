package s1_02_n1_pablogarciabarros;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Producto producto1 = new Producto("Jamon", 44.0);
		Producto producto2= new Producto("Queso", 4.0);
		Producto producto3 = new Producto("Agua", 0.25);	
		Producto producto4 = new Producto("Huevos", 1.20);
		
		Venta ventaNueva = new Venta();
		
		ventaNueva.agregarProducto(producto1);
		ventaNueva.agregarProducto(producto2);
		ventaNueva.agregarProducto(producto3);
		ventaNueva.agregarProducto(producto4);
	
		try {
			System.out.println("El precio de la venta es: " + ventaNueva.calcularTotal() + "€");
		}
		catch(ExcepcionVentaVacia evv) {
			System.out.println(evv.getMessage());
		}
		catch(IndexOutOfBoundException ioobe) {
			System.out.println(ioobe.getMessage());
		}
		
	}

}
