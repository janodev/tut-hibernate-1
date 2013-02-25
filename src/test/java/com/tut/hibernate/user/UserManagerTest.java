package com.tut.hibernate.user;

import java.util.List;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;


public class UserManagerTest {

    private static Logger log = LogManager.getLogger(UserManagerTest.class);
    
    @Test
    public void testX() throws Exception {
        
        UserManager manager = new UserManager();
        
        log.debug("Create users");
        Long carolId = manager.create("Carol");
        Long nigellaId = manager.create("Nigella");
        
        log.debug("List users");
        List<User> users = manager.read();
        Assert.assertTrue(users.size()==2);
        
        log.debug("Update Carol");
        manager.update(carolId, "Carolina");
        
        log.debug("Delete Nigella");
        manager.delete(nigellaId);
        
        log.debug("List users");
        users = manager.read();
        Assert.assertTrue(users.size()==1);
    }

}
