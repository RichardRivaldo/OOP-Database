/* Richard Rivaldo
Praktikum 1 - 13519185 */

#include "A.hpp"
#include <iostream>

/* cons 1
cons 2
cons 3
cons 4
cassign 3 = 1
cons 5
cassign 4 = 5
dest 5
cons 6
ccons 5
ccons 2
cassign 2 = 6
cassign 1 = 5
show 2
dest 2
dest 5
dest 6
dest 5
dest 1
dest 6
dest 5 */

int main(){

    A* A1 = new A(1);
    A* A2 = new A(2);
    A* A3 = new A(3);
    A* A4 = new A(4);

    A3->operator= (*A1);
    A* A5 = new A(5);

    A4->operator= (*A5);
    delete A5;

    A* A6 = new A(6);
    A* A7 = new A(*A4);
    A* A8 = new A(*A2);

    A8->operator= (*A6);
    A1->operator= (*A4);

    A2->show();

    delete A2;
    delete A4;
    delete A6;
    delete A7;
    delete A3;
    delete A8;
    delete A1;

    return 0;
}