# Lenex Java

Java Library for the [Lenex 3.0](https://de.wikipedia.org/wiki/Lenex) file format. 

The format is commonly used in swimmeets and developed by [Swimrankings.net](https://www.swimrankings.net/).
The library is able to read an uncompressed .lef file or a compressed .lxf file and transform it into POJOs.

## Ussage
```java

InputStream is = new FileInputStream(...);
Lenex lenex = LenexParser.parse(exEntries, LenexType.LENEX_COMPRESSED);
...

```

## Disclaimer
This library was originally deveopped for the [SwimCoachOrganizer](https://github.com/Tiim/SwimCoachOrganizer)
project and has just been extracted to a separate library. The API will likely change in the future as I am 
trying to make the library easier to use.

## Installation
We don't have a maven repo yet as this library is not yet production ready at all. 
If you want to play with it anyway feel free to clone this project.


