package com.study.springboot.jpa;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@Entity(name="JPAMEMBER003")
public class Member {
	@Id
	@SequenceGenerator(
			name="mySequence003",
			sequenceName = "JPAMEMBER003_SEQ",
			initialValue = 1,
			allocationSize = 1
			)
	@GeneratedValue(generator = "mySequence003")
	private Long id;
	private String name;
	private String email;

}
