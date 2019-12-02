package tranminhduc.pro.service;

import tranminhduc.pro.model.Supplier;

public interface SupplierService {
    Iterable<Supplier> findAll();
    Supplier findById(Long id);
    void save(Supplier supplier);
    void remove (Long id);

}
