ZorkRunner --> main() method

CommandParser --> get and resolve the input from command line and send to correspond function

Command --> call start(), which triggers the CommandParser

Character --> contains all attributes of the player status, Inventory, HP & Attack.

MapFactory --> Load the data from config file, represents the location and status of each room, and use it to create map by filling the attributes in Room.

MonsterFactory --> create Monster, which is parent of all Monster classes.

ItemFactory --> create Item, which is parent of all Item classes.