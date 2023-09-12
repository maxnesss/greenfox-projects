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
public class Main {
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
        int cat1 = 0;
        int cat2 =1;
        int cat3 =2;


        String temp1 = listOfStudents[cat1][position];
        String temp2 = listOfStudents[cat2][position];
        String temp3 = listOfStudents[cat3][position];

        int a = position;


        while(a>2){
            a-=3;
        }
        int category1 = cat1;
        int category2 = cat2;
        int category3 = cat3;
        if (a==1){
            category1 = cat1+a;
            category2 = cat2+a;
            category3 = cat3+a-3;
        } else if (a == 2) {
            category1 = cat1+a;
            category2 = cat2+a-3;
            category3 = cat3+a-4;
        }


        listOfStudents[category1][position] = temp1;
        listOfStudents[category2][position] = temp2;
        listOfStudents[category3][position] = temp3;

        return listOfStudents;
    }
}