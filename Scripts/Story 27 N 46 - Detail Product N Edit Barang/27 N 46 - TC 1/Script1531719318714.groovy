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
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.util.internal.PathUtil as PathUtil

Mobile.comment('Start Story 27 - Detail Product - Info Stock')

WebUI.callTestCase(findTestCase('Story 26 dan 842 -Kelola Stok Final/26 TC 1 - All Search Product'), [:], FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'content-desc', 
    'productListComponent_textInput_search', GlobalVariable.G_ShortTimeOut)

Mobile.comment('Search Product')

'Melakukan Input Text lebih dari satu kata dalam search produk pada kategori "Makanan"'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari nama produk - btn'), 'MIMINO Bottle', GlobalVariable.G_ShortTimeOut)

//Mobile.hideKeyboard(FailureHandling.CONTINUE_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut)

Mobile.verifyElementAttributeValue(findTestObject('Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), 'content-desc', 
    'productListComponent_listItem_0', GlobalVariable.G_ShortTimeOut)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/List Produk - Elemen 1'), GlobalVariable.G_ShortTimeOut)

Mobile.delay(GlobalVariable.G_LongTimeOut, FailureHandling.CONTINUE_ON_FAILURE)

