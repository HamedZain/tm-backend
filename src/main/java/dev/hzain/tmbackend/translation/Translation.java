package dev.hzain.tmbackend.translation;

import dev.hzain.tmbackend.localization.Localization;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Translation {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(nullable = false, unique = true)
  private String key;

  @OneToMany(mappedBy = "translation", cascade = CascadeType.ALL, orphanRemoval = true)
  private List<Localization> localizations;
}
