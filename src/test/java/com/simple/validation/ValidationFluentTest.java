package com.simple.validation;

import org.junit.Test;

public class ValidationFluentTest {

	@Test
	public void test() {
		Dog punk = new Dog();
		punk.setName("");
		
		SimpleValidation.build(punk)
					.property(Dog::getName).isNotEmpty().isMaxlength(10).next()
					.property(Dog::getName).isNotEmpty().next()
					.propertyInt(Dog::getAge).isMoreThan(100).next()
					.validate((x)->{ throw new RuntimeException("ERROR");});

	}

	class Dog {
		private String name;
		private int age;

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}
	}
}
