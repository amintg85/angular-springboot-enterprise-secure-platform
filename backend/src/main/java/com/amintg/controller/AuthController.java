
package com.amintg.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/auth")
public class AuthController {
 @PostMapping("/login")
 public Map<String,String> login() {
  return Map.of("token","mock-jwt-token","role","ADMIN");
 }
}
