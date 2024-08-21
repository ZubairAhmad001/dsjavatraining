package oops;

public class encapsulation {
    public static void main(String[] args) {

        Trainers trainers = new Trainers();
        //1.
        trainers.name = "ZUABIR AHMAD";
        trainers.email = " xyz@email.com";
        trainers.technology = "java Program";
        System.out.println(trainers.name + " '" + trainers.email + "' " + trainers.technology);
        //2. data add using object and methods
        trainers.printprofile("zubair Ahmad" + ",  ", "xyz@gmail.com" + ", ", "java program");

        //3. data and using encapsulation
        // add the data using getter and setter
        trainers.setName("ankit tiwari");
        trainers.setEmail(" tiwari@gmail.com");
        trainers.setTechnology("JAVA");
        System.out.println(trainers.getName() +  ",  "  + trainers.getEmail()  +", "+ trainers.getTechnology());

        Studentdetails student = new Studentdetails();


        student.setName(" madhur ");
        student.setEmail(" madhur@gmail.com");
        student.setMobileNo(" 7623676743");
        System.out.println( student.getName() + student.getEmail() + student.getEmail());


    }
}
class Studentdetails{
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }

    String name;
    String email;
    String mobileNo;
}




 class Trainers{
    String name;
    String email;
    String technology;

     public String getName() {
         return name;
     }

     public void setName(String name) {
         this.name = name;
     }

     public String getEmail() {
         return email;
     }

     public void setEmail(String email) {
         this.email = email;
     }

     public String getTechnology() {
         return technology;
     }

     public void setTechnology(String technology) {
         this.technology = technology;
     }

     public void printprofile(String zubairAhmad, String mail, String javaProgram) {
         System.out.println(zubairAhmad + mail + javaProgram);
     }
 }