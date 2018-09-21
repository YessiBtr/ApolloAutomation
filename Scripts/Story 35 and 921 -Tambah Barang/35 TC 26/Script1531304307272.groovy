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

Mobile.comment('Mengecek Validasi')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'content-desc', 
    'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)

'Click Cari Produk - Parent'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

'SetText in Cari Produk - Parent '
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'MIMINO Bottle', GlobalVariable.G_Timeout)

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
    GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 
    'content-desc', 'productListComponent_listItem_0', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Object Repository/Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Alert = Mobile.getText(findTestObject('Sidebar Menu/Produk/Tambah Barang/Alert - Stok Habis'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyEqual(Alert, '⚠︎ Stok Habis')

'Keluar Akun'
Mobile.comment('Click Sidebar')

Mobile.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/HamburgerButton'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/HamburgerButton'), 'content-desc', 'headerBar_button_hamburgerMenu', 
    GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/HamburgerButton'), GlobalVariable.G_ShortTimeOut)

Mobile.comment('Click Keluar')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Keluar/Keluar'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Keluar/Keluar'), 'content-desc', 'logoutMenuItem', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Keluar/Keluar'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(GlobalVariable.G_ShortTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

'Close Application ya say..'
Mobile.closeApplication()

