package TUGAS_ASD3;

import sun.misc.Queue;
public class MainQueueString {

	public static void main(String[] args) {
		QueueString q = new QueueString();
		q.cetak();
		
		q.insert("ISMAIL");q.cetak();
		q.insert("UMAR");q.cetak();
		q.insert("MAIL");q.cetak();
		q.insert("CUMAIL");q.cetak();

	}
}
