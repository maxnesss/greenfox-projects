import java.util.Arrays;

public class Test {

    public static void main(String[] args) {
        int[] numbers;
        numbers = new int[5];
        numbers[0] = 9;
        numbers[1] = 5;
        numbers[2] = 3;
        Arrays.sort(numbers);



        String[] names = {"Ales", "Lukas", "David"};
        String[] names3 = {"Ales", "Lukas", "Karel", "David"};

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(names));
        System.out.println(names.length);

        for (int name = 0; name<names.length;name++){
            System.out.println(names[name]);
        }

        System.out.println(Arrays.binarySearch(numbers, 5));

        String[][] names1 = new String[2][];
        names1[0] = new String[]{"Ales", "Lukas" };
        names1[1] = new String[]{"max", "max2", "denis", "Mirek" };
        System.out.println(Arrays.toString(names1));
        System.out.println(names1[1][3]);
        System.out.println(names1[0].length + " " + names1[1].length);
        System.out.println(Arrays.deepToString(names1));

        System.out.println(Arrays.compare(names, names3));

        for (int category = 0; category<names1.length; category++){

            for (int name = 0; name<names1[category].length; name++){
                if (names1[category][name].equals("max")){
                    System.out.println("Found at: " + category + " " + name);
                }
            }

        }

    }
}
