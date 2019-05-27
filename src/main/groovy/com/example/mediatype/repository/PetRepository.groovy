package com.example.mediatype.repository

import com.example.mediatype.model.Pet
import groovy.transform.CompileStatic
import org.bson.types.ObjectId
import org.springframework.data.mongodb.repository.MongoRepository


@CompileStatic
interface PetRepository extends MongoRepository<Pet,ObjectId>{

    List<Pet> findPetByCategory ( String category )
}
