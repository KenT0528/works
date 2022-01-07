public class practice27 {
	
	public static void main (String[] args) {
		for (int i = 1; i <= 1000000; i++)
		if (i % 2 == 0)break;
		else if (i % 3 == 0)break;
		else if (i % 5 == 0)break;
		else if (i % 7 == 0)break;
		IBIO.output(i);
		for(int count=0;count <=1000000; count++)
		IBIO.output(count);
	}
}

