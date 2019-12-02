package tranminhduc.pro.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;
import tranminhduc.pro.model.Material;
import tranminhduc.pro.model.Supplier;

public interface MaterialRepository extends PagingAndSortingRepository<Material, Long> {
    Iterable<Material> findAllBySupplier(Supplier supplier);
}
