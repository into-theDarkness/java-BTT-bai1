package tranminhduc.pro.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import tranminhduc.pro.model.Material;
import tranminhduc.pro.model.Supplier;

public interface MaterialService {
    Page<Material> findAll(Pageable pageable);
    Material findById(Long id);
    void save(Material material);
    void remove (Long id);
    Iterable<Material> findAllBySupplier(Supplier supplier);
}
