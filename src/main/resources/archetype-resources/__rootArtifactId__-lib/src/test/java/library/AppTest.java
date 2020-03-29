package ${package}.library;

import static org.assertj.core.api.Assertions.assertThat;

import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

@Slf4j
/** Unit test for simple App. */
public class AppTest {
  /** Rigorous Test */
  @Test
  public void shouldAnswerWithTrue() {
    String[] args = {};
    log.info("Hello");
    SampleLibrary sampleLibrary = new SampleLibrary();
    assertThat(sampleLibrary.getMessage()).isEqualTo("hello");
  }
}
