# Opdracht: sorteren van lijst met gerechten
Opdracht in functie van het gebruik van anonieme inwendige klassen

## Gegeven
De klasse `Gerecht` met de velden `naam` en `calorieen`.

Een uitvoerbare `main`methode in `App` die een menu (`List`) van meerdere Gerechten aanmaakt

## Gevraagd
Verwerk de TODO's in de `main`methode:

- Sorteer de lijst `menu` op basis van de calorieën van een `Gerecht` van laag naar hoog.
- Druk de gesorteerde lijst af op te console

## Hoe sorteren
### sort() method op een List
Gebruik de methode `sort()` die je kan uitvoeren op een `List`:
https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/List.html#sort(java.util.Comparator)

Volgens de JavaDoc: _"Sorts this list according to the order induced by the specified Comparator"_

### Comparator
`Comparator` is een interface waarbij je de methode `compare(T,T)` kan overschrijven: 

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html

https://docs.oracle.com/en/java/javase/11/docs/api/java.base/java/util/Comparator.html#compare(T,T)

Volgens de JavaDoc: _"Compares its two arguments for order. Returns a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second."_

**Parameters:**
- o1 - the first object to be compared.
- o2 - the second object to be compared.

**Returns:**
a negative integer, zero, or a positive integer as the first argument is less than, equal to, or greater than the second.

### Concreet
Maak een anonieme inwendige klasse van het type `Comparator` aan bij het sorteren van de lijst via de `sort()`methode
 en schrijf een correcte bijhorende implementatie zodat de Gerechten op calorieën worden gesorteerd.

## Uitbreiding
Maak een kleine aanpassing en zorg ervoor dat de gerechten op een gelijkaardige manier alfabetisch worden gesorteerd op hun naam.

