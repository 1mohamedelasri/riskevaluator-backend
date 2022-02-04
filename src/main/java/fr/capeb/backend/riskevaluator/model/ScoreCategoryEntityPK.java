package fr.capeb.backend.riskevaluator.model;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.io.Serializable;

@Getter
@Setter
@NoArgsConstructor
@EqualsAndHashCode
@Embeddable
public class ScoreCategoryEntityPK implements Serializable {
    @Column(name = "id_evaluation")
    private Integer idEvaluation;

    @Column(name = "id_categorie")
    private Integer idCategorie;
}
