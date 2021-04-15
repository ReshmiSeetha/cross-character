import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		String st=s.nextLine();//Read String
		for(int i=0;i<st.length();i++){
		    for(int j=0;j<st.length();j++){
		        if(i==j||j+i==st.length()-1)
		            System.out.print(st.charAt(j));
		           else
		            System.out.print(" ");
		        }
		        System.out.println();
		    }
}}
