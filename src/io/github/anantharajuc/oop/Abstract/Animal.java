package io.github.anantharajuc.oop.Abstract;

//Abstract Class
//An abstract class outlines the methods but not necessarily implements all the methods.s
abstract class Animal
{
	//Abstract Method
	//A method that is declared but not defined. Only method signature no body.
	//Declared using the abstract keywords
	//Used to put some kind of compulsion on the class who inherits the class has abstract methods
	//The class that inherits must provide the implementation of all the abstract methods of parent class else declare the subclass as abstract
	 public abstract void animalSound();

}
