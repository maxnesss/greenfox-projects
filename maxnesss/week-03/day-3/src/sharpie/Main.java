package sharpie;

public class Main {
    public static void main(String[] args) {
        Sharpie penOne= new Sharpie("Red",10);
        Sharpie penTwo= new Sharpie("Black",10);
        Sharpie penThree= new Sharpie("Blue",10);

        for (int i = 0; i < 10; i++) {
            penOne.use();
        }
        System.out.println(penOne.color +" "+penOne.width+" "+penOne.inkAmount);


        SharpieSet listOfPens = new SharpieSet();

        listOfPens.add(penOne);
        listOfPens.add(penTwo);
        listOfPens.add(penThree);


        System.out.println(listOfPens.countUsable());
        listOfPens.removeTrash();
        System.out.println(listOfPens.listOfSharpies.size());



    }
}
