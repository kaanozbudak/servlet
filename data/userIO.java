package data;

import java.io.FileWriter; 

public class userIO
{
	public static void write(business.user user1,String path) throws java.io.IOException
	{
		FileWriter fw= new FileWriter(path, true);
		fw.write(user1.getName() + "--->" + user1.getEmail()+"\n");
		fw.close();
	}
	
}