package com.atashgah.dao;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        UserDao userDao=new UserDaoImpl();

        userDao.deleteUser(userDao.getUserById(1));
        
        userDao.saveUser(new User(4,"arif","abc"));
        
        for(User user:userDao.getAllUsers()) {
        	System.out.println(user.getId()+" "+user.getName()+" "+user.getPassword());
        }
        
        
    }
}
