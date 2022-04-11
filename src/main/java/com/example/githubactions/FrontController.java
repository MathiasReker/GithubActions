package com.example.githubactions;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
public class FrontController {
  @GetMapping("/")
  public String hello() {
    return "Hello World10";
  }
}
