package com.java.strings;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.*;
import java.lang.*;
import java.io.*;

//not recorded in geeks their issue

/*
Input:
2
geeksforgeek
acaaabbbacdddd

Output:
gksforgk
acac
 */

class StrRemoveDup {
	static String s ;
	static char temp ;
	public static void main(String[] args) throws IOException {
		BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
		String s1 = "ABC";
		while (s1!=null) {
			s1 = read.readLine();
			s=s1;
			check(0);
		}
		System.out.println(s);
		//check(0);
	}

	public static void check(int i) {
		if(i<s.length()-1) {
			if(s.charAt(i) == s.charAt(i+1)) {
				temp =s.charAt(i);
				check(i+1);
			}else {
				if(s.charAt(i) != s.charAt(i+1)) {
					if(temp != s.charAt(i)) {
						System.out.print(s.charAt(i));
					}
					else
					{
						if(i!=0 && (s.charAt(i) != s.charAt(i-1))) {
							System.out.print(s.charAt(i));
						}
					}
					check(i+1);
					// to print last element
					if(i == s.length()-2) {
						if(s.charAt(i+1) != s.charAt(i)) {
							System.out.println(s.charAt(i+1));
						}
					}// end of if
				}
			}
		}

	}



}