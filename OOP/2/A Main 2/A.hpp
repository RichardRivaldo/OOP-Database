#ifndef A_HPP
#define A_HPP

#include <iostream>

class A {
public:
    A(int d);
    A(const A&);
    virtual ~A();

    A& operator=(const A&);

    void show();
private:
    int data;
};

#endif