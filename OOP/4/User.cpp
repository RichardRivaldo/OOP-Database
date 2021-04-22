/* Richard Rivaldo
13519185 - K04 */

#include "User.h"
#include <iostream>
#include <cstring>

using namespace std;

int User::n_user = 0;

User::User(char* nama){
    name = new char[strlen(nama)];
    num_of_favourite_music = 0;
    music_list = new char*[256];

    strcpy(name, nama);
    n_user++;
}

User::User(const User& U1){
    name = new char[strlen(U1.name)];
    num_of_favourite_music = U1.num_of_favourite_music;
    music_list = new char*[U1.num_of_favourite_music];

    strcpy(name, U1.name);

    for(int i = 0; i < num_of_favourite_music; i++){
        music_list[i] = new char[strlen(U1.music_list[i])];
        strcpy(music_list[i], U1.music_list[i]);
    }

    n_user++;
}

User::~User(){
    cout << "User " << name << " deleted" << endl;
    
    delete[] name;

    for(int i = 0; i < num_of_favourite_music; i++){
        delete[] music_list[i];
    }

    delete[] music_list;
    
    n_user--;
}

void User::addFavouriteMusic(char* title){
    music_list[num_of_favourite_music] = new char[strlen(title)];
    strcpy(music_list[num_of_favourite_music], title);

    num_of_favourite_music++;
}

void User::deleteFavouriteMusic(char* title){
    int i = 0;

    while(i < num_of_favourite_music){
        if(strcmp(title, music_list[i]) == 0){
            int j = i;
            for(j; j < num_of_favourite_music - 1; j++){
                delete[] music_list[j];
                music_list[j] = new char[strlen(music_list[j + 1])];
                strcpy(music_list[j], music_list[j + 1]);
            }

            delete[] music_list[j];
            num_of_favourite_music--;
        }
        i++;
    }
}

void User::setName(char* nama){
    delete[] name;
    name = new char[strlen(nama)];
    strcpy(name, nama);
}

char* User::getName() const{
    return this->name;
}

int User::getNumOfFavouriteMusic() const{
    return this->num_of_favourite_music;
}

int User::getNumOfUser(){
    return n_user;
}

void User::viewMusicList() const{
    if(num_of_favourite_music <= 0){
        cout << "No music in your favourite list" << endl;
    }
    else{
        for(int i = 0; i < num_of_favourite_music; i++){
            cout << i + 1 << ". " << music_list[i] << endl;
        }
    }
}