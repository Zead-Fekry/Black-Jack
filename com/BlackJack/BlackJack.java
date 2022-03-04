package com.BlackJack;


import java.util.*;

/**
 * @author DIGITAL
 */
public class BlackJack {

    /**
     * @param args the command line arguments
     */
    static Game g = new Game();

    public static void main(String[] args) {
        GUI gui = new GUI();
        g.generate_card_deck();
        g.add_players();
        gui.runGUI(g.deck, g.players_arr[0].cards_arr, g.players_arr[1].cards_arr, g.players_arr[2].cards_arr, g.players_arr[3].cards_arr);
        Scanner p1_choice = new Scanner(System.in);
        Scanner p2_choice = new Scanner(System.in);
        Scanner p3_choice = new Scanner(System.in);


        while (true) {
            System.out.println(g.players_arr[0].getName() + " turn choose 1 for hit or 2 for stand ... ");


            int choice = p1_choice.nextInt();


            if (choice == 1) {

                g.players_arr[0].add_card(g.get_rand_card());
                gui.updatePlayerHand(g.players_arr[0].cards_arr[(g.players_arr[0].getIndex()) - 1], 0);
                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());

                if (g.players_arr[0].getScore() == 21) {

                    System.out.println(g.players_arr[0].getName() + " has a black jack congratulations with score ...  " + g.players_arr[0].getScore());
                    g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                    g.players_arr[0].won = true;
                    break;
                } else if (g.players_arr[0].getScore() > 21) {
                    System.out.println(g.players_arr[0].getName() + " is busted oops with score ...  " + g.players_arr[0].getScore());
                    g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                    g.players_arr[0].lose = true;
                    break;
                }
            } else if (choice == 2) {
                System.out.println(g.players_arr[0].getName() + " stands right now with score ...  " + g.players_arr[0].getScore());
                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());

                break;
            }


        }

        while (true) {
            System.out.println(g.players_arr[1].getName() + " turn choose 1 for hit or 2 for stand ... ");

            int choice = p2_choice.nextInt();
            if (choice == 1) {
                g.players_arr[1].add_card(g.get_rand_card());
                gui.updatePlayerHand(g.players_arr[1].cards_arr[(g.players_arr[1].getIndex()) - 1], 1);

                if (g.players_arr[1].getScore() == 21) {
                    System.out.println(g.players_arr[1].getName() + " has a black jack congratulations with score ...  " + g.players_arr[1].getScore());
                    g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                    g.players_arr[1].won = true;
                    break;
                } else if (g.players_arr[1].getScore() > 21) {
                    System.out.println(g.players_arr[1].getName() + " is busted oops with score ...  " + g.players_arr[1].getScore());
                    g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                    g.players_arr[1].lose = true;
                    break;
                }
            } else if (choice == 2) {
                System.out.println(g.players_arr[1].getName() + " stands right now with score ...  " + g.players_arr[1].getScore());
                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                break;
            }


        }
        while (true) {
            System.out.println(g.players_arr[2].getName() + " turn choose 1 for hit or 2 for stand ...  ");
            int choice = p3_choice.nextInt();
            if (choice == 1) {
                g.players_arr[2].add_card(g.get_rand_card());
                gui.updatePlayerHand(g.players_arr[2].cards_arr[(g.players_arr[2].getIndex()) - 1], 2);

                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());

                if (g.players_arr[2].getScore() == 21) {
                    System.out.println(g.players_arr[2].getName() + " has a black jack congratulations with score ... " + g.players_arr[2].getScore());
                    g.players_arr[2].won = true;
                    g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                    break;
                } else if (g.players_arr[2].getScore() > 21) {
                    System.out.println(g.players_arr[2].getName() + " is busted oops with score ...  " + g.players_arr[2].getScore());
                    g.players_arr[2].lose = true;
                    g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                    break;
                }
            } else if (choice == 2) {
                System.out.println(g.players_arr[2].getName() + " stands right now with score ...  " + g.players_arr[2].getScore());
                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                break;
            }


        }


        System.out.println(" \n Now its dealer turn ...");
        int condition = 0;
        while (condition == 0) {
            g.players_arr[3].add_card(g.get_rand_card());
            gui.updateDealerHand(g.players_arr[3].cards_arr[(g.players_arr[3].getIndex()) - 1], g.deck);

            if (g.players_arr[3].getScore() == 21) {
                System.out.println("\n dealer has a black jack congratulations with score ...  " + g.players_arr[3].getScore());
                g.players_arr[3].won = true;
                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
                condition++;
            } else if (g.players_arr[3].getScore() > g.high_score && g.players_arr[3].getScore() < 21) {
                System.out.println("\n  dealer have score higher than the highest score " + g.players_arr[3].getScore());
                g.players_arr[3].won = true;
                g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());

                condition++;
            } else if (g.players_arr[3].getScore() > 21) {
                System.out.println("\n  dealer  is busted oops with score ...  " + g.players_arr[3].getScore());
                g.players_arr[3].lose = true;
                condition++;
            }
        }

        g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
        for (int i = 0; i < 4; i++) {
            if (g.high_score == g.players_arr[i].getScore())
                g.players_arr[i].won = true;
        }

        int check_counter = 0;
        for (int i = 0; i < 4; i++) {
            if (g.players_arr[i].won == true)
                check_counter++;
        }
        g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());
        if (g.high_score == 0) {
            System.out.println("\n sorry nobody is winner today all are loosers ....");

        } else if (check_counter != 1) {
            System.out.println("\n sorry nobody is winner today its aPush ....");
        } else {
            g.update_maximum_score(g.players_arr[0].getScore(), g.players_arr[1].getScore(), g.players_arr[2].getScore(), g.players_arr[3].getScore());

            int index = 0;
            for (int i = 0; i < 4; i++) {
                if (g.players_arr[i].won == true)
                    index = i;
            }
            System.out.println("\n congratulation  " + g.players_arr[index].getName() + " is the winner today...");
        }


    }

}
