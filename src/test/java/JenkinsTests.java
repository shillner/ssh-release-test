import org.junit.Assert;
import org.junit.Test;

public class JenkinsTests {

  @Test
  public void failingTest() {
    Assert.fail("intended to fail");
  }

  public void validTest() {
    Assert.assertTrue(1 + 1 == 2);
  }
}
