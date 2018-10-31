package TUGAS_ASD3;

import java.util.ArrayList;
public class ArrayListObject {

	public static void main(String[] args) {
	ArrayList<Mahasiswa> Data = new ArrayList<Mahasiswa>();
	Data.add(new Mahasiswa("ISMAIL UMAR", "D0217308", "A", "LUTANG"));
	Data.add(new Mahasiswa("TIFAL.D", "D0217001", "A", "parrape"));
		
	Data.forEach(data ->{
	System.out.println("NAMA   : "+data.getNama());
	System.out.println("NIM    : "+data.getNim());
	System.out.println("KELAS  : "+data.getKelas());
	System.out.println("ALAMAT : "+data.getAlamat());	
	System.out.println(" ")
	});
	}
}
