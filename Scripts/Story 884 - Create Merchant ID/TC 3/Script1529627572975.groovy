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

Mobile.comment('Nama toko less than 3')

Mobile.comment('Input Nama Toko')

Mobile.waitForElementPresent(findTestObject('Create Toko/Nama Toko - EditText'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Create Toko/Nama Toko - EditText'), 'content-desc', 'StoreNameTextInput', 
    GlobalVariable.G_Timeout)

Mobile.setText(findTestObject('Create Toko/Nama Toko - EditText'), 'ab', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Create Toko/Nama Toko - EditText'), 'ab')

Mobile.waitForElementPresent(findTestObject('Create Toko/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Create Toko/Simpan Button'), 'content-desc', 'dialogPrimaryBtn', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Create Toko/Simpan Button'), GlobalVariable.G_ShortTimeOut)

ErMsg = Mobile.getText(findTestObject('Create Toko/EMsgNamaToko - Minimal 3 karakter'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(ErMsg, 'Minimal 3 karakter')

