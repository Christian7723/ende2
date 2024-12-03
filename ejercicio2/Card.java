    package ejercicio2;

public class Card {

	public String suit;	//palo de la carta
	public String value;	//valor de la carta
	//Constructor para crear una carta con su palo y valor
	public Card (String suit, String value) {
		this.suit = suit;
		this.value = value;
	}
	//Método para mostrar la carta
	public String toString () {
		return (this.suit+"-"+this.value);
	}
}

    