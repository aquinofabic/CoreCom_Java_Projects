import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

// EXERCISE
// Describe what each method does using algorithmic words and phrases
class Scratch {
    public static List<Integer> method1(List<Integer> input, int maximum) {
        List<Integer> output = new ArrayList<Integer>();
        for (int value: input){
            if (value <= maximum) {
                output.add(value);
            }
        }
        return output;
    }

    /*
    Declare a method called method1 that returns integers in a list, and is public and static
    and accepts (parameters) called input, which is integers in a list, and another integer variable called maximum {

    Declare a variable called output which is a list of <integers> and assign = to a new Array of integers (which is empty).
    Two-clause for loop, for each integer value, range from value to input, which increments by 1 {
        if the value is less than or equal to the maximum {
            method is to add the value to the output list
            }
        }
        returns the output
     */

    public static List<Integer> method2(List<Integer> input) {
        List<Integer> output = new ArrayList<Integer>();
        int fst, snd;
        for (int i = 0; i < (input.size() - 1); i += 2) {
            fst = input.get(i);
            snd = input.get(i + 1);
            output.add(fst + snd);
        }
        return output;
    }
1
    public static int method3(List<Integer> input) {
        int result = 0;
        for (int candidate : input) {
            if (candidate > result) {
                result = candidate;
            }
        }
        return result;
    }
    public static boolean method4a(int parameter) {
        if (parameter < 2) {
            return false;
        }
        for (int i = 2; i < parameter; i++) {
            if (parameter % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static List<Integer> method4b(int parameter) {
        List<Integer> integers = new ArrayList<Integer>();
        for (int i=0; i < parameter; i++) {
            if (method4a(i)) {
                integers.add(i);
            }
        }
        return integers;
    }
    public static List<Integer> method5() {
        Map<LocalDate, Boolean> holidays = getBankHolidays();
        List<Integer> result = new ArrayList<Integer>();
        LocalDate date, today;
        date = today = LocalDate.now();
        while (result.size() < 5) {
            if (holidays.get(date)) {
                result.add(Period.between(today, date).getDays());
                date = date.plusDays(1);
            }
        }
        return result;
    }
}
