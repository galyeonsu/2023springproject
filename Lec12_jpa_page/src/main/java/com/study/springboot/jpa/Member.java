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

@Builder
@AllArgsConstructor
@NoArgsConstructor(access = AccessLevel.PRIVATE)
@Getter
@Entity(name="JPAMEMBER003")
public class Member {
	@Id
	@SequenceGenerator(
			name = "mysequence03",
			sequenceName = "JPAMEMBER003_SEQ",
			initialValue = 1,
			allocationSize = 1
			)
	@GeneratedValue(generator = "mysequence03")
	private Long id;
	private String name;
	private String email;
}
