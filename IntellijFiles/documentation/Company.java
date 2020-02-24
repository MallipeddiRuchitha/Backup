package documentation;
Interface Company {
    String companyName="Zemoso";
    String  location="hyderabad";
    public int login();
public int logout();



    }






class Employee implements Company{
    String name;
    String  personalGmailId;
    String  allocatedGmailId;
    int phoneNumber;
    String address;
    date  joiningDate;

    public Employee(String name, String  personalGmailId, String  allocatedGmailId,int phonenumber,String address, String  joiningDate){
        this.name=name;
        this.personalGmailId=personalGmailId;
        this.allocatedGmailId=allocatedGmailId;
        this.phoneNumber=phoneNumber;
        this.address=address;
        this.joiningDate=joiningDate;

    }
    public void add(){

    }
salary(int numberOfYears){

}
salary()




}
class Project{
    String projectTitle;
    String  domain;
    String  projectManager;
    String deadline;
    public Project(String projectTitle,String Domain){
        this.projectTitle=projectTitle;
        this.domain=domain;

    }
    public void projectDescription();



}

Interface  Trainee{
    training();
    mentoring();
    salary();

        }

        Interface  FullTime{
         salary(int numOfYears);
        salary(int numOfYears,int incentive);


        }


class   SoftwareEngineer extends Employee implements Project{




}
class InternSoftwareEngineer extends SoftwareEngineer{

}



