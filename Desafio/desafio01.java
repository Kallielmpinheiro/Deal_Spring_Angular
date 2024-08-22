import java.util.Scanner;

public class EndpointValidator {
    public static String validateEndpoint(String endpoint) {
        String regex = "^/api/\\w+(/\\w+)*$";

        if (endpoint.matches(regex)) {
            return "Endpoint valido.";
        } else {
            return "Endpoint invalido.";
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String endpoint = scanner.nextLine();
        System.out.println(validateEndpoint(endpoint));
        scanner.close();
    }
}
