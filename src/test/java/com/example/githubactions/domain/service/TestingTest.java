package com.example.githubactions.domain.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class TestingTest {

  @Test
  void When_AgeLessThan18_Expect_isAdultAsFalse() {
    Assertions.assertFalse(new Testing().isAdult(10));
  }

  @Test
  void When_AgeMoreThan18_Expect_isAdultAsTrue() {
    Assertions.assertTrue(new Testing().isAdult(20));
  }
}
