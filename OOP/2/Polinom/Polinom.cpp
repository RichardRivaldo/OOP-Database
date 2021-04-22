/* Richard Rivaldo
Praktikum 1 - 13519185 */

#include "Polinom.hpp"
#include "math.h"
#include <iostream>

using namespace std;

Polinom::Polinom():derajat(0){
    koef = new int[1];
    koef[0] = 0;
}

Polinom::Polinom(int n):derajat(n){
    koef = new int[n];
    for(int i = 0; i <= derajat; i++){
        koef[i] = 0;
    }
}

Polinom::Polinom(const Polinom& P){
    this->derajat = P.derajat;
    koef = new int[this->derajat];

    for(int i = 0; i <= derajat; i++){
        koef[i] = P.koef[i];
    }
}

Polinom::~Polinom(){
    delete[] koef;
}

Polinom& Polinom::operator=(const Polinom& P){
    delete[] koef;

    this->derajat = P.derajat;
    koef = new int[this->derajat];

    for(int i = 0; i <= derajat; i++){
        koef[i] = P.koef[i];
    }
}

int Polinom::getKoefAt(int idx) const{
    return koef[idx];
}

int Polinom::getDerajat() const{
    return derajat;
}

void Polinom::setKoefAt(int idx, int val){
    koef[idx] = val;
}

void Polinom::setDerajat(int n){
    derajat = n;
}

void Polinom::input(){
    for(int i = 0; i <= derajat; i++){
        cin >> koef[i];
    }
}

void Polinom::printKoef(){
    for(int i = 0; i <= derajat; i++){
        cout << koef[i] << endl;
    }
}

int Polinom::substitute(int x){
    int sumSubs = 0;

    for(int i = 0; i <= derajat; i++){
        sumSubs += pow(x, i) * koef[i];
    }
    return sumSubs;
}

void Polinom::print(){
    cout << koef[0];
    for(int k = 1; k <= derajat; k++){
        if(koef[k] > 0){
            cout << '+' << koef[k] << "x^" << k;
        }
        else if(koef[k] < 0){
            cout << koef[k] << "x^" << k;
        }
    }
    cout << endl;
}