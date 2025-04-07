package com.aditu.service;

import com.aditu.model.*;
import com.aditu.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.*;

@Service
public class TutorService {
    @Autowired private TutorRepository tutorRepository;
    public List<Tutor> findAll() { return tutorRepository.findAll(); }
    public Tutor save(Tutor tutor) { return tutorRepository.save(tutor); }
    public void delete(Long id) { tutorRepository.deleteById(id); }
    public List<Tutor> findByNombresOrApellidos(String searchTerm) {
        return tutorRepository.findByNombresContainingIgnoreCaseOrApellidosContainingIgnoreCase(searchTerm, searchTerm);
    }
}