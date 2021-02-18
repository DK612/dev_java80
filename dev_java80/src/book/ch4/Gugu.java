package book.ch4;

public class Gugu {

	public static void main(String[] args) {
		int i = 1;
		while(i < 10) {
			int j = 2;
			while(j < 10) {
				System.out.printf("%2d  X %2d  =  %2d	  ", j, i, i*j);
				j++;
			}
			System.out.println("");
			i++;
		}
	}

}
