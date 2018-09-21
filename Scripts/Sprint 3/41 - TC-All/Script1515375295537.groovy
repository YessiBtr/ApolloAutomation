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

Mobile.comment('Start Story 41')

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

'Menungg//////////////////////u hingga elemen Pengeluaran barang untuk melanjutkan action element "Tambah Catatan"'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TAMBAH CATATAN - Button'), 5)

'Mengklik Button "Tambah Catatan"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/TAMBAH CATATAN - Button'), 5)

'Mengklik TextBox Judul MengInput Text pada Judul Catatan'
Mobile.sendKeys(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Judul Catatan - TextBox'), 'Pengeluaran Kos Kosan')

'Keyboard device tertutup'
Mobile.hideKeyboard()

'Menunggu hingga elemen Input Judul Catatan selesai untuk melanjutkan action element "Tambah Catatan"'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pilih Kategori 1'), 5)

'Mengklik "Pilih Kategori"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pilih Kategori 1'), 5)

'Mengklik "Pilih Kategori"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pilih Kategori 1'), 5)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pengaturan Kategori - Button'), 2)

'Menggabungkan Story 42- \tManage Kategori'
Mobile.comment('Start Story 42')

'Klik \'Pengaturan Kategori\''
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pengaturan Kategori - Button'), 5)

'Selanjutnya, Melakukan Looping Swipe pada List Kategori'
Mobile.comment('Selanjutnya, Melakukan Looping Swipe pada List Kategori')

'Looping Toogle Kategori Elemen 1'
for (def index : (0..3)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 1]'
        Mobile.swipe(383, 143, 425, 143)
    } else {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 1]'
        Mobile.swipe(425, 143, 383, 143)
    }
}

'Looping Toogle Kategori Elemen 2'
for (def index : (0..3)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 2]'
        Mobile.swipe(383, 226, 425, 226)
    } else {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 2]'
        Mobile.swipe(425, 226, 383, 226)
    }
}

'Looping Toogle Kategori Elemen 3'
for (def index : (0..3)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 3]'
        Mobile.swipe(383, 310, 425, 310)
    } else {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 3]'
        Mobile.swipe(425, 310, 383, 310)
    }
}

'Looping Toogle Kategori Elemen 4'
for (def index : (0..3)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 4]'
        Mobile.swipe(383, 393, 425, 393)
    } else {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 4]'
        Mobile.swipe(425, 393, 383, 393)
    }
}

'Looping Toogle Kategori Elemen 5'
for (def index : (0..3)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 5]'
        Mobile.swipe(383, 476, 425, 476)
    } else {
        'Swipe Pengaturan Kategori di Tambah Catatan - [Kategori Elemen 5]'
        Mobile.swipe(425, 476, 383, 476)
    }
}

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan Button'), 5)

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan Button'), 5)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Tambah Kategori - Button'), 5)

'Klik \'Tambah Kategori\''
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Tambah Kategori - Button'), 5)

'Setelah mengKlik Button \'Terapkan\', muncul Notifikasi "Perlu diisi"'
Mobile.comment('Notifikasi "Pelu diisi"')

'Input Nama Kategori Baru yang akan di tambahkan'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Input Tambah Kategori Baru'), 5)

'Input Tambah Kategori Baru dengan "Buku"'
Mobile.sendKeys(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Input Tambah Kategori Baru'), 'Sticky')

'Klik Button "Terapkan"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Terapkan - ButtonTambahKategori'), 10)

Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan Button'), 5)

'Klik Button \'Simpan\' untuk menyimpan perubahan'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan Button'), 6)

'Klik \'Terapkan Button\''
Mobile.pressBack()

Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Pilih Kategori Elemen ke 1'), 5)

'Kategori Baru sudah muncul pada List Kategori dengan status \'active\''
Mobile.comment('Insert berhasil')

'End Story 42 - Manage Kategori'
Mobile.comment('End Story 42')

'Mengklik "Nominal Pengeluaran"'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), 5)

'MengInput nilai Nominal Pengeluaran'
Mobile.setText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), '4500000', 5)

'Memverifikasi nilai Nominal Pengeluaran yang telah di Input apakah sama actual dengan expectednya'
Mobile.verifyElementText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), '4.500.000')

'Mengambil nilai Nominal Pengeluaran setelah di verifikasi'
Mobile.getText(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Nominal Pengeluaran - TextBox'), 5)

'Menunggu sampai nilai Nominal Pengeluaran terGet, kemudian melakukan action selanjutnya'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 5)

'Mengklik TextBox Deskripsi dan mengInput Deskripsinya '
Mobile.sendKeys(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Deskripsi - TextBox'), 'Pengeluaran untuk uang Listrik, Uang Makan, dan Uang Kos bulan Januari')

'Keyboard device tertutup'
Mobile.hideKeyboard()

'Menunggu sampai Deskripsi selesai di Input, kemudian melakukan action selanjutnya'
Mobile.waitForElementPresent(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

'Mengklik Selector Tanggal Pengeluaran'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

'Mengklik Selector Tanggal Pengeluaran'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

Mobile.swipe(96, 398, 96, 614)

'Memilih Tanggal yang belum lewat dengan tanggal hari ini'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/23 Februari 2018'), 5)

'Klik Batal untuk membatalkan tanggal yang dipilih'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Cancel Tanggal'), 5)

'Mengklik Selector Tanggal Pengeluaran'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/SelectorTangal'), 5)

Mobile.comment('Gk bisa di swipe sama scroll to text bang. Aye puyeng')

not_run: Mobile.scrollToText('01 Maret 2018')

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

not_run: Mobile.swipe(96, 614, 96, 398)

'Memilih Tanggal yang belum lewat dengan tanggal hari ini'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/10 Maret 2018'), 5)

'Memilih OK ketika tangggal yang dipilih sesuai'
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/OK Tanggal'), 5)

'Mengklik Button "Simpan" untuk  menyimpan Catatan '
Mobile.tap(findTestObject('Sidebar Menu/Ringkasan/Pengeluaran/Simpan - Tambah Catatan'), 5)

Mobile.delay(5, FailureHandling.STOP_ON_FAILURE)

Mobile.comment('End Story 41')

