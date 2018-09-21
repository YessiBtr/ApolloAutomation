import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory as MobileDriverFactory
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
import io.appium.java_client.AppiumDriver as AppiumDriver
import io.appium.java_client.TouchAction as TouchAction

Mobile.comment('Drop down consist of product category')

'Start apps and than Login'
Mobile.comment('Start apps and than Login')

def apkPath = GlobalVariable.apkName

Mobile.startApplication(apkPath, false)

Mobile.delay(GlobalVariable.G_LongTimeOut)

'Wait until Nomor HP/Nama Pengguna Textbox present'
Mobile.waitForElementPresent(findTestObject('Login/Nomor HP  Nama Pengguna - Text Box'), GlobalVariable.G_ShortTimeOut)

'Verify Element Attribute Nomor HP/Nama Pengguna  with content-desc  to do action  '
Mobile.verifyElementAttributeValue(findTestObject('Login/Nomor HP  Nama Pengguna - Text Box'), 'content-desc', 'LoginNameTextInput', 
    GlobalVariable.G_ShortTimeOut)

'SetText to Nomor HP/Nama Pengguna Textbox'
Mobile.setText(findTestObject('Login/Nomor HP  Nama Pengguna - Text Box'), '08112233445567', GlobalVariable.G_ShortTimeOut)

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify Element Nomor HP/Nama Pengguna which has been you set  '
Mobile.verifyElementText(findTestObject('Login/Nomor HP  Nama Pengguna - Text Box'), '08112233445567')

'Wait until Masuk Button  present'
Mobile.waitForElementPresent(findTestObject('Login/Button Masuk'), GlobalVariable.G_ShortTimeOut)

'Verify Element Attribute Nomor HP/Nama Pengguna  with content-desc  to do action '
Mobile.verifyElementAttributeValue(findTestObject('Login/Button Masuk'), 'content-desc', 'LoginJumpNextBtn', GlobalVariable.G_ShortTimeOut)

'Click Masuk Button'
Mobile.tap(findTestObject('Login/Button Masuk'), GlobalVariable.G_ShortTimeOut)

'Wait until Input Pin Textbox  present'
Mobile.waitForElementPresent(findTestObject('Login/Input Pin'), GlobalVariable.G_ShortTimeOut)

'Verify Element Attribute Pin Textbox  with content-desc  to do action '
Mobile.verifyElementAttributeValue(findTestObject('Login/Input Pin'), 'content-desc', 'pinCircleFocus', GlobalVariable.G_ShortTimeOut)

'Click Input Pin TextBox'
Mobile.tap(findTestObject('Login/Input Pin'), GlobalVariable.G_ShortTimeOut)

'SetText to PIN Textbox'
Mobile.setText(findTestObject('Login/Input Pin'), '123456', GlobalVariable.G_ShortTimeOut)

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'End Login Test Case'
Mobile.comment('End Login Test Case')

'Wait until HamburgerButton on the Sidebar  present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/HamburgerButton'), GlobalVariable.G_ShortTimeOut)

'Verify Element HamburgerButton that have value content desc to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/HamburgerButton'), 'content-desc', 'headerBar_button_hamburgerMenu', 
    GlobalVariable.G_ShortTimeOut)

'Click Hamburger Button'
Mobile.tap(findTestObject('Sidebar Menu/HamburgerButton', [('variable') : 'Transaksi -Tab']), GlobalVariable.G_ShortTimeOut)

'Wait until Produk Button on the Sidebar  present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Produk'), GlobalVariable.G_ShortTimeOut)

'Verify Element Produk Button that have value content desc to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Produk'), 'content-desc', 'produkMenuItem', GlobalVariable.G_ShortTimeOut)

'Click Produk Button'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Produk'), GlobalVariable.G_ShortTimeOut)

'Verify Onboarding Produk screen if element is visible'
Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Produk/Text Header -  Produk'), GlobalVariable.G_ShortTimeOut)

'Wait until Product All Category DropDown present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_ShortTimeOut)

'Verify Element Product All Category DropDown has Attribute  content-desc  to do action  '
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), 'content-desc', 
    'choices-list-button', GlobalVariable.G_ShortTimeOut)

'Click Product All Category DropDown'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_Timeout)

/*Looping Drop Down*/
'Appium function to swipe'
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

TouchAction action = new TouchAction(driver)

for (def index : (0..2)) {
    action.longPress(50, 510).moveTo(150, 158).release().perform()

    Mobile.delay(5)
}

for (def index : (0..2)) {
    action.longPress(50, 158).moveTo(150, 510).release().perform()

    Mobile.delay(5)
}

'Wait until function swipe is present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), GlobalVariable.G_ShortTimeOut)

'Tap first element List Category product'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(5)

Mobile.closeApplication()

