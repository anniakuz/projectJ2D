package org.example.service;

import org.example.model.Neighborhood;

import java.util.List;

public interface NeighborhoodService {
    List<Neighborhood> getByActivity(String activity);
}
