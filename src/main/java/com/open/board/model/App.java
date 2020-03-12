package com.open.board.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.beans.factory.annotation.Value;

import com.open.board.constants.Schema;
import com.open.board.constants.Tables;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Data;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
@Table(name=Tables.app,schema=Schema.defaultSchema)
public class App extends Track{
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	Long appId;
	String type;
	String position;
	String preferences;
}