package projectEuler;

//Even Fibonacci numbers
//Problem 2
//Each new term in the Fibonacci sequence is generated by adding the previous two terms. By starting with 1 and 2, the first 10 terms will be:
//
//1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
//
//By considering the terms in the Fibonacci sequence whose values do not exceed four million, find the sum of the even-valued terms.

public class q2 {
	
	public static void main(String[] args) {
		System.out.println(fibonacci(1,2,4000000,0));

	}

	private static int fibonacci(int i, int j, int k, int l) {
		if(j>=k){
			return l;
		}
		if(j%2==0){
			l=l+j;
			System.out.println("add");
		}
		return fibonacci(j,j+i,k,l);
		//return l;
	}

}
