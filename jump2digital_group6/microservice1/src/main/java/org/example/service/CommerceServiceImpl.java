package org.example.service;

import lombok.AllArgsConstructor;
import org.example.repository.CommerceRepository;
import org.springframework.stereotype.Service;

@Service@AllArgsConstructor
public class CommerceServiceImpl implements CommerceService{
    private final CommerceRepository commerceRepository;


}
