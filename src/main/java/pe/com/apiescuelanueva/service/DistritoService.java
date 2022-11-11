/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apiescuelanueva.service;

import java.util.*;
import java.util.Optional;
import pe.com.apiescuelanueva.entity.DistritoEntity;

public interface DistritoService {
    //funcion que te permita mostrar todos los datos
    List<DistritoEntity>findAll();
    //funcion que permita mostrar todos los datos habilitados
    List<DistritoEntity>findAllCustom();
    //funcion paras poder buscar por codigo
    Optional<DistritoEntity>finById(Long id);
    // funcion para registrar datos
    DistritoEntity add(DistritoEntity d);
    //funcion para actualizar
    DistritoEntity update(DistritoEntity d);
    //funcion para eliminar datos
    DistritoEntity delete(DistritoEntity d);
     
}
