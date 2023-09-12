        // - Create a two-dimensional array (of Strings)
        //   which can contain the different shades of specified colors
        // - In `colors[0]` store the shades of green:
        //   `"lime", "forest green", "olive", "pale green", "spring green"`
        // - In `colors[1]` store the shades of red:
        //   `"orange red", "red", "tomato"`
        // - In `colors[2]` store the shades of pink:
        //   `"orchid", "violet", "pink", "hot pink"`
        // - Print the array in the following format:
        //
        //   lime, forest green, oline, pale green, spring green
        //   orange red, red, tomato
        //   orchid, violet, pink, hot pink
public class Colors {
    public static void main(String[] args) {
        // init of 2d array with colors
        String[][] colors = {
                {"lime", "forest green", "olive", "pale green", "spring green"},
                {"orange red", "red", "tomato"},
                {"orchid", "violet", "pink", "hot pink"}};

        // loops through the colors categories
        for (int category=0; category<colors.length;category++){

            // loops through each element in each category
            for (int element=0; element < colors[category].length; element++){

                System.out.print(colors[category][element] + " ");
            }
            // makes new line inbetween each category
            System.out.println();

        }
    }

}
