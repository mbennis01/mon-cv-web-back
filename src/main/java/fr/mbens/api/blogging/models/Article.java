package fr.mbens.api.blogging.models;

import lombok.Data;
import org.springframework.data.annotation.Id;

import javax.persistence.Entity;

@Data
@Entity
public class Article {
    @Id
    private long id;
    private String title;
    private String text;
    private String videoLink;
}
