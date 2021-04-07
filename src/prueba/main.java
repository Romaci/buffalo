package prueba;

import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Hit q= new Hit("q");
		q.sumarHits(2, 4);
		Game game1= new Game("/reelConfig.txt");

		System.out.print(q.totalHits());
	
		

	}

}
