package Lab10;

public class SortStringArray {
	
	static String Array[] = {"Hello","This","Is","Sorting","Example"};
	public static void main(String[] args)
	{

	   for (int j=0; j<Array.length;j++)
	   {
	       for (int i=j+1 ; i<Array.length; i++)
	       {
	           if (Array[i].compareTo(Array[j])<0)
	           {
	               String temp = Array[j];
	               Array[j] = Array[i];
	               Array[i] = temp;
	           }
	       }
	       System.out.println(Array[j]);
	   }
	}

	String temp;
}