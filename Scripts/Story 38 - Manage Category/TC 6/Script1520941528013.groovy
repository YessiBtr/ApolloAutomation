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

'Klik Object \'Nama Kategori\''
Mobile.tap(findTestObject('Sidebar Menu/Produk/Detail Barang/Nama Kategori'), 3)

'Input Text Nama Kategori dengan value \'Kesehatan\''
Mobile.setText(findTestObject('Sidebar Menu/Produk/Detail Barang/Nama Kategori'), 'Kesehatan', 3)

'Klik Button \'Terapkan\''
Mobile.tap(findTestObject('Sidebar Menu/Produk/Manage Kategori/TERAPKAN - Button'), 5)

'Klik Button Simpan di Pengaturan Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Produk/Manage Kategori/SIMPAN Button'), 5)

Mobile.scrollToText('Kesehatan', FailureHandling.STOP_ON_FAILURE)

Mobile.pressBack()

