package group.java.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Promotion {

    @Id
    @Column(nullable = false, updatable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(nullable = false)
    private Integer idProduct;

    @Column(nullable = false)
    private Integer promotion;

    @Column(nullable = false, columnDefinition = "tinyint", length = 1)
    private Boolean isDiscounted;

    public Integer getId() {
        return id;
    }

    public void setId(final Integer id) {
        this.id = id;
    }

    public Integer getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(final Integer idProduct) {
        this.idProduct = idProduct;
    }

    public Integer getPromotion() {
        return promotion;
    }

    public void setPromotion(final Integer promotion) {
        this.promotion = promotion;
    }

    public Boolean getIsDiscounted() {
        return isDiscounted;
    }

    public void setIsDiscounted(final Boolean isDiscounted) {
        this.isDiscounted = isDiscounted;
    }

}
