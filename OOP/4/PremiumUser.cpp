/* Richard Rivaldo
13519185 - K04 */

#include "PremiumUser.h"
#include <iostream>
#include <cstring>

using namespace std;

PremiumUser::PremiumUser(char* nama): User(nama){
    num_of_music_downloaded = 0;
    active = true;
}

PremiumUser::PremiumUser(const PremiumUser& PU1){
}

PremiumUser::~PremiumUser(){}

void PremiumUser::downloadMusic(char *title){
    if(active){
        cout << "Music Downloaded: " << title << endl;
        num_of_music_downloaded++;
    }
    else{
        cout << "Activate premium account to download music" << endl;
    }
}

void PremiumUser::inactivatePremium(){
    this->active =  false;
}

void PremiumUser::activatePremium(){
    this->active = true;
}

int PremiumUser::getNumOfMusicDownloaded() const{
    return this->num_of_music_downloaded;
}

bool PremiumUser::getPremiumStatus() const{
    return this->active;
}