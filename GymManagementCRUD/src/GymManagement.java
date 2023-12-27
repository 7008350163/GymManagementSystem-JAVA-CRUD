import java.util.Scanner;

import java.util.Collection;

public class GymManagement {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("WELCOME TO GYM MANAGEMENT PROJECT");

        while(true){
            System.out.println("SELECT THE OPERATION TO PERFORM FROM THE FOLLOWING MENU:");
            System.out.println("1. DISPLAY ALL GYM MEMBER DETAILS");
            System.out.println("2. ADD NEW GYM MEMBER DETAILS");
            System.out.println("3. DISPLAY SINGLE GYM MEMBER DETAILS");
            System.out.println("4. UPDATE GYM MEMBER DETAILS");
            System.out.println("5. DELETE GYM MEMBER DETAILS");
            System.out.println("0. EXIT MENU");

            System.out.print("ENTER YOUR CHOICE: ");
            int choice = sc.nextInt();
            String name,gympackage,course;
            Integer id,age;
            GymCustomer Gym;

            if(choice == 0)
                break;
            
            else{      //DISPLAY ALL GYM MEMBER
                switch(choice){
                    case 1: Collection<GymCustomer> gymcustomers = GymOperations.getAllGymCustomers();
                                System.out.println("ID\tNAME\tAGE\tGYMPACKAGE\tCOURSE");
                                for(GymCustomer s : gymcustomers){
                                    System.out.println(s.getId() + "\t" 
                                                    + s.getName() + "\t" 
                                                    + s.getAge() + "\t"
                                                    + s.getGympackage() + "\t"
                                                    + s.getCourse());
                                                
                                }
                                break; 
                                //ADD NEW GYM MEMBER
                    case 2: System.out.print("Customer Name: ");
                            name = sc.next();
                            System.out.print("Customer Age: ");
                            age = sc.nextInt();
                            System.out.print("Gym package : ");
                            gympackage = sc.next();
                            System.out.print("Gym course : ");
                            course = sc.next();
                            
                            Gym = new GymCustomer(name, age, gympackage, course);
                            GymOperations.addGymCustomer(Gym);
                            break;  
                            //DISPLAY SINGLE GYM MEMBER
                    case 3: System.out.print("Enter ID of the Gym Member: ");
                            id = sc.nextInt();
                            Gym = GymOperations.getGymCustomerById(id);
                            if(Gym == null){
                                System.out.println("MEMBER WITH THIS ID DOES NOT EXISTS");
                            }
                            else{
                                System.out.println(Gym.getId() + "\t" 
                                                    + Gym.getName() + "\t" 
                                                    + Gym.getAge() + "\t"
                                                    + Gym.getGympackage() + "\t"
                                                    + Gym.getCourse()); 
                                }
                                break;
                                //UPDATE GYM MEMBER DETAILS
                    case 4: System.out.print("Enter ID of the Gym Member: ");
                            id = sc.nextInt();
                            Gym = GymOperations.getGymCustomerById(id);
                            if(Gym == null){
                                System.out.println("MEMBER WITH THIS ID DOES NOT EXISTS");
                            }
                            else{
                                System.out.println("CHOOSE THE FIELD TO UPDATE:");
                                System.out.println("1. NAME");
                                System.out.println("2. AGE");
                                System.out.println("3. GYMPACKAGE");
                                System.out.println("4. COURSE");
                                System.out.print("ENTER YOUR CHOICE: ");
                                choice = sc.nextInt(); 
                                switch(choice){
                                    case 1: System.out.print("Gym Member Name: ");
                                            name = sc.next();
                                            Gym.setName(name);
                                            break;
                                    case 2: System.out.print("Gym Member Age: ");
                                            age = sc.nextInt();
                                            Gym.setAge(age);
                                            break;
                                    case 3: System.out.print("Gym Member Package: ");
                                            gympackage = sc.next();
                                            Gym.setGympackage(gympackage);
                                            break;
                                    case 4: System.out.print("Gym Member Course: ");
                                            course = sc.next();
                                            Gym.setCourse(course);
                                            break;
                                                  
                                }
                                GymOperations.updateGymCustomer(id, Gym);
                            }
                            break;   
                            //DELETE GYM MEMBER DETAILS  
                    case 5: System.out.print("Enter ID of the Gym Member: ");
                            id = sc.nextInt();
                            Gym = GymOperations.getGymCustomerById(id);
                            if(Gym == null){
                                System.out.println("MEMBER WITH THIS ID DOES NOT EXISTS");
                            }
                            else{
                                GymOperations.deleteGymCustomer(id);
                            }
                            break;
                    default:System.out.println("INVALID CHOICE!");


                        }
             }
         }
      
    sc.close();
                
    } 
} 