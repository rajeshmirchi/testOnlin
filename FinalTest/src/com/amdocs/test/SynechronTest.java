package com.amdocs.test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SynechronTest {
	
	public static void main(String... args) {

		
		//System.out.println("Please enter number"); Testing 2nd Push
//		Scanner sc = new Scanner(System.in);
		int number = 100; //sc.nextInt();
		
		List<Integer> primes = IntStream.rangeClosed(2, number)
//				.filter(n -> n%2 !=0)
                .filter(n -> isPrime(n))
                .boxed()
                .collect(Collectors.toList());
		
		System.out.println(primes);
	}

	public static boolean isPrime(int number) {
		//System.out.println("Number used:-"+number);
	    return IntStream.rangeClosed(2, (int)Math.sqrt(number)).noneMatch(i -> number%i == 0); 
	}
}

// 100 -25 , 1000 - 168, 10000 - 1229
