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
import com.kms.katalon.core.testdata.DBData as DBData
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

'Call "apk" from Global Variabel\r\n'
def apkPath = GlobalVariable.apkName

'Start Application'
Mobile.startApplication(apkPath, true)

'Give delay for install "apk"'
Mobile.delay(GlobalVariable.G_LongTimeOut)

'Look at Comment Description!'

'If there is a Update TopuUp, click No, Else you can delay for waiting lazyload '

'If there is a Update TopuUp, click No, Else you can delay for waiting lazyload '
AppiumDriver<?> driver = MobileDriverFactory.getDriver()

'Function to call appium server to swipe to side\r\n'
TouchAction action = new TouchAction(driver)

'Call function swipe to side'
action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

action.longPress(550, 300).moveTo(100, 300).release().perform()

Mobile.delay(8)

'Wait until the swipe is done to do "Mulai" button'
Mobile.waitForElementPresent(findTestObject('Object Repository/Splash Screen/Mulai - Button'), 0)

'Tap "Mulai" Button'
Mobile.tap(findTestObject('Object Repository/Splash Screen/Mulai - Button'), 0)

'Look at Comment Input!'
Mobile.comment('end Welcome Screen')

'Look at Comment  Input!'
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

'Give delay for the Server to sent your PIN'
Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'End Login Test Case'
Mobile.comment('End Login Test Case')

'Look at Comment Input!'
Mobile.comment('PRODUCT')

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

'Give delay'
Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('DETAIL PRODUCT')

Mobile.comment('Mengecek Validasi')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'content-desc',
	'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)


Mobile.comment('KELOLA STOCK')

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

Mobile.comment('Search by spesific Produk')

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

Mobile.comment(' Search by inputed less then 3 digit')

'Wait until Produk page is present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

'Verify element Cari nama produk button has attribute content-desc to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'content-desc', 
    'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)

'SetText in Cari Produk - Parent '
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'ye', GlobalVariable.G_ShortTimeOut)

not_run: Mobile.hideKeyboard()

'Get top up message(yang di tampung dalam sebuah tampungan)'
ErMsg = Mobile.getText(findTestObject('Sidebar Menu/Produk/Stock View/Masukkan minimal 3 karakter - eror message'), GlobalVariable.G_ShortTimeOut)

'Verify top up message '
Mobile.verifyEqual(ErMsg, 'Masukkan minimal 3 karakter')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment(' Search by inputed 3 digit')

'Wait until Cari Produk TextBox is present '
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_ShortTimeOut)

'Verify Element Semua Kategori - Drop Down has Attribute  content-desc  to do action  '
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), 'content-desc', 
    'choices-list-button', GlobalVariable.G_ShortTimeOut)

'Click Semua Kategori - Drop Down'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Semua Kategori - Drop Down'), GlobalVariable.G_ShortTimeOut)

'Wait until Semua Kategori - Drop Down is present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), GlobalVariable.G_ShortTimeOut)

'Verify element first list category product has attribute content-desc to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), 'content-desc', 
    'choices-list-item-0', GlobalVariable.G_ShortTimeOut)

'Tap the element in the first list category product'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/List Kategori - Elemen 0'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'Wait until the element in the first list category product is present'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

'Verify element cari nama produk button has aatribute content-desc to do action'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'content-desc', 
    'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)

'Set Test in the Cari nama produk button'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'cap', GlobalVariable.G_ShortTimeOut)

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

Mobile.comment('Check Paging')

//'Appium function to swipe'
//AppiumDriver<?> driver = MobileDriverFactory.getDriver()
//
//TouchAction action = new TouchAction(driver)
'Swipe to check paging'
for (def index : (0..3)) {
    action.longPress(50, 994).moveTo(50, 346).release().perform()

    Mobile.delay(5)
}

for (def index : (0..3)) {
    action.longPress(50, 346).moveTo(50, 994).release().perform()

    Mobile.delay(5)
}

Mobile.closeApplication()

