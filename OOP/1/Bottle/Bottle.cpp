#include "Bottle.hpp"
#include <iostream>

int Bottle::numOfBottle = 0;

Bottle::Bottle(): id(Bottle::numOfBottle + 1){
    height = 10.00;
    radius = 10.00;
    waterHeight = 0.00;
    numOfBottle += 1;
}

Bottle::Bottle(float height, float radius): id(Bottle::numOfBottle + 1){
    this->height = height;
    this->radius = radius;
    this->waterHeight = 0.00;
    numOfBottle += 1;
}

Bottle::Bottle(const Bottle& bottle): id(bottle.id){
    height = bottle.height;
    radius = bottle.radius;
    waterHeight = bottle.waterHeight;
}

Bottle::~Bottle(){}

int Bottle::getId() const{
    return id;
}

float Bottle::getWaterVolume() const{
    return(PI * radius * radius * waterHeight);
}

float Bottle::getBottleVolume() const{
    return(PI * radius * radius * height);
}

void Bottle::setHeight(float height){
    this->height = height;
    if(height < waterHeight){
        waterHeight = height;
    }
}

void Bottle::addWater(float waterVolume){
    float h = waterVolume / (PI * radius * radius);

    if(h + waterHeight >= height){
        waterHeight = height;
    }
    else{
        waterHeight += h;
    }
}

void Bottle::substractWater(float waterVolume){
    float h = waterVolume / (PI * radius * radius);

    if(waterHeight - h <= 0){
        waterHeight = 0;
    }
    else{
        waterHeight -= h;
    }
}

float Bottle::getWaterHeightIfVolume(float waterVolume) const{
    return(waterVolume / (PI * radius * radius));
}

void Bottle::pourWaterTo(Bottle& other){
    float empty = other.getBottleVolume() - other.getWaterVolume();
    float volThis = this->getWaterVolume();

    other.addWater(volThis);
    if(volThis <= empty){
        this->waterHeight = 0;
    }
    else{
        this->waterHeight = this->getWaterHeightIfVolume(volThis - empty);
    }
}