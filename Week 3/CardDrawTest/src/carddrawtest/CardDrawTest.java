package carddrawtest;

public class CardDrawTest {
    public static void main(String[] args) {  
        int[] average = new int[100];
        int count = 0;
        int index = 0;
        String[] cards = new String[4];
        
        for (int i = 0; i < 100; i++) {
            boolean spades = false;
            boolean hearts = false;
            boolean diamond = false;
            boolean clubs = false;
        
            for (int j = 0; j < 4; j++) {
                cards[j] = " ";
            }
            
            index = 0;
            count = 0;
            
            while (!spades || !hearts || !diamond || !clubs) {
                String card = showCard(getCard());
                count++;

                if (card.contains("Spades") && !spades) {
                    cards[index++] = card;
                    spades = true;
                } else if (card.contains("Hearts") && !hearts) {
                    cards[index++] = card;
                    hearts = true;
                } else if (card.contains("Diamond") && !diamond) {
                    cards[index++] = card;
                    diamond = true;
                } else if (card.contains("Clubs") && !clubs) {
                    cards[index++] = card;
                    clubs = true;
                }
            }
            average[i] = count;
        }
        
        for (int i = 0; i < cards.length; i++) {
            System.out.println(cards[i]);
        }
        int temp = 0;
        for (int i = 0; i < 100; i++) {
            temp+=average[i];
        }
        
        System.out.printf("Count = %1s\n", count);
        System.out.println("We went ahead and ran this test 100 times and the average count was " + (temp/100));
    }
    
    static int getCard() {
        return (int)(Math.random() * 52);
    }
    
    static String showCard(int num) {
        String[] suit = {"Spades", "Hearts", "Clubs", "Diamonds"};
        String[] ranks = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};
        
        int sn = num / 13;
        int rn = num % 13; 
        
        return ranks[rn] + " of " + suit[sn];
    }
}
