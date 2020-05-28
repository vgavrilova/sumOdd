public class SumOdd {

    // A method that checks whether the inserted number is true
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        } else if(number % 2 != 0){
            return true;
        } else {
            return false;
        }
    }

    // A method that returns the sum of all odd numbers in a range
    public static int sumOdd(int start, int end){
        if((start < 0) || (end < 0) || (end < start)){
            return -1;
        }
        int sum = 0;
        for(int i = start; i <= end; i++){
            if(isOdd(i)){
                sum += i;

            }

        }
        return sum;
    }
}
