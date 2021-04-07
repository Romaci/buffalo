package prueba;

import java.io.FileNotFoundException;
import java.io.IOException;

public class main {

public static void main(String[] args) throws FileNotFoundException, IOException {
		// TODO Auto-generated method stub
		Game game1= new Game();
		game1.imprimirReel();
		String valorAct;
		int hitTot;
		int jugada;
		for (int i = 0 ; i <game1.tamanioReel(0); i++) {
		 for(int x=i; i<i+4;x++) {
			valorAct = game1.getValor(1, i);
			hitTot = 0;
			jugada = 1;
			for(int j=0; j < game1.tamanioReel(1); j++) {
				if(game1.reel(1).cantCoincidencias(valorAct,j)>0) {
					hitTot*=game1.reel(0).cantCoincidencias(valorAct,i);
					hitTot*=game1.reel(1).cantCoincidencias(valorAct,j);
					jugada=2;
					for(int k=0; k < game1.tamanioReel(2);k++) {
						if(game1.reel(1).cantCoincidencias(valorAct,j)>0) {
							hitTot*=game1.reel(1).cantCoincidencias(valorAct,k);
							jugada=3;
							for(int l = 0; l< game1.tamanioReel(3);l++) {
								if(game1.reel(1).cantCoincidencias(valorAct,l)>0) {
									hitTot*=game1.reel(1).cantCoincidencias(valorAct,l);
									jugada=4;
									for(int m = 0; m< game1.tamanioReel(4);m++) {
										if(game1.reel(1).cantCoincidencias(valorAct,m)>0) {
											hitTot*=game1.reel(1).cantCoincidencias(valorAct,m);
											jugada=5;
											game1.hit(valorAct).sumarHits(jugada, hitTot);
										}
									}
									game1.hit(valorAct).sumarHits(jugada, hitTot);
								}
							}
							game1.hit(valorAct).sumarHits(jugada, hitTot);
						}
					}
					game1.hit(valorAct).sumarHits(jugada, hitTot);
				}
			}
		}
	}
	game1.imprimirPremioHits();
	
}	
}

