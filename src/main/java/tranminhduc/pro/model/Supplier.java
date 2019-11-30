package tranminhduc.pro.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "supplier")
public class Supplier {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long sup_id;
    private String name;
    private String description;
    private String address;
    @OneToMany(targetEntity = Material.class)
    private List<Material> materials;
    public Supplier(){

    }
    public Supplier(String name, String description, String address){
        this.name =name;
        this.description = description;
        this.address = address;
    }

    public Long getSup_id() {
        return sup_id;
    }

    public void setSup_id(Long sup_id) {
        this.sup_id = sup_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Material> getMaterials() {
        return materials;
    }

    public void setMaterials(List<Material> materials) {
        this.materials = materials;
    }
}
