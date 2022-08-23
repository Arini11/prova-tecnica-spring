package me.arnaumas.dto;

import javax.persistence.*;
import lombok.*;
import lombok.ToString.Exclude;

@Entity(name="friendships")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Friendships {

    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int id;
    
    @Exclude @ManyToOne(optional=false) @JoinColumn(name="user_id", nullable=false)
    private @Getter @Setter Users users;
    @Exclude @ManyToOne(optional=false) @JoinColumn(name="friend_id", nullable=false)
    private @Getter @Setter Users users2;

}
