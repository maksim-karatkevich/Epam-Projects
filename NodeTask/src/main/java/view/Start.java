package view;

import java.util.logging.Logger;


public class Start {
    // Инициализация логера
    private static final Logger log = Logger.getLogger(Start.class.getName());
    private static Start logic;

    public void doOrder(){
        // какае-то логика
        System.out.println("Заказ оформлен!");
        // логируем инфо
        log.info("Это информационное сообщение!");
        addToCart();
    }

    private void addToCart() {
        // добавление товара в корзину
        System.out.println("Товар добавлен в корзину");
        // логируем ошибку
    }

    public static void main(String[] args) {
        logic = new Start();
        logic.doOrder();
    }
}
