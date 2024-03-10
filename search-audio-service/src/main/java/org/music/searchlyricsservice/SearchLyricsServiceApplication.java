package org.music.searchlyricsservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SearchLyricsServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(SearchLyricsServiceApplication.class, args);
    }
}
