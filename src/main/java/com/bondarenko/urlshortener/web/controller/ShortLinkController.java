package com.bondarenko.urlshortener.web.controller;

import com.bondarenko.urlshortener.dto.ShortLinkResponse;
import com.bondarenko.urlshortener.service.ShortLinkGenerator;
import lombok.RequiredArgsConstructor;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(path = "/api/v1/short-link ", produces = MediaType.APPLICATION_JSON_VALUE)
public class ShortLinkController {

    private final ShortLinkGenerator shortLinkGenerator;

    @PostMapping("/generate")
    protected ShortLinkResponse generateShortLink() {

        return shortLinkGenerator.generateShortLink();
    }
}
