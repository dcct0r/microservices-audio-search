package org.music.audioservice.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "music", schema = "tracks")
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "song_id")
    private UUID id;

    @NotNull
    @Column(name = "song_name")
    private String songName;

    @NotNull
    @Column(name = "author_name")
    private String authorName;

    @Column(name = "description")
    private String description;

    @NotNull
    @CreationTimestamp
    @Column(name = "published_date")
    private Date publishedDate;
}
