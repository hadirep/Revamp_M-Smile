import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.windows.driver.WindowsDriverFactory
import com.kms.katalon.core.windows.keyword.helper.WindowsActionHelper

Windows.startApplicationWithTitle('C:\\Users\\H23070017\\Desktop\\COREDEV.WS', 'COREDEV')

Windows.setText(findWindowsObject('Object Repository/Host/Edit'), 'u4hadi')

Windows.click(findWindowsObject('Object Repository/Host/Edit(1)'))

Windows.setText(findWindowsObject('Object Repository/Host/Edit(1)'), 'MEGABANK')

Windows.click(findWindowsObject('Object Repository/Host/Button'))

Windows.delay(10)

//Windows.click(findWindowsObject('Object Repository/Host/Pane'))
//
//Windows.clickElementOffset(findWindowsObject('Object Repository/Host/Pane'), 150, 20)
//
//Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord('u4hadi'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.TAB))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord('megabank'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord('2'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord('3'))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(GlobalVariable.rekening))

Windows.delay(2)

Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.ENTER))

Windows.delay(2)

//Windows.sendKeys(findWindowsObject('Object Repository/Host/Pane'), Keys.chord(Keys.F11))
//
//Windows.delay(2)

// script take screen shot di desktop apps :
String screenshotLocation = 'Images//01.png' 
WindowsActionHelper.create(WindowsDriverFactory.getWindowsSession()).takeScreenshot(screenshotLocation)

Windows.delay(2)

Windows.closeApplication()

Windows.callTestCase(findTestCase('Test Cases/Host/Read Image Host-OK'), null)

//Script untuk mengambil nominal di baris Ledger Balance yg sudah disimpan di Global Variable
String saldo = GlobalVariable.LedgerBalance

//script ambil text sebelum kata '1 Day'
String sebelum = saldo.substring(0, saldo.indexOf('1 Day'))
println(sebelum)

//script mengambil setelah tanda baca ':' :
String nominal = sebelum.substring(sebelum.indexOf(': ') + 1)
println(nominal)

//script untuk menghilangkan spasi di depan nominal :
String hapusspasi = nominal.replaceAll(' ', '')
println(hapusspasi)

//script menghilangkan tanda koma agar bisa dihitung :
String saldofinal = hapusspasi.replaceAll(',', '')
println(saldofinal)

GlobalVariable.SaldoAwal = saldofinal

////script perhitungan penjumlahan/pengurangan saldo awal dengan nominal transaksi yg diinput user sbb:
////script ini bisa diinsert di masing2 test case nantinya
//String strsaldoawal = GlobalVariable.SaldoAwal
//
//def saldoawaldesimal = strsaldoawal.toDouble()
//
//def nominaltrx = 100123.45
////Nominal diatas adalah nominal trx (hardcode), bisa diganti dgn variable Nominal yg ada di test case masing2
//
////script perhitungan (penjumlahan/pengurangan) saldo dengan nominal trx :
//def hitungpengurangan = saldoawaldesimal - nominaltrx
//println(hitungpengurangan)
//
////script ubah format nominal menjadi 2 digit dibelakang koma, sbb :
//def saldoformatawal = String.format('%.2f', hitungpengurangan)
//
//println(saldoformatawal)

	