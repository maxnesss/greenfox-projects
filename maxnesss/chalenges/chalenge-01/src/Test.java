import java.util.Arrays;

//        System.out.println(Arrays.deepToString(moveStudents(students, 1)));
// /* Mělo by vypsat - posunout studenty na pozici "1" o "1 skupinu" -> ty "!!" jsou tam jen pro vás, abyste viděli, kde proběhla změna, na zvlášť řádcích je to pro čitelnost:
//
// ["Max", !!"David"!!, "Oryna", "Václav", "Daniel", "Tomáš"],
// ["Rasťa", !!"Aleks"!!, "Míša", "Martin", "Petr", "Zdenko"],
// ["Ríša", !!"Tomáš"!!, "Matouš", "Renat", "Václav", "Jakub"]
// */
//
//        System.out.println(Arrays.deepToString(moveStudents(students, 4)));
// /* Mělo by vypsat - posunout studenty na pozici "4" o "4 skupiny" -> ty "!!" jsou tam jen pro vás, abyste viděli, kde proběhla změna, na zvlášť řádcích je to pro čitelnost:
//
// ["Max", "David", "Oryna", "Václav", !!"václav"!!, "Tomáš"],
// ["Rasťa", "Aleks", "Míša", "Martin", !!"Daniel"!!, "Zdenko"],
// ["Ríša", "Tomáš", "Matouš", "Renat", !!"Petr"!!, "Jakub"]
// */
public class Test {
    public static void main(String[] args) {
        String[][] students = {
                {"Max", "Aleks", "Oryna", "Václav", "Daniel", "Tomáš"},
                {"Rasťa", "Tomáš", "Míša", "Martin", "Petr", "Zdenko"},
                {"Ríša", "David", "Matouš", "Renat", "Václav", "Jakub"}

        };
        System.out.println("original list");
        System.out.println(Arrays.deepToString(students));
        System.out.println("\n");
        System.out.println(Arrays.deepToString(moveStudents(students, 1)));
        System.out.println(Arrays.deepToString(moveStudents(students, 4)));
        System.out.println(Arrays.deepToString(moveStudents(students, 0)));


    }
    public static String[][] moveStudents(String[][] listOfStudents, int position){


        for (int category = 0; category < listOfStudents.length; category++) {
            String temp1 = listOfStudents[category][position];
            int a = position;
            while(a> listOfStudents.length-1){
                a-= listOfStudents.length;
            }
            for (int i = 0; i < listOfStudents.length; i++) {
                listOfStudents[i][position] = temp1;

            }

        }
        return listOfStudents;
    }
}