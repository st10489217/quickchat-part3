/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.quickchat;

import org.junit.Test;
import org.junit.Assert;
import org.junit.Before;
public class TestUnit {
    
   // ========== USERNAME TESTS ==========
    @org.junit.Test
    public void testCheckUserNameCorrect() {
        Assert.assertEquals(true, Login.checkUserName("kgl_1"));
    }
    
    @org.junit.Test
    public void testCheckUserNameIncorrect() {
        Assert.assertEquals(false, Login.checkUserName("kgutso!!!!!"));
    }
    
    // ========== PASSWORD TESTS ==========
    @org.junit.Test
    public void testCheckPasswordComplexityCorrect() {
        Assert.assertEquals(true, Login.checkPasswordComplexity("Ch&&sec@ke99!"));
    }
    
    @org.junit.Test
    public void testCheckPasswordComplexityIncorrect() {
        Assert.assertEquals(false, Login.checkPasswordComplexity("password"));
    }
    
    // ========== CELLPHONE TESTS ==========
    @org.junit.Test
    public void testCheckCellPhoneNumberCorrect() {
        Assert.assertEquals(true, Login.checkCellPhoneNumber("+27838968976"));
    }
    
    @org.junit.Test
    public void testCheckCellPhoneNumberIncorrect() {
        Assert.assertEquals(false, Login.checkCellPhoneNumber("08966553"));
    }
    
    // ========== REGISTER TEST ==========

    @org.junit.Test
    public void testRegisterUser() {
        String result = Login.registerUser("Yasmine", "kgl_1", "Ch&&sec@ke99!", "+27838968976", "Mfene");
        System.out.println("RESULT: " + result);
        Assert.assertEquals(true, result.contains("Welcome"));
    }
    
    // ========== LOGIN TESTS ==========
    @org.junit.Test
    public void testLoginUserCorrect() {
        Login.registerUser("Yasmine", "kgl_1", "Ch&&sec@ke99!", "+27838968976", "Mfene");
        Assert.assertEquals(true, Login.loginUser("kgl_1", "Ch&&sec@ke99!"));
    }
    
    @org.junit.Test
    public void testLoginUserIncorrect() {
        Login.registerUser("Yasmine", "kgl_1", "Ch&&sec@ke99!", "+27838968976", "Mfene");
        Assert.assertEquals(false, Login.loginUser("wrong", "wrong"));
    }
    
    // ========== LOGIN STATUS TESTS ==========
    @org.junit.Test
    public void testReturnLoginStatusSuccess() {
        Login.registerUser("Yasmine", "kgl_1", "Ch&&sec@ke99!", "+27838968976", "Mfene");
        String result = Login.returnLoginStatus(true);
        Assert.assertEquals(true, result.contains("Welcome"));
    }
    
    @org.junit.Test
    public void testReturnLoginStatusFailed() {
        String result = Login.returnLoginStatus(false);
        Assert.assertEquals(true, result.contains("failed"));
    }
}
