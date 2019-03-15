import java.util.*;

public class BubbleSort {

	public static void main(String[] args) {
		
		int[] theArray = new int [10000];
		
		int[] newArray = RNGarray(theArray);
		Ascend(newArray);
		System.out.print("\n");
		System.out.print("\n");
		Descend(newArray);
	
	}
	
public static void Descend(int x[]){
	
	int a, b, bubbleTemp;
	
	for(a = 0; a < x.length - 1; ++a){
		for(b = 0; b < x.length - 1; ++b){
			if(x[b] < x[b + 1]){
				
				bubbleTemp = x[b];
				x[b] = x[b + 1];
				x[b + 1] = bubbleTemp;
			}
		}
	}
	
	System.out.print(Arrays.toString(x));
	}

public static void Ascend(int x[]){
	
	int a, b, bubbleTemp;
	
	for(a = 0; a < x.length - 1; ++a){
		for(b = 0; b < x.length - 1; ++b){
			if(x[b] > x[b + 1]){
				
				bubbleTemp = x[b];
				x[b] = x[b + 1];
				x[b + 1] = bubbleTemp;
			}
		}
	}
	
	System.out.print(Arrays.toString(x));
	}

public static int[] RNGarray(int x[]){
	Random rando = new Random();
	for(int i = 0; i < x.length; ++i){
		int n = rando.nextInt(1000);
		x[i] = n;
	}
	return x;
	}
}

