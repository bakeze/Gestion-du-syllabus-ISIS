package isis.projet.backend.entity;

import jakarta.persistence.*;
import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter
@Setter
@RequiredArgsConstructor
@ToString
@Entity // Une entité JPA
public class Country {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY) 
    private Integer id;
    // Identifiant métier (code ISO)
    @Column(unique=true)
    private String code;
    
    @Column(unique=true)
    private String name;
}
