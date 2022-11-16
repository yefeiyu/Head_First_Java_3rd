package Chapter01;

public class PoolPuzzleOne {
    //领先本题理解了while的"遍历"一词的意思，一遍遍的历，直到溢出条件限制停止。14/11/2022，lgy
    public static void main(String[] agrs) {
        int x = 0;
        while (x < 4) {
            System.out.print("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x < 1) {
                System.out.print("oise");
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            System.out.println();
            x = x + 1;
        }
    }
}
