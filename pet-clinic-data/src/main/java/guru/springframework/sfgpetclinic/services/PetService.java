/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guru.springframework.sfgpetclinic.services;

import guru.springframework.sfgpetclinic.model.Pet;
import java.util.Set;

/**
 *
 * @author None
 */
public interface PetService
{
    Pet findById(Long id);
    
    Pet save (Pet pet);
    
    Set<Pet>  findAll();
}
