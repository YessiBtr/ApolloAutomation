import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import javax.media.rtp.GlobalReceptionStats as GlobalReceptionStats
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.configuration.RunConfiguration as RunConfiguration
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.util.internal.PathUtil as PathUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.comment('Start Story 40')

'Step 1 - [Melakukan Kelola Stock]'
def apkPath = PathUtil.relativeToAbsolutePath(GlobalVariable.apkName, RunConfiguration.getProjectDir())

Mobile.startApplication(apkPath, false)

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

'Mengklik "Operasional" untuk bisa direct ke screen Stock'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Operasional - Sidebar Menu'), 5)

'Click Navbar \'Pengeluaran\''
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/PengeluaranNavbar'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Klik Drop Down Semua Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SemuaKategori - DropDown'), 5)

'Pilih Kategori "Biaya Listrik"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListKategori - Elemen 2(DropDown)'), 5)

'Klik "Terapkan Button"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TerapkanBUtton - SelectKategori'), 5)

'Klik Drop Down Semua Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SemuaKategori - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListKategori - Elemen 3(Drop Down)'), 5)

'Klik "Terapkan Button"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TerapkanBUtton - SelectKategori'), 5)

'Klik Drop Down Semua Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SemuaKategori - DropDown'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListKategori - Elemen 1(Drop Down)'), 5)

'Klik "Terapkan Button"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TerapkanBUtton - SelectKategori'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListPengeluaranKategori - Elemen 1'), 
    5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListPengeluaranKategori - Elemen 1'), 5)

Mobile.pressBack()

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListPengeluaranKategori - Elemen 4'), 5)

Mobile.pressBack()

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TAMBAH CATATAN - Button'), 5)

'Klik button  "Tambah Catatan"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TAMBAH CATATAN - Button'), 5)

Mobile.pressBack()

'Melakukan Looping Swipe ke bawah untuk menemukan list expanse lainnya '
for (def index : (0..2)) {
    'Melakukan Swipe kebawah untuk menemukan list expanse lainnya '
    Mobile.swipe(0, 626, 0, 284)
}

'Melakukan Looping Swipe ke atas untuk menemukan list expanse lainnya '
for (def index : (0..2)) {
    'Melakukan Swipe ke atas untuk menemukan list expanse lainnya '
    Mobile.swipe(0, 284, 0, 626)
}

Mobile.comment('End Story 40')

