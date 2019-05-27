package com.example.mediatype.model

import com.fasterxml.jackson.databind.PropertyNamingStrategy
import com.fasterxml.jackson.databind.annotation.JsonNaming
import groovy.transform.CompileStatic
import org.bson.types.ObjectId
import org.springframework.data.mongodb.core.mapping.Document
import org.springframework.stereotype.Component


@CompileStatic
@Component
@Document(collection = "pets")
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
class Pet {
    ObjectId _id
    String name
    String category
    double weigh
    String food

    Pet() {
    }

    Pet(String name, String category, double weigh, String food) {
        this.name = name
        this.category = category
        this.weigh = weigh
        this.food = food
    }

    ObjectId get_id() {
        return _id
    }

    void set_id(ObjectId _id) {
        this._id = _id
    }

    String getName() {
        return name
    }

    void setName(String name) {
        this.name = name
    }

    String getCategory() {
        return category
    }

    void setCategory(String category) {
        this.category = category
    }

    double getWeigh() {
        return weigh
    }

    void setWeigh(double weigh) {
        this.weigh = weigh
    }

    String getFood() {
        return food
    }

    void setFood(String food) {
        this.food = food
    }
}
