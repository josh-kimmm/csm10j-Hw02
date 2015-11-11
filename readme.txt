1. The most significant difference is the way my inheritance hierarchy is structured. I did not seperate the Wealth class
from the class Asset. The similarity is that class Car, House, BankAccout, Stock, and Bond are all subclasses of the
class Asset.

2. The significant difference is that in the interface design the hierarchy almost resembles a multiple inheritance in
the class House and Car. This is Java's way around multiple inheritance since Java does not allow it. The similarity is
that the class Asset or interface Asset has the 5 types of assets we have been working with. Car, House, BankAccount,
Stock, and Bond. The advantage of the inheritance hierarchy is that variables can be inherited from the parent classes
so there is no need to create more variables in the subclasses which require more overhead and possible problems with
trying to debug the program. This is where the disadvantage of the interface hierarchy comes in. In an interface you 
cannot include variables in the interfaces so therefore the variables have to be created in the class that implements the
the interface which require a lot more overhead to keep track of. The advantage that comes with interfaces is that less
classes have to be created since a class can implement many interfaces whereas the disadvantage that comes with 
inheritance is that you can only inherit one class.

4. In both the inheritance and interface design I would probably add more to the Bond class and add to the class how much
money you received from the bond and how much the bond still owes you and add that to the functions that prints out the 
bond information.
