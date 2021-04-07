package prueba;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

import java.util.List;

public class Game {
	private List<Hit> hits;
	private List<List<String>> reels;

public Game(String a) throws FileNotFoundException, IOException {
	this.configHits();
	this.configReels(a);
	
}

private void configHits() {
	Hit k=new Hit("k");
	hits.add(k);
	Hit q=new Hit("Q");
	hits.add(q);
	Hit j=new Hit("J");
	hits.add(j);
	Hit nueve=new Hit("9");
	hits.add(nueve);
	Hit diez=new Hit("10");
	hits.add(diez);
	Hit p1=new Hit("P1");
	hits.add(p1);
	Hit p2=new Hit("P2");
	hits.add(p2);
	Hit p3=new Hit("p3");
	hits.add(p3);
	
}

public void configReels(String archivo) throws FileNotFoundException, IOException {
	FileReader f = new FileReader(archivo);
    BufferedReader b = new BufferedReader(f);
    String valor;
	for(int i = 1; i<6;i++) {
		List <String> reel = new LinkedList<String>();
		while((valor=b.readLine())!=null & b.readLine()!= " "){
			reel.add(valor);
		}
		reels.add(reel);
   }
    b.close();
}

public void imprimirReel() {
	for(int i = 0; i<reels.size();i++ ) {
		List<String> reelAct = reels.get(i);
		System.out.println(String.format("---Reel %d----",i));
		for(int j = 0; j<reelAct.size();j++ ) {
			System.out.print(reelAct.get(j));
		}
	}
}

}
