package me.arnaumas.dto;

import javax.persistence.*;
import lombok.*;
import lombok.ToString.Exclude;

@Entity(name="group_membership")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class GroupMembership {
    
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    private @Getter @Setter int id;
    
    @Exclude @ManyToOne(optional=false) @JoinColumn(name="user_id", nullable=false)
    private @Getter @Setter Users users;
    @Exclude @ManyToOne(optional=false) @JoinColumn(name="group_id", nullable=false)
    private @Getter @Setter Parties parties;
}
