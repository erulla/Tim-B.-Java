//This is written via Jshell 
int myFirstNumber = (10+5) + (2*10);
int mySecondNumber=12;
int myThirdNumber=6;
int myTotal= myFirstNumber + mySecondNumber + myThirdNumber;
myThirdNumber = myFirstNumber *2;
myTotal= myFirstNumber + mySecondNumber + myThirdNumber; //int removed as you do not want to redefine the variable
int myLastOne = 1000 - myTotal;
System.out.print(myLastOne);