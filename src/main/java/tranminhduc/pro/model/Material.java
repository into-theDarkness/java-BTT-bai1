package tranminhduc.pro.model;

import org.springframework.validation.annotation.Validated;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;
import java.util.Date;
@Validated
@Entity
@Table(name = "materials")
public class Material {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //@NotEmpty
    //@Size(max = 50, min = 2)
    private String name;
    private java.sql.Date importDate;
    //@NotEmpty
    //@Size(min = 2, max = 1000)
    private String description;
    //@NotEmpty
    //@Size(min =2, max =100)
    private Float price;
    //@NotEmpty
    //@Size(min=2, max =10000)
    private Integer quantity;
    private String image;
    @ManyToOne
    private Supplier supplier;
    public Material(){

    }
    public Material(Long id, String name, java.sql.Date importDate, String description, Float price, Integer quantity, String image, Supplier supplier){

    }

    public Long getId() {
        return id;
    }


    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getImportDate() {
        return importDate;
    }

    public void setImportDate(java.sql.Date importDate) {
        this.importDate = importDate;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
