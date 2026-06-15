package fst;

import java.util.Scanner;


public class Activity2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		int left=0,right=n-1,sum=0;
		int[] arr =new int[n];
		System.out.println("Enter the  elements");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		while (left < right) {
		    while (left < right && arr[left] != 10) left++;
		    while (left < right && arr[right] != 10) right--;
		    if (left < right) {
		        sum += 20;
		        left++;
		        right--;
		    }
		}
	
		if (left == right && arr[left] == 10) sum += 10;
	
		System.out.println(sum);

	}

}
