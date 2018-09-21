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

Mobile.comment('Start Story 215')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

'Klik List Pengeluaran di Elemen ke 3'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/ListPengeluaranKategori - Elemen 3'), 5)

'Hapus Judul Catatan'
Mobile.clearText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 5)

'MengInput Ulang Judul Catatan'
Mobile.setText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 'Pengeluaran Belanja Bulanan', 
    5)

'Memverifikasi Actual Text dengan Expected Text'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 'Pengeluaran Belanja Bulanan')

'Mengambil Text yang telah di Set di Judul Catatan\r\n'
Mobile.getText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 5)

'Menunggu sampai action Get Text selesai'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), 5)

Mobile.comment('Pilih Kategori -> Menunggu ID')

'Klik Pilih Kategori'
not_run: Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pilih Kategori - DropDown'), 5)

'Pilih Kategori "Ongkos Kirim"'
not_run: Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Ongkos Kirim - SelectKategoriExpanse'), 5)

'Klik Nonimal Pengeluaran'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), 5)

'Mengahapus Nominal Pengeluaran'
Mobile.clearText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), 5)

'Mengisi Nominal Pengeluaran'
Mobile.setText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), '3000000', 5)

'Memverifikasi actual  text dengan expected text'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), '3.000.000')

'Mengambil Text yang telah di Set di Nominal Pengeluaran'
Mobile.getText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), 5)

Mobile.clearText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 5)

'Mengubah dan mengisi Deskripsi'
Mobile.sendKeys(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 'Pengeluaran untuk belanja bulanan')

Mobile.hideKeyboard()

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

'Mengklik Tanggal Text Box'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

'Memilih Tanggal 16 Januari 2018'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/23 Februari 2018'), 5)

Mobile.comment('Kalo mau swipe tanggal gimana ya?')

'Klik "Cancel" button '
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Cancel Tanggal'), 5)

'Mengklik kembali Tanggal Text Box '
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

'Memilih Tanggal 16 Januari 2018'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/23 Februari 2018'), 5)

'Klik "OK" button'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/OK Tanggal'), 5)

'Klik Simpan Button'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan Button'), 5)

