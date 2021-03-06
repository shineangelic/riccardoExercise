import fattoria.Animale;
import fattoria.Fattoria;
import fattoria.animali.Cane;
import fattoria.animali.Gallina;
import fattoria.animali.Mucca;

public class FattoriaTest {

	public static void main(String[] args) {

		System.out.println("Nella vecchia fattoria ia ia OOObjectOriented");

		Fattoria fattoriaDiTest = creaFattoriaDiTest(3);

		// TODO 1riccardo perche le mucche abbaiano?+
		// TODO 2dai una raddrizzata al contadino
		// TODO 3aggiusta il cane rabbioso
		fattoriaDiTest.faiAppello();
		
		// TODO 4fix NotImplementedException
		Animale bestiaTest = fattoriaDiTest.getAnimaleACaso();
	}

	/**
	 * Test method, create a fake farm
	 * 
	 * @return
	 */
	public static Fattoria creaFattoriaDiTest(int numGalline) {
		Fattoria fattoriaDiTest = new Fattoria();
		// cazzo di cane
		Animale fido = new Cane("Fido");
		fattoriaDiTest.aggiungiAnimale(fido);

		Animale erminia = new Mucca("erminia");
		fattoriaDiTest.aggiungiAnimale(erminia);
		// eh eh
		Animale matilde = new Mucca("Matilde");
		fattoriaDiTest.aggiungiAnimale(matilde);

		// un po' di pollame
		for (int i = 0; i < numGalline; i++) {
			Animale pita = new Gallina("Gallina " + i);
			fattoriaDiTest.aggiungiAnimale(pita);
		}

		return fattoriaDiTest;
	}
}
