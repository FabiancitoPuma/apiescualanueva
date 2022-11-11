
package pe.com.apiescuelanueva.service;

import java.util.*;
import pe.com.apiescuelanueva.entity.ApoderadoEntity;

public interface ApoderadoService {
     //funcion que te permita mostrar todos los datos
    List<ApoderadoEntity>findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<ApoderadoEntity>findAllCustom();
    //funcion paras poder buscar por codigo
    Optional<ApoderadoEntity>finById(Long id);
    // funcion para registrar datos
    ApoderadoEntity add(ApoderadoEntity a);
    //funcion para actualizar
    ApoderadoEntity update(ApoderadoEntity a);
    //funcion para eliminar datos
    ApoderadoEntity delete(ApoderadoEntity a);
}
