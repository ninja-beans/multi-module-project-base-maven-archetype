package ${package}.application;

import static org.junit.jupiter.api.Assertions.assertTrue;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
/** Unit test for simple App. */
public class AppTest {
  /** Rigorous Test */
  @Test
  public void shouldAnswerWithTrue() {
    // new App();
    String[] args = {};
    App.main(args);
    log.info("Hello");
    assertTrue(true);
  }
}
