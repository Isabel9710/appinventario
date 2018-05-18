/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.DAOImpl;

import co.com.poli.Appinventario.DAO.IProductoDao;
import co.com.poli.Appinventario.Data.ProductoData;
import co.com.poli.Appinventario.Model.Producto;
import java.util.List;
import org.springframework.stereotype.Repository;

@Repository
public class ProductoDaoImpl implements IProductoDao{

    @Override
    public List<Producto> getList() {
        return ProductoData.getListado();
    }
    
}
