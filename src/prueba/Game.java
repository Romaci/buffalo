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
	private List<Reel> reels = new LinkedList<Reel>();

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

//private void configReels() throws FileNotFoundException, IOException {
//	String archivo = "/Buffalo/src/prueba/reelConfig.txt";
//	FileReader f = new FileReader(archivo);
//    BufferedReader b = new BufferedReader(f);
//    String valor;
//	for(int i = 0; i<5;i++) {
//		Reel reel = new Reel();
//		while((valor=b.readLine())!=null & b.readLine()!= " "){
//			reel.agregarValor(valor);
//		}
//		reels.add(reel);
//   }
//    b.close();
//}

public Hit hit(String valor) {
	return hits.get(valor);
}
public HashMap<String, Hit> hits(){
	return hits;
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
			System.out.println(reelAct.get(j));
		}
	}
}

public void imprimirPremioHits() {
	hits.forEach((k,v) -> System.out.println(v.totalHits()));
}



private void configReels() {
	Reel r1=new Reel();
	Reel r2=new Reel();
	Reel r3=new Reel();
	Reel r4=new Reel();
	Reel r5=new Reel();
	r1.reel().add("Q");
	r1.reel().add("P1");
	r1.reel().add("P1");
	r1.reel().add("P1");
	r1.reel().add("K");
	r1.reel().add("P1");
	r1.reel().add("P1");
	r1.reel().add("J");
	r1.reel().add("Q");
	r1.reel().add("P3");
	r1.reel().add("P1");
	r1.reel().add("10");
	r1.reel().add("Q");
	r1.reel().add("K");
	r1.reel().add("P2");
	r1.reel().add("J");
	r2.reel().add("10");
	r2.reel().add("J");
	r2.reel().add("P2");
	r2.reel().add("10");
	r2.reel().add("ACE");
	r2.reel().add("P3");
	r2.reel().add("9");
	r2.reel().add("10");
	r2.reel().add("P4");
	r2.reel().add("Q");
	r2.reel().add("10");
	r2.reel().add("P3");
	r2.reel().add("P2");
	r2.reel().add("P1");
	r2.reel().add("ACE");
	r2.reel().add("10");
	r2.reel().add("P1");
	r2.reel().add("K");
	r3.reel().add("9");
	r3.reel().add("P1");
	r3.reel().add("P1");
	r3.reel().add("P1");
	r3.reel().add("ACE");
	r3.reel().add("P1");
	r3.reel().add("P1");
	r3.reel().add("10");
	r3.reel().add("P1");
	r3.reel().add("9");
	r3.reel().add("P3");
	r3.reel().add("J");
	r3.reel().add("P4");
	r3.reel().add("9");
	r3.reel().add("P3");
	r3.reel().add("J");
	r3.reel().add("P4");
	r3.reel().add("9");
	r3.reel().add("P5");
	r3.reel().add("ACE");
	r3.reel().add("P3");
	r4.reel().add("k");
	r4.reel().add("P1");
	r4.reel().add("P1");
	r4.reel().add("Q");
	r4.reel().add("ACE");
	r4.reel().add("P1");
	r4.reel().add("P1");
	r4.reel().add("K");
	r4.reel().add("P1");
	r4.reel().add("P2");
	r4.reel().add("P1");
	r4.reel().add("J");
	r4.reel().add("P1");
	r4.reel().add("P1");
	r4.reel().add("K");	
	r5.reel().add("Q");
	r5.reel().add("P1");
	r5.reel().add("P1");
	r5.reel().add("P1");
	r5.reel().add("K");
	r5.reel().add("P1");
	r5.reel().add("P1");
	r5.reel().add("P1");
	r5.reel().add("ACE");
	r5.reel().add("Q");
	r5.reel().add("P2");
	r5.reel().add("P1");
	r5.reel().add("P1");
	r5.reel().add("J");
	r5.reel().add("P1");
	r5.reel().add("P1");
	reels.add(r1);
	reels.add(r2);
	reels.add(r3);
	reels.add(r4);
	reels.add(r5);
	
}

}


