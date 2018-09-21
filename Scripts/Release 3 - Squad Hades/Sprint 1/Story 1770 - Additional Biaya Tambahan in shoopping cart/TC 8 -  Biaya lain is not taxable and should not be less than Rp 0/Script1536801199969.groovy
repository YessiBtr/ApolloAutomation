import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import org.junit.After as After
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
import io.appium.java_client.MobileDriver as MobileDriver
import io.appium.java_client.TouchAction as TouchAction

Mobile.comment('WELCOME SCREEN')

def apkPath = GlobalVariable.apkName

Mobile.startApplication(apkPath, true)

Mobile.delay(GlobalVariable.G_LongTimeOut)

'If there is a Update TopuUp, click No, Else you can delay for waiting lazyload '

'If there is a Update TopuUp, click No, Else you can delay for waiting lazyload '
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

TouchAction action = new TouchAction(driver)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

Mobile.waitForElementPresent(findTestObject('Object Repository/Splash Screen/Mulai - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Object Repository/Splash Screen/Mulai - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('end Welcome Screen')

Mobile.comment('LOGIN')

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

Mobile.comment('MESIN KASIR')

'Verify Element HamburgerButton that have value content desc to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/HamburgerButton'), 'content-desc', 'headerBar_button_hamburgerMenu', 
    GlobalVariable.G_ShortTimeOut)

'Click Hamburger Button'
Mobile.tap(findTestObject('Sidebar Menu/HamburgerButton', [('variable') : 'Transaksi -Tab']), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/Kasir'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/Kasir'), 'content-desc', 
    'drawerContainer_button_cashierSwitch', GlobalVariable.G_ShortTimeOut)

'Go to Mesin Kasir Menu'
Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/Kasir'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/ListProduk 1'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/ListProduk 1'), 'content-desc', 
    'productSalesItem0', GlobalVariable.G_ShortTimeOut)

'ADD PRODUCT to shopping cart'
for (def index : (0..1)) {
    'Go to Mesin Kasir Menu'
    Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/ListProduk 1'), GlobalVariable.G_ShortTimeOut)
}

for (def index : (0..1)) {
    Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/ListProduk 2'), GlobalVariable.G_ShortTimeOut)
}

'See shopping cart'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Estimasi Detail Pesanan/Keranjangbtn'), GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Estimasi Detail Pesanan/Keranjangbtn'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('Ringkasan Pesanan Onboarding')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Diskon Tambahan/Tambah_Diskon'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Diskon Tambahan/Tambah_Diskon'), 
    'content-desc', 'asubtotal_atext_additional_discount', GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Diskon Tambahan/Tambah_Diskon'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/Tambah_Biaya'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/Tambah_Biaya'), 
    'content-desc', 'asubtotal_abutton_additional_cost', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/Tambah_Biaya'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - JudulDropdown'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - JudulDropdown'), 
    'content-desc', 'additionalCost_icon_costType', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - JudulDropdown'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - JudulList3'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - JudulList3'), 
    'content-desc', 'additionalCost_text_costType_2', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - JudulList3'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaLainEdtTxt'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaLainEdtTxt'), 
    'content-desc', 'additionalCost_input_extraCostInfo', GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaLainEdtTxt'), 
    'Buble Wrap', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaEditTxt'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaEditTxt'), 
    'content-desc', 'additionalCost_input_costAmount', GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaEditTxt'), 
    '0', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - BiayaEditTxt'), 
    '0')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - SIMPANbtn'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - SIMPANbtn'), 
    'content-desc', 'additionalCost_button_saveCost', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/TambahBiaya - SIMPANbtn'), GlobalVariable.G_ShortTimeOut)

ErMsg = Mobile.getText(findTestObject('Sidebar Menu/Kasir/Kasir/Ringkasan Pesanan/Biaya Tambahan/ErMsg-BiayaHarus lebih dari Rp 0'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(ErMsg, 'Harus lebih dari Rp 0')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()
