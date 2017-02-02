package zork;

import character.Character;

import java.util.Scanner;

/**
 * Created by billy.witt on 1/28/2017 AD.
 */
public class Command {

    public void start() {
        CommandParser commandParser = new CommandParser();
        Scanner scanner = new Scanner(System.in);
        Character player = new Character();
        boolean quit = false;
        System.out.println("Welcome to Zork Bay every brave soul, in this tale you will face with all the thing you might not expect ...\nThis all began in 1662 during the golden age of piracy, the sea was filled with many cruel creatures and above all that the pirates.\n'Steve Bob', the captain of Floating Apple Ship, was known for his merciful and brave heart.\nOne night he was abducted by his all time enemy 'Gatewinson' ... and this is where the story began\n\n???: Hey! Hey!! Heyy!!!\nYou: ...\n???: Hi Captain Bob, I'm Tinker Bell, the sea fairy, I was sent by your crews, they are hiding outside waiting for your presence. I will help you out of here!\nYou: Nice to meet you buddy. Let's Rock!!");

            while (!quit) {
                try {
                    if (commandParser.isGameOver()) {
                        if (player.getHP() <= 0) {
                            System.out.println("\n============== Game Over ==============\n");
                        } else {
                            System.out.println("\n============== Congratulation ==============\n");
                        }
                        break;
                    }

                    commandParser.mapDetail();
                    System.out.print("You: ");
                    String line = scanner.nextLine();
                    String[] commands = line.split(" ");

                    if (commands[0].equals("quit")) {
                        quit = line.equals("quit");
                    } else {
                        String command = commands[0];
                        String object = commands[1];
                        commandParser.parse(command, object);
                    }
                } catch (Exception e) {
                    System.out.println("You need two parameter {command} {object}");
                }
            }
        }
    }
