package TUGAS_ASD3;
import java.util.ArrayList;

public class QueueString {
	ArrayList<String> kelase = new ArrayList<String>();
	int ismail = -1;

	public void insert(String value) {
		ismail++;
		kelase.add(ismail,value);
	}
	public String get() {
		String value = "KOSONG";
		if(ismail>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			ismail--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+ismail+" > KELAS A: "+kelase.toString());
	}
}
