#include "Bike.h"
#include "Car.h"

// ctor vehicle 4 4
// ctor car 4 4
// ctor vehicle 4 10
// ctor car 4 10
// ctor vehicle 2 2
// ctor bike 2 2
// cctor vehicle 2 2
// dtor bike 2 2
// dtor vehicle 2 2
// someone is driving this vehicle 4 10
// someone is cleaning this vehicle 2 2
// someone is driving this car 4 4
// someone is parking this vehicle 2 2
// dtor car 4 10
// dtor vehicle 4 10
// dtor vehicle 2 2
// dtor car 4 4
// dtor vehicle 4 4

int main(){
    Car* c1 = new Car(4);
    Car* c2 = new Car(10);

    Bike* b1 = new Bike();
    Vehicle* v1 = new Vehicle(*b1);

    delete b1;
    
    c2->Vehicle::drive();
    v1->clean();
    c1->drive();
    v1->park();

    delete c2;
    delete v1;
    delete c1;
}