package com.cicd.cicdappliedtospringbootjavaapp.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Class Description.
 *
 * @author Antônio Lima Jr
 */
@RestController
public class ApiRest {
  @GetMapping
  public ResponseEntity<String> response() {
    return ResponseEntity.ok("Ola mundoooo");
  }
}
