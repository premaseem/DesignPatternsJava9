__author__ = 'Aseem Jain'

class Car(object):

    def factory(type):
        if type == "Racecar":
            return Racecar()
        if type == "Van":
            return Van()
        if type == "SUV":
            return Van()
        assert 0, "Bad car creation: " + type

    factory = staticmethod(factory)

class Racecar(Car):
    def drive(self):
        print("Racecar driving.")


class Van(Car):
    def drive(self):
        print("Van driving.")

class SUV(Car):
    def drive(self):
        print("SUV driving.")

# Create object using factory.
print("Car factory creating Cars based on params ")
car = Car.factory("Racecar")
car.drive()

# Create object using factory.
car = Car.factory("Van")
car.drive()



