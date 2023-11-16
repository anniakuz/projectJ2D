package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.service.NeighborhoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/commerce")
public class Controller {
    private final NeighborhoodService neighborhoodService;

    @GetMapping("/getActivityByNeighborhood")
    public ResponseEntity<?> getByActivity(@RequestParam String activity){

        return ResponseEntity.status(HttpStatus.OK).
                body(neighborhoodService.getByActivity(activity));

    }

}
