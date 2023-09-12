package harrypotter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BookShop {
        List<Book> listOfBooks = new ArrayList<>();

    BookShop(){

        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookOne());
        listOfBooks.add(new BookTwo());
        listOfBooks.add(new BookThree());
        listOfBooks.add(new BookFive());
        listOfBooks.add(new BookFour());



    }
    public double calculatePrice(){
        int price = 0;
        HashMap<String,Integer> hashOfBooks = listToHash();
        double tempCash = 0;

        for (String key:hashOfBooks.keySet()){
            for (int i = 1; i < hashOfBooks.get(key); i++) {
                tempCash += 8.0;
            }
            hashOfBooks.put(key, 1);
        }
        if (hashOfBooks.size()==5){
            
        }


        System.out.println(hashOfBooks);
        
        return tempCash;
    }

    public HashMap<String,Integer> listToHash(){
        HashMap<String, Integer> hashOfBooks = new HashMap<>();
        for(Book book: this.listOfBooks){
            Integer occurrence = hashOfBooks.get(book.getTitle());
            System.out.println(book.getTitle());
            hashOfBooks.put(book.getTitle(),(occurrence ==null) ? 1 : occurrence+1);
        }
        return hashOfBooks;
    }





}
