package tranminhduc.pro.service;

import tranminhduc.pro.model.Material;
import tranminhduc.pro.model.Supplier;

public interface MaterialService {
    Iterable<Material> findAll();
    Material findById(Long id);
    void save(Material material);
    void remove (Long id);
    Iterable<Material> findAllBySupplier(Supplier supplier);
}
