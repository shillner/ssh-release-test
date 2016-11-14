package com.itemis.maven.plugins;

import org.junit.Assert;
import org.junit.Test;
import org.junit.experimental.categories.Category;

public class JenkinsTest {

  @Test
  @Category(IntegrationTest.class)
  public void failingTest() {
    Assert.fail("intended to fail");
  }

  @Test
  @Category(IntegrationTest.class)
  public void validIntegrationTest() {
    Assert.assertEquals(2, 1 + 1);
  }

  @Test
  public void validUnitTest() {
    Assert.assertEquals(3, 1 + 2);
  }
}
