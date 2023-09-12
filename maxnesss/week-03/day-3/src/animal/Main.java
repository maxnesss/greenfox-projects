package animal;

public class Main {
    public static void main(String[] args) {
        Animal tiger = new Animal();
        Farm myFarm = new Farm(10);

        System.out.println(myFarm.listOfAnimal.size());
        for (int i = 0; i < 20; i++) {
            myFarm.breed();

        }
        myFarm.listOfAnimal.get(2).eat();
        myFarm.listOfAnimal.get(2).eat();
        myFarm.listOfAnimal.get(3).eat();
        myFarm.listOfAnimal.get(0).eat();
        myFarm.listOfAnimal.get(0).eat();
        myFarm.listOfAnimal.get(1).eat();

        System.out.println(myFarm.listOfAnimal.get(1).hunger);
        System.out.println(myFarm.listOfAnimal.size());
        myFarm.sell();
    }
}
