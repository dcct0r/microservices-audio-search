package org.music.searchaudioservice;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.music.searchaudioservice.infrastracture.api.controller.SearchAuthorController;
import org.music.searchaudioservice.service.SearchAuthorService;

@ExtendWith(MockitoExtension.class)
public class SearchAuthorControllerTest {
    @Mock
    SearchAuthorService authorService;

    @InjectMocks
    SearchAuthorController searchAuthorController;

    @Test
    void handleAuthorByFirstNameAndLastName_ReturnsValidResponse() {

    }

    @Test
    void handleAuthorByFirstNameAndLastName_ReturnsInvalidResponse() {

    }
}
