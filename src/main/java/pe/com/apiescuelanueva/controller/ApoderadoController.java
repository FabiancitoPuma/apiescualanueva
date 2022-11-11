
package pe.com.apiescuelanueva.controller;

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
import pe.com.apiescuelanueva.entity.ApoderadoEntity;
import pe.com.apiescuelanueva.service.ApoderadoService;

@RestController
@RequestMapping("/apoderado")
public class ApoderadoController {
    @Autowired
    private ApoderadoService apoderadoservice;
    
    @GetMapping
    public List<ApoderadoEntity>findAll(){
        return apoderadoservice.findAll();
    }
    @GetMapping("/custom")
    public List<ApoderadoEntity>findAllCustom(){
        return apoderadoservice.findAllCustom();
    }
    @GetMapping("/{id}")
    public Optional<ApoderadoEntity>findById(@PathVariable Long id){
        return apoderadoservice.finById(id);   
    }
    @PostMapping
    public ApoderadoEntity add(@RequestBody ApoderadoEntity a){
        return apoderadoservice.add(a);
    }
    @PutMapping("/{id}")
    public ApoderadoEntity update(@PathVariable long id, @RequestBody ApoderadoEntity a){
        a.setCodigo(id);
        return apoderadoservice.update(a);
    }
    @DeleteMapping("/{id}")
    public ApoderadoEntity delete (@PathVariable long id){
        ApoderadoEntity objapoderado = new ApoderadoEntity();
        objapoderado.setEstado(false);
        return apoderadoservice.delete(ApoderadoEntity.builder().codigo(id).build());
    }
}
