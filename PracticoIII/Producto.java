package PracticoIII;

public class Producto {
static int nextID;
	int id;
int stock;
String nombre;
float precioCompra;
/**
 * constructor de producto
 * @param nombre
 * @param stock
 */
public Producto(String nombre, int stock) {
	this.stock=stock;
	this.nombre=nombre;
}
/**
 * devuelve la cantidad de stock en producto
 * @return
 */
public int getStock() {
	return stock;
}
/**
 * setea el stock de producto
 * @param stock
 */
public void setStock(int stock) {
	this.stock = stock;
}
/**
 * devuelve el nombre del producto
 * @return
 */
public String getNombre() {
	return nombre;
}
/**
 * setea el nombre del producto
 * @param nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * devuelve el precio de la compra
 * @return
 */
public float getPrecioCompra() {
	return precioCompra;
}
/**
 * setea el precio de la compra
 * @param precioCompra
 */
public void setPrecioCompra(float precioCompra) {
	this.precioCompra = precioCompra;
}
}
