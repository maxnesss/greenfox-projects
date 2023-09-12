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
public class Test2 {
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

    public static String[][] moveStudents(String[][] students, int pos) {
        for (String[] list : students) {
            String temp = list[pos];
            for (int i = pos + 1; i < list.length; i++) {
                String next = list[i];
                list[i] = temp;
                temp = next;
            }
            list[pos] = temp;
        }
        return students;
    }





}