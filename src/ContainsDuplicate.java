import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static boolean containsDuplicate(int[] numbers) {
        Set<Integer> setOfNumbers = new HashSet<>();

        for (int i = 0; i < numbers.length; i++) {
            setOfNumbers.add(numbers[i]);
        }

        return setOfNumbers.size() < numbers.length;
    }

    public static void main(String[] args) {
        int[] numbers = {1,2,3,4};
        int[] numbers2 = {1,2,3,1};
        int[] numbers3 = {1,1,1,3,3,4,3,2,4,2};

        System.out.println(ContainsDuplicate.containsDuplicate(numbers));
        System.out.println(ContainsDuplicate.containsDuplicate(numbers2));
        System.out.println(ContainsDuplicate.containsDuplicate(numbers3));
    }
}
