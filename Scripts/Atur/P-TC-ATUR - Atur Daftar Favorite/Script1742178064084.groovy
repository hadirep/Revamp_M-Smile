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

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\01.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/01. Button-Atur'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\02.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/02. TextView-Atur Daftar Favorit'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\03.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/03. TextView-Dana'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\04.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/04. ViewGroup-Tambah Favorite'), 0)

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/05. EditText-Tap Nama'), 0)

Mobile.setText(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/06. EditText-Set Nama'), 'Hadi', 0)

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/07. EditText-Tap Nomor'), 0)

Mobile.setText(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/08. EditText-Set Nomor'), '085711357924', 
    0)

Mobile.hideKeyboard()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\05.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/09. ViewGroup-Tambah Favorite'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\06.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/10. TextView-Ok'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\07.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/11. PathView-Hapus Favorite'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\08.png')

Mobile.tap(findTestObject('Object Repository/Atur/Atur - Atur Daftar Favorite/12. ViewGroup-Ya Hapus Favorite'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\09.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\10.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\11.png')

Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\P-TC-ATUR - Atur Daftar Favorite\\12.png')

Mobile.closeApplication()