import java.util.ArrayList;
public class PersonTest {
    public static void main(String[] args) {
    Person person1 = new Person(); // new person object
    person1.setName ("Mia \n");
    person1.setAge(21);
    person1.setPhoneNumber(520665656);

    Person person2 = new Person(); // new person object
    person2.setName ("Tenimba \n");
    person2.setAge(5);
    person2.setPhoneNumber(84961654);

    Person person3 = new Person(); // new person object
    person3.setName ("Sesina \n");
    person3.setAge(35);
    person3.setPhoneNumber(12132357);

    Person person4 = new Person(); // new person object
    person4.setName ("Bob \n");
    person4.setAge(75);
    person4.setPhoneNumber(87984321);

    Person person5 = new Person(); // new person object
    person5.setName ("Bakari \n");
    person5.setAge(35);
    person1.setPhoneNumber(520600556);

    Person person6 = new Person(); // new person object
    person6.setName ("Sam \n");
    person6.setAge(27);
    person6.setPhoneNumber(587441996);

    Person person7 = new Person(); // new person object
    person7.setName ("Leroy \n");
    person7.setAge(12);
    person7.setPhoneNumber(878787884);

    Person person8 = new Person(); // new person object
    person8.setName ("Tanaka \n");
    person8.setAge(3);
    person8.setPhoneNumber(98126578);

    Person person9 = new Person(); // new person object
    person9.setName ("Carlton \n");
    person9.setAge(67);
    person9.setPhoneNumber(878451321);

    Person person10 = new Person(); // new person object
    person10.setName ("John \n");
    person10.setAge(7);
    person10.setPhoneNumber(121232354);


    Building building1 = new Building(); //new buidling object 
    building1.setBuildingName("School \n");
    building1.setBuildingAddress("300 W Hawthorne rd \n");

    Building building2 = new Building(); //new buidling object 
    building2.setBuildingName("School \n");
    building2.setBuildingAddress("300 W Hawthorne rd\n");
   
//outputs the name of all the people in a loop
System.out.printf("The names of the people in the city are:  \n");
ArrayList<Person> Population = new ArrayList <>();
Population.add(person1);
Population.add(person2);
Population.add(person3);
Population.add(person4);
Population.add(person5);
Population.add(person6);
Population.add(person7);
Population.add(person8);
Population.add(person9);
Population.add(person10);
for (int i=0; i<Population.size();i++)
{
   System.out.printf(Population.get(i).getName());
}

//output the names of all buildings in a loop
System.out.printf("What are the existing buildings?:  \n");
ArrayList<Building> Buildingz = new ArrayList <>();
Buildingz.add(building1);
Buildingz.add(building2);
for (int i =0; i<Buildingz.size();i++)
{
    System.out.printf (Buildingz.get(i).getBuildingName());
    System.out.printf(Buildingz.get(i).getBuildingAddress());
}

//which kids are in school
System.out.printf("which kids are in school:  \n");
for (int i =0; i<Population.get(i).getName();i++) {

if ( Population.getAge()<18)
{
    System.out.printf(Population.getName());
    CurInSchool.add(Population.getName());
}
    }
//which teachers are in school
System.out.printf("which teachers are in school:  \n");
for (int i =0; i<Population.get(i).getName();i++) {

if ( Population.getAge()>18 && Population.getAge()<40)
{
    System.out.printf(Population.getName());
    CurInSchool.add(Population.getName());
}

    }
//which police officers are in City Hall
System.out.printf("Which police officers are in City Hall?: \n");
for (int i=0; i<Population.get(i).getName()) {
    if (Population.getAge()>40) 
    {
        System.out.printf(Population.getName());
        CurInCityHall.add(Population.getName());
    }
}
//to pay those persons who are employees


         }   

}
