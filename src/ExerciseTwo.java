import java.util.ArrayList;
import java.util.List;

public class ExerciseTwo {
    public static void main(String[] args) {
        System.out.println(Total(10));
    }
    public static boolean isEven(int number){
        // simply you can do: return number%2 == 0;
        if (number%2 == 0){
            return true;
        }
        else {
            return false;
        }
    }
    public static List<Integer> Total(int total) {
        List<Integer> numbers = new ArrayList<>();
        int twoTotal = total*2;
        for (int i = 0; i<= twoTotal; i++){
            boolean isItEven = isEven(i);
            if (isItEven == true){
                numbers.add(i);
            }
        }
        return numbers;
    }
}
