import java.util.Scanner;
public class PBAmali{
	public static void main (String args[]){

		String namaPekerja;
		int bilanganHaribekerja;

		Scanner input = new Scanner (System.in);

	System.out.println("Masukkan nama:");
	namaPekerja = input.nextLine();

	System.out.println("Masukkan bilangan hari bekerja:");
	bilanganHaribekerja = input.nextInt();

		int gajiSebulan = bilanganHaribekerja * 160;

	if(bilanganHaribekerja <=30){
		gajiSebulan = bilanganHaribekerja * 160;

	System.out.println("Rumusan gaji bulanan bagi " +namaPekerja);
	System.out.println("Jumlah hari bekerja " +bilanganHaribekerja);
	System.out.println("GAJI SEBULAN ADALAH " +gajiSebulan);

	}
	
	else{
		System.out.println("Bilangan hari tidak boleh melebihi 31 hari");
		System.out.println("Masukkan semula bilangan hari bekerja:");
		bilanganHaribekerja = input.nextInt();
		gajiSebulan = bilanganHaribekerja * 160;
	}

	}
}