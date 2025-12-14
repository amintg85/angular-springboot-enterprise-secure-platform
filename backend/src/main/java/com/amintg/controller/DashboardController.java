
package com.amintg.controller;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class DashboardController {
 @GetMapping("/kpi")
 public Map<String,Object> kpi() {
  return Map.of("users",120000,"latency",120,"availability","99.99%");
 }
}
