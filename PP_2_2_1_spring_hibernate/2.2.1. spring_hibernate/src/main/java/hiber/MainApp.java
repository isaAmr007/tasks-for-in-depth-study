package hiber;

import hiber.config.AppConfig;
import hiber.model.Car;
import hiber.model.User;
import hiber.service.UserService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;
import java.util.List;

public class MainApp {
   public static void main(String[] args) throws SQLException {
      AnnotationConfigApplicationContext context = 
            new AnnotationConfigApplicationContext(AppConfig.class);

      UserService userService = context.getBean(UserService.class);
      User pushkin = new User("Alexandr", "Pushkin", "alexandr@mail.ru");
      User lermontov = new User("Mikhail", "Lermontov", "mikhail@mail.ru");
      User tolstoy = new User("Lev", "Tolstoy", "lev@mail.ru");
      User esenin = new User("Sergey", "Esenin", "sergey@mail.ru");

     Car lexus = new Car("lexus", 570);
     Car toyota = new Car("toyota", 200);
     Car bmw = new Car("bmw", 540);
     Car volvo = new Car("volvo", 9);

     
     userService.add(pushkin.setCar(lexus));
     userService.add(lermontov.setCar(toyota));
     userService.add(tolstoy.setCar(bmw));
     userService.add(esenin.setCar(volvo));

     System.out.println(userService.getUserByCar("lexus", 570));




      List<User> users = userService.listUsers();
      for (User user : users) {
         System.out.println("Id = "+user.getId());
         System.out.println("First Name = "+user.getFirstName());
         System.out.println("Last Name = "+user.getLastName());
         System.out.println("Email = "+user.getEmail());
         System.out.println();
      }

      context.close();
   }
}
