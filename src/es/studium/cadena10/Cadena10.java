package es.studium.cadena10;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cadena10
{
	static String mayor(String a, String b)
	{
		String sub;
		if (a.compareTo(b)<=1)
		{
			sub=a;
		}
		else 
		{
			sub=b;
		}
		return sub;
	}
	
	public static void main(String[] args) throws IOException
	{
		BufferedReader lectura = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Escriba una palabra");
		String a= lectura.readLine();
		System.out.println("Escriba otra palabra");
		String b= lectura.readLine();
		System.out.println("La mayor alfabeticamente es "+mayor(a,b));
	}

}
