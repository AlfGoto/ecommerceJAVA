package group.java.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Commandes {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private String adresse;

    @Column(nullable = false)
    private String prix;

    @Column(nullable = false, length = 1000)
    private String articles;

    @Column(nullable = false)
    private String etat;

    @Column
    private Integer idUser;

    @Column(nullable = false)
    private Integer method;

    @Column(nullable = false, columnDefinition = "tinyint", length = 1)
    private Boolean embal;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(final String adresse) {
        this.adresse = adresse;
    }

    public String getPrix() {
        return prix;
    }

    public void setPrix(final String prix) {
        this.prix = prix;
    }

    public String getArticles() {
        return articles;
    }

    public void setArticles(final String articles) {
        this.articles = articles;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(final String etat) {
        this.etat = etat;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(final Integer idUser) {
        this.idUser = idUser;
    }

    public Integer getMethod() {
        return method;
    }

    public void setMethod(final Integer method) {
        this.method = method;
    }

    public Boolean getEmbal() {
        return embal;
    }

    public void setEmbal(final Boolean embal) {
        this.embal = embal;
    }

}
