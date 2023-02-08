package com.Hazem.Spring.Data.Jpa.Entities;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString(exclude = "course")
public class CourseMaterial {

	@Id
	@SequenceGenerator(name = "course_material_sequence", sequenceName = "course_material_sequence", allocationSize = 1)
	@GeneratedValue(generator = "course_material_sequence", strategy = GenerationType.SEQUENCE)
	private Long courseMaterialId;
	private String url;

	@OneToOne(
	cascade = CascadeType.ALL , 
	fetch = FetchType.LAZY
			)
	@JoinColumn(name = "course_id", referencedColumnName = "courseId")
	private Course course;
}
