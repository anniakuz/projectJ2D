package org.example.service;

import lombok.AllArgsConstructor;
import org.example.model.Neighborhood;
import org.example.repository.NeighborhoodRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class NeighborhoodServiceImpl implements NeighborhoodService{
    private final NeighborhoodRepository neighborhoodRepository;

    @Override
    public List<Neighborhood> getByActivity(String activity){

        return neighborhoodRepository.findAll().stream().filter(neighborhood ->
                neighborhood.getActivitat().equals(activity)).collect(Collectors.toList());
    }

}
