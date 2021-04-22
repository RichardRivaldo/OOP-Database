#include <iostream>
#include <string>
using namespace std;

class Hewan{
    public:
        Hewan(string name){
            nama = name;
        }

        ~Hewan(){
            cout << "Hewan mati " << nama << endl;
        }

        virtual void print(){
            cout << "Hewan ini namanya " << nama << endl;
        }

    protected:
        string nama;

};

class Anjing : public Hewan{
    public:
        Anjing(string name): Hewan(name){}

        ~Anjing(){
            cout << "Anjing mati " << nama<< endl;
        }

        void print(){
            cout << "Anjing ini namanya " << nama << endl;
        }
};

class Kucing : public Hewan{
    public:
        Kucing(string name): Hewan(name){}

        virtual ~Kucing(){
            cout << "Kucing mati " << nama << endl;
        }

        void print(){
            cout << "Hewan ini namanya " << nama << endl;
        }
};

class AnjingBulldog : public Anjing{
    public:
        AnjingBulldog(string name, string owner): Anjing::Anjing(name)
        {
            pemilik = owner;
        }

        virtual ~AnjingBulldog(){
            cout << "Anjing bulldog mati " << nama << endl;
        }

        void print(){
            cout << "Anjing bulldog ini namanya " << nama << ". " << "Pemiliknya adalah " <<pemilik << endl;
        }
        
    protected:
        string pemilik;
};

class KucingAnggora:public Kucing{
    public:
        KucingAnggora(string name, string owner):Kucing::Kucing(name){
            pemilik = owner;
        }

        ~KucingAnggora(){
            cout << "Kucing anggora mati " << nama << endl;
        }

        void print(){
            cout << "Kucing anggora ini namanya " << nama << ". " << "Pemiliknya adalah " << pemilik << endl;
        }

    protected:
        string pemilik;
};