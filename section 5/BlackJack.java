import java.util.Scanner;

public class BlackJack {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("\nWelcome to Java Casino!");
        System.out.println("Do you have a knack for Black Jack?");
        System.out.println("We shall see..");
        System.out.println("Dealer must hit until total is at least 17");
        System.out.println("Aces count as 1");
        System.out.println("Black Jack pays 3 to 2");
        System.out.println("..Ready? Press anything to begin!");
        scan.nextLine();
        System.out.println("\nHow much money do you bet?");
        double bet = scan.nextDouble();
        int userCard1 = drawRandomCard();
        int userCard2 = drawRandomCard();
        int total = Math.min(userCard1, 10) + Math.min(userCard2, 10);
        System.out.println("\n You get a \n" + pickRandomCard(userCard1) + "\n and a \n" + pickRandomCard(userCard2));
        System.out.println("\n Your total is : " + total + "\n");
        int dealerCard1 = drawRandomCard();
        int dealerCard2 = drawRandomCard();
        System.out.println("\n The dealer shows \n" + pickRandomCard(dealerCard1) + "\n and has a card facing down \n" + faceDown());
        int dealerTotal = Math.min(dealerCard1, 10) + Math.min(dealerCard2, 10);
        System.out.println("\n The dealer's total is hidden");
        while (true){
            String option = hitOrStay();
            if (option.equals("stay")){
                break;
            }
            int newCard = drawRandomCard();
            total = total + Math.min(newCard, 10);
            System.out.println("\nThis is your card \n" + pickRandomCard(newCard));
            System.out.println("\nYour total is now " + total);
            if (total > 21) {
                System.out.println("\nYou busted! You lose!");
                System.exit(0);
            }
            
        }
        System.out.println("\nOkay, dealer's turn");
        System.out.println("\nHis hidden card was \n" + pickRandomCard(dealerCard2));
        while (dealerTotal < 17 &&
         dealerTotal < total){
            int newCard = drawRandomCard();
            dealerTotal = dealerTotal + Math.min(newCard, 10);
            System.out.println("\nDealer chooses to hit\n" + pickRandomCard(newCard));
            System.out.println("\nDealer's total is now " + dealerTotal);
            System.out.println("Press enter to continue");
            scan.nextLine();
        }
        if (dealerTotal > 21) {
                System.out.println("\nDealer busted! You win!");
                System.out.println();
                System.out.println("You win $" + bet*2 + "!");
                System.exit(0);
            }
            if (total == 21 && dealerTotal != 21) {
                System.out.println("\nBlack Jack! You win!");
                System.out.println("You win $" + bet*3/2 + "!");
                System.out.println();
                System.exit(0);
            }
            if (dealerTotal > total) {
                System.out.println("\nDealer wins! With a total of " + dealerTotal + " over your total of " + total + "");
                System.exit(0);
            } else if (dealerTotal == total) {
                System.out.println("Dealer has " + dealerTotal + " and you have " + total + "");
                System.out.println("\nTie!");
                System.exit(0);
            } else {
                System.out.println("Dealer has " + dealerTotal + " and you have " + total + "");
                System.out.println("You win $" + bet*2 + "!");
                System.exit(0);
            }

        scan.close();



        }

    public static String faceDown() {
        return
        "   _____\n"+
        "  |     |\n"+ 
        "  |  J  |\n"+
        "  | JJJ |\n"+
        "  |  J  |\n"+
        "  |_____|\n";
    }
    public static int drawRandomCard() {
        int randomCard = (int) (Math.random() * 13) + 1;
        return randomCard;
    }
    public static String pickRandomCard(int cardNumber) {
        
        switch (cardNumber) {
            case 1: return
            "   _____\n"+
            "  |A _  |\n"+ 
            "  | ( ) |\n"+
            "  |(_'_)|\n"+
            "  |  |  |\n"+
            "  |____V|\n";
            case 2: return
            "   _____\n"+              
            "  |2    |\n"+ 
            "  |  o  |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____Z|\n";
            case 3: return
            "   _____\n" +
            "  |3    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  |  o  |\n"+
            "  |____E|\n";
            case 4: return
            "   _____\n" +
            "  |4    |\n"+
            "  | o o |\n"+
            "  |     |\n"+
            "  | o o |\n"+
            "  |____h|\n";
            case 5: return
            "   _____ \n" +
            "  |5    |\n" +
            "  | o o |\n" +
            "  |  o  |\n" +
            "  | o o |\n" +
            "  |____S|\n";
            case 6: return
            "   _____ \n" +
            "  |6    |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  | o o |\n" +
            "  |____6|\n";
            case 7: return
            "   _____ \n" +
            "  |7    |\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |____7|\n";
            case 8: return
            "   _____ \n" +
            "  |8    |\n" +
            "  |o o o|\n" +
            "  | o o |\n" +
            "  |o o o|\n" +
            "  |____8|\n";
            case 9: return
            "   _____ \n" +
            "  |9    |\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |____9|\n";
            case 10: return
            "   _____ \n" +
            "  |10  o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |o o o|\n" +
            "  |___10|\n";
            case 11: return
            "   _____\n" +
            "  |J    |\n"+
            "  | J   |\n"+
            "  |     |\n"+
            "  |  J  |\n"+
            "  |____J|\n";
            case 12: return
            "   _____\n" +
            "  |Q    |\n"+
            "  | Q   |\n"+
            "  |     |\n"+
            "  |  Q  |\n"+
            "  |____Q|\n";
            case 13: return
            "   _____\n" +
            "  |K    |\n"+
            "  | K   |\n"+
            "  |     |\n"+
            "  |  K  |\n"+
            "  |____K|\n";
            default: return "null";
        
        }
         
    }
    public static String hitOrStay() {
        System.out.println("Would you like to hit or stay?");
        String response = scan.nextLine();
        while (!response.equalsIgnoreCase("hit") && !response.equalsIgnoreCase("stay")) {
            System.out.println("Please write 'hit' or 'stay'");
            response = scan.nextLine();
        }
        return response;
    }
}

