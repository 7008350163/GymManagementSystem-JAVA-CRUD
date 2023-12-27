import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

public class GymOperations {
    private static Map<Integer,GymCustomer> gymcustomers = new HashMap<>();
    private static AtomicInteger atomic = new AtomicInteger();

    public static Collection<GymCustomer> getAllGymCustomers(){
        return gymcustomers.values();
    }
    public static GymCustomer getGymCustomerById(Integer id){
       return gymcustomers.get(id);
    }
    public static String addGymCustomer(GymCustomer gymCustomer){
        gymCustomer.setId(atomic.incrementAndGet());
        gymcustomers.put(gymCustomer.getId(),gymCustomer);
        return "GymMember Details Added Successfully!";

    }
    public static String updateGymCustomer(Integer id,GymCustomer gymCustomer){
        gymcustomers.put(id,gymCustomer);
        return "GymMember Details Updated Successfully!";
    }

    public static String deleteGymCustomer(Integer id){
        gymcustomers.remove(id);
        return "GymMember Details Deleted Successfully!";
    }
}
