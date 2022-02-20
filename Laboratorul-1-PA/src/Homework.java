import org.jetbrains.annotations.NotNull;

public class Homework {
    public static void main(String @NotNull [] args) {

        if (args.length < 3) {
            System.out.println("Not enough arguments!");
            System.exit(-1);
        }
//        String str = args[0];
//        int a = Integer.parseInt(args[1]);
//        double x = Double.parseDouble(args[2]);


    Homework app = new Homework();
//        Let n, p be two integers and C1,...,Cm a set of letters (the alphabet), all given as a command line arguments. Validate the arguments!
            int n =Integer.parseInt(args[0]);//how many words to generate
            final int p = Integer.parseInt(args[1]); //how many characters has the alphabet
            String[] c = new String[p]; //create the alphabet array
            for (int i = 2; i < c.length; i++) c[i] = args[i];
            String[] words;
            words = app.generate(n, c);
    }

//Create an array of n strings (called words), each word containing exactly p characters from the given alphabet.
        public String[] generate(int n, String[] alphabet) {
            String[] words = new String[n];
            for (int i = 0; i < n; i++) {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int pos = (int) (Math.random() * (alphabet.length + 1)) - 1;
                    if (pos < 0) break;
                    sb.append(alphabet[pos]);
                }
                words[i] = sb.toString();
                //Display on the screen the generated array.
                System.out.println(words[i]);
            }
            return words;

        }






}