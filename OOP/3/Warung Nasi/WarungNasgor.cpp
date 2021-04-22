/* Richard Rivaldo
13519185 - K04 */

#include "WarungNasgor.hpp"
#include <iostream>

WarungNasgor::WarungNasgor(int uang, int nasi, int telur, int kecap):WarungNasi(){
    this->kecap = kecap;
}

bool WarungNasgor::masak(int pesanan){
    if(this->getNasi() < pesanan && this->getTelur() < pesanan && this->kecap < pesanan){
        return false;
    }
    else{
        int total = pesanan * 15000;
        this->setUang(this->getUang() + total);

        return true;
    }
}