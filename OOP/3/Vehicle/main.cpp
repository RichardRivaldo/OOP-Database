/* Richard Rivaldo
13519185 - K04 */

#include "Bike.h"
#include "Car.h"
#include <iostream>

using namespace std;

/* 
ctor vehicle 3 2
cctor vehicle 3 2
ctor vehicle 6 50
ctor vehicle 4 8
ctor car 4 8
cctor vehicle 4 8
cctor car 4 8 

ctor vehicle 4 6
ctor car 4 6
ctor vehicle 2 2
ctor bike 2 2
someone is driving this car 4 6
wheels 2 capacity 2
someone is riding this bike2 2
dtor bike 2 2
dtor vehicle 2 2
dtor car 4 6
dtor vehicle 4 6
dtor car 4 8
dtor vehicle 4 8
dtor car 4 8
dtor vehicle 4 8
dtor vehicle 6 50
dtor vehicle 3 2
dtor vehicle 3 2 */

int main(){
    Vehicle v1(3, 2);
    Vehicle v2 = v1;
    Vehicle v3(6, 50);

    Car c1(8);
    Car c2 = c1;
    Car c3(6);

    Bike b1;
    c3.drive();
    b1.show();
    b1.ride();

    return 0;
}
