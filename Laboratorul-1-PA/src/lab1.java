import java.util.Random;
import java.util.stream.IntStream;

public class Lab1 {
    public static void main(String[] args) {
        Lab1 lab1 = new Lab1();
        lab1.compulsory();
        lab1.homework(args) ;

    }

     void compulsory() {
 ///afisare hello world
        System.out.println("Hello world!");
        //partea a 2a
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
    }

    void homework(String[] args) {

        if (args.length < 3) {
            System.out.println(
                    "Usage: number, number, one or more characters");
            System.exit(-1);
        }

        Lab1 app = new Lab1();

        int n = Integer.parseInt(args[0]);
        int p = Integer.parseInt(args[1]);
        int m = args.length - 2;
        char[] alphabet = new char[m];
        for(int i=0; i<m; i++) {
            alphabet[i] = args[i+2].charAt(0);
        }


        IntStream.range(0, n).mapToObj(i -> app.createRandomWord(p, alphabet)).forEach(System.out::println);

    }
        private String createRandomWord ( int len, char[] alphabet){
            StringBuilder word = new StringBuilder();
            Random rand = new Random();
            for (int i = 0; i < len; i++) {
                int k = rand.nextInt(alphabet.length);
                word.append(alphabet[k]);
            }
            return word.toString();
        }






     void bonus() {
   //Do stuff
      }


}