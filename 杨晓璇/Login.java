package cases;

import base.Assertion;
import base.InitAppium;
import operation.LoginOperate;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;



public class Login extends InitAppium {

    private LoginOperate loginOperate;


    @BeforeClass
    public void initDriver(){
        Assert.assertNotNull(driver);

    }

    /**
     * �����ʺŶ�Ӧ���������
     */
    @Test(priority = 0)
    public void login1(){
    	boolean flag = loginOperate.login("http://192.168.80.129:11443","aaa","123321");
    	Assertion.verifyEquals(flag,true,"�ʺ������ʽ�����Ƿ��¼�ɹ�");
    }

    /**
     * �����ʺ����볤�ȹ���
     */
    @Test(priority = 1)
    public void login2(){
        boolean flag = loginOperate.login("http://192.168.80.129:11443","123456789qazwsxedcrfvtgbyhnujmikqwertyuioasdfghjkl","74128529638596564645656");
        Assertion.verifyEquals(flag,true,"�ʺ������ʽ�����Ƿ��¼�ɹ�");
    }
    /**
     * �����ʺ����볤�ȹ���
     */
    @Test(priority = 2)
    public void login3(){
        boolean flag = loginOperate.login("http://192.168.80.129:11443","l","1");
        Assertion.verifyEquals(flag,true,"�ʺ������ʽ�����Ƿ��¼�ɹ�");
    }

    /**
     * �����ʺ�����Ϊ�������
     */
    @Test(priority = 3)
    public void login4(){
        boolean flag = loginOperate.login("http://192.168.80:11443","�ʺ�","����");
        Assertion.verifyEquals(flag,true,"�ʺ�����Ϊ�����Ƿ��¼�ɹ�");
    }



    /**
     * �����ʺ�����Ϊ�����
     */
    @Test(priority = 4)
    public void login5(){
        boolean flag = loginOperate.login("http://192.168.80:11443","","");
        Assertion.verifyEquals(flag,true,"�ʺ�����Ϊ���Ƿ��¼�ɹ�");
    }


    /**
     * ���Է������ʺ�������ȷ���
     */
    @Test(priority = 5)
    public void login6() {
        boolean flag = loginOperate.login("http://192.168.80:11443","aaa","123456");
        Assert.assertTrue(flag,"�ʺ�����Ե������¼");
    }
    /**
     * �����ʺŲ�����
     */
    @Test(priority = 6)
    public void login7() {
        boolean flag = loginOperate.login("http://192.168.80:11443","zzz","123456");
        Assert.assertTrue(flag,"�ʺ�����Ե������¼");
    }
    
    /**
     * ���Է���������
     */
    @Test(priority = 7)
    public void login8() {
        boolean flag = loginOperate.login("http://192.168.80:11111","aaa","123456");
        Assert.assertTrue(flag,"�ʺ�����Ե������¼");
    }
    
    /**
     * ���Է�����Ϊ��
     */
    @Test(priority = 8)
    public void login9() {
        boolean flag = loginOperate.login("","aaa","123456");
        Assert.assertTrue(flag,"�ʺ�����Ե������¼");
    }
    
    /**
     * ���Է���������Ϊ����
     */
    @Test(priority = 9)
    public void login10(){
        boolean flag = loginOperate.login("������","aaa","123456");
        Assertion.verifyEquals(flag,true,"�ʺ�����Ϊ���Ƿ��¼�ɹ�");
    }
}