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

Mobile.comment('Increase or decrease product stock')

'Start Login Test Case'
Mobile.comment('Start Login Test Case')

def apkPath = GlobalVariable.apkName

Mobile.startApplication(apkPath, false)

Mobile.delay(GlobalVariable.G_LongTimeOut)

'If there is a Update TopuUp, click No, Else you can delay for waiting lazyload '


//if (Mobile.verifyElementVisible(findTestObject('Login/popUpUpdate'), GlobalVariable.G_ShortTimeOut) == true) {
//    Mobile.tap(findTestObject('Login/noPopUpUpdate'), GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)
//
//    System.out.println('Don\'t Update')
//} else {
//    Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)
//}
//
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

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Tambah Barang Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Tambah Barang Button'), 'content-desc', 
    'productListComponent_button_addProduct', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Tambah Barang Button'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

for (def index : (0..10)) {
    Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/PlusTap - JumlaH Stock'), GlobalVariable.G_ShortTimeOut)

    Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/PlusTap - JumlaH Stock'), 'content-desc', 
        'action_plus_anumberpicker', GlobalVariable.G_ShortTimeOut)

    Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/PlusTap - JumlaH Stock'), 5)
}

for (def index : (0..5)) {
    Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Minus Tap - Jumlah Stock'), GlobalVariable.G_ShortTimeOut)

    Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Minus Tap - Jumlah Stock'), 'content-desc', 
        'action_minus_anumberpicker', GlobalVariable.G_ShortTimeOut)

    Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Minus Tap - Jumlah Stock'), 5)
}

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

