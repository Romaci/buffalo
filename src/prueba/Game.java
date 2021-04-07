package prueba;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedList;

import java.util.List;

public class Game {
	private HashMap<String, Hit> hits = new HashMap<String, Hit>();
	private List<Reel> reels;

public Game() throws FileNotFoundException, IOException {
	this.configHits();
	this.configReels();
	
}

private void configHits() {
	Hit k=new Hit("k");
	hits.put("k",k);
	Hit q=new Hit("Q");
	hits.put("q",q);
	Hit j=new Hit("J");
	hits.put("j",j);
	Hit nueve=new Hit("9");
	hits.put("9",nueve);
	Hit diez=new Hit("10");
	hits.put("10",diez);
	Hit p1=new Hit("P1");
	hits.put("P1",p1);
	Hit p2=new Hit("P2");
	hits.put("P2",p2);
	Hit p3=new Hit("P3");
	hits.put("P3",p3);
	
}

private void configReels() throws FileNotFoundException, IOException {
	String archivo = "/Buffalo/src/prueba/reelConfig.txt";
	FileReader f = new FileReader(archivo);
    BufferedReader b = new BufferedReader(f);
    String valor;
	for(int i = 0; i<5;i++) {
		Reel reel = new Reel();
		while((valor=b.readLine())!=null & b.readLine()!= " "){
			reel.agregarValor(valor);
		}
		reels.add(reel);
   }
    b.close();
}

public Hit hit(String valor) {
	return hits.get(valor);
}

public List<String> getReel(int nroReel) {
	return reels.get(nroReel).reel();
}

public Reel reel(int nroReel) {
	return reels.get(nroReel);
}

public int tamanioReel(int nroReel) {
	return reels.get(nroReel).tamanioReel();
}


public String getValor(int reel, int pos) {
	return reels.get(reel).valor(pos);
}




public void imprimirReel() {
	for(int i = 0; i<reels.size();i++ ) {
		List<String> reelAct = this.getReel(i);
		System.out.println(String.format("---Reel %d----",i));
		for(int j = 0; j<reelAct.size();j++ ) {
			System.out.print(reelAct.get(j));
		}
	}
}

}
