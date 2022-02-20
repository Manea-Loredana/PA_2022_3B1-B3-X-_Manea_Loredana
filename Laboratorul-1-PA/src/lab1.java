
//Manea Loredana

import java.util.*;


public class Lab1 {
    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        lab1.compulsory();
        lab1.homework(args) ;
        lab1.bonus();

    }

     void compulsory() {
         // Hello world! print
        System.out.println("Hello world!");
        //second step
        String[] c = {"C", "C++", "C#", "Python", "Go", "Rust", "JavaScript", "PHP", "Swift", "Java"};
//        Generate a random integer n: int n = (int) (Math.random() * 1_000_000);
        int n = (int) (Math.random() * 1_000_000);
//        Compute the result obtained after performing the following calculations:
//  multiply n by 3;
//  add the binary number 10101 to the result;
//  add the hexadecimal number FF to the result;
//  multiply the result by 6;
        int prod1 = n * 3;
        int sum1 = prod1 + 0b10101;
        int sum2 = sum1 + 0xFF;
         int b = sum2 * 6;
        while (b > 9)
        { int sum =0 ;
            while (b != 0)
            {
                sum = sum + b % 10;
                b = b/10;
            }
            b=sum;

        }
//        Compute the sum of the digits in the result obtained in the previous step. This is the new result. While the new result has more than one digit, continue to sum the digits of the result.
//Display on the screen the message: "Willy-nilly, this semester I will learn " + languages[result].
        System.out.println(b);
        System.out.println("Willy-nilly, this semester I will learn " + c[b]);

//9
//Willy-nilly, this semester I will learn Java
    }

    void homework(String[] args) {
// Launch the application from the command line, for example: java Lab1 100 7 A C G T.
        if (args.length < 3) {
            System.out.println(
                    "Usage: number, number, one or more characters");
            System.exit(-1);
        }

        Lab1 app = new Lab1();
//Let n, p be two integers and C1,...,Cm a set of letters (the alphabet), all given as a command line arguments. Validate the arguments!
        int n = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        int m = args.length - 2;
        char[] alphabet = new char[m];
        for(int i=0; i<m; i++) {
            alphabet[i] = args[i+2].charAt(0);
        }
        String[] c= new String[n];
        for(int i=0; i<n ;i++){
            c[i]=app.createRandomWord(p, alphabet);
            System.out.println(c[i]);

        }
//        String word=app.createRandomWord(p, alphabet);


//Display on the screen the generated array.


//Two words are neighbors if they have a common letter.
//Create a boolean n x n matrix, representing the adjacency relation of the words.
        int[][] A = new int[n][n];
        for(int i =0 ; i<n ;i++) {
            for (int j = 0; j < n; j++){
                if(Objects.equals(Neighbors(c[i], c[j]), "YES")) ////
                {
                    A[i][j]=1;
                } else
                A[i][j]=0;

        }
        }
//Display this data structure on the screen.
        System.out.println(Arrays.deepToString(A));


    }


    //Create an array of n strings (called words), each word containing exactly p characters from the given alphabet.
        private String createRandomWord ( int len, char[] alphabet){
            StringBuilder word = new StringBuilder();
            Random rand = new Random();
            for (int i = 0; i < len; i++) {
                int k = rand.nextInt(alphabet.length);
                word.append(alphabet[k]);
            }
            return word.toString();
        }


    static String  Neighbors(String s1, String s2) {
        String result="NO";
        Set<Character> set1 = new HashSet<>();

        for (char s : s1.toCharArray()){
            set1.add(s);
        }

        for(int i=0;i<s2.length();i++){
            if(set1.contains(s2.charAt(i))){
                result = "YES";
                break;
            }
        }
        return result;
    }
//







     void bonus() {
   //Do stuff
      }


}