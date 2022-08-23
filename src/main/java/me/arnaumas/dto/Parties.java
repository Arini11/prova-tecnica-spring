package me.arnaumas.dto;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;
import lombok.ToString.Exclude;

@Entity(name = "parties")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Parties {

	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	
	private @Getter @Setter String name;
	private @Getter @Setter String description;
	
	@JsonIgnore @OneToMany(mappedBy = "parties")
	private @Getter @Setter List<GroupMembership> groupMembership;
	@JsonIgnore @OneToMany(mappedBy = "parties")
	private @Getter @Setter List<Messages> messages;
	@Exclude @ManyToOne(optional = false) @JoinColumn(name = "game_id", nullable = false)
	private @Getter @Setter Games games;
	@Exclude @ManyToOne(optional = false) @JoinColumn(name = "admin_id", nullable = false)
	private @Getter @Setter Users users;

}
