
public class Esercizio {
	
	static int sumPos(int myArray[]){
		int tot = 0;
	    for(int i = 0; i <myArray.length; i++){
	        if(myArray[i] < 0){
	            return tot;
	        } else {
	            tot += myArray[i];
	            }
	     }
	  return tot;
	}
	
	static int sumOdd(int n) {
		int tot = 0;
		  
		    for(int i = 0; i < n; i++){
		         tot += 1 + 2 * i;
		        }
		  return tot;
	}
	
	static double average(int myArray[]) {
			  double tot = 0;
			    for(int i = 0; i < myArray.length; i++){
			        tot += myArray[i];
			     }
			  return tot / myArray.length;
	}
	
	static int sumRange(int a, int b) {
		int tot = 0;
	    if(a >= b){
	            for(int i = b; i <= a; i++){
	                tot += i;
	            }
	     } else {
	        for(int j = a; j <= b; j++){
	                tot += j;
	        }
	    }
	  return tot;
	}
	
	public static void main(String[] args){
		
		//Esercizio 1
		
		int a[] = {2,5,7,-1};
		int result = sumPos(a);
		System.out.println(result);
		
		//Esercizio 2
		
		int b = sumOdd(10);
		System.out.println(b);
		
		//Esercizio 3
		
		int c[] = {1,2,3,4,5,6,7,8,9,10};
		double re = average(c);	
		System.out.println(re);
		
		//esercizio 4
		
		int res = sumRange(3,6);
		System.out.println(res);
		
	}
}
