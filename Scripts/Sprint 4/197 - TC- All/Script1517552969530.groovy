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

Mobile.comment('Start Story 197')

'BTPNAP 197 - Cost Expenses - View\r\n'
Mobile.startApplication('C:\\Users\\AV2017005903\\Documents\\Apollo Test\\SIT v-9.apk', false)

'Mengklik "Daftar Sekarang" untuk masuk ke halaman Home/Beranda'
Mobile.tap(findTestObject('null'), 30)

'Mengklik Text Box untuk mengisi Nomor HP/Nama Pengguna'
not_run: Mobile.tap(findTestObject('Login/Nomor HP  Nama Pengguna - Text Box'), 5)

'Megisi inputan dengan Nama Pengguna "Yessi"'
not_run: Mobile.setText(findTestObject('Login/Nomor HP  Nama Pengguna - Text Box'), 'Yessi', 3)

'Hide Keyboard Device'
not_run: Mobile.hideKeyboard()

'Mengklik Button Masuk'
not_run: Mobile.tap(findTestObject('Login/Button Masuk'), 3)

'Menunggu action button masuk hingga selesai untuk masuk ke action Input PIN'
not_run: Mobile.waitForElementPresent(findTestObject('Login/Button Masuk'), 3)

'Mengklik Text Field Pin'
not_run: Mobile.tap(findTestObject('Login/InputPin'), 3)

'Menginput PIN Pengguna dengan 6 digit'
not_run: Mobile.setText(findTestObject('Login/InputPin'), '160996', 4)

'Menunggu hingga button sebelum Humburger button di klik'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/HamburgerButton'), 5)

'Mengklik Hamburger Button kemdian memilih Operasional untuk masuk ke halaman Kasir, Stock, Pengeluaran dan Rincian'
Mobile.tap(findTestObject('Sidebar Menu/HamburgerButton', [('variable') : 'Transaksi -Tab']), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan - Sidebar Menu'), 5)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Biaya/Biaya - Tabbar'), 3)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/Biaya - Tabbar'), 5)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Biaya Harian - Elemen 1'), 5)

'Melakukan down scroll untuk melihat List Expense'
not_run: Mobile.swipe(0, 0, 0, 0)

'Melakukan up scroll untuk melihat List Expense'
not_run: Mobile.swipe(0, 0, 0, 0)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Biaya Harian - Elemen 1'), 5)

Mobile.pressBack()

'List Kategori "Mingguan"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Kategori - Elemen 1'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/Terapkan - Button'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Biaya Mingguan - Elemen 1'), 5)

Mobile.pressBack()

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Biaya Mingguan - Elemen 2'), 5)

Mobile.pressBack()

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/Button Drop Down Biaya'), 5)

'List Kategori "Bulanan"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Kategori - Elemen 2'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/Terapkan - Button'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Biaya/List Biaya Bulanan - Elemen 1'), 5)

Mobile.pressBack()

