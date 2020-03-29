package ${package}.library;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class SampleLibrary {
  public String getMessage() {
    log.debug("getMessage");
    return SampleLibrary.message();
  }

  private static String message() {
    String[] field = {"h", "e", "l", "l", "o"};
    String s = "";
    for (String _s : field) {
      s = s + _s;
    }
    return s;
  }
}
