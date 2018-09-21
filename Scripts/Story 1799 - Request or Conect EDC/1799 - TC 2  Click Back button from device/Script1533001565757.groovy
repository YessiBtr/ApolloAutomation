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

not_run: def apkPath = GlobalVariable.apkName

not_run: Mobile.startApplication(apkPath, true)

not_run: Mobile.delay(GlobalVariable.G_LongTimeOut)

WebUI.callTestCase(findTestCase('Smoked Test/Release 2/Story 679 - Welcome Screen/679 TC - Welcome Screen'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.delay(GlobalVariable.G_LongTimeOut)

//Case Login
Mobile.waitForElementPresent(findTestObject('Object Repository/Login/Nomor HP  Nama Pengguna - Text Box'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Login/Nomor HP  Nama Pengguna - Text Box'), 'content-desc', 
    'LoginNameTextInput', GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Object Repository/Login/Nomor HP  Nama Pengguna - Text Box'), '08112233445567', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Object Repository/Login/Nomor HP  Nama Pengguna - Text Box'), '08112233445567')

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Login/Button Masuk'), 'content-desc', 'LoginJumpNextBtn', 
    GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Object Repository/Login/Button Masuk'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Object Repository/Login/Input Pin'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Login/Input Pin'), 'content-desc', 'pinCircleFocus', 
    GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Object Repository/Login/Input Pin'), '123456', GlobalVariable.G_ShortTimeOut)

Mobile.delay(0, FailureHandling.STOP_ON_FAILURE)

/*Login end*/
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/HamburgerButton'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/HamburgerButton'), 'content-desc', 
    'headerBar_button_hamburgerMenu', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/HamburgerButton'), GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sidebar Menu/Pengaturan Toko/Pengaturan Toko'), 'content-desc', 
    'aturTokoMenuItem', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Object Repository/Sidebar Menu/Pengaturan Toko/Pengaturan Toko'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementVisible(findTestObject('Object Repository/Sidebar Menu/Pengaturan Toko/EDC'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sidebar Menu/Pengaturan Toko/EDC'), 'content-desc', 
    'tokoListScreen_button_edc', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Pengaturan Toko/EDC'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Pengaturan Toko/EDC Menu/unduh_form_permintaan'), 'content-desc', 
    '', GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Pengaturan Toko/EDC Menu/unduh_form_permintaan'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Pengaturan Toko/EDC Menu/hubungkan_mesin_edc'), 'content-desc', 
    '', GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Pengaturan Toko/EDC Menu/hubungkan_mesin_edc'), GlobalVariable.G_ShortTimeOut)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Pengaturan Toko/pengaturan_toko_screen'), 0)

Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Pengaturan Toko/pengaturan_toko_screen'), 0)

Mobile.closeApplication()

