package com.example.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Entity.Faculty;

public interface FacultyRepository extends JpaRepository<Faculty, Integer> 
{
	
}