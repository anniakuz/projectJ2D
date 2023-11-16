package org.example.controllers;

import lombok.AllArgsConstructor;
import org.example.service.CommerceService;
import org.example.service.NeighborhoodService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@AllArgsConstructor
@RestController
@RequestMapping("/commerce")
public class Controller {
    private final CommerceService commerceService;
    private final NeighborhoodService neighborhoodService;

    @GetMapping("/getActivityByNeighborhood/{activity}")
    public ResponseEntity<?> getByActivity(@PathVariable String activity){

        return ResponseEntity.status(HttpStatus.OK).
                body(neighborhoodService.getByActivity(activity));

    }

}
