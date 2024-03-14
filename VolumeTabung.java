package projectWandaweek1;

public class VolumeTabung {

	public static void main(String[] args) {
		double diameter = 5.0;
		double tinggi = 10.0;
		double jariJari = diameter / 2.0;
		double volume = Math.PI * Math.pow(jariJari, 2) * tinggi;
			
		System.out.println("Volume tabung dengan diameter " + diameter + " dan tinggi " + tinggi + " adalah " + volume);
		

	}

}
