package com.example.Entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import javax.persistence.*;
import java.util.List;

@Entity
@Table(name="SpringBoot_Faculty")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Faculty 
{
    @Id
    int faculty_id;
    @NonNull
    String faculty_name;
    @OneToMany(mappedBy = "faculty",cascade = CascadeType.ALL)
    List<Course> courses;
	public int getFaculty_id() {
		return faculty_id;
	}
	public void setFaculty_id(int faculty_id) {
		this.faculty_id = faculty_id;
	}
	public String getFaculty_name() {
		return faculty_name;
	}
	public void setFaculty_name(String faculty_name) {
		this.faculty_name = faculty_name;
	}
	public List<Course> getCourses() {
		return courses;
	}
	public void setCourses(List<Course> courses) {
		this.courses = courses;
	}
	
}