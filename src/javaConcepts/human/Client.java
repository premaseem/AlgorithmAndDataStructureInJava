package javaConcepts.human;

/**
 * Created by asee2278 on 1/28/17.
 */
public class Client {

    public static void main(String[] args) {

    Person premAseem = new Person();

        premAseem.setName(" premaseem ");
        premAseem.setAge(500);

        premAseem.eat(" vegetarian - salad");
        premAseem.personDeatils();

        GenderFemale sphoorti = new GenderFemale();
        sphoorti.eat("fish ");
        sphoorti.setAge(21);
        sphoorti.setName("spoorthi");
        sphoorti.personDeatils();

        GenderMale naren = new GenderMale();
        naren.eat(" veg ");
        naren.setAge(20);
        naren.setName("naren");
        naren.personDeatils();

    }





}
