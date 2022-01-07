public class practice28 {
	
	public static void main (String[] args) {
		int count = 0;
		for (int i = 1; i <= 1000000; i++)
		{
		if (i % 2 == 0)continue;
		else if (i % 3 == 0)continue;
		else if (i % 5 == 0)continue;
		else if (i % 7 == 0)continue;
		IBIO.output(i);
		count++;
	}
		IBIO.output("number of count is "+count);
	}
}

