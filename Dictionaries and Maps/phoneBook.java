//Complete this code or write your own from scratch
import java.util.*;
import java.io.*;

class Solution{
    public static String searchPhoneBook(HashMap<String,Integer> phonebook,String name){
        if(phonebook.containsKey(name)){
            return(name+"="+phonebook.get(name)); 
        }
        return("Not found");
    }
    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        HashMap<String,Integer> phonebook = new HashMap<>();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            
            phonebook.put(name,phone);
        }
        while(in.hasNext()){
            String s = in.next();
            // Write code here
           System.out.println(searchPhoneBook(phonebook, s));
        }
        in.close();
    }
}
