package kz.bitlab.db;

import java.util.ArrayList;

public class DBManager {
    private static ArrayList<Contact> contacts = new ArrayList<>();

    static {
        contacts.add(new Contact("Serik" ,"Erzhanov" ,"24"));
        contacts.add(new Contact("ALiw" ,"Serzhanov" ,"25"));
        contacts.add(new Contact("Berik" ,"Berzhanov" ,"26"));
        contacts.add(new Contact("Masr" ,"Nerzhanov" ,"27"));
        contacts.add(new Contact("ASr" ,"Kerzhanov" ,"28"));

    }

    public static void addContact(Contact contact){
        contacts.add(contact);

    }
    public static ArrayList<Contact> getAllContacts(){
        return contacts;
    }
}
