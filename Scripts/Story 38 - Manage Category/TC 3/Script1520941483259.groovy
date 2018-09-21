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

'Looping Toogle Kategori Elemen 1'
for (def index : (0..4)) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Alat Berat]'
    if (true) {
        Mobile.swipe(381, 139, 450, 139)
    } else {
        Mobile.swipe(450, 139, 381, 139)
    }
}

'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
if (true) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Buku]'
    Mobile.swipe(381, 213, 450, 213)
} else {
    Mobile.swipe(450, 213, 381, 213)
}

'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
if (true) {
    'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Elemen 2]'
    Mobile.swipe(381, 286, 450, 286)
} else {
    Mobile.swipe(450, 286, 381, 286)
}

'Looping Toogle Kategori Elemen 3'
for (def index : (0..4)) {
    'Jika Toogle di Swipe Left ->  Right = true\r\nKalau tidak Right -> Left'
    if (true) {
        'Swipe Pengaturan Kategori di Tambah Barang - [Kategori Elemen 3]'
        Mobile.swipe(381, 727, 450, 727)
    } else {
        Mobile.swipe(450, 727, 381, 727)
    }
}

Mobile.delay(3, FailureHandling.STOP_ON_FAILURE)

