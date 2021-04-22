/* Richard Rivaldo
13519185 - K04 */

#include "ArtistUser.h"
#include <iostream>
#include <cstring>

using namespace std;

int ArtistUser::num_of_artist = 0;

ArtistUser::ArtistUser(char *nama): User(nama){
    num_of_music_uploaded = 0;
    uploaded_music_list = new char*[256];

    num_of_artist++;
}

ArtistUser::ArtistUser(const ArtistUser& AU1): User(AU1){
    this->num_of_music_uploaded = AU1.num_of_music_uploaded;
    uploaded_music_list = new char*[AU1.num_of_music_uploaded];

    for(int i = 0; i < num_of_music_uploaded; i++){
        uploaded_music_list[i] = new char[strlen(AU1.uploaded_music_list[i])];
        strcpy(uploaded_music_list[i], AU1.uploaded_music_list[i]);
    }
    num_of_artist++;
}

ArtistUser::~ArtistUser(){
    cout << "Artist user " << getName() << " deleted" << endl;

    for(int i = 0; i < num_of_music_uploaded; i++){
        delete[] uploaded_music_list[i];
    }
    delete[] uploaded_music_list;

    num_of_artist--;
}

void ArtistUser::uploadMusic(char* title){
    num_of_music_uploaded++;

    uploaded_music_list[num_of_music_uploaded] = new char[strlen(title)];
    strcpy(uploaded_music_list[num_of_music_uploaded], title);
}

void ArtistUser::deleteUploadedMusic(char* title){
    int i = 0;

    while(i < num_of_music_uploaded){
        if(strcmp(title, uploaded_music_list[i]) == 0){
            int j = i;
            for(j; j < num_of_music_uploaded - 1; j++){
                delete[] uploaded_music_list[j];
                uploaded_music_list[j] = new char[strlen(uploaded_music_list[j + 1])];
                strcpy(uploaded_music_list[j], uploaded_music_list[j + 1]);
            }

            delete[] uploaded_music_list[j];
            num_of_music_uploaded--;
        }
        i++;
    }
}

void ArtistUser::viewUploadedMusicList() const{
    if(num_of_music_uploaded > 0){
        for(int i = 0; i < num_of_music_uploaded; i++){
            cout << i + 1 << ". " << uploaded_music_list[i] << endl;
        }
    }
    else{
        cout << "No music uploaded" << endl;
    }
}

int ArtistUser::getNumOfMusicUploaded() const{
    return num_of_music_uploaded;
}

int ArtistUser::getNumOfArtist(){
    return num_of_artist;
}