package com.kamer.springbootjacksontips;

import com.kamer.springbootjacksontips.q1.Exam;
import com.kamer.springbootjacksontips.q2.Q2ProductOptionOne;
import com.kamer.springbootjacksontips.q2.Q2ProductOptionTwo;
import com.kamer.springbootjacksontips.q3.Q3ProductOptionOne;
import com.kamer.springbootjacksontips.q3.Q3ProductOptionTwo;
import com.kamer.springbootjacksontips.q4.Application;
import com.kamer.springbootjacksontips.q5.ContainerOptionOne;
import com.kamer.springbootjacksontips.q5.ContainerOptionTwo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created on March, 2020
 *
 * @author kamer
 */
@Slf4j
@RestController
class Controller {

	@PostMapping("/question-one")
	ResponseEntity<Void> questionOne(@RequestBody Exam exam) {
		log.info("Parsed object: {}", exam);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-two-option-one")
	ResponseEntity<Void> questionTwoOptionOne(@RequestBody Q2ProductOptionOne productOptionOne) {
		log.info("Parsed object with option 1: {}", productOptionOne);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-two-option-two")
	ResponseEntity<Void> questionTwoOptionTwo(@RequestBody Q2ProductOptionTwo q2ProductOptionTwo) {
		log.info("Parsed object with option 2: {}", q2ProductOptionTwo);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-three-option-one")
	ResponseEntity<Void> questionThreeOptionOne(@RequestBody Q3ProductOptionOne q3ProductOptionOne) {
		log.info("Parsed object with option 1: {}", q3ProductOptionOne);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-three-option-two")
	ResponseEntity<Void> questionThreeOptionTwo(@RequestBody Q3ProductOptionTwo q3ProductOptionTwo) {
		log.info("Parsed object with option 2: {}", q3ProductOptionTwo);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-four")
	ResponseEntity<Void> questionFour(@RequestBody Application application) {
		log.info("Parsed object with option 1: {}", application);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-five-option-one")
	ResponseEntity<Void> questionFiveOptionOne(@RequestBody ContainerOptionOne containerOptionOne) {
		log.info("Parsed object: {}", containerOptionOne);
		return ResponseEntity.ok().build();
	}

	@PostMapping("/question-five-option-two")
	ResponseEntity<Void> questionFiveOptionTwo(@RequestBody ContainerOptionTwo containerOptionTwo) {
		log.info("Parsed object: {}", containerOptionTwo);
		return ResponseEntity.ok().build();
	}

}
