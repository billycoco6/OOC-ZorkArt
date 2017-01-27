This programme is using factory design pattern.

- main() in ZorkRunner called the Zork classs which retrieve the current state of the game.
	a. currentRoom() returns the current room
	b. getPlayer() returns the status of the player

- CMD has the method getInput(), which takes the command typed in command line and trigger the command directed by that command via getCommand() in CMDParser

- ItemFactory, MonsterFactory and MapGenerator are abstract classes, which create new Item, Monster and Map accordingly

- Class Room is extended from Map, which displays the event in each room such as Monster, Item and Trap via getRoomEvent()

- Class Player represents the status and action of player such as health, inventory and movement