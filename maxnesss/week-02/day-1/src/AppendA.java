import java.util.Arrays;

// - Create an array variable named `animals`
        //   with the following content:
        //   `["koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
        //     "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul",
        //     "piranh"]`
        //
        // - Add an `"a"` at the end of all elements (use a loop!)
        // - Print the 'fixed' array to the console:
        //   [koala, panda, zebra, anaconda, boa, ..., puma, tarantula, piranha]
public class AppendA {
    public static void main(String[] args) {
        String[] animals = {"koal", "pand", "zebr", "anacond", "bo", "chinchill", "cobr",
                "gorill", "hyen", "hydr", "iguan", "impal", "pum", "tarantul", "piranh"};

        // adds a to each animal in the animals array
        for(int element = 0; element < animals.length; element++){
            animals[element]= animals[element].concat("a");
        }
        System.out.println(Arrays.toString(animals));
    }

}