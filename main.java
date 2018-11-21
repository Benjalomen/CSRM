import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String c = "Server";
		String m = "Test1";
		Class[] p = null;
		
		Server s = new Server();
				
		try {
			Class classname = Class.forName(c);
			
			Method method = classname.getDeclaredMethod(m, p);
			method.invoke(s, null);
			
		} catch (ClassNotFoundException | NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
