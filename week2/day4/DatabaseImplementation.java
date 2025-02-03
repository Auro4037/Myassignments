package week2.day4;

public class DatabaseImplementation implements DatabaseConnection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DatabaseImplementation di= new DatabaseImplementation();
		di.connect();
		di.disconnect();
		di.executeUpdate();

	}

	@Override
	public void connect() {
		// TODO Auto-generated method stub
		System.out.println("Database connnected");
		
	}

	@Override
	public void disconnect() {
		// TODO Auto-generated method stub
		System.out.println("Database Disconnected");
		
	}

	@Override
	public void executeUpdate() {
		// TODO Auto-generated method stub
		System.out.println("Database executed the update");
	}

}
