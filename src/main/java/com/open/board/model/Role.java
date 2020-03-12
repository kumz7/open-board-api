package com.open.board.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.open.board.constants.Schema;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name="role",schema=Schema.defaultSchema)
public class Role {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long roleId;
	
	String name;
	String type;
}