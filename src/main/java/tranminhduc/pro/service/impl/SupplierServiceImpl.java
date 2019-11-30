package tranminhduc.pro.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import tranminhduc.pro.model.Supplier;
import tranminhduc.pro.repository.SupplierRepository;
import tranminhduc.pro.service.SupplierService;

public class SupplierServiceImpl implements SupplierService {
    @Autowired
    private SupplierRepository supplierRepository;

    @Override
    public Iterable<Supplier> findAll() {
        return supplierRepository.findAll();
    }

    @Override
    public Supplier findById(Long id) {
        return supplierRepository.findOne(id);
    }

    @Override
    public void save(Supplier supplier) {
        supplierRepository.save(supplier);
    }

    @Override
    public void remove(Long id) {
        supplierRepository.delete(id);

    }
}
