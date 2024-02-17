#include <iostream>
#include <string>
#include "Product.cpp"

using namespace std;

class Clothing : public Product
{
    private:
        string size;
        string material;
        string gender;

    public:
        Clothing(){
        }

        void setSize(string size){
            this->size = size;
        }

        string getSize(){
            return this->size;
        }
        
        void setMaterial(string material){
            this->material = material;
        }

        string getMaterial(){
            return this->material;
        }

        void setGender(string gender){
            this->gender = gender;
        }

        string getGender(){
            return this->gender;
        }

        ~Clothing(){
        }
};