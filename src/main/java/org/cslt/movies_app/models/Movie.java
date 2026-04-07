package org.cslt.movies_app.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Entity
@Table(name="movie")
@NoArgsConstructor
public class Movie {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    //Configuración de la secuencia para realizar incrementos de 1
    @SequenceGenerator(
            name = "seq_movie",
            allocationSize = 1
    )
    Long id;
    String title;
    String director;
    String synopsis;
    String release_date;
    String genre;

}
