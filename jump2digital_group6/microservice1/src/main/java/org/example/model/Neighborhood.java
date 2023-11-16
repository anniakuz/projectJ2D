package org.example.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
@Table(name="sectorperbarri")
public class Neighborhood {
    @Id
    @JsonIgnore
    @Column(name="Id")
    private Integer id;
    @Column(name="Nom_Barri")
    private String name;
    @Column(name="Nom_Grup_Activitat")
    private String activitat;
    @Column(name="counts")
    private int counts;



}
