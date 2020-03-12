package com.open.board.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.open.board.constants.Schema;
import com.open.board.constants.Tables;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name=Tables.userMapping,schema=Schema.defaultSchema)
public class UserMapping extends Track{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	long userMapId;
	
	@ManyToOne
	@JoinColumn(name="fk_user")
	User user;
	@ManyToOne
	@JoinColumn(name="fk_organization")
	Organization org;
	@ManyToOne
	@JoinColumn(name="fk_role")
	Role role;
	
}
