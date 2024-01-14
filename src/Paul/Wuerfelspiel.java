package Paul;

class Wuerfelspiel {
	public static void main(String[] args) throws InterruptedException {
		double wert = 1.0F;    
		double delta = 1.0F;    
		int i = 0; 
		//zaehler    
		do{    
			delta /= 10.;     
			i++;    
		}while (wert != wert + delta);   
		System.out.println ("Delta: " + delta);   
		System.out.println ("Signifikante Stellen: " + i); 

		// int a = -5;
		// int b = 2;
		// int mod = 0;
		// int div = 0;

		// mod = a % b;
		// div = a/b;

// Game oGame = new Game(5);
// oGame.addPlayer(new Player("Anna"));
// oGame.addPlayer(new Player("Berta"));
// oGame.addPlayer(new Player("Cäsar"));
// oGame.addPlayer(new Player("Dennis"));
// oGame.play();

// System.out.println(oGame.toString());

// oGame.addPlayer(new Player("Emil"));
// oGame.play();
// oGame.sortBeste();

// System.out.println(oGame.toString());
}}

class Wuerfel {
	private static int MAX_AUGENZAHL = 6;

	static void init(int MAX_AUGENZAHL) {
		Wuerfel.MAX_AUGENZAHL = MAX_AUGENZAHL;
	}

	public static int wuerfeln() {
		return (int) (Math.random() * Wuerfel.MAX_AUGENZAHL + 1);
	}
}

class Player {
	private String sName;
	private int iAugenzahl;

	public Player(String sName) {
		this.setsName(sName);
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public void setsAugenzahl(int iAugenzahl) {
		this.iAugenzahl = iAugenzahl;
	}

	public String getsName() {
		return this.sName;
	}

	public int getiAugenzahl() {
		return this.iAugenzahl;
	}

}

class Game {
	private Player[] aGame;
	private int iTop;

	public void addPlayer(Player oPlayer) {
		if (this.isFull()) {
			System.out.println("Maximale Spieler erreicht!");
			return;
		}

		this.aGame[this.getiTop()] = oPlayer;
		this.setiTop(this.getiTop() + 1);
		System.out.println(
				"Spieler " + oPlayer.getsName() + " aufgenommen auf " + this.getiTop() + ".Stelle " + this.getiZahl());
		if (this.isFull()) {
			System.out.println();
		}
	}

	public void sortBeste() {
		int arrayLength = this.aGame.length;
		boolean swapped;
		Player TempVar;

		// Äußere While-Schleife
		while (true) {
			swapped = false;

			// Innere For-Schleife
			for (int i = 1; i < arrayLength; i++) {
				// Vergleiche die Augenzahlen der aufeinanderfolgenden Spielern
				if (this.aGame[i - 1].getiAugenzahl() > this.aGame[i].getiAugenzahl()) {
					// Sortiere die Spieler-Objekte, mit der geringsten Augenzahl, nach vorne
					TempVar = this.aGame[i - 1];
					this.aGame[i - 1] = this.aGame[i];
					this.aGame[i] = TempVar;
					swapped = true;
				}
			}

			// Wenn in dieser Iteration keine Elemente getauscht wurden, ist das Array
			// sortiert
			if (!swapped) {
				break;
			}

			// Reduziere die Größe des zu betrachtenden Bereichs
			arrayLength--;
		}

		for (int i = 0; i < this.aGame.length; i++) {
			// startet bei 1 da zwei folgende werte miteinander verglichen werden
			for (int j = 1; j < (this.aGame.length - 1); j++) {
				if (this.aGame[j].getiAugenzahl() > this.aGame[j + 1].getiAugenzahl()) {
					TempVar = this.aGame[j + 1];
					this.aGame[j + 1] = this.aGame[j];
					this.aGame[j] = TempVar;
				}
			}
		}
	}

	public Game(int numPlayers) {
		this.aGame = new Player[numPlayers];
		this.setiTop(0);

		System.out.println("Wer die höchste Zahl würfelt hat gewonnen!");
	}

	// public void setiZahl(int iZahl) {
	// this.iZahl = iZahl;
	// }

	public String getiZahl() {
		/*
		 * Ergänzung Alex:
		 * this.getiTop() aufgenommen, damit
		 * die Ausgabe wie folgt aussieht [x von y] (Bsp.: [1 von 5])
		 */
		return "[" + this.getiTop() + " von " + this.aGame.length + "]";
	}

	public void setiTop(int iTop) {
		this.iTop = iTop;
	}

	public int getiTop() {
		return this.iTop;
	}

	private boolean isFull() {
		return this.getiTop() == this.aGame.length;
	}

	public String toString() {
		String sStringOut = "";

		for (Player oPlayer : this.aGame) {
			if (oPlayer == null) {
				continue;
			}
			sStringOut = sStringOut + oPlayer.getsName() + " [" + oPlayer.getiAugenzahl() + "] " + "\n";
		}
		return sStringOut;
	}

	public void play() throws InterruptedException {
		System.out.println("#######################################################################");
		if (this.isFull()) {
			Thread.sleep(800);
			System.out.println("\t\t -3-");
			Thread.sleep(800);
			System.out.println("\t\t -2-");
			Thread.sleep(800);
			System.out.println("\t\t -1-");
			System.out.println("#######################################################################");
			for (Player oPlayer : this.aGame) {
				oPlayer.setsAugenzahl(Wuerfel.wuerfeln());
			}

		} else
			System.out.println("nicht genügend Spieler");
	}
}
