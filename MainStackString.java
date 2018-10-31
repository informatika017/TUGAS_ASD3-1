package TUGAS_ASD3;

public class MainStackString {
public static void main(String[] args) {
		classstackstring st= new classstackstring();
		
		st.push("ISMAIL");
    st.push("UMAR");
		st.push("RIFAL");
		st.push("MAIL");
		
		String d0=st.pop();
		System.out.println(d0);
		st.cetak();
	}
}
