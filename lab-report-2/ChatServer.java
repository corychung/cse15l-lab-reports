import java.io.IOException;
import java.net.URI;
import java.util.ArrayList;

class Handler implements URLHandler {
    // The one bit of state on the server: a number that will be manipulated by
    // various requests.
    int num = 0;
    public ArrayList<String> chatHistory = new ArrayList<String>();
    public String handleRequest(URI url) {
        if (url.getPath().contains("/add-message")) {
            String[] splitUserAndMessage = url.getQuery().split("&");
            String[] msgString = splitUserAndMessage[0].split("=");
            String[] userString = splitUserAndMessage[1].split("=");
            if (msgString[0].equals("s") && userString[0].equals("user")) {
                chatHistory.add(userString[1] + ": " + msgString[1]);
            }
        }
        String toPrint = "";
        for (int i = 0; i < chatHistory.size(); i++) {
            toPrint += "\n"+ chatHistory.get(i);
        }
        return toPrint;
    }
}

class ChatServer {
    public static void main(String[] args) throws IOException {
        if(args.length == 0){
            System.out.println("Missing port number! Try any number between 1024 to 49151");
            return;
        }

        int port = Integer.parseInt(args[0]);

        Server.start(port, new Handler());
    }
}
