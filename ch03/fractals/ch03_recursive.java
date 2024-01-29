package ch03.fractals;


	import java.util.Scanner;
	class Main
	{   
	    static int times=5;
	    static int power=2;
	    public static int Sum(int N){
	        if(N==1){
	            return 1;
	        }
	        return N+Sum(N-1);
	    }    
	    public static int Bitpower(int N){
	        
	        if(power==1){
	            return N;
	        }
	        else{
	            power=power-1;
	        return N+Bitpower(N);
	        }
	    }
	    public static int TimesFive(int N){   
	        if(times==1){
	            return N;
	        }
	        else{
	            times=times-1;
	            return N+TimesFive(N);
	        }
	        
	    }


	    public static void main(String[] args)

	    {
	        System.out.println(Sum(5));
	        System.out.println(Bitpower(5));
	        System.out.println(TimesFive(5));
	    }
	}

