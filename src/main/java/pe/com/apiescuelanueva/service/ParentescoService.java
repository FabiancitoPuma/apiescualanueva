
package pe.com.apiescuelanueva.service;

import java.util.*;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.ParentescoEntity;

public interface ParentescoService {
    //funcion que te permita mostrar todos los datos
    List<ParentescoEntity>findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<ParentescoEntity>findAllCustom();
    //funcion paras poder buscar por codigo
    Optional<ParentescoEntity>finById(Long id);
    // funcion para registrar datos
    ParentescoEntity add(ParentescoEntity p);
    //funcion para actualizar
    ParentescoEntity update(ParentescoEntity p);
    //funcion para eliminar datos
    ParentescoEntity delete(ParentescoEntity p);
}
