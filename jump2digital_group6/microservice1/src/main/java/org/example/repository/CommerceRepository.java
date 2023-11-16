package org.example.repository;

import org.example.model.Neighborhood;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CommerceRepository extends JpaRepository<Neighborhood, Integer> {

}
