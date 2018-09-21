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

Mobile.comment('Start Story 46')

'Step 1 - [Melakukan Kelola Stock]'
def apkPath = PathUtil.relativeToAbsolutePath(GlobalVariable.apkName, RunConfiguration.getProjectDir())

Mobile.startApplication(apkPath, false)

not_run: Mobile.verifyElementExist(findTestObject('null'), 5)

'Mengklik "Daftar Sekarang" untuk masuk ke halaman Home/Beranda'
Mobile.tap(findTestObject('null'), 30)

'Menunggu hingga button sebelum Humburger button di klik'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/HamburgerButton'), 5)

'Mengklik Hamburger Button kemdian memilih Operasional untuk masuk ke halaman Kasir, Stock, Pengeluaran dan Rincian'
Mobile.tap(findTestObject('Sidebar Menu/HamburgerButton', [('variable') : 'Transaksi -Tab']), 5)

'Mengklik "Operasional" untuk bisa direct ke screen Stock'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Operasional - Sidebar Menu'), 5)

'Mengklik "Stok Tabbar" untuk bisa ke screen Stock'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Stok - Navbar Menu', [('variable') : 'Stock - Tab']), 
    3, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Stock View/Cari Produk - Parent'), 5)

Mobile.comment('Search Product')

'Mengklik SearchButton untuk mencari Produk'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Stock View/Cari Produk - Parent'), 10)

'Melakukan Input Text lebih dari satu kata dalam search produk pada kategori "Makanan"'
Mobile.setText(findTestObject('Sidebar Menu/Produk/Stock View/Cari Produk - Parent'), 'Nestle Air Murni', 5)

'Melakukan Verify Element Text yang telah di Input'
Mobile.verifyElementNotChecked(findTestObject('Sidebar Menu/Produk/Stock View/Cari Produk - Parent'), 3)

'Mengambil Text yang telah di input'
Mobile.getText(findTestObject('Sidebar Menu/Produk/Stock View/Cari Produk - Parent'), 5)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Detail Barang/List Produk Search - Elemen 1'), 
    5)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Detail Barang/List Produk Search - Elemen 1'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('Swipe ke Bawah')

Mobile.swipe(24, 788, 24, 452)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Produk/Detail Barang/Ubah Info - Button'), 5)

