package section_19.main.application;

import java.util.Map;
import java.util.TreeMap;

public class Program {

    public static void main(String[] args) {
        Map<String, String> cookies = new TreeMap<>();

        cookies.put("username", "Maria");
        cookies.put("email", "maria@gmail.com");
        cookies.put("phone", "997111122");

        cookies.remove("email");
        cookies.put("phone", "997111133"); // sobscreve o valor anterior

        System.out.println("Contains 'phone' key: " + cookies.containsKey("phone")); // true
        System.out.println("Phone number: " + cookies.get("phone")); // 997111133
        System.out.println("Email: " + cookies.get("email")); // null
        System.out.println("Size: " + cookies.size()); // 2

        System.out.println("ALL COOKIES: ");

        for (String key : cookies.keySet()) {
            System.out.println(key + ": " + cookies.get(key));
        }
    }
}
