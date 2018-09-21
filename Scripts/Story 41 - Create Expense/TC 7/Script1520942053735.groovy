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

'Menunggu sampai nilai Nominal Pengeluaran terGet, kemudian melakukan action selanjutnya'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 0)

'Mengklik TextBox Deskripsi dan mengInput Deskripsinya '
Mobile.sendKeys(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 'Pengeluaran untuk uang Listrik, Uang Makan, dan Uang Kos bulan Januari')

'Mengambil nilai Nominal Pengeluaran setelah di verifikasi'
Mobile.getText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 5)

'Keyboard device tertutup'
Mobile.hideKeyboard()

Mobile.delay(2, FailureHandling.STOP_ON_FAILURE)

