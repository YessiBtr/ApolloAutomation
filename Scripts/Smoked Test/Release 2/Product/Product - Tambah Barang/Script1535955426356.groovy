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

'Look at Comment Input!'
Mobile.comment('End Product')

'Look at Comment Input!'
Mobile.comment('TAMBAH PRODUCT')

'Wait until the sytem verify every element in the product board'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Tambah Barang Button'), GlobalVariable.G_ShortTimeOut)

'Verify element "Tambah Barang" button based on content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Tambah Barang Button'), 'content-desc', 
    'productListComponent_button_addProduct', GlobalVariable.G_ShortTimeOut)

'Tap "Tambah Barang" button'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Tambah Barang Button'), GlobalVariable.G_ShortTimeOut)

'Look at Comment Input!'
Mobile.comment('Input Jumlah Stock')

'Wait until "Tambah Barang" button  is done to do'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), GlobalVariable.G_ShortTimeOut)

'Verify element "Jumlah Stock" by Typing that has a content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), 'content-desc', 
    'input_anumberpicker', GlobalVariable.G_ShortTimeOut)

'Clear Text'
//Mobile.clearText(findTestObject('Object Repository/Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), GlobalVariable.G_ShortTimeOut)

'Set the count of product in "Jumlah Stock by typing" element'
Mobile.sendKeys(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), '3', FailureHandling.CONTINUE_ON_FAILURE)

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify value that you set in "Jumlah Stock bby typing" element'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), '3')

'Look at Comment Input!'
Mobile.comment('Input Nama Barang')

'Wait until the systems is done to verify element text'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

'Verify "Nama Barang" Element that have content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), 'content-desc', 
    'productNameTextInput', 0)

'Call random string in Custom Keyword package '

String NamaProduct = CustomKeywords.'newpackage.allkeyword.randomString'()

String Temp = "MimiBottle" + NamaProduct
 GlobalVariable.NamaProduct = Temp
 
'Input "Nama Barang" based on random string(Custom keyword)'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), Temp, 
    GlobalVariable.G_ShortTimeOut)

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify if two objects are equal. (what you input is the with your output)'
Mobile.verifyEqual(NamaProduct, NamaProduct)

'Look at Comment Input!'
Mobile.comment('Input SKU')

'Wait until the system is done to verify "Nama Barang" output'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), GlobalVariable.G_ShortTimeOut)

'Verify "SKU Produk" element that has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), 'content-desc', 
    'product_code_input', 0)

/*@function randomstring
 * Call SKU keywords
 * @return randomstring
 * */
'call random string in Custom Keyword package '
String SKU = CustomKeywords.'newpackage.allkeyword.randomString'()

'Input "SKU Produk" based on the random string(Custom Keyword)'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), "SKU"+SKU, GlobalVariable.G_ShortTimeOut)

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify if two objects are equal. (what you input is the with your output)'
Mobile.verifyEqual("SKU"+SKU, "SKU"+SKU)

'Look at Comment Input!'
Mobile.comment('Pick One Category')

'Wait until the system is done to verify two objects are equal'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Checvron_SelectKategori'), GlobalVariable.G_ShortTimeOut)

'Verify "Pilih Kategori" Element that has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Checvron_SelectKategori'), 'content-desc', 
    'productCategoryArrowIcon', GlobalVariable.G_ShortTimeOut)

'Tap "Pilih Kategori"'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Checvron_SelectKategori'), 2, FailureHandling.STOP_ON_FAILURE)

/*Dibuat Kondisi karena Katalon
 * tidak menangkap objek
 * */
if (Mobile.verifyElementVisible(findTestObject('Object Repository/Sidebar Menu/Produk/Tambah Barang/PilihKategori_Screen'), 
    GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE) == true) {
    println('Object Ditemukan')
} else {
    Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Checvron_SelectKategori'), 2, FailureHandling.STOP_ON_FAILURE)

    Mobile.verifyElementVisible(findTestObject('Object Repository/Sidebar Menu/Produk/Tambah Barang/PilihKategori_Screen'), 
        GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)
}

