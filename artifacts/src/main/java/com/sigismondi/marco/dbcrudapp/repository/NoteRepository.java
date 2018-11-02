package com.sigismondi.marco.dbcrudapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sigismondi.marco.dbcrudapp.entity.NoteEntity;

@Repository
public interface NoteRepository extends JpaRepository<NoteEntity, Long>{

}
