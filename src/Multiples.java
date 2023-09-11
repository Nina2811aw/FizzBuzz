public class Multiples {

    public static void main(String[] args) {
        int numberOfMultiples = calculateNumberOfMultiples(1000);
        System.out.println(numberOfMultiples);
    }
    private static int calculateNumberOfMultiples(int i) {
        int result = 0;
        int currentNumber = i - 1;
        while(currentNumber > 0){
            if(currentNumber % 5 == 0 || currentNumber % 3 == 0){
                result++;
            }
            currentNumber--;
        }
        return result;
    }


}


