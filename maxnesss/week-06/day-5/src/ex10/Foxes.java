package ex10;

import java.util.ArrayList;
import java.util.List;

public class Foxes {
    List<Fox> foxList = new ArrayList<>();

    public Foxes() {
        foxList.add(new Fox("max","black",4));
        foxList.add(new Fox("ben","blue",2));
        foxList.add(new Fox("rich","red",1));
        foxList.add(new Fox("evan","green",5));
        foxList.add(new Fox("long","green",3));
        foxList.add(new Fox("haf","green",3));
        foxList.add(new Fox("roll","black",4));
        foxList.add(new Fox("coke","black",4));

    }

    public List<Fox> getFoxList() {
        return foxList;
    }
}
