/* Richard Rivaldo
Praktikum 1 - 13519185 */

#include "A.hpp"
#include <iostream>

/* 
cons 1
cons 2
ccons 1
cassign 1 = 2
show 2
dest 2
dest 2
dest 1 
*/

int main(){
    A* A1 = new A('1');
    A* A2 = new A('2');
    A* A3 = new A(*A1);

    A1->operator=(*A2);
    A2->show();

    delete A1;
    delete A2;
    delete A3;
    return 0;
}