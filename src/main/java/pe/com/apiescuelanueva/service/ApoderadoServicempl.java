package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;
import pe.com.apiescuelanueva.repository.ApoderadoRepository;

@Service
public class ApoderadoServicempl implements ApoderadoService{
    
    @Autowired
    private ApoderadoRepository apoderadorepository;
    @Override
    public List<ApoderadoEntity> findAll() {
        return apoderadorepository.findAll();
    }

    @Override
    public List<ApoderadoEntity> findAllCustom() {
        return apoderadorepository.findAllCustom();
    }

    @Override
    public Optional<ApoderadoEntity> finById(Long id) {
        return apoderadorepository.findById(id);
    }

    @Override
    public ApoderadoEntity add(ApoderadoEntity a) {
       return  apoderadorepository.save(a);
    }

    @Override
    public ApoderadoEntity update(ApoderadoEntity a) {
       ApoderadoEntity objapoderado =apoderadorepository.getById(a.getCodigo());
       BeanUtils.copyProperties(a, this);
       return apoderadorepository.save(objapoderado);
    }

    @Override
    public ApoderadoEntity delete(ApoderadoEntity a) {
        ApoderadoEntity objapoderado = apoderadorepository.getById(a.getCodigo());
        objapoderado.setEstado(false);
        return apoderadorepository.save(objapoderado);
    }
    
}
