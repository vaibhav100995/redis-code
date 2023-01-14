package com.redissondemo.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public class Student implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String studentId;

	public String getStudentId() {
		return studentId;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}

	private String name;
	
	private String city;
	
	private Set<String> subjects = new HashSet<>();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public Set<String> getSubjects() {
		return subjects;
	}

	public void setSubjects(Set<String> subjects) {
		this.subjects = subjects;
	}

//	@Override
//	public int hashCode() {
//		return Objects.hash(city, name, studentId, subjects);
//	}
//
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Student other = (Student) obj;
//		return Objects.equals(city, other.city) && Objects.equals(name, other.name)
//				&& Objects.equals(studentId, other.studentId) && Objects.equals(subjects, other.subjects);
//	}
	
//	@Override
//    public int hashCode() {
//        return new HashCodeBuilder(17, 31). // two randomly chosen prime numbers
//            // if deriving: appendSuper(super.hashCode()).
//            append(name).
//            append(studentId).
//            append(city).
////            append(subjects).
//            toHashCode();
//    }
//	
//	@Override
//    public boolean equals(Object obj) {
//       if (!(obj instanceof Student))
//            return false;
//        if (obj == this)
//            return true;
//
//        Student rhs = (Student) obj;
//        return new EqualsBuilder().
//            // if deriving: appendSuper(super.equals(obj)).
//            append(name, rhs.name).
//            append(studentId, rhs.studentId).
//            append(city, rhs.city).
////            append(subjects, rhs.subjects).
//            isEquals();
//    }
}
