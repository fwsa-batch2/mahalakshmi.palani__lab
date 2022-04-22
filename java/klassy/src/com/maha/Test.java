package com.maha;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Addition add = new Addition();
        int s = add.addTwoInt(1, 2);
        System.out.println("Sum of two integer values :"
                           + s);
	}

}
class Addition {
	 
   
    int sum = 0;
    public int addTwoInt(int a, int b){
        sum = a + b;
        return sum;
    }
}