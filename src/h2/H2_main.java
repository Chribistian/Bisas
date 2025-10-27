package h2;

public class H2_main {

	public static void main(String[] args) {
		
		int i, j, k, min, max;
		i=238; j=4000; k=88;
		
		// Angenommen i ist Minimum und Maximum
		min=i; max=i;
	
		//Teste ob j oder k kleiner als i, dann neues Minimum.
		if (j<min) {
			min=j;
		}
		if (k<min) {
			min=k;
		}
		//Teste ob j oder k größer als i, dann neues Maximum.
		if (j>max) {
			max=j;
		}
		if (k>max) {
			max=k;
		}
	
		/*
		System.out.println(min +" ist Minimum");
		System.out.println(max +" ist Maximum");*/
	}

}
