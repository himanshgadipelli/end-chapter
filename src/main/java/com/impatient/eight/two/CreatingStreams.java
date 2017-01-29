package com.impatient.eight.two;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by bobby on 1/28/2017.
 */
public class CreatingStreams {
    public static <T> void show(String title, Stream<T> stream){
        final int SIZE = 10;
        List<T> firstElements = stream.limit(SIZE+1).collect(Collectors.toList());
        System.out.println(title+": ");
        if(firstElements.size() <= SIZE)
            System.out.println(firstElements);
        else{
            firstElements.remove(SIZE);
            String out = firstElements.toString();
            System.out.println(out.substring(0,out.length() -1) + ",...]");
        }
    }

    public static void main(String [] args) throws IOException{
        Path path = Paths.get("../alice.txt");
        String contents = new String(Files.readAllBytes(path), StandardCharsets.UTF_8);

        Stream<String> words = Stream.of(contents.split("\\PL+"));
        show("words",words);

    }
}
