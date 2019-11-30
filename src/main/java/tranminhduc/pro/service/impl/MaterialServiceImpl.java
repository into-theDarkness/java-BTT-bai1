package tranminhduc.pro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tranminhduc.pro.model.Material;
import tranminhduc.pro.model.Supplier;
import tranminhduc.pro.repository.MaterialRepository;
import tranminhduc.pro.service.MaterialService;

public class MaterialServiceImpl implements MaterialService {
    @Autowired
    private MaterialRepository materialRepository;

    @Override
    public Iterable<Material> findAll() {
        return materialRepository.findAll();
    }

    @Override
    public Material findById(Long id) {
        return materialRepository.findOne(id);
    }

    @Override
    public void save(Material material) {
        materialRepository.save(material);

    }

    @Override
    public void remove(Long id) {
        materialRepository.delete(id);
    }
    @Override
    public Iterable<Material> findAllBySupplier(Supplier supplier){
        return materialRepository.findAllBySupplier(supplier);
    }
}
