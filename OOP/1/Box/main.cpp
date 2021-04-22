#include "Box.hpp"
#include <iostream>

using namespace std;

// new empty box 2
// new empty box with default id 0
// new empty box 1
// assign box 0 <- 2
// copy box 1
// box 2
// box 1
// destroy box 2
// destroy box 1
// destroy box 1
// destroy box 2"


int main(){
    Box *box2 = new Box(2);
    Box *box0 = new Box();
    Box *box1 = new Box(1);

    *box0 = *box2;
    Box *copy1 = new Box(*box1);
    box2->peek();
    box1->peek();
    
    delete box0;
    delete box1;
    delete copy1;
    delete box2;
}