
public class GymCustomer {
    private Integer id;
    private String name;
    private Integer age;
    private String gympackage;
    private String course;
    

    public GymCustomer(){}

    public GymCustomer(String name,Integer age,String gympackage,String course){
        this.name=name;
        this.age=age;
        this.gympackage=gympackage;
        this.course=course;
        
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getGympackage() {
        return gympackage;
    }

    public void setGympackage(String gympackage) {
        this.gympackage = gympackage;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    
     
    

}
