#include <iostream>
#include <string>

using namespace std;

class Product
{
    private:
        int idProduct;
        string name;
        string brand;
        int price;

    public:
        Product(){
        }
        
        void setId(int idProduct){
            this->idProduct = idProduct;
        }

        int getId(){
            return this->idProduct;
        }

        void setName(string name){
            this->name = name;
        }

        string getName(){
            return this->name;
        }

        void setBrand(string brand){
            this->brand = brand;
        }

        string getBrand(){
            return this->brand;
        }

        void setPrice(int price){
            this->price = price;
        }

        int getPrice(){
            return this->price;
        }

        ~Product(){
        }
};

