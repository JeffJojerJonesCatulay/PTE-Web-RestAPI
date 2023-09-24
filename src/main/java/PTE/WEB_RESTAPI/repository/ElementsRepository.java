package PTE.WEB_RESTAPI.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import PTE.WEB_RESTAPI.entity.Elements;


/**
 * @author Jeff Catulay
 * @category Repository
 * @version 1.0.0
 *
 */
@Repository
public interface ElementsRepository extends JpaRepository<Elements, Long> {
	@Query(value = "SELECT id, element_name, symbol, atomic_number, chemical_group, state FROM PTE_TBL", nativeQuery = true)
    List<Elements> getAllInfo();
	@Query(value = "SELECT id, element_name, symbol, atomic_number, chemical_group, state FROM PTE_TBL WHERE element_name = ?", nativeQuery = true)
    Elements getAllInfoByElement(String elementName);
}
