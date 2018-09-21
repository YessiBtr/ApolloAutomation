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

'BTPNAP- 38 Manage Category -> Tambah Barang'
Mobile.startApplication('D:\\Project Apollo\\APK Appolo\\RetroSprint4.apk', false)

'Klik Burger Button'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/SidebarMenu', [('variable') : 'Transaksi -Tab']), 5)

'Select and Click \'Operasional\''
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Operasional'), 5)

'Click Navbar \'Stock\''
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Stock View/StokNavbar - Btn', [('variable') : 'Stock - Tab']), 
    5, FailureHandling.STOP_ON_FAILURE)

'Click Tambah Barang Button'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/TambahBarang - Button'), 5)

'Mengscroll to text untuk menemukan \'Pilih Kategori\''
Mobile.scrollToText('Pilih Kategori')

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Pilih Kategori - TambahBarang'), 
    2)

'Klik Pilih Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Pilih Kategori - TambahBarang'), 5, FailureHandling.STOP_ON_FAILURE)

'Mengscroll to text untuk menemukan \'Pengaturan Kategori\''
Mobile.scrollToText('Pengaturan Kategori', FailureHandling.STOP_ON_FAILURE)

'Klik Pengaturan Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Pengaturan Kategori'), 5)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Pengaturan Kategori'), 5)

'Looping Toogle Kategori Elemen 1'
for (def index : (0..4)) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Alat Berat]'
    if (true) {
        Mobile.swipe(381, 139, 420, 139)
    } else {
        Mobile.swipe(420, 139, 381, 139)
    }
}

'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
if (true) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Buku]'
    Mobile.swipe(381, 213, 420, 213)
} else {
    Mobile.swipe(420, 213, 381, 213)
}

'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
if (true) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Elemen 2]'
    Mobile.swipe(381, 286, 420, 286)
} else {
    Mobile.swipe(420, 286, 381, 28)
}

'Looping Toogle Kategori Elemen 3'
for (def index : (0..4)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Elemen 3]'
        Mobile.swipe(381, 486, 420, 486)
    } else {
        Mobile.swipe(420, 414, 381, 414)
    }
}

'Klik SimpanBtn yang di Pengaturan Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/SimpanBtn - Pengaturan Kategori'), 3)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/SimpanBtn - Pengaturan Kategori'), 
    3)

'Mengscroll to text untuk menemukan \'Tambah Kategori\''
Mobile.scrollToText('Tambah Kategori', FailureHandling.STOP_ON_FAILURE)

'Klik \'Tambah Kategori\''
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Tambah Kategori - Button'), 5)

'Klik \'Terapkan Kategori\''
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Terapkan- Tambah Kategori'), 5)

'Klik Object \'Nama Kategori\''
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Nama Kategori'), 3)

'Input Text Nama Kategori dengan value \'Kesehatan\''
Mobile.setText(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Nama Kategori'), 'Kesehatan', 3)

'Klik Button \'Terapkan\''
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/Terapkan- Tambah Kategori'), 5)

'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
if (true) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Elemen 10]'
    Mobile.swipe(381, 801, 420, 801)
} else {
    Mobile.swipe(420, 801, 381, 801)
}

'Klik Button Simpan di Pengaturan Kategori'
Mobile.tap(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/SimpanBtn - Pengaturan Kategori'), 2)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Operasional/Stock/Tambah Barang/SimpanBtn - Pengaturan Kategori'), 
    3)

Mobile.pressBack()

Mobile.pressBack()

