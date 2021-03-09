import java.util.*;

public class TwoSum {

    public static int[] twoSum(int[] nums, int target) {

        Map<Integer, Integer> hashMap = new HashMap<>();

        List<Integer> listOfNums = new ArrayList<>();
        for (int i : nums) {
            listOfNums.add(i);
        }

        int[] result = new int[2];

        for(int i = 0; i < listOfNums.size(); i++) {
            int current = listOfNums.get(i);
            int complement = target - current;

            if (!hashMap.containsValue(complement)) {
                hashMap.put(i, current);
            } else {
                result[0] = i;
                result[1] = listOfNums.indexOf(complement);

                return result;
            }
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int[] result = TwoSum.twoSum(nums, 9);
        for (int i : result) {
            System.out.println(i);
        }
    }
}

