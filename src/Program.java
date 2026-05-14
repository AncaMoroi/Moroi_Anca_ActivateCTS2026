import ChainOfResponsability.clase.*;


public class Program {
    public static void main(String[] args) {


//        //Facade
//        Facade hotelFacade = new Facade();
//        hotelFacade.checkIn("Andrei Popescu", "204");
//
//        //Decorator
//        ICoffe c1 = new BasicCoffe(10, 200);
//        c1.prepare();
//
//        ICoffe c2 = new Milk(new BasicCoffe(10,200));
//        c2.prepare();
//
//        ICoffe c3 = new SugarDecorator(new BasicCoffe(10, 200));
//        c3.prepare();
//
//        ItemComponent espresso = new ProdusLeaf("Espresso", 10);
//        ItemComponent cappuccino = new ProdusLeaf("Cappuccino", 15);
//        ItemComponent latte = new ProdusLeaf("Latte", 18);
//        CategorieComposite bauturi = new CategorieComposite("Bauturi");
//        CategorieComposite cafele = new CategorieComposite("Cafele");
//
//        cafele.adauga(espresso);
//        cafele.adauga(cappuccino);
//
//        CategorieComposite meniu = new CategorieComposite("Meniu Coffee Shop");
//        meniu.adauga(bauturi);
//        meniu.adauga(cafele);
//
//        meniu.afisare();


//        //proxy
//        CoffeObjProxy cappucino = new CoffeObjProxy("Espresso", 12);
//
//        CoffeObjProxy luxuryCoffee = new CoffeObjProxy("Golden Coffee", 50);
//
//        CoffeService coffeeShop = new Proxy();
//
//        coffeeShop.serverCoffee(cappucino);
//
//
//        coffeeShop.serverCoffee(luxuryCoffee);


        /// Comand
/*        ChefReceiver chef = new ChefReceiver();

        OrderCommand pizzaOrder = new PizzaCommand(chef);

        OrderCommand pasta = new PastaCommand(chef);

        ChelnerInvoker chelner = new ChelnerInvoker();

        chelner.setOrderCommand(pizzaOrder);
        chelner.placeOrder();

        chelner.setOrderCommand(pasta);
        chelner.placeOrder();

        CoffeInterface coffee = new BasicCoffeE("Espresso", 10);
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());
        coffee = new LapteDecorator(coffee);
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());
        coffee = new FriscaDecorator(coffee);
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());
        coffee =  new ZaharDecorator((coffee));
        System.out.println("Descriere: " + coffee.getDescription());
        System.out.println("Pret: " + coffee.getPrice());

        coffee.prepare();*/


//        OrderService manager = new OrderServiceProxy3("manager");
//
//        manager.viewOrders();
//        manager.deleteOrder();
//
//
//        OrderService ospatar = new OrderServiceProxy3("ospatar");
//
//        ospatar.viewOrders();
//        ospatar.deleteOrder();
//
//    }

//        MetodaPlataVeche bank = new MetodaPlataVeche();
//        PaymentProcessor procesor = new BankAdapter(bank);
//        procesor.pay(250.0);

//        Facade facade = new Facade();
//       // facade.getInventory().addStock(20);
//        facade.placeOrder("Pizza", 5, 120);


        Order order = new Order("Burger", false, true);


        OrderHandler stock = new StockHandler();
        OrderHandler payment = new PaymentHandler();
        OrderHandler kitchen = new KitchenHandler();

        stock.setNext(payment);
        payment.setNext(kitchen);

        stock.handle(order);

    }
}