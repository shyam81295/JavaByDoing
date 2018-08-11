public class LetterToYourself{
    public static void main( String args[] ){
        System.out.print("+");
        for(int dash = 0; dash < 39; dash++){
            System.out.print("-");
        }
        System.out.print("+\n");

        for(int countHashLines = 0; countHashLines < 3; countHashLines++){
            System.out.print("|");
            for(int countSpaces = 0; countSpaces < 34; countSpaces++){
                System.out.print(" ");
            }
            System.out.println("#### |");
        }
        
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\t\t\t\t|");
        System.out.println("|\t\tBill Gates"+"              |");
        System.out.println("|\t\t1 Microsoft Way"+"         |");
        System.out.println("|\t\tRedmond, WA 98104"+"       |");
        System.out.println("|\t\t\t\t\t|");

        System.out.print("+");
        for(int dash = 0; dash < 39; dash++){
            System.out.print("-");
        }
        System.out.print("+\n");


    }
}
