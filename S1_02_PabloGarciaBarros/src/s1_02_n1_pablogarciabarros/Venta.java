package s1_02_n1_pablogarciabarros;

import java.util.ArrayList;

public class Venta {
	
	private double precioTotalVenta;
	private ArrayList<Producto> productos;
	
	public Venta() {
		this.productos = new ArrayList<Producto>();
		this.precioTotalVenta = 0;
	}
	
	public double calcularTotal() throws ExcepcionVentaVacia, IndexOutOfBoundException{
		
		boolean flag = false;
		int i = 0;
		
			if(this.productos.isEmpty()) {
				throw new ExcepcionVentaVacia("Primero debe cargar productos. No puede calcularse el total");
			}
			else {
				while(flag == false) {
					if(i < this.productos.size()) {
						this.precioTotalVenta += this.productos.get(i).getPrecio();						
					}
					else {
						flag = true;
						throw new IndexOutOfBoundException("Se supero el limite del array");
					}
					i++;
				}
			}		
			return this.precioTotalVenta;
		}
	
	public void agregarProducto(Producto producto) {
		productos.add(producto);
	}
}
