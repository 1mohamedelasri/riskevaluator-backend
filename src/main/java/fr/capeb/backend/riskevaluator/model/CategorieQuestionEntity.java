package fr.capeb.backend.riskevaluator.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "categorie_question")

public class CategorieQuestionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_categorie")
    public Integer idCategorie;

    @ManyToOne(fetch = FetchType.LAZY)
    @JsonIgnoreProperties("categorieQuestions")
    @JoinColumn(name="id_questionnaire", nullable=false)
    public QuestionnaireEntity questionnaire;

    @Column(name = "libelle", nullable=false)
    public String libelle;

    @OneToMany(mappedBy = "idCategorie", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<ScoreCategoryEntity> scoreEvaluations=new ArrayList<ScoreCategoryEntity>();

    @OneToMany(mappedBy = "idCategorie", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<PreconisationCategorieEntity> preconisationsCategorie= new ArrayList<PreconisationCategorieEntity>();

    @OneToMany(mappedBy = "idCategorie", fetch = FetchType.LAZY)
    @JsonManagedReference
    private List<QuestionEntity> questions= new ArrayList<QuestionEntity>();


}