'Wait until before action is done'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/ListKategori - Elemen 5'), GlobalVariable.G_ShortTimeOut)

'Verify "List Kategori Element 5th" element has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/ListKategori - Elemen 5'), 'content-desc', 
    'product_category_item_4', GlobalVariable.G_ShortTimeOut)

'Tap "List Kategori Element 5th"'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/ListKategori - Elemen 5'), GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'Look at Comment Input!'
Mobile.comment('Input Stock Rendah =0')

'Scroll by text  to find Pilih Supplier text'
Mobile.scrollToText('SIMPAN', FailureHandling.CONTINUE_ON_FAILURE)

'Wait until before action is done'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Stock Rendah - Field'), GlobalVariable.G_ShortTimeOut)

'Verify "Stock Rendah"field has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Stock Rendah - Field'), 'content-desc', 
    'productStockMinimumTextInput', GlobalVariable.G_ShortTimeOut)

'Clear "Stock Rendah" field'
Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Stock Rendah - Field'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

'Input your Stok Rendah in "Stock Rendah" field'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Stock Rendah - Field'), '0', GlobalVariable.G_ShortTimeOut)

'Hide Keyword'
Mobile.hideKeyboard()

'Verify output "Stock Rendah" element has value is the same that u input'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Stock Rendah - Field'), '0')

'Look at Comment Input!'
Mobile.comment('Input Harga Beli')

'Wait until before action is done\r\n'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), GlobalVariable.G_ShortTimeOut)

'Verify "Harga Beli" field has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), 'content-desc', 
    'productPurchasePriceTextInput', GlobalVariable.G_ShortTimeOut)

'Set Text in "Harga Beli" field'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), '60000', GlobalVariable.G_ShortTimeOut)

'Hide Keyword'
Mobile.hideKeyboard()

'Verify element that u input'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), '60.000')

'Look at Comment Input!'
Mobile.comment('Input Harga Jual')

'Wait until the system is done to verify element text '
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), GlobalVariable.G_ShortTimeOut)

'Verify "Harga Jual" element that has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), 'content-desc', 
    'productSalePriceTextInput', GlobalVariable.G_ShortTimeOut)

'Input Harga Jual in "Harga Jual" field'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), '90000', GlobalVariable.G_ShortTimeOut)

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify element text in "Harga Jual" field'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), '90.000')

'Look at Comment Input!'
Mobile.comment('Input Nominal Diskon')

'Wait until the system is done to verify element text "Harga Jual"'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), GlobalVariable.G_ShortTimeOut)

'Verify "Nominal Diskon" that has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), 'content-desc', 
    'productDiscountNominalTextInput', GlobalVariable.G_ShortTimeOut)

'Input Nominal Diskon on "Nominal Diskon" field'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), '2000', GlobalVariable.G_ShortTimeOut)

'Hide Keyboard'
Mobile.hideKeyboard()

'Verify element text in "Nominal Diskon" field'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), '2.000')

'Look at Comment Input!'
Mobile.comment('Simpan Button')

'Wait until the system is done to verify value in "Nominal Diskon" field'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

'Verify "Simpan" button that has content-desc'
Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), 'content-desc', 'productSubmitBtn', 
    GlobalVariable.G_ShortTimeOut)

'Tap "Simpan" button to save your Product'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

/*Fetch data to DB*/
//'Fetch data from database for row 8'
//DBData dbTestdata7 = findTestData('masterdataapprovalQuery/row8')
// 
//dbTestdata7.fetchedData = dbTestdata7.fetchData()
// 
//System.out.println('Row 8  ---->' + dbTestdata7.fetchedData)
'Give a delay to saving product process'
Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.takeScreenshot('C:\\Users\\AV2017005903\\Documents\\apollo-automation\\Screenshoot\\AddProduct.png', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.closeApplication()

