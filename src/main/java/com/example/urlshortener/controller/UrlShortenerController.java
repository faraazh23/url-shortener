// controller/UrlShortnerController.java
package com.example.urlshortener.controller;

import com.example.urlshortener.service.UrlShortenerService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.view.RedirectView;

@RestController
public class UrlShortenerController {

    private final UrlShortenerService service;

    public UrlShortenerController(UrlShortenerService service) {
        this.service = service;
    }

    @PostMapping("/shorten")
    public ResponseEntity<String> shortenUrl(@RequestBody String originalUrl) {
        String code = service.shortenUrl(originalUrl);
        return ResponseEntity.ok("http://localhost:8080/" + code);
    }

    @GetMapping("/{code}")
    public RedirectView redirect(@PathVariable String code) {
        String originalUrl = service.getOriginalUrl(code);
        return new RedirectView(originalUrl);
    }
}