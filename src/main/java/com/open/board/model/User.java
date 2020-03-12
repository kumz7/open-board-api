package com.open.board.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.ColumnDefault;

import com.open.board.constants.Schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Table(name="user_",schema=Schema.defaultSchema)
public class User extends Track{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long userId;
	@Column(nullable=false,unique=true)
	String name;
	String password;
	@Column(nullable=false,unique=true)
	String email;
	String mobile;
	String type;
	String firstName;
	String lastName;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name = "fk_default_org")
	Organization defaultOrg;

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="fk_default_site")
	Site defaultSite;
		
	@ColumnDefault(value="false")
	boolean reset_;

}