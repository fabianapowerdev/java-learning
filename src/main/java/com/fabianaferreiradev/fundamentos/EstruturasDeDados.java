package com.fabianaferreiradev.fundamentos;

import java.util.*;


public class EstruturasDeDados {
    static void main(String[] args) {

      // List<String> list = List.of("apple", "banana", "cherry");

       List<String> list = new ArrayList<>();
        list.add("Fabiana Alves");
        list.add("Fabiana Chaves");
        list.add("Daniel Alves");
        list.add("Daniel Chaves");
        list.add("cherry");

        System.out.println("Lista = " + list);

       /* Set<String> setStrings = new HashSet<>();
        setStrings.add("apple");
        setStrings.add("banana");
        setStrings.add("cherry");
        setStrings.add("cherry");

        System.out.println("SetStrings = " + setStrings.contains("cherry"));
        System.out.println("SetStrings = " + setStrings);

        Map<String, String> map = new HashMap<>();
        map.put("name", "Fabiana");
        map.put("surname",  "Ferreira");
        System.out.println(map.get("name")); */


        Carro Sandero = new Carro( "Sandero", "Preto", 2020, "ABC-1234");
        System.out.println(Sandero.ano());
        System.out.println(Sandero.Modelo());
        System.out.println(Sandero.Cor());
        System.out.println(Sandero.Place());

        // DTOs => data transfer objects
       //  POJOs +> plain old java objects

       /*
        Queue<String> queue = new LinkedList<>();
        queue.add("apple");
        queue.add("banana");
        System.out.println("Queue = " + queue);
        System.out.println("Queue = " + queue.poll());
        System.out.println("Queue = " + queue.poll());
        System.out.println("Queue = " + queue.poll());
        System.out.println("Queue = " + queue);

        LinkedList<String> linkedList = new LinkedList<>();
    */

     // STREAM API
     // realizar operações funcionais nas nossas collections (estruturas de dados)
     // filter, map, reduce, agregações
     //filter - filtra os elementos de uma coleção
     // map - transforma os elementos em uma coleção
     // reduce - reduz os elementos de uma coleção a um único elemento
     // agregações - soma, média, contatem, etc

     List<String> fabianas = list.stream().filter(nome -> nome.startsWith("Fabiana")).toList();
     System.out.println("Fabianas: " + fabianas);


    }
}

