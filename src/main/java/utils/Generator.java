package utils;

public class Generator {
			static void printAllKLength(char[] set, int k)
			{
			    int n = set.length;
			    printAllKLengthRec(set, "", n, k);
			}

			static void printAllKLengthRec(char[] set,
			                               String prefix,
			                               int n, int k)
			{

			    if (k == 0)
			    {
			        System.out.println(prefix);
			        return;
			    }

			    for (int i = 0; i < n; ++i)
			    {

			    	String newPrefix = prefix + set[i];

			        printAllKLengthRec(set, newPrefix,
			                                n, k - 1);
			    }
			}

			public static void main(String[] args)
			{
//			    That characters you want to use in password generator
			    char[] set1 = {'a', 'A', 'b', 'B', 'c', 'C','d', 'D', 'e', 'E', 'f', 'F', 'g', 'G', 'h', 'H', 'i', 'I', 'j', 'J', 'k', 'K', 'l', 'L', 'm', 'M', 'n', 'N', 'o', 'O', 'p', 'P', 'q', 'Q', 'r', 'R', 's', 'S', 't', 'T', 'u', 'U', 'v', 'V', 'w', 'W', 'x', 'X', 'y', 'Y', 'w', 'W', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'  };


//			    How many elements you want your password to be
			    int k = 3;
			    printAllKLength(set1, k);

			}

}
