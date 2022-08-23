package me.arnaumas.dto;

import java.util.List;
import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.*;

@Entity(name = "users")
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Users {

	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private @Getter @Setter int id;
	
	private @Getter @Setter String username;
	private @Getter @Setter String email;
	private @Getter @Setter String steamUserName;
	private @Getter @Setter String password;
	
	@JsonIgnore @OneToMany(mappedBy = "users")
	private @Getter @Setter List<Friendships> friendships;
	@JsonIgnore @OneToMany(mappedBy = "users2")
	private @Getter @Setter List<Friendships> friendships2;
	@JsonIgnore @OneToMany(mappedBy = "users")
	private @Getter @Setter List<GroupMembership> groupMembership;
	@JsonIgnore @OneToMany(mappedBy = "users")
	private @Getter @Setter List<Messages> messages;
	@JsonIgnore @OneToMany(mappedBy = "users")
	private @Getter @Setter List<Parties> parties;

}
