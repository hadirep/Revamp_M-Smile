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

Mobile.startExistingApplication('com.bankmega.msmiledev')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Ubah Password Login\\01.png')

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/01. PathView-Atur'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Ubah Password Login\\02.png')

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/02. TextView-Ubah Password Login'), 0)

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/03. EditText-Tap Password Lama'), 0)


Mobile.setText(findTestObject('Object Repository/Atur/Ubah Password Login/04. EditText-Set Password Lama'), 'Bankmega1', 
    0)

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/05. TextView-Tap Password Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Atur/Ubah Password Login/06. EditText-Set Password Baru'), 'Bankmega2', 
    0)

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/07. TextView-Tap Konfirmasi Password Baru'), 0)

Mobile.setText(findTestObject('Object Repository/Atur/Ubah Password Login/08. EditText-Set Konfirm Password Baru'), 'Bankmega2', 
    0)

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/09. ImageView-Cek Password Lama'), 0)

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/10. ImageView-Cek Password Baru'), 0)

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/11. ImageView-Cek Konfirm Password Baru'), 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Ubah Password Login\\03.png')

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/12. ViewGroup-Ubah'), 0)

Mobile.verifyElementText(findTestObject('Object Repository/Atur/Ubah Password Login/13. TextView-verif Password Berhasil Diubah'), 
    'Password Berhasil Diubah')

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Ubah Password Login\\04.png')

Mobile.tap(findTestObject('Object Repository/Atur/Ubah Password Login/14. ViewGroup-Tutup'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Ubah Password Login\\05.png')

Mobile.closeApplication()

