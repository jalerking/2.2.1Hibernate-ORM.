package hiber.dao;

import hiber.model.Car;
import hiber.model.User;

import java.util.List;

public interface UserDao {

   void add(Car user);

   List<User> listUsers();

   List<Car> listCar();

   void add(User user);

   User findMyCar(String model, int series);



}
