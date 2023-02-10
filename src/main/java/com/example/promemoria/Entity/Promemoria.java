package com.example.promemoria.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Promemoria {
  @Id
          @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long Id;
  @Column(name = "titolo")
    private String titolo;
  @Column(name = "descrizione")
    private String descrizione;
  @Column(name = "data")
    private String data;
  @Column(name = "ora")
    private Long ora;
  @Column(name = "fatto")
    private String fatto;
  @Column(name = "stato")
    private String stato;

}
