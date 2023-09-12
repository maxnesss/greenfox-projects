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
public class Test3 {
    public static void main(String[] args) {
        String[][] students = {
                {"Max", "Aleks", "Oryna", "Václav", "Daniel", "Tomáš"},
                {"Rasťa", "Tomáš", "Míša", "Martin", "Petr", "Zdenko"},
                {"Ríša", "David", "Matouš", "Renat", "Václav", "Jakub"}
        };
//        System.out.println("original list");
//        System.out.println(Arrays.deepToString(students));
//        System.out.println("\n");
        System.out.println(Arrays.deepToString(moveStudents(students, 1)));
        System.out.println(Arrays.deepToString(moveStudents(students, 4)));
//        System.out.println(Arrays.deepToString(moveStudents(students, 0)));
//    moveStudents(students,1);
//    moveStudents(students,2);
//    moveStudents(students,3);
//    moveStudents(students,4);

    }

    public static String[][] moveStudents(String[][] students, int n) {
        // temp Array to store the students of position n from each category;
        String[] tempArr = new String[students.length];
        // adding students to temp string
        for (int studentIndex = 0; studentIndex < students.length; studentIndex++) {
            tempArr[studentIndex] = students[studentIndex][n];
        }
        // rotate the temp array for n
        for (int i = 0; i <n ; i++) {
            //make temp
            String lastName = tempArr[tempArr.length-1];
            //rotate the temp for one positinon
            for (int position = tempArr.length -1; position > 0; position--) {
                tempArr[position] =tempArr[position-1];
            }
            tempArr[0] = lastName;
        }
        // populate to original list
        for (int studentIndex = 0; studentIndex < students.length; studentIndex++) {
             students[studentIndex][n] = tempArr[studentIndex];
        }
        return students;
    }
}