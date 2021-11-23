package tp2;

import java.util.Scanner;

public class ISIGame {

    static class ISIException extends RuntimeException{
        public ISIException(String s) {
            super(s);
        }
    }

    public static void main(String[] args) {

        System.out.println("Enter a word");



        // now you have to check if the word contains 'isi' or not
        // if not print 'ok'
        // if yes throw the exception 'ISIException'
        // and when you catch it print 'life is not isi'


            Scanner scanner = new Scanner(System.in);
            String line = scanner.nextLine();
            // now you have to check if the word contains 'isi' or not
            if(!line.contains("isi"))
                System.out.println(" ok ");
            else
                try {
                    throw new ISIException("life is not isi");
                }


        catch (ISIException e ){
            System.out.println(e.getMessage());
        }
}
}