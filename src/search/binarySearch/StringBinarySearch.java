package search.binarySearch;

import java.util.Arrays;
import java.util.Scanner;

public class StringBinarySearch {
	static Scanner stdIn=new Scanner(System.in);
	
	public static void main(String[] args) {
		String[] x = {
				"abstract",   "assert",       "boolean",   "break",      "byte",
				"case",       "catch",        "char",      "class",      "const",
				"continue",   "default",      "do",        "double",     "else",
				"enum",       "extends",      "final",     "finally",    "float",
				"for",        "goto",         "if",        "implements", "import",
				"instanceof", "int",          "interface", "long",       "native",
				"new",        "package",      "private",   "protected",  "public",
				"return",     "short",        "static",    "strictfp",   "super",
				"switch",     "synchronized", "this",      "throw",      "throws",
				"transient",  "try",          "void",      "volatile",   "while"
		};
		
		System.out.println("what word do you want to find?");
		String key=stdIn.next();
		
		int result=Arrays.binarySearch(x, key);
		if(result<0) {
			System.out.println("not found");			
		}
		else {
			System.out.println("index:"+result);			
		}
	}
}
