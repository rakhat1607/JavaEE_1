package kz.bitalb.homework_1_2;

import java.util.ArrayList;

public class DataUsers {

    private static ArrayList<Users> users = new ArrayList<>();

    static {

        users.add(new Users("Ilyas","Zhuanyshev","IT","550000"));
        users.add(new Users("Aybek","Bagit","Management","650000"));
        users.add(new Users("Alibek","Serikov","HR","350000"));
        users.add(new Users("Serzhan","Berikov","IT","450000"));
        users.add(new Users("Madina","Assetova","PR","350000"));

    }
    public static ArrayList<Users> getAllContacts(){
        return users;
    }
}

