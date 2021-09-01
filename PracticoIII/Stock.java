package PracticoIII;

import java.util.ArrayList;
import java.util.List;

public class Stock {
List<Producto> stock;

public Stock() {
	stock=new ArrayList<Producto>();
}
/**
 * agrega producto en stock con la cantidad
 * @param p
 * @param cantidad
 */
public void agregar(Producto p, int cantidad) {
	if(stock.indexOf(p)>=0)
		p.setStock(p.getStock()+cantidad);
	else {
		p.setStock(cantidad);
		stock.add(p);
	}
		
}
}
