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

'Click Cari Produk - Parent'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

'SetText in Cari Produk - Parent '
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.NamaProduct, GlobalVariable.G_Timeout)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
    'content-desc', 'productListComponent_listItem_0', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Alert = Mobile.getText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Alert -  Stok Sedikit'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(Alert, '⚠︎ Stok Sedikit')

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('EDIT PRODUCT')

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), 'content-desc', 
    'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)

'Click Cari Produk - Parent'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('Edit jumlah stock')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), 'content-desc', 
    'input_anumberpicker', GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), '0', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Jumlah Stock - by typing'), 'text', 
    '0', GlobalVariable.G_ShortTimeOut)

Mobile.comment('Edit Nama Barang')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), GlobalVariable.G_ShortTimeOut, 
    FailureHandling.CONTINUE_ON_FAILURE)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), 'content-desc', 
    'productNameTextInput', 0)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nama Barang - Text Box'), 'MIMINO Bottle 1', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyEqual('MIMINO Bottle 1', 'MIMINO Bottle 1')

Mobile.comment('Edit SKU Product')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), 'content-desc', 
    'product_code_input', 0)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), GlobalVariable.G_ShortTimeOut)

String SKU = CustomKeywords.'newpackage.allkeyword.randomSKU'()

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/SKU Produk - Text Box'), SKU, GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyEqual(SKU, SKU)

Mobile.comment('Edit Select Category')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Pilih Kategori - SelectButton'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Pilih Kategori - SelectButton'), 'content-desc', 
    'selectCategoryBtn', 0)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Pilih Kategori - SelectButton'), GlobalVariable.G_ShortTimeOut)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/ListKategori - Elemen 2'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/ListKategori - Elemen 2'), 'content-desc', 
    'product_category_item_1', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/ListKategori - Elemen 2'), GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.comment('Edit Harga Beli')

Mobile.scrollToText('Pilih Supplier', FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), 'content-desc', 
    'productPurchasePriceTextInput', GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), '65000', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/HargaBeli - TextInput'), '65.000')

Mobile.comment('Edit Harga Jual')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), 'content-desc', 
    'productSalePriceTextInput', GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), '95000', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Harga Jual - TextBox'), '95.000')

Mobile.comment('Edit Nominal Diskon')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), 'content-desc', 
    'productDiscountNominalTextInput', GlobalVariable.G_ShortTimeOut)

Mobile.clearText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), GlobalVariable.G_ShortTimeOut)

Mobile.setText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), '3000', GlobalVariable.G_ShortTimeOut)

Mobile.hideKeyboard()

Mobile.verifyElementText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Nominal Diskon- TextBox'), '3.000')

Mobile.comment('Save Edit Produk')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), 'content-desc', 'productSubmitBtn', 
    GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Tambah Barang/Simpan Button'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

Alert = Mobile.getText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Alert - Stok Habis'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(Alert, '⚠︎ Stok Habis')

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.STOP_ON_FAILURE)

