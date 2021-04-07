package prueba;

import java.util.LinkedList;
import java.util.List;

public class Reel {
	private List <String> reel ;

public Reel() {
	reel= new LinkedList<String>();
}

public List <String> reel() {
	return reel;
}

public void agregarValor(String valor) {
	reel.add(valor);
}
public int cantCoincidencias(String valor, int posInicial) {
	int cant = 0;
	for (int i=posInicial; i<(i+4); i++) {
		if (reel.get(i)==valor) {
			cant++;
		}
	}
	return cant;
}
public int tamanioReel() {
	return reel.size();
}

public String valor(int pos) {
	return reel.get(pos);
}


}
