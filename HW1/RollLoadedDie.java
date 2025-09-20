public class RollLoadedDie {
    public static int roll() {
        double rNumber = Math.random();
        int result;
        if (rNumber < 1.0/8.0) {
            result = 1;
        }
        else if (rNumber < 2.0/8.0) {
            result = 2;
        }
        else if (rNumber < 3.0/8.0) {
            result = 3;
        }
        else if (rNumber < 4.0/8.0) {
            result = 4;
        }
        else if (rNumber < 5.0/8.0) {
            result = 5;
        }
        else {
            result = 6;
        }
        return result;
    }
    public static void main(String args[]) {
        System.out.println(roll());
    }
}
