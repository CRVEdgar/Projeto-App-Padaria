/*
INTERFACE RESPONSAVEL PELO CRUD
 */
package model.dao;

//

import java.util.List;
import model.entities.Produto;


/**
 *
 * @author Edgar
 */
public interface ProdutoDao {
    
    void insert(Produto obj);
    void update(Produto obj);
    void updateVenda(Produto obj);
    void deleteByCodigo(Integer codigo);
    List<Produto> selectAll();
    
}
