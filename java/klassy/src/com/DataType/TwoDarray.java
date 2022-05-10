package DataType;

import java.util.Arrays;

public class TwoDarray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,j,k =1;
		int twoDarray[][] = new int[4][5];
		for(i =0;i<2;i++) {
			for(j=0;j<2;j++) {
				twoDarray[i][j] = k;
				k++;
			}
		}
		//System.out.println(Arrays.toString(twoDarray));
		for(i =0;i<2;i++) {
			for(j=0;j<2;j++) {
			System.out.print(twoDarray[i][j]+" ");
			}
			System.out.println(" ");
		}
		
	}

}
