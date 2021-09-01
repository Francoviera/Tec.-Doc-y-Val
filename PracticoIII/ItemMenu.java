package PracticoIII;
import java.util.List;

public class ItemMenu {
static int nextID;
int id;
String nombre;
float precio;
Receta receta;
String tipo;
public String getNombre() {
	return nombre;
}
/**
 * setea nombre del menu
 * @param nombre
 */
public void setNombre(String nombre) {
	this.nombre = nombre;
}
/**
 * devuelve el precio del producto
 * @return
 */
public float getPrecio() {
	return precio;
}
/**
 * setea el precio del menu
 * @param precio
 */
public void setPrecio(float precio) {
	this.precio = precio;
}
/**
 * devuelve la receta
 * @return
 */
public Receta getReceta() {
	return receta;
}
/**
 * setea la receta
 * @param receta
 */
public void setReceta(Receta receta) {
	this.receta = receta;
}
/**
 * devuelve el tipo 
 * @return
 */
public String getTipo() {
	return tipo;
}
/**
 * setea el tipo 
 * @param tipo
 */
public void setTipo(String tipo) {
	this.tipo = tipo;
}
/**
 * constructor de item menu
 * @param nombre
 * @param precio
 * @param receta
 * @param tipo
 */
public ItemMenu(String nombre, float precio, Receta receta, String tipo) {
	super();
	this.id=nextID;
	nextID++;
	this.nombre = nombre;
	this.precio = precio;
	this.receta = receta;
	this.tipo = tipo;
}

}
