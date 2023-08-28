package com.camilo.datastructures.arrays;

import com.camilo.User;

public class ArraysMain {

    public static void main(String[] args) {
        MyDynamicArray<User> users = new MyDynamicArray<>();
        users.append(new User("1", "John", "123", 27));
        users.append(new User("2", "Mary", "123", 20));
        users.append(new User("3", "Matt", "123", 16));
        users.append(new User("4", "Annie", "123", 38));
        users.append(new User("5", "Xavier", "123", 53));

        System.out.println("List is empty? " + users.isEmpty());
        System.out.println("List: " + users);
    }

}
