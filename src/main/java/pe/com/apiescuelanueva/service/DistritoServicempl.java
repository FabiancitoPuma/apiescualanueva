
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.DistritoEntity;
import pe.com.apiescuelanueva.repository.DistritoRepository;

//Permite difinir la clase como un servicio
@Service
public class DistritoServicempl implements DistritoService{
    
    // Inyectar dependencias
    @Autowired
    private DistritoRepository distritorepository;
    @Override
    public List<DistritoEntity> findAll() {
        return distritorepository.findAll();
    }

    @Override
    public List<DistritoEntity> findAllCustom() {
        return distritorepository.findAllCustom();
    }

    @Override
    public Optional<DistritoEntity> finById(Long id) {
        return distritorepository.findById(id);
    }

    @Override
    public DistritoEntity add(DistritoEntity d) {
        return distritorepository.save(d);
    }

    @Override
    public DistritoEntity update(DistritoEntity d) {
        DistritoEntity objdistrito=distritorepository.getById(d.getCodigo());
        BeanUtils.copyProperties(d, objdistrito);
        return distritorepository.save(objdistrito);
    }

    @Override
    public DistritoEntity delete(DistritoEntity d) {
        DistritoEntity objdistrito=distritorepository.getById(d.getCodigo());
        objdistrito.setEstado(false);
        return distritorepository.save(objdistrito);
    }
    
}
