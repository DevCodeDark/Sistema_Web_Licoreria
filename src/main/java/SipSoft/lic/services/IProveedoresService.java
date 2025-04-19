package SipSoft.lic.services;

import java.util.List;
import java.util.Optional;

import SipSoft.lic.entity.Proveedores;

public interface IProveedoresService {
    
    List<Proveedores> buscarTodos();
    
    void guardar(Proveedores proveedor);

    void modificar(Proveedores proveedor);

    
    Optional<Proveedores> buscarId(Integer id);

    void eliminar(Integer id);

}
