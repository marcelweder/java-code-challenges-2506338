package com.linkedinlearning.challenges;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CsvParser {

  public Map<Integer, String> parse(String file) {

    Map<Integer, String> mapItems = new HashMap<>();

    try (FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);) {

      mapItems = bufferedReader.lines().map(
          line -> line.split(",")).collect(
              Collectors.toMap(
                  key -> Integer.parseInt(key[0]),
                  value -> value[1],
                  (key, value) -> key + ", " + value));

    } catch (IOException ex) {
      System.out.println("Error reading file '" + file + "'");
    }

    return mapItems;
  }

}
