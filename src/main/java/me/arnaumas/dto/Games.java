package me.arnaumas.dto;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity(name="games")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Games {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int id;
    
    private @Getter @Setter String title;
    private @Getter @Setter String thumbnailUrl;
    private @Getter @Setter String url;
    
    @JsonIgnore @OneToMany(mappedBy="games")
    private @Getter @Setter List<Parties> parties;
}
