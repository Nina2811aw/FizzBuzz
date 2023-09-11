public class Reduce {

    public static void main(String[] args) {
        int numberOfSteps = calculateNumberOfSteps(100);
        System.out.println(numberOfSteps);
    }

    private static int calculateNumberOfSteps(int n) {
        int counter = 0;
        while(n > 0){
            if(n % 2 == 0){
                n = n/2;
            } else{
                n = n - 1;
            }
            counter++;
        }
        return counter;
    }
}
