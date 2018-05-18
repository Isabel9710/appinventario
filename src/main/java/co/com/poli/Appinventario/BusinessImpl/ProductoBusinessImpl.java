/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.com.poli.Appinventario.BusinessImpl;

import co.com.poli.Appinventario.Business.IProductoBusiness;
import co.com.poli.Appinventario.DAO.IProductoDao;
import co.com.poli.Appinventario.Model.Producto;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProductoBusinessImpl implements IProductoBusiness {

    @Autowired
    private IProductoDao iProductoDao;
    
    @Override
    public List<Producto> getList() {
        return iProductoDao.getList();
    }
    
    
    
}
