package com.aditya.project.service;

import com.aditya.project.entity.PenEntity;
import com.aditya.project.repository.PenRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class PenService {

    private final PenRepository penRepository;

    public void save(String name, String colour) {
        PenEntity penEntity = new PenEntity();
        penEntity.setName(name);
        penEntity.setColour(colour);
        penRepository.save(penEntity);
    }
}
