package group.java.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Produit {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer idTheme;

    @Column(nullable = false)
    private String nom;

    @Column(
            nullable = false,
            name = "\"description\"",
            columnDefinition = "longtext"
    )
    private String description;

    @Column(nullable = false)
    private Integer nbPiece;

    @Column(nullable = false)
    private Integer age;

    @Column(nullable = false)
    private String dimension;

    @Column(nullable = false)
    private Integer prix;

    @Column(nullable = false)
    private String petiteDesc;

    @Column(length = 2600)
    private String img;

    @Column
    private Integer popularite;

    @Column(nullable = false)
    private Integer stock;

    @Column
    private Integer reduction;

    @Column(nullable = false, columnDefinition = "tinyint", length = 1)
    private Boolean nouveau;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Integer getIdTheme() {
        return idTheme;
    }

    public void setIdTheme(final Integer idTheme) {
        this.idTheme = idTheme;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(final String nom) {
        this.nom = nom;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(final String description) {
        this.description = description;
    }

    public Integer getNbPiece() {
        return nbPiece;
    }

    public void setNbPiece(final Integer nbPiece) {
        this.nbPiece = nbPiece;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(final Integer age) {
        this.age = age;
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(final String dimension) {
        this.dimension = dimension;
    }

    public Integer getPrix() {
        return prix;
    }

    public void setPrix(final Integer prix) {
        this.prix = prix;
    }

    public String getPetiteDesc() {
        return petiteDesc;
    }

    public void setPetiteDesc(final String petiteDesc) {
        this.petiteDesc = petiteDesc;
    }

    public String getImg() {
        return img;
    }

    public void setImg(final String img) {
        this.img = img;
    }

    public Integer getPopularite() {
        return popularite;
    }

    public void setPopularite(final Integer popularite) {
        this.popularite = popularite;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(final Integer stock) {
        this.stock = stock;
    }

    public Integer getReduction() {
        return reduction;
    }

    public void setReduction(final Integer reduction) {
        this.reduction = reduction;
    }

    public Boolean getNouveau() {
        return nouveau;
    }

    public void setNouveau(final Boolean nouveau) {
        this.nouveau = nouveau;
    }

}
