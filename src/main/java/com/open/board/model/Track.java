package com.open.board.model;

import java.io.Serializable;
import java.util.Date;

import org.hibernate.annotations.ColumnDefault;

import lombok.AllArgsConstructor;
import lombok.Data;
@Data
public class Track implements Serializable{
	@ColumnDefault(value="false")
	Boolean active_;
	Date createdDate;
	Date ModifiedDate;
	String createdUser;
	String ModifiedUser;
}
