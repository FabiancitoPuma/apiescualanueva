
package pe.com.apiescuelanueva.service;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apiescuelanueva.entity.ParentescoEntity;
import pe.com.apiescuelanueva.repository.ParentescoRepository;

@Service
public class ParentescoServicempl implements ParentescoService {
    
    @Autowired
    private ParentescoRepository parentescorepository;
    @Override
    public List<ParentescoEntity> findAll() {
        return parentescorepository.findAll();
    }

    @Override
    public List<ParentescoEntity> findAllCustom() {
        return parentescorepository.findAllCustom();
    }

    @Override
    public Optional<ParentescoEntity> finById(Long id) {
        return parentescorepository.findById(id);
    }

    @Override
    public ParentescoEntity add(ParentescoEntity p) {
        return parentescorepository.save(p);
    }

    @Override
    public ParentescoEntity update(ParentescoEntity p) {
        ParentescoEntity objparentesco = parentescorepository.getById(p.getCodigo());
        return parentescorepository.save(objparentesco);
    }

    @Override
    public ParentescoEntity delete(ParentescoEntity p) {
        ParentescoEntity objparentesco = parentescorepository.getById(p.getCodigo());
        objparentesco.setEstado(false);
        return parentescorepository.save(objparentesco);
    }
    
}
