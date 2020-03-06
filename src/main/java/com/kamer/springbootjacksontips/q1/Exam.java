package com.kamer.springbootjacksontips.q1;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Created on March, 2020
 *
 * @author kamer
 */
@Getter
@Setter
@ToString
public class Exam {

	private String title;

	private String lecture;

	private LocalDateTime examDate;

	private Integer studentNumber;

	private List<Question> questions;

}
