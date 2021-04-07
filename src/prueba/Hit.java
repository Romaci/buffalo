package prueba;

import java.util.HashMap;

public class Hit {
	private String valor;
	private HashMap<Integer, Integer> juegos;
	
public Hit (String unValor) {
	valor = unValor;
	juegos = new HashMap<Integer, Integer>();
	for (int i=2; i<6; i++) {
		juegos.put(i,0);
	}
}

public String getValor () {
	return valor;
}
public void sumarHits(int key, int cant) {
	int tot=cant+ juegos.get(key);
	juegos.put(key,tot);
}

public String totalHits() {
	String total="";
	for (int i=2; i<=juegos.size()+1;i++) {
		total += String.format("%sx%d:%d\n",valor,i,juegos.get(i));  
	}
	return total;
}
public void imprimirData() {
	System.out.println(valor);
}
	
}

