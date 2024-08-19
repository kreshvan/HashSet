import java.util.*;

public class Main {
    public static void main(String[] args) {

        task1();
        task2();
        task3();
        task4();
    }

    public static void task1() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        for (int num : nums) {
            if (num % 2 != 0) {
                System.out.println(num);
            }
        }
    }

    public static void task2() {
        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        Collections.sort(nums);
        int e = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num % 2 == 0 & num != e) {
                System.out.println(num);
                e = num;

            }
        }
    }

    public static void task3() {
        HashSet<String> strings = new HashSet<>(List.of("один", "два", "два", "три", "три", "три"));
        System.out.println(strings);
    }

    public static void task4() {
        List<String> strings = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        HashSet<String> unic = new HashSet<>(List.of("один", "два","два", "три", "три", "три"));
        System.out.println(strings.size()-unic.size());
    }

}


