/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package traductor;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Scanner;

/**
 *
 * @author adrimexico1
 */
public class Traductor {

    /**
     * @param args the command line arguments
     */
   
        // TODO code application logic here
        public static String reverse(String word) {
		StringBuilder reverse = new StringBuilder();

		for (int i = 0; i < word.length(); i++) {
			reverse.append(word.charAt(word.length() - i - 1));
		}

		return reverse.toString();
	};

	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		PrintStream out = System.out;
                
		String string = scanner.next();
		String s2 = scanner.next();

		out.println(string.equals(reverse(s2)) ? "YES" : "NO");

		
		out.close();
	}
    }
    

