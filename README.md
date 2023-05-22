# Wyvern-Quest

The difference between an abstract class and an interface in Java is that a class / subclass can only extend one abstract class, whilst on the other hand being able to implement multiple interfaces.
Java abstracts allow methods and attributes of any kind, meanwhile Java interfaces only allows abstract methods and variables declared in interfaces are static and final (methods are also by default abstract in java interfaces - not requiring explicit declaration). In regards, to their uses, java interfaces are used when multiple classes that are not closely related have a common function/method, for example, in the code I have provided nearly all the classes need to be able to show their detail , but creating a common parent class just for this function would not make much sense, therefore an interface is created to solve this issue. Meanwhile java abstract are used when a developer does not want or allow the ability to create an instance of a parent class and instead only instances of it's children.

# Code in action
![image](https://github.com/J0hn-J0hnson/Wyvern-Quest/assets/91310490/d089b295-7118-4efb-bf72-34b4b945fb91)
![image](https://github.com/J0hn-J0hnson/Wyvern-Quest/assets/91310490/1625eab4-7fd8-48e3-8d27-bed289025f58)
![image](https://github.com/J0hn-J0hnson/Wyvern-Quest/assets/91310490/dca0edd7-d91f-429f-82ae-d589509d57d2)


