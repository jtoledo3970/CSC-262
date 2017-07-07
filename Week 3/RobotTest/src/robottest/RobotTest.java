package robottest;

class Robot{
    public static char[][] grid = new char[26][26];
    public static int RIGHTBOUNDARY=26;
    public static int LEFTBOUNDARY=0;
    public static int TOPBOUNDARY=26;
    public static int BOTTOMBOUNDARY=0;
    
    private int x, y;
    private char payload;
   
    public Robot() {
        x = 0;
        y = 0;
        payload = ' ';
    }
    
    public Robot(int x, int y, char pay) {
        setX(x);
        setY(y);
        setPayload(pay);
    }
    
    // Mutator Functions 
    public void setX(int x) {
        this.x = x;
    }
    
    public void setY(int y) {
        this.y = y;
    }
    
    public void setPayload(char payload) {
        this.payload = payload;
    }
    
    // Accessor Functions
    public int getX() {
        return x;
    }
    
    public int getY() {
        return y;
    }
    
    public char getPayload() {
        return payload;
    }
    
    // Print Function
    public void print() {
        System.out.println("Your robot is located at (" + x + ", " + y + ") with a payload of " + payload + ".");
    }
    
    public boolean pickUp(int lx, int ly) {
        int tempX, tempY;
        boolean b = false;
        tempX = x;
        tempY = y;
        if (tempX != lx && tempY != ly) {
            System.out.println("Your robot is not at (" + lx + ", " + ly + ")");
            b = false;
        } else if (grid[lx][ly] == ' ') {
            System.out.println("There is no payload at this location");
            b = false;
        } else if (payload == ' ') {
            payload = grid[lx][ly];
            grid[lx][ly] = ' ';
            b = true;
            System.out.println("Your new payload is " + payload);
        } else {
            System.out.println("Sorry you are already carrying something");
        }
        return b;
    }
    
    public boolean dropOff(int lx, int ly) {
        int tempX, tempY;
        tempX = x;
        tempY = y;
        boolean b = false;
        if (tempX != lx && tempY != ly) {
            System.out.printf("Your robot is not at (%10s, %10s)", lx, ly);
            b = false;
        } else if (payload != ' ') {
            grid[lx][ly] = payload;
            payload = ' ';
            b = true;
        }
        
        return b;
    }
    
    public void moveRight() {
        int temp = x;
        temp+=1;
        if (temp >= RIGHTBOUNDARY) {
            System.out.println("Right boundary reached, cannot move");
        } else {
            this.x = temp;
        }
    } 
    
    public void moveLeft() {
        int temp = x;
        temp-=1;
        if (temp < LEFTBOUNDARY) {
            System.out.println("Left boundary reached, cannot move to the left");
        } else {
            this.x = temp;
        }
    }
    
    public void moveUp() {
        int temp = y;
        temp+=1;
        if (temp >= TOPBOUNDARY) {
            System.out.println("Top boundary reached, cannot move up");
        } else {
            this.y = temp;
        }
    }
    
    public void moveDown() {
        int temp = y;
        temp-=1;
        if (temp < BOTTOMBOUNDARY) {
            System.out.println("Bottom boundary reached, cannot move down");
        } else {
            this.y = temp;
        }
    }
    
    public boolean moveTo(int lx, int ly) {
        boolean b = false;
        if (lx >= LEFTBOUNDARY && lx < RIGHTBOUNDARY && ly >= BOTTOMBOUNDARY && ly < TOPBOUNDARY) {
            int tempX, tempY;
            tempX = x;
            tempY = y;
            int tempXMove, tempYMove;
            
            if (lx < tempX) {
                tempXMove = tempX - lx;
                for (int i = 0; i < tempXMove; i++) {
                    moveLeft();
                }
            } else if (lx > tempX) {
                tempXMove = lx - tempX;
                for (int i = 0; i < tempXMove; i++) {
                    moveRight();
                }
            }
            
            if (ly < tempY) {
                tempYMove = tempY - ly;
                for (int i = 0; i < tempYMove; i++) {
                    moveDown();
                }
            } else if (ly > tempY) {
                tempYMove = ly - tempY;
                for (int i = 0; i < tempYMove; i++) {
                    moveUp();
                }
            }
            return true;
        } else {
            System.out.println("You are trying to move outside the boundary of the grid, your robot did not move");
        }
        return b;
    }
    
    public static void print2D() {
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < 26; i++) {
            System.out.print("|");
            for (int j = 0; j < 26; j++) {
                System.out.print(grid[i][j] + "|");
            }
            System.out.println("");
            System.out.println("------------------------------------------------------");
        }
    }
}

public class RobotTest {
    public static void main(String[] args) {
        // Initiliaze the grid as 26 * 26 of empty char
        for (int i = 0; i < 26; i++) {
            for (int j = 0; j < 26; j++) {
                Robot.grid[i][j] = ' ';
            }
        }
        Robot.grid[10][8] = 'B';
        Robot.grid[22][4] = 'C';
        Robot.print2D();
        
        // Declare R1 and R2
        Robot R1 = new Robot();
        Robot R2 = new Robot(1,1,' ');
        
        R1.print();
        R2.print();
        
        R1.moveTo(25,26);
        R2.moveTo(15,3);
        
        R1.print();
        R2.print();
        
        R1.moveTo(10, 8);
        R1.pickUp(10, 8);
        R1.moveTo(20,20);
        R1.dropOff(20, 20);
        Robot.print2D();
        
        R2.moveTo(22, 4);
        R2.pickUp(22, 4);
        R2.moveTo(0, 0);
        R2.dropOff(0, 0);
        Robot.print2D();
        
    }
}
