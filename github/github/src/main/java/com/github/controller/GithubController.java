package com.github.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class GithubController {

    @GetMapping("/repos")
    public ResponseEntity<List<RepositoryResponse>> listarRepos() {
        return null;
    }
}
