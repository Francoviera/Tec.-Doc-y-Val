package PracticoIII;

public class ItemPedido {
	/**
	 * devuelve la cantidad del pedido
	 * @return
	 */
public int getCantidad() {
		return cantidad;
	}
/**
 * setea la cantidad del pedido
 * @param cantidad
 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
	/**
	 * devuelve la receta del pedido
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
	
int cantidad;
Receta receta;
/**
 * constructor de itemPedido
 * @param cantidad
 * @param receta
 */
public ItemPedido(int cantidad, Receta receta) {
	super();
	this.cantidad = cantidad;
	this.receta = receta;
}
/**
 * metodo encargar pedido
 * @throws SinSuficientesIngredientesException
 */
public void encargar() throws SinSuficientesIngredientesException {
	
}
}
