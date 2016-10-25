package test;
/**
 * Created by yinxu on 2016/10/23.
 */

import junit.framework.*;
import bean.PrimePrint;
import org.junit.*;
import org.junit.Assert;

public class test extends TestCase {
    @org.junit.Test
            public void test(){
        PrimePrint primePrint=new PrimePrint();
        Assert.assertEquals(false, primePrint.isPrime(45));
    }
}