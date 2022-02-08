package fr.capeb.backend.riskevaluator.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Evaluation {

    private Integer idEvaluation;
    @NotNull
    private Compte compte;
    @NotNull
    @JsonIgnoreProperties({"categorieQuestion","evaluation"})
    private List<ScoreCategory> scoreCategories;




}
