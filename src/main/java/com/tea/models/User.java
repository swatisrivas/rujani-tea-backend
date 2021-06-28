package com.tea.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="users")
@Data
@Setter
@Getter
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(generator="user_seq",strategy=GenerationType.SEQUENCE)
	@SequenceGenerator(name="user_seq",sequenceName="user_seq",allocationSize=1,initialValue=1)
	@Column(name="user_id")
	private int userId;
	private String name;
	private String email;
	private String password;
	@Column(columnDefinition=" varchar(10) default 'user'")
	private String type; 
	
	public User(int userId, String name, String email, String password) {
		super();
		this.userId = userId;
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	
}
