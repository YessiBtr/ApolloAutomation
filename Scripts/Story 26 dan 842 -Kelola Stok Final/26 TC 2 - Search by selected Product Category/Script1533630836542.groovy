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

'Search by selected Product Category'
Mobile.comment('Search by selected Product Category')

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

Mobile.comment('Search by selected Product Category')

'Wait until Product All Category DropDown present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_ShortTimeOut)

'Verify Element Product All Category DropDown has Attribute  content-desc  to do action  '
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), 'content-desc', 
    'choices-list-button', GlobalVariable.G_ShortTimeOut)

'Click Product All Category DropDown'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_Timeout)

'Wait until List Kategori - Elemen 2 present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 2'), GlobalVariable.G_ShortTimeOut)

'Verify Element List Kategori - Elemen 2 has Attribute  content-desc  to do action  '
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 2'), 'content-desc', 
    'choices-list-item-2', GlobalVariable.G_ShortTimeOut)

'Click List Kategori - Elemen 2'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 2'), GlobalVariable.G_ShortTimeOut)

/*
 * TC 3*/
'Make Condition To Check if it\'s have a product or not'
Mobile.comment('Jika produk ada dan tidak ada')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'If it\'s have a product'
if (Mobile.verifyElementVisible(findTestObject('Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)) {
    //Mobile.getAttribute(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'),"content-desc" , GlobalVariable.G_ShortTimeOut, FailureHandling.STOP_ON_FAILURE)
    'Wait until product present'
    Mobile.waitForElementPresent(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
        GlobalVariable.G_ShortTimeOut)

    'Verify element product'
    Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
        'content-desc', 'productListComponent_listItem_0', GlobalVariable.G_ShortTimeOut)

    System.out.println('Produk Ada')

    'Tap the product'
    Mobile.tap(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut)

    'Press back butoon to direct in produk screen'
    Mobile.pressBack( //masukin message error
        )
	'if it\'s haven\'t product'
} else {
    message = Mobile.getText(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/Belum ada produk - Error Message'), 
        GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)
	'verify message top up if product haven\t '
    Mobile.verifyEqual(message, 'Belum ada produk')

    System.out.println('Produk tidak ada')
}

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

