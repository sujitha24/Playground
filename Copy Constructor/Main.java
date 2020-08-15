#include <iostream>
using namespace std;
class CC
{ 
  private: 
    int x, y; 
  public: 
  CC(int x1, int y1) 
    { 
      x=x1; 
      y=y1; 
    } 
   CC(const CC &c2) 
    {
      x=c2.x;
      y=c2.y; 
    } 
    int getX()         
    {  
      return x; 
    } 
    int getY()          
    {  
      return y; 
    } 
}; 
int main() 
{ 
    CC c1(10,15); 
    CC c2 = c1;
    cout <<"p1.x = " <<c1.getX() << ", p1.y = " << c1.getY()<<endl;
    cout <<"p2.x = " <<c2.getX() << ", p2.y = " << c2.getY(); 
    return 0; 
}