
import java.util.InputMismatchException;
import java.util.Scanner;
public class PetVirtualGame 
{   
    public static void main(String[] args)
    {
        Pet pet = new Pet();
        Food food = new Food();
        Play play = new Play();
        Player player = new Player();
        
        System.out.println("Hello! Welcome to the Pet Virtual Game");
        System.out.println("You now can take a pet from the followings:");
        System.out.println("1 for Dog");
        System.out.println("2 for Cat");
        System.out.println("3 for Bunny");
        System.out.println("4 for No pet");
        System.out.println("To quit: enter 0");
        
        Scanner scan = new Scanner(System.in);
        
        Scanner scanner = new Scanner(System.in);
        
        while(!scan.hasNextInt())  
        {
            System.out.println("You have entered not integer!");
            System.out.println("1 for Dog");
            System.out.println("2 for Cat");
            System.out.println("3 for Bunny");
            System.out.println("4 for No pet");
            scan = new Scanner(System.in);      
        }

        int userEnter =  scan.nextInt();
        
        while(userEnter > 4)
        {
            System.out.println("Invalid number!");
            System.out.println("Pleaase pick another number:");
            System.out.println("1 for Dog");
            System.out.println("2 for Cat");
            System.out.println("3 for Bunny");
            System.out.println("4 for No pet");
            userEnter = scan.nextInt();
        }
        
        pet.checkPetType(userEnter);    
        
        Scanner scanOne = new Scanner(System.in);
        int userEnterThree;
        int userEnterFour;
        int userEnterFive;
        
        if(userEnter == 4)
        {
            System.out.println("Okay. you have picked no pet!");
        }
        
        do
        {
        if(userEnter >= 1 && userEnter <= 3)
        {
            do
            {
                System.out.println("You have picked: " + pet.getPetType());
                System.out.println("Your pet is hungry");
                System.out.println("Your pet want to play");
                System.out.println("The options are to: ");
                System.out.println("Feed your pet or play with your pet");
                System.out.println("Press 1 for feeding");
                System.out.println("Press 2 for playing");
                System.out.println("Your pet's health is now; " + food.getHealth());
                System.out.println("Your pet's happiness is now; " + play.getHappiness());
                System.out.println("");
                
                while(!scanOne.hasNextInt())  
                {
                    System.out.println("You have entered not integer!");
                    System.out.println("Press 1 for feeding");
                    System.out.println("Press 2 for playing");
                    scanOne = new Scanner(System.in);      
                }
                        
                userEnterThree =  scanOne.nextInt();

                while(userEnterThree > 2)
                {
                    System.out.println("Invalid number!");
                    System.out.println("Pleaase pick another number:");
                    System.out.println("1 for feeding");
                    System.out.println("2 for playing");
                    userEnterThree = scanner.nextInt();
                }
                    
                if(userEnterThree == 1)
                {
                    do
                    {
                        System.out.println("Which food will you feed to your " + pet.getPetType());
                        System.out.println("1 for the dog food,");
                        System.out.println("2 for the cat food,");
                        System.out.println("3 for the bunny food,");
                        System.out.println("4 for no food");                   
                         
                        while(!scanOne.hasNextInt())  
                        {
                            System.out.println("You have entered not integer!");
                            System.out.println("1 for Dog food");
                            System.out.println("2 for Cat food");
                            System.out.println("3 for Bunny food");
                            System.out.println("4 for No food");
                            scanOne = new Scanner(System.in);      
                        }
                        
                        userEnterFour =  scanOne.nextInt();

                        while(userEnterFour > 4)
                        {
                            System.out.println("Invalid number!");
                            System.out.println("Pleaase pick another number:");
                            System.out.println("1 for Dog food");
                            System.out.println("2 for Cat food");
                            System.out.println("3 for Bunny food");
                            System.out.println("4 for No food");
                            userEnterFour = scanner.nextInt();
                        }
                        
                        food.checkFood(userEnterFour, pet.getPetType()); 
                        System.out.println("You have given your pet the " + food.getFoodType());
                        food.checkHealthStatus(food.getHealth());
                    } while(userEnterFour <= 0 && food.getHealth() >= 0 && play.getHappiness() >= 0);
                }

                if(userEnterThree == 2)
                {
                    do
                    {
                        System.out.println("Which toy will you give to your " + pet.getPetType());
                        System.out.println("1 for the dog toy,");
                        System.out.println("2 for the cat toy,");
                        System.out.println("3 for the bunny toy,");
                        System.out.println("4 for no toy");
                        System.out.println("5 for petting");
                        
                        while(!scanOne.hasNextInt())  
                        {
                            System.out.println("You have entered not integer!");
                            System.out.println("1 for the dog toy,");
                            System.out.println("2 for the cat toy,");
                            System.out.println("3 for the bunny toy,");
                            System.out.println("4 for no toy");
                            System.out.println("5 for petting");
                            scanOne = new Scanner(System.in);      
                        }
                        
                        userEnterFive =  scanOne.nextInt();

                        while(userEnterFive > 5)
                        {
                            System.out.println("Invalid number!");
                            System.out.println("Pleaase pick another number:");
                            System.out.println("1 for the dog toy,");
                            System.out.println("2 for the cat toy,");
                            System.out.println("3 for the bunny toy,");
                            System.out.println("4 for no toy");
                            System.out.println("5 for petting");
                            userEnterFive = scanner.nextInt();
                        }
                            
                            play.checkPlay(userEnterFive, pet.getPetType());
                            System.out.println("You have given your pet, " + play.getPlayType());    
                            play.checkHappiness(play.getHappiness());       
                        } while (userEnterFive == 0 && play.getHappiness() >=0 && food.getHealth() >= 0);
                    }      
                } while(food.getHealth() >= 0 && play.getHappiness() >=0 || userEnter == 0);
                        System.out.println("Thanks for playing"); 
            }
        } while (userEnter == 0);
    }
}
