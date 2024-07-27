package ru.sergachev.pastebox.controller;

import org.springframework.web.bind.annotation.*;
import ru.sergachev.pastebox.api.request.PasteBoxRequest;

import java.util.List;

@RestController
public class PasteBoxController {

    @GetMapping("/{hash}")
    public String getByHash(@PathVariable String hash) {
        return hash;
    }

    @GetMapping("")
    public List<String> getPublicPasteList() {
        return null;
    }

    @PostMapping("/")
    public String add(@RequestBody PasteBoxRequest request) {
        return request.getData();
    }
}
