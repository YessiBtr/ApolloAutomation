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

Mobile.comment('Start Story 201')

'Step 1 - [Melakukan Kelola Stock]'
Mobile.startApplication('C:\\Users\\AV2017005903\\Documents\\ApolloTest\\apollo-automation\\Apollo Test\\SITv-9.apk', false)

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
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Terapkan Button'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Menunggu hingga button sebelum Humburger button di klik'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu Harian'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Terapkan Button'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Menunggu hingga button sebelum Humburger button di klik'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu Mingguan'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Terapkan Button'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Menunggu hingga button sebelum Humburger button di klik'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Jangka Waktu Bulanan'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Terapkan Button'), 5)

Mobile.scrollToText('UNDUH DAN BAGIKAN', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Unduh dan Bagikan'), 5)

Mobile.verifyElementExist(findTestObject('Sidebar Menu/Ringkasan/Ringkasan/Unduh dan Bagikan'), 5)

Mobile.delay(10, FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

Mobile.pressBack()

