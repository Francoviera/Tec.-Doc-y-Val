package PracticoIII;
import java.util.List;

public class Receta {
	List<ItemReceta> ingredientes;
	String nombre;
	String tiempoDeCoccion;
	float precioVenta;
	/**
	 * devuelve el precio de la venta
	 * @return
	 */
	public float getPrecioVenta() {
		return precioVenta;
	}
	/**
	 * setea el precio de la venta
	 * @param precioVenta
	 */
	public void setPrecioVenta(float precioVenta) {
		this.precioVenta = precioVenta;
	}
	/**
	 * devuelve el nombre de la receta
	 * @return
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * setea el nombre de la receta
	 * @param nombre
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * devuelve el tiempo de cocion
	 * @return
	 */
	public String getTiempoDeCoccion() {
		return tiempoDeCoccion;
	}
	/**
	 * setea el tiempo de cocion 
	 * @param tiempoDeCoccion
	 */
	public void setTiempoDeCoccion(String tiempoDeCoccion) {
		this.tiempoDeCoccion = tiempoDeCoccion;
	}
	/**
	 * agrega ingredientes
	 * @param i
	 */
	public void addIngrediente(ItemReceta i) {
		
		ingredientes.add(i);
	}
	/**
	 * agrega Ingredientes
	 * @param producto
	 * @param cantidad
	 */
	public void addIngrediente(Producto producto, int cantidad ) {
		ItemReceta item=new ItemReceta(producto, cantidad);
		ingredientes.add(item);
	}
}
