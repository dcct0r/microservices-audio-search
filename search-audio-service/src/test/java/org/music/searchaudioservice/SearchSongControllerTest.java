package org.music.searchaudioservice;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;

@ExtendWith(MockitoExtension.class)

public class SearchSongControllerTest {

    /*@Autowired
    MockMvc mockMvc;

    @Mock
    SearchSongService songService;

    @InjectMocks
    SearchSongController searchSongController;

    @BeforeEach
    void setup() {
        this.mockMvc = MockMvcBuilders.standaloneSetup(new SearchSongController(songService))
                .defaultRequest(get("/search/songs/")
                        .accept(MediaType.APPLICATION_JSON))
                .build();
    }

    @Test
    void handleSongByAuthorAndTitle_ReturnsValidResponse() {
        //given
        var author = "Lois Armstrong";
        var title = "Rose";
        when(this.songService.findSongByAuthorAndTitle(author, title));
        //when
        var respEntity = this.searchSongController.getSongByAuthorAndTitle(author, title);
        //then
        assertNull(respEntity);
        assertEquals(respEntity, HttpStatus.OK);

    }

    @Test
    void handleSongByAuthorAndTitle_ReturnsInvalidResponse() {
        //given
        var author = "Lois Armstrong";
        when(this.songService.findSongByAuthorAndTitle(author, null));
        //when
        var respEntity = this.searchSongController.getSongByAuthorAndTitle(author, null);
        //then
        assertNull(respEntity);
        assertEquals(respEntity, HttpStatus.OK);
    }

    @Test
    void handleSongByTitle_ReturnsInvalidResponse() throws Exception {
        mockMvc.perform(get("/title"))
                .andExpect(status().is(404));
    }

    @Test
    void handleSongByTitle_ReturnsValidResponse() {
        //given
        String title = null;
        when(this.songService.findSongsByTitle(title));
        //when
        var respEntity = this.searchSongController.getSongsByTitle(title);
        //then
        assertNull(respEntity);
        assertEquals(respEntity, HttpStatus.OK);
    }*/
}
