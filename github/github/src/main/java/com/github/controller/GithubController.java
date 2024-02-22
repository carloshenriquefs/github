package com.github.controller;

import com.github.client.GithubClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/v1")
public class GithubController {

    private GithubClient githubClient;

    public GithubController(GithubClient githubClient) {
        this.githubClient = githubClient;
    }

    @GetMapping("/repos")
    public ResponseEntity<List<RepositoryResponse>> listarRepos(@RequestHeader("token") String token) {

        var repos = githubClient.listRepos(
                "Bearer " + token,
                null,
                "public"
        );

        return ResponseEntity.ok(repos);
    }
}
