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

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 5)

'Mengklik TextBox Judul MengInput Text pada Judul Catatan'
Mobile.setText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 'Pengeluaran Kos Kosan', 
    5)

Mobile.verifyElementText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 'Pengeluaran Kos Kosan')

Mobile.getText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 5)

'Keyboard device tertutup'
Mobile.hideKeyboard()

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan - Tambah Catatan'), 5)

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

