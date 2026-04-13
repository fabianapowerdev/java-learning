package com.fabianaferreiradev.fundamentos;

import java.util.*;


public class EstruturasDeDados {
    static void main(String[] args) {

      // List<String> list = List.of("apple", "banana", "cherry");

       List<String> list = new ArrayList<>();
        list.add("Hello world");
        list.add("apple");
        list.add("banana");
        list.add("cherry");
        list.add("cherry");

        System.out.println("Lista = " + list);

        Set<String> setStrings = new HashSet<>();
        setStrings.add("apple");
        setStrings.add("banana");
        setStrings.add("cherry");
        setStrings.add("cherry");

        System.out.println("SetStrings = " + setStrings.contains("cherry"));
        System.out.println("SetStrings = " + setStrings);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Fabiana");
        map.put("surname",  "Ferreira");
        System.out.println(map.get("name"));

        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        System.out.println("Queue = " + queue);
        System.out.println("Queue = " + queue.poll());
        System.out.println("Queue = " + queue.poll());
        System.out.println("Queue = " + queue.poll());
        System.out.println("Queue = " + queue);

        LinkedList<String> linkedList = new LinkedList<>();




    }
}

