package TUGAS_ASD3;

import java.util.ArrayList;

public class QueueFloat {
	ArrayList<Float> kelase = new ArrayList<Float>();
	int ismail = -1;

	public void insert(Float value) {
		ismail++;
		kelase.add(ismail,value);
	}
	public Float get() {
		Float value = 0.1f;
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
