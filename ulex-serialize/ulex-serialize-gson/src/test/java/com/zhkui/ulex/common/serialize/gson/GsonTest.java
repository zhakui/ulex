package com.zhkui.ulex.common.serialize.gson;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import com.google.gson.internal.LinkedTreeMap;
import com.zhkui.ulex.common.serialize.ObjectInput;
import com.zhkui.ulex.common.serialize.ObjectOutput;
import com.zhkui.ulex.common.serialize.Serialization;

import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;

/**
 * Unit test for simple App.
 */
public class GsonTest extends TestCase {

    Serialization gsonSerialization = new GsonSerialization();
    User user = new User("张三",16);

    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    public GsonTest(String testName) {
        super(testName);
    }

    /**
     * @return the suite of tests being tested
     */
    public static Test suite() {
        return new TestSuite(GsonTest.class);
    }

    /**
     * Rigourous Test :-)
     */
    public void testSerialize() {
        OutputStream outputStream;
        try {
            outputStream = new FileOutputStream("/home/xavier/privateSpace/ulex/ulex-serialize/ulex-serialize-gson/src/test/resource/user.txt");
            ObjectOutput objectOutput = gsonSerialization.serialize(outputStream);
            objectOutput.writeObject(user);
            assertTrue(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        
    }

    public void testdeserialize() {
        InputStream inputStream;
        try {
            inputStream = new FileInputStream("/home/xavier/privateSpace/ulex/ulex-serialize/ulex-serialize-gson/src/test/resource/user.txt");
            ObjectInput objectinput = gsonSerialization.deserialize(inputStream);

            // LinkedTreeMap<String,> object  = (LinkedTreeMap<String,String>)objectinput.readObject();
            
            // System.out.println(object.get("age"));
            assertTrue(true);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
