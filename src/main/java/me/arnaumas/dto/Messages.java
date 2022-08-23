package me.arnaumas.dto;

import java.time.LocalDateTime;
import javax.persistence.*;
import lombok.*;
import lombok.ToString.Exclude;

@Entity(name="messages")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Messages {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int id;
    
    private @Getter @Setter String message;
    private @Getter @Setter LocalDateTime date;
    
    @Exclude @ManyToOne(optional=false) @JoinColumn(name="sender_id", nullable=false)
    private @Getter @Setter Users users;
    @Exclude @ManyToOne(optional=false) @JoinColumn(name="party_id", nullable=false)
    private @Getter @Setter Parties parties;
}
