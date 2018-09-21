import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.comment('Nama toko Mandatory')

Mobile.comment('Input Nama Pemilik')

Mobile.waitForElementPresent(findTestObject('Create Toko/Nama Pemilik - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Create Toko/Nama Pemilik - EditText'), 'content-desc', 'OwnerNameTextInput', 
    GlobalVariable.G_ShortTimeOut)

String NamaPemilik = CustomKeywords.'newpackage.allkeyword.randomname'()

Mobile.setText(findTestObject('Create Toko/Nama Pemilik - EditText'), NamaPemilik, GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyEqual(NamaPemilik, NamaPemilik)

Mobile.comment('Input Email')

Mobile.waitForElementPresent(findTestObject('Create Toko/Email - TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Create Toko/Email - TextBox'), 'content-desc', 'EmailOwnerNameTextInput', 
    GlobalVariable.G_ShortTimeOut)

String Email = CustomKeywords.'newpackage.allkeyword.randomemail'()

Mobile.setText(findTestObject('Create Toko/Email - TextBox'), Email, GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyEqual(Email, Email)

Mobile.waitForElementPresent(findTestObject('Create Toko/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Create Toko/Simpan Button'), 'content-desc', 'dialogPrimaryBtn', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Create Toko/Simpan Button'), GlobalVariable.G_ShortTimeOut)

ErMsg = Mobile.getText(findTestObject('Create Toko/NamaTokoErMsg - Mohon diisi'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(ErMsg, 'Mohon diisi')

