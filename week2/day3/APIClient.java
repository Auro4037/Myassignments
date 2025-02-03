package week2.day3;

public class APIClient {
	
	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		if (requestStatus) {
			System.out.println("Request status is successful" + requestStatus);
		}
		else {

			System.out.println("Request status is unsuccessful " + requestStatus);
		}
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		APIClient ac= new APIClient();
		ac.sendRequest("IOT", "JSON Format", false);

	}

}
