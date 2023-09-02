package Sem3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineShopUI {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter product ID: ");
            int productId = scanner.nextInt();
            System.out.print("Enter quantity: ");
            int quantity = scanner.nextInt();

            double totalPrice = ShopManager.purchaseProduct(productId, quantity);
            System.out.println("Total price: $" + totalPrice);
        } catch (ProductWasNotFound e){
            System.out.println("Товар не найден.");
            System.out.println(e.getMessage());
        } catch (AccsessDBExeption e){
            System.out.println("Нет доступа к базе данных.");
            System.out.println(e.getMessage());
        } catch (InputMismatchException e){
            System.out.println("Ошибка ввода чила.");
            System.out.println(e.getMessage());
        }
    }
}