/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model.dao.implement;

import db.DB;
import db.DbException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.dao.ProdutoDao;
import model.entities.Produto;

/**
 *
 * @author Edgar
 */
public class ProdutoDaoJDBC implements ProdutoDao{
    private Connection conn;
    public ProdutoDaoJDBC(Connection conn){
        this.conn = conn;
    }

    @Override
    public void insert(Produto obj) {
        PreparedStatement st = null;
        String comando = "INSERT INTO Produto"
                       + " (nome, quantidade, preco, lote, validade)"
                       + " VALUES"
                       + " (?,?,?,?,?)";
        try{
            st = conn.prepareStatement(comando, Statement.RETURN_GENERATED_KEYS);
            st.setString(1, obj.getNome());
            st.setInt(2, obj.getQuantidade());
            st.setDouble(3, obj.getPreco());
            st.setString(4, obj.getLote());
            st.setDate(5, new java.sql.Date(obj.getValidade().getTime()));
            
            int linhasAfetadas = st.executeUpdate();
            
            if(linhasAfetadas>0){
                ResultSet rs = st.getGeneratedKeys();
                if(rs.next()){
                    int cod = rs.getInt(1);
                    obj.setCodigo(cod);
                }
                DB.closeResultSet(rs);
            }else{
                throw new DbException("ERRO NA INSERCAO, nehuma linha afetada");
            }
            
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void update(Produto obj) {
        PreparedStatement st = null;
        String comando =   "UPDATE Produto"
                         + " SET nome = ?, quantidade = ?, preco = ?, lote = ?, validade = ?"
                         + " WHERE codigo = ?";
        try{
            st = conn.prepareStatement(comando);
            st.setString(1, obj.getNome());
            st.setInt(2, obj.getQuantidade());
            st.setDouble(3, obj.getPreco());
            st.setString(4, obj.getLote());
            st.setDate(5, new java.sql.Date(obj.getValidade().getTime()));
            st.setInt(6, obj.getCodigo());
            
            st.executeUpdate();  
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
        
    }
    
    @Override
    public void updateVenda(Produto obj){
        PreparedStatement st = null;
        String comando =   "UPDATE Produto"
                         + " SET quantidade = ?"
                         + " WHERE codigo = ?";
        try{
            st = conn.prepareStatement(comando);
            st.setInt(1, obj.getQuantidade());
            st.setInt(2, obj.getCodigo());
             st.executeUpdate();  
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public void deleteByCodigo(Integer codigo) {
        PreparedStatement st = null;
        String comando = "DELETE FROM Produto"
                         + " WHERE codigo = ?";
        
        try{
            st = conn.prepareStatement(comando);
            
            st.setInt(1, codigo);
            
            int linhasAfetadas = st.executeUpdate();
            if(linhasAfetadas == 0){
                throw new DbException("ERRO! CODIGO NAO ENCONTRADO NO BANCO!");
            }
        }catch(SQLException e){
            throw new DbException(e.getMessage());
        }finally{
            DB.closeStatement(st);
        }
    }

    @Override
    public List<Produto> selectAll() {
        PreparedStatement st = null;
        ResultSet rs = null;
        
        String comando = "SELECT *"
                        + " FROM Produto"
                        + " ORDER BY codigo";
        
        try{
            st = conn.prepareStatement(comando);
            
            rs = st.executeQuery();
            
            List<Produto> lista = new ArrayList<>();
            
            while(rs.next()){
                Produto prod = new Produto();
                    prod.setCodigo(rs.getInt("codigo"));
                    prod.setNome(rs.getString("nome"));
                    prod.QuantidadeAdd(rs.getInt("quantidade"));
                    prod.setPreco(rs.getDouble("preco"));
                    prod.setLote(rs.getString("lote"));
                    prod.setValidade(new java.util.Date(rs.getTimestamp("validade").getTime()));
                    lista.add(prod);
            }
            return lista;
            
        }catch(SQLException e){
            throw new DbException(e.getMessage());         
        }finally{
            DB.closeStatement(st);
            DB.closeResultSet(rs);
        }
    }
    
}
