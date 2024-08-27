package group.java.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Adresses {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer idUser;

    @Column(nullable = false)
    private String pays;

    @Column(nullable = false)
    private String ville;

    @Column(nullable = false)
    private Integer codePostal;

    @Column(nullable = false)
    private String nomDeRue;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Integer getIdUser() {
        return idUser;
    }

    public void setIdUser(final Integer idUser) {
        this.idUser = idUser;
    }

    public String getPays() {
        return pays;
    }

    public void setPays(final String pays) {
        this.pays = pays;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(final String ville) {
        this.ville = ville;
    }

    public Integer getCodePostal() {
        return codePostal;
    }

    public void setCodePostal(final Integer codePostal) {
        this.codePostal = codePostal;
    }

    public String getNomDeRue() {
        return nomDeRue;
    }

    public void setNomDeRue(final String nomDeRue) {
        this.nomDeRue = nomDeRue;
    }

}
