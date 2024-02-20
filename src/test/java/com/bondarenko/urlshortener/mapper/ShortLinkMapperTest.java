package com.bondarenko.urlshortener.mapper;

import com.bondarenko.urlshortener.dto.ShortLinkResponse;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.mapstruct.factory.Mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ShortLinkMapperTest {

    private final ShortLinkMapper shortLinkMapper = Mappers.getMapper(ShortLinkMapper.class);

    @Test
    @DisplayName("should map to short link response successfully")
    void shouldMapToShortLinkResponseSuccessfully() {
        String shortLink = "00001";

        ShortLinkResponse shortLinkResponse = shortLinkMapper.toShortLinkResponse(shortLink);

        assertNotNull(shortLinkResponse);
        assertEquals(shortLink, shortLinkResponse.getShortLink());
    }
}
