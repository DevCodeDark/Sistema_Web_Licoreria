package SipSoft.lic.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import SipSoft.lic.entity.Proveedores;
import SipSoft.lic.services.IProveedoresService;

@RestController
@RequestMapping("/restful")
public class ProveedoresController {

    @Autowired
    private IProveedoresService serviceProveedores;

    @GetMapping("/proveedores")
    public List<Proveedores> buscarToodos() {
        return serviceProveedores.buscarTodos();
    }
    @PostMapping("/proveedores")
    public Proveedores guardar(@RequestBody Proveedores proveedor) {
        serviceProveedores.guardar(proveedor);
        return proveedor;
    }
    @PutMapping("/proveedores")
    public Proveedores modificar(@RequestBody Proveedores proveedor) {
        serviceProveedores.modificar(proveedor);
        return proveedor;
    }

    //listar un solo elemento
    @GetMapping("/proveedores/{id}")
    public Optional<Proveedores> buscarId(@PathVariable("id") Integer id) {
        return serviceProveedores.buscarId(id);
    }

    @DeleteMapping("/proveedores/{id}")
    public String eliminar(@PathVariable Integer id){
        serviceProveedores.eliminar(id);
        return "Proveedor eliminado";
    }

}
