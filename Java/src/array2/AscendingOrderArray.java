package array2;

import java.util.Scanner;

public class AscendingOrderArray {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the array size");
		int n = sc.nextInt();
		int a[]= new int[n];
		System.out.println("Enter the elements");
		for(int i=0; i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int j=0; j<a.length; j++)
		{
			for(int k=j+1; k<a.length; k++)
			{
				int temp=0;
				if(a[j]>a[k])
				{    
					temp=a[j];
					a[j]=a[k];
					a[k]=temp;
				}
			}
		}
		System.out.println("ascending order:");
		for(int i=0; i<a.length; i++)
		{
			System.out.println(a[i]);
		}

	}

}
