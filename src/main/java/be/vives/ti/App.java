package be.vives.ti;

import java.util.Arrays;
import java.util.List;

public class App {

  public static void main(String[] args) {
    List<Gerecht> menu = Arrays.asList(
            new Gerecht("varken", 800),
            new Gerecht("rund", 700),
            new Gerecht("kip", 400),
            new Gerecht("frietjes", 530),
            new Gerecht("rijst", 350),
            new Gerecht("fruit", 120),
            new Gerecht("pizza", 550),
            new Gerecht("forel", 300),
            new Gerecht("zalm", 450)
    );

    // TODO: sorteer het volledige menu op calorieën van laag naar hoog


    // TODO: druk de gesorteerde lijst af op de console

  }
}