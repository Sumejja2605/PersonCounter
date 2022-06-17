public class Program {

    public static void main(String[] args) {

        String text = "John.Davidson/Belgrade Michael.Barton/Krakow Ivan.Perkinson/Moscow";
         Person[] persons= new Person[3];
         int personsCounter=0;

       String[] textDate = text.split("[ ./]");

        for (int i=0; i<textDate.length; i+=3){
            Person Person=new Person(textDate[i] , textDate[i+1] , textDate[i+2]);
              persons[personsCounter]= Person;
              personsCounter++;
        }

        for (Person person : persons) {
            System.out.println(person.getInfo());
        }
    }
}
