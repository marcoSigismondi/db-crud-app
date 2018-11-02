package com.sigismondi.marco.dbcrudapp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.sigismondi.marco.dbcrudapp.entity.NoteEntity;
import com.sigismondi.marco.dbcrudapp.repository.NoteRepository;

@RestController
public class NoteService {
	
	@Autowired
	private NoteRepository noteRepository;
	
	@GetMapping("/notes")
	public List<NoteEntity> retrieveAllStudents() {
		List<NoteEntity> findAll = noteRepository.findAll();
		return findAll;
	}

}
