#ifndef _VECTOR2_HPP_
#define _VECTOR2_HPP_

#include <iostream>

using namespace std;

template <class T, int length>
class Vector {
private:
    T* elements;

public:
    Vector() {
        this->elements = new T[length];
    }

    Vector(const Vector<T,length>& other) {
        this->elements = new T[length];
        for(int i = 0; i < length; i++){
            elements[i] = other.elements[i];
        }
    }

    ~Vector() {
        delete[] this->elements;
    }

    T& operator[](int idx) {
        return this->elements[idx];
    }

    Vector<T, length> operator+(const Vector<T, length>& other) {
        Vector<T, length> result;
        for(int i = 0; i < length; i++){
            result.elements[i] = elements[i] + other.elements[i];
        }
        return result;
    }

    Vector<T, length> operator-(const Vector<T, length>& other) {
        Vector<T, length> result;
        for(int i = 0; i < length; i++){
            result.elements[i] = elements[i] - other.elements[i];
        }
        return result;
    }

    bool operator<(const Vector<T, length>& other) {
        for(int i = 0; i < length; i++){
            if (elements[i] != other.elements[i]) {
                return elements[i] < other.elements[i];
            }
        }
        return false;
    }

    bool operator>(const Vector<T, length>& other) {
        for(int i = 0; i < length; i++){
            if (elements[i] != other.elements[i]) {
                return elements[i] > other.elements[i];
            }
        }
        return false;
    }

    friend std::ostream& operator<<(ostream& os, Vector<T, length> vector) {
        os << "<";
        for(int i = 0; i < length; i++){
            os << vector.elements[i];
            if(i != length - 1){
                cout << ",";
            }
        }
        os << ">";
        return os;
    }

    friend std::istream& operator>>(istream& is, Vector<T, length>& vector) {
        for(int i = 0; i < length; i++){
            is >> vector.elements[i];
        }
        return is;
    }
};

#endif