/*
CLASSE QUE SERA UTILIZADA NOS CONTROLADORES DA INTERFACE [VIEW]
 */
package model.service;

import java.util.List;
import model.dao.DaoFactory;
import model.dao.ProdutoDao;
import model.entities.Produto;

/**
 *
 * @author Edgar
 */
public class ProdutoService {
    private ProdutoDao dao = DaoFactory.createProdutoDao();
    
    public List<Produto> listarTodos(){
        return dao.selectAll();
    }
    
    public void InserirNoEstoque(Produto obj){
        dao.insert(obj);
    }
    
    public void RemoverDoEstoque(Produto obj){
        dao.deleteByCodigo(obj.getCodigo());
    }

    public void AtualizarEstoqueVenda(Produto obj){
        dao.updateVenda(obj);
    }
    
    public void AtualizarEstoque(Produto obj){
        dao.update(obj);
    }
    
    /*
    public void salvarOuAtualizar(Produto obj){
        
        if(obj.getCodigo()== null){
            dao.insert(obj);
        }else{
            dao.update(obj);
        }
    }
    */
   
}
