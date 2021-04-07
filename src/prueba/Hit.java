package prueba;

import java.util.HashMap;

public class Hit {
	private String valor;
	private HashMap<Integer, Integer> hits;
	
public Hit (String unValor) {
	valor = unValor;
	hits = new HashMap<Integer, Integer>();
	for (int i=2; i<6; i++) {
		hits.put(i,0);
	}
}

public String getValor () {
	return valor;
}
public void sumarHits(int key, int cant) {
	int tot=cant+ hits.get(key);
	hits.put(key,tot);
}

public String totalHits() {
	String total="";
	for (int i=2; i<=hits.size()+1;i++) {
		total += String.format("%sx%d:%d\n",valor,i,hits.get(i));  
	}
	return total;
}
	
	
}

