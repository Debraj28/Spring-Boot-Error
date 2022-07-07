package com.greatlearning.library.serviceImpl;

import org.springframework.stereotype.Service;

import com.greatlearning.library.model.GreatLearning;
import com.greatlearning.library.service.ExampleService;

@Service
public class ExampleServiceImpl implements ExampleService {

	@Override
	public GreatLearning get() {
		GreatLearning greatlearning = new GreatLearning();
		greatlearning.setCourseName("Learn controllers in spring boot");
		greatlearning.setCourseType("Software Development");
		greatlearning.setInstructorName("Samarth Narula");
		return greatlearning;
		
	}
	
	@Override
	public GreatLearning customInfo(String courseName, String courseType, String instructorName) {
		GreatLearning greatlearning = new GreatLearning();
		greatlearning.setCourseName(courseName);
		greatlearning.setCourseType(courseType);
		greatlearning.setInstructorName(instructorName);
		return greatlearning;
	}
}
