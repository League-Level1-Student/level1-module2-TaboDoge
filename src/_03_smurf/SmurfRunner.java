package _03_smurf;

public class SmurfRunner {
public static void main(String[] args) {
	Smurf handy = new Smurf("handy");
	handy.eat();
	handy.getName();
	Smurf papa = new Smurf("papa");
	papa.getHatColor();
	papa.isGirlOrBoy();
	Smurf smurfette = new Smurf("smurfette");
	smurfette.getHatColor();
	smurfette.isGirlOrBoy();
}
}
