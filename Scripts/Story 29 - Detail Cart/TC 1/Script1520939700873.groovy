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

Mobile.comment('Start Story 29')

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

Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Kasir - Navbar'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

for (def index : (0..7)) {
    Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/PlusTap - ListProduct Elemen 1'), 5, FailureHandling.CONTINUE_ON_FAILURE)
}

for (def index : (0..1)) {
    Mobile.tap(findTestObject('Sidebar Menu/Kasir/Kasir/Dashboard Kasir/MinusTap - List Product Elemen 1'), 5, FailureHandling.CONTINUE_ON_FAILURE)
}

Mobile.waitForElementPresent(findTestObject('null'), 5)

Mobile.tap(findTestObject('null'), 30, FailureHandling.STOP_ON_FAILURE)

