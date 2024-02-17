#include <iostream>
#include <string>
#include "Clothing.cpp"

using namespace std;

class Shirt : public Clothing
{
private:
    string color;
    string sleeveType;

public:
    Shirt(){
    }

    void setColor(string color){
        this->color = color;
    }

    string getColor(){
        return this->color;
    }

    void setSleeveType(string sleeveType){
        this->sleeveType = sleeveType;
    }

    string getSleeveType(){
        return this->sleeveType;
    }

    Shirt inputDataShirt() {
        Shirt shirt;

        cout << "INPUT THE DETAIL OF SHIRT : \n";
        cout << "ID Product: ";
        int id; cin >> id;
        cout << "Name: ";
        string name; getline(cin, name);
        cout << "Brand: ";
        string brand; getline(cin, brand);
        cout << "Price: ";
        int price; cin >> price;
        cout << "Size: ";
        string size; getline(cin, size);
        cout << "Material: ";
        string material; getline(cin, material);
        cout << "Gender: ";
        string gender; getline(cin, gender);
        cout << "Color: ";
        string color; getline(cin, color);
        cout << "Sleeve Type: ";
        string sleeveType; getline(cin, sleeveType);

        shirt.setId(id);
        shirt.setName(name);
        shirt.setBrand(brand);
        shirt.setPrice(price);
        shirt.setSize(size);
        shirt.setMaterial(material);
        shirt.setGender(gender);
        shirt.setColor(color);
        shirt.setSleeveType(sleeveType);
        
        return shirt;
    }

    ~Shirt(){
    }
};
