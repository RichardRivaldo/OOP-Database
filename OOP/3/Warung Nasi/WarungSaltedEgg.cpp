/* Richard Rivaldo
13519185 - K04 */

#include "WarungSaltedEgg.hpp"
#include <iostream>

WarungSaltedEgg::WarungSaltedEgg(int uang, int nasi, int telur, int telurAsin, int ayam){
    this->telurAsin = telurAsin;
    this->ayam = ayam;
}

bool WarungSaltedEgg::masak(int pesanan){
    if(this->getNasi() < pesanan && this->getTelur() < pesanan && this->telurAsin < 3 * pesanan && this->ayam < pesanan){
        return false;
    }
    else{
        int total = pesanan * 30000;
        this->setUang(this->getUang() + total);

        return true;
    }
}