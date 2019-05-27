package com.example.mediatype.controller

import com.example.mediatype.business.PetBusiness
import com.example.mediatype.business.validator.PetValidator
import com.example.mediatype.model.Pet
import com.example.mediatype.repository.PetRepository
import groovy.transform.CompileStatic
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.ModelAttribute
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@CompileStatic
@RestController
@RequestMapping(value = "/pets")
class PetController {

    @Autowired
    PetRepository repository
    @Autowired
    PetValidator validator

    @GetMapping
    public List<Pet> getAllPets() {
        return repository.findAll()
    }

    @GetMapping("/{name}")
    public List<Pet> findPetByCategory( @PathVariable("name") String category ) {
        return repository.findPetByCategory(category)
    }
    @PostMapping
    public Pet create(@RequestBody Pet pet) {
        validator.create(pet)
        return repository.save(pet)

    }

//    @PostMapping
//    public Pet create(@ModelAttribute("pet") Pet pet) {
//        validator.create(pet)
//        return repository.save(pet)
//
//    }
}
