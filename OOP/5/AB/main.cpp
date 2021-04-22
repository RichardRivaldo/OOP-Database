// main.cpp
#include "A.hpp"
#include "B.hpp"

void setX(A* x){
    x->setValue(888);
}

int main() {
  B b; /** ANDA HARUS MENGGUNAKAN DEFAULT CONSTRUCTOR */

  setX(&b);
  b.setValue(10888);
  
  b.print(); // OUTPUT: (888, 10888)
  return 0;
}

