package com.example.mediatype.business.validator

import com.example.mediatype.model.Pet
import groovy.transform.CompileStatic
import org.springframework.stereotype.Component

import javax.naming.directory.InvalidAttributeIdentifierException


@CompileStatic
@Component
class PetValidator {
    void create (Pet pet) {
        if(!(pet.category && pet.food)) {
            throw new InvalidAttributeIdentifierException("category and food are required! ")
        }
    }
}
