#include "Ball.hpp"
#include <iostream>

using namespace std;

Ball::Ball(){
    this->radius = 1;
}

Ball::Ball(int radius){
    if(radius >= 1 and radius <= 1000){
        this->radius = radius;
    }
}

Ball::Ball(const Ball& b){
    this->radius = b.radius;
}

Ball::~Ball(){}

void Ball::bounce(){
    cout << "bo";
    for(int i = 0; i < radius; i++){
        cout << "i";
    }
    cout << "ng" << endl;
}
