package ObjectOriented;

public class Coupling {
  public void navigate(String address) {
    String ip = findIpAddress(address);
    String html = sendHttpRequest(ip);
    System.out.println(html);
  }

  public String findIpAddress(String address) {
    return "127.0.0.1";
  }

  public String sendHttpRequest(String ip) {
    return "<html></html>";
  }
}
