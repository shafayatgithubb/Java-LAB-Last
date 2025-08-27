class NorthEnd
{
    static Coffee makeCoffee(String order)
    {
        if(order == "Latte") return new Latte();

        if(order == "Cappuchino") return new Cappuchino();

        if(order == "Mocha") return new Mocha();

        return null;
    }
}

class Coffee
{
    void drink()
    {
        System.out.println("Drinking Coffee");
    }
}

class Mocha extends Coffee
{
    void drink()
    {
        System.out.println("Drinking Mocha");
    }
}

class Cappuchino extends Coffee
{
    void drink()
    {
        System.out.println("Drinking Cappuchino");
    }
}

class Latte extends Coffee
{
    void drink()
    {
        System.out.println("Drinking Latte");
    }
}


public class SubClassPolymorphism {

    public static void main(String[] args) {

        Coffee c1 = NorthEnd.makeCoffee("Latte");
        c1.drink();

        Coffee c2 = NorthEnd.makeCoffee("Mocha");
        c2.drink();
    }
}


/*
Parent er reff diye child obj banano
ParentReff name = new Child()

1. Only Parent
2. Common(overridden)---> parent eo ase child eo ase
3. Only Child.

suppose parent Animal and child dog
Animal a1 = new dog();
for overriding:
1. Only parents paabe
2. Overriding things pabe (jeta child er gula call dibe)
3. Only childs pabena ===> pawar jonno typecasting.


//Typecasting
((ChildName)parentReff).calling function---> only child call paabe --->> korar main reason hocche amader child er attributes amra
subclass polymorphism theke paina. pawar jonno typecasting kora lage.
 */
