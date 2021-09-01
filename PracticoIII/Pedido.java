package PracticoIII;
import java.util.List;

public class Pedido {
static int nextID=0;


List<ItemPedido> items;
Usuario usuario;
String estado;
int id;
public Pedido() {
	super();
	this.items = items;
	this.usuario = usuario;
}
/**
 * devuelve nextID
 * @return
 */
public static int getNextID() {
	return nextID;
}
/**
 * setea nextID
 * @param nextID
 */
public static void setNextID(int nextID) {
	Pedido.nextID = nextID;
}
/**
 * devuelve el ID
 * @return
 */
public int getId() {
	return id;
}
/**
 * setea el Id
 * @param id
 */
public void setId(int id) {
	this.id = id;
}
/**
 * constructor Pedido
 * @param items
 * @param usuario
 */
public Pedido(List<ItemPedido> items, Usuario usuario) {
	super();
	this.items = items;
	this.usuario = usuario;
	estado=null;
}
/**
 * agrega el item 
 * @param item
 */
void agregarItem(ItemPedido item) {
if(estado==null)
	estado="ABIERTO";
	items.add(item);
}
/**
 * elimina el item
 * @param item
 */
void eliminarItem(ItemPedido item) {
	items.remove(item);
}
/**
 * devuelve total del pedido
 * @return
 */
float totalPedido() {
	float  acum=0.0f;
	for(int i = 0;i<items.size();i++) {
		acum+=items.get(i).cantidad*items.get(i).getReceta().getPrecioVenta();
	}
	return acum;
}
/**
 * funcion completa el pedido
 */
void completarPedido() {
	float total=totalPedido();
	try {
		this.getUsuario().descontarSaldo(total);
		this.setEstado("ENVIADO");
	} catch (SinSaldoException e) {
		System.out.println(e);	
	} finally {
		
	}
	
}
/**
 * devuelve el listado de item del pedido
 * @return
 */
public List<ItemPedido> getItems() {
	return items;
}
/**
 * setea el listado de item del pedido
 * @param items
 */
public void setItems(List<ItemPedido> items) {
	this.items = items;
}
/**
 * devuelve el usuario
 * @return
 */
public Usuario getUsuario() {
	return usuario;
}
/**
 * setea el usuario
 * @param usuario
 */
public void setUsuario(Usuario usuario) {
	this.usuario = usuario;
}
/**
 * devuelve el estado
 * @return
 */
public String getEstado() {
	return estado;
}
/**
 * setea el estado
 * @param estado
 */
public void setEstado(String estado) {
	this.estado = estado;
}

}
