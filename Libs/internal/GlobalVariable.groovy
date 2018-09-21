package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object batch
     
    /**
     * <p></p>
     */
    public static Object apkName
     
    /**
     * <p></p>
     */
    public static Object G_Timeout
     
    /**
     * <p></p>
     */
    public static Object G_ShortTimeOut
     
    /**
     * <p></p>
     */
    public static Object G_LongTimeOut
     
    /**
     * <p></p>
     */
    public static Object G_Notification
     
    /**
     * <p></p>
     */
    public static Object NamaProduct
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['batch' : 'MoveAPK', 'apkName' : '21 September 2018 pagi.apk', 'G_Timeout' : 10, 'G_ShortTimeOut' : 5, 'G_LongTimeOut' : 15, 'G_Notification' : 'Your message has been sent. View message', 'NamaProduct' : ''])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        batch = selectedVariables['batch']
        apkName = selectedVariables['apkName']
        G_Timeout = selectedVariables['G_Timeout']
        G_ShortTimeOut = selectedVariables['G_ShortTimeOut']
        G_LongTimeOut = selectedVariables['G_LongTimeOut']
        G_Notification = selectedVariables['G_Notification']
        NamaProduct = selectedVariables['NamaProduct']
        
    }
}
