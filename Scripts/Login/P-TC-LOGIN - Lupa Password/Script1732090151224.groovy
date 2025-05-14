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
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\01.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/01. ViewGroup-Login'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\02.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/02. TextView-Lupa Password'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\03.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/03. TextView-Tap No Hp'), 0)

Mobile.setText(findTestObject('Object Repository/Login/Lupa Password/04. EditText-Set No Hp'), '085770056083', 0)

Mobile.hideKeyboard()

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/05. EditText-Tap Email'), 0)

Mobile.setText(findTestObject('Object Repository/Login/Lupa Password/06. EditText-Set Email'), 'hadiesarahma@gmail.com', 0)

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/07. TextView-Tap M-PIN'), 0)

Mobile.setText(findTestObject('Object Repository/Login/Lupa Password/08. EditText-Set M-PIN'), '111111', 0)

Mobile.hideKeyboard()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\04.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/09. ViewGroup-Lanjut'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\05.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/10. ViewGroup-Kirim SMS'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\06.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/11. ImageView-Messaging'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\07.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/12. ImageButton-Sent SMS'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\08.png')

Mobile.pressBack()

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\09.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/13. ViewGroup-Lanjut'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\10.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/14. EditText-Tap Password'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Login/Lupa Password/15. EditText-Set Password'), 'Bankmega2', 0)

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/16. TextView-Tap Konfirmasi Password'), 0)

Mobile.setEncryptedText(findTestObject('Object Repository/Login/Lupa Password/17. EditText-Set Konfirmasi Password'), 'Ww1FHTu5BdyN2exnacfMzg==', 
    0)

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/18. PathView-Cek Password'), 0)

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/19. PathView-Cek Konfirm Password'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\11.png')

Mobile.tap(findTestObject('Object Repository/Login/Lupa Password/20. ViewGroup-Simpan'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('D:\\Revamp_M-Smile\\Screenshot\\TC-010 - P-TC-LOGIN - Lupa Password\\12.png')

Mobile.closeApplication()

