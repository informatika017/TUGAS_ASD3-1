package TUGAS_ASD3;

import java.util.ArrayList;

public class QueueDouble {
	ArrayList<Double> kelase = new ArrayList<Double>();
	int ismail = -1;

	public void insert(Double value) {
		ismail++;
		kelase.add(ismail,value);
	}
	public Double get() {
		Double value = 0.1;
		if(ismail>-1) {
			value = kelase.get(0);
			kelase.remove(0);
			ismail--;
		}
		return value;
		
	}
	public void cetak() {
		System.out.println("ECOR : "+ismail+" > VARIABLE: "+kelase.toString());
	}
}
