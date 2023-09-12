//
//What is John K. Miller's phone number?
//Whose phone number is 307-687-2982?
//Do we know Chris E. Myers' phone number? (yes/no)
//The full output of your main method should be the following:
//
//402-247-8568
//Brooke P. Askew
//no
import java.util.HashMap;

public class TelephoneBook {
    public static void main(String[] args) {
        HashMap<String,String> telephoneBook = new HashMap<>();
        telephoneBook.put("William A. Lathan", "405-709-1865");
        telephoneBook.put("John K. Miller", "402-247-8568");
        telephoneBook.put("Hortensia E. Foster", "606-481-6467");
        telephoneBook.put("Amanda D. Newland", "319-243-5613");
        telephoneBook.put("Brooke P. Askew", "307-687-2982");
        //what is john's phone number
        System.out.println(telephoneBook.get("John K. Miller"));
        //Whose phone number is 307-687-2982?
        for (String i : telephoneBook.keySet()) {

            if(telephoneBook.get(i).equals("307-687-2982")){
                System.out.println(i);
            }
        }
        //Do we know Chris E. Myers' phone number? (yes/no)
        if(telephoneBook.containsValue("Chris E. Myers")){
        System.out.println("yes");
        } else {
            System.out.println("no");
        }




    }
}
