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

'Search by specific product'
Mobile.comment('Search by specific product')

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

'Wait until Semua Kategori - Drop Down present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_ShortTimeOut)

'Verify Element Semua Kategori - Drop Down has Attribute  content-desc  to do action '
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), 'content-desc', 
    'choices-list-button', GlobalVariable.G_ShortTimeOut)

'Click Semua Kategori - Drop Down on the Produk Page'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_ShortTimeOut)

'Wait until first element List Category present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), GlobalVariable.G_ShortTimeOut)

'Verify first element List Category has Attribute  content-desc  to do action '
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), 'content-desc', 
    'choices-list-item-0', GlobalVariable.G_ShortTimeOut)

'Click first element List Category on the Produk Page'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), GlobalVariable.G_ShortTimeOut)

'Wait until Cari nama produk button present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

'Verify Cari nama produk button has Attribute  content-desc  to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'content-desc', 
    'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)

'Set Text in Cari nama produk button'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'indomie', GlobalVariable.G_ShortTimeOut)

'Verify Element Text what you set'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'indomie')

'Make a condition if the element that u search be there or not'
Mobile.comment('Jika produk ada dan tidak ada')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'if the element you are looking for is there'
if (Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)) {
    'Wait until Produk is present'
    Mobile.waitForElementPresent(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
        GlobalVariable.G_ShortTimeOut)

    'Verify Produk has Attribute  content-desc  to do action'
    Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
        'content-desc', 'productListComponent_listItem_0', GlobalVariable.G_ShortTimeOut)

    'Tap the first product'
    Mobile.tap(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut)

    'Wait until Ubah Info Button is present'
    Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), GlobalVariable.G_ShortTimeOut)

    Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

    'PressBack behaviour device'
    Mobile.pressBack()

    System.out.println('Produk Ada')

    'if the element you are looking for is not there'
} else {
    message = Mobile.getText(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/Belum ada produk - Error Message'), 
        GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

    'Verify top up message, if the element you are looking for is not there'
    Mobile.verifyEqual(message, 'Belum ada produk')

    System.out.println('Produk tidak ada')
}

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

