package org.music.searchaudioservice.domain.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.UUID;

@Entity
@Table(name = "author")
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "author_id")
    private UUID id;

    @NotNull
    @Column(name = "firstname")
    private String firstName;

    @NotNull
    @Column(name = "lastname")
    private String lastName;

    @Column(name = "citizenship")
    private String citizenship;

    @NotNull
    @Column(name = "career_start")
    private Integer careerStart;

    @Column(name = "birthday")
    private Date birthday;

    @NotNull
    @Column(name = "male")
    private String male;

    @Column(name = "genre")
    private String genre;
}