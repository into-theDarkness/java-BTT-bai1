package tranminhduc.pro.repository;

import org.springframework.data.repository.PagingAndSortingRepository;
import tranminhduc.pro.model.Supplier;

public interface SupplierRepository extends PagingAndSortingRepository<Supplier, Long> {
}
