package ${package}.application;

import ${package}.library.SampleLibrary;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class App {

  private int abc;

  public static void main(String[] args) {
    System.out.println(message() + "World!");

    SampleLibrary lib = new SampleLibrary();
    log.debug(lib.getMessage());
  }

  static String message() {
    String[] field = {"h", "e", "l", "l", "o"};
    String s = "";
    for (String _s : field) {
      s = s + _s;
    }
    return s;
  }
}
