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
	int pos = 0;
	for (int i=posInicial; i<(posInicial+4); i++) {
		if(reel.size()-1<i) {
			pos=(reel.size()-i)*-1;
		}
		else {
			pos=i;
		}
		if (reel.get(pos)==valor) {
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
