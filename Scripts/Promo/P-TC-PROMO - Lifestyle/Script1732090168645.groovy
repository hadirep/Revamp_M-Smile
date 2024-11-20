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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\01.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/01. Button - Promo'), 0)

Mobile.swipe(800, 880, 70, 855)
Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\02.png')

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\03.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/02. ViewGroup - Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\04.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/03. TextView - Dermatheory Clinic Makassar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\05.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\06.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/04. TextView - Keishaderm Medical Aesthetic'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\07.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\08.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/05. TextView - Profira Aesthetic Clinic Makassar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\09.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\10.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/06. TextView - Erha - Voucher Belanja hingga Rp200ribu'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\11.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\12.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/07. TextView - Prodia Diskon hingga 15'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\13.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\14.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/08. TextView - Belanja Terasa Lebih Ringan dengan Ubah'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\15.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\16.png')
Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\17.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/09. TextView - Stella McCartney'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\18.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\19.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/10. TextView - Laboratorium Klinik Pramita Makassar'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\20.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\21.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/11. TextView - Scuto Platinum Palembang'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\22.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\23.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/12. TextView - Keishaglow Aesthetic  Anti Aging Center'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\24.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\25.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/13. TextView - Aigner Diskon 10 atau Cicilan 0'), 0)

Mobile.delay(3)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\26.png')
Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\27.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/14. TextView - Moschino Jeans'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\28.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\29.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/15. TextView - Esther Aesthetic Clinic Manado'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\30.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\31.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/16. TextView - Quantum Sarana Medik Bali'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\32.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\33.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/17. TextView - Laboratorium Klinik Pramita Pontianak'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\34.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\35.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/18. TextView - Laboratorium Klinik Pramita Balikpapan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\36.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\37.png')
Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\38.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/19. TextView - Glafidsya Aesthetic Clinic Medan'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\39.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\40.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/20. TextView - NILAI TUKAR LEBIH RENDAH'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\41.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\42.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/21. TextView - House of Beauty Aesthetic Clinic'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\43.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\44.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/22. TextView - Parai Beach Resort'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\45.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\46.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/23. TextView - Trans Fashion Indonesia'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\47.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\48.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/24. TextView - RS Indriati Solo Baru'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\49.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\50.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/25. TextView - Charisma Aesthetic Skincare Semarang'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\51.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\52.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/26. TextView - Niluh Djelantik Diskon 20'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\53.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\54.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/27. TextView - IHH Hospital Malaysia'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\55.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\56.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/28. TextView - RSU Kambang Jambi'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\57.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\58.png')
Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\59.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/29. TextView - Chandra Kirana Aesthetic Clinic'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\60.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\61.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/30. TextView - Pondok Indah Golf Bonus 50 Driving Balls'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\62.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\63.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/31. TextView - Dermaster Clinic Indonesia'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\64.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\65.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/32. TextView - Bukit Pandawa Golf'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\66.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\67.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/33. TextView - Klinik Gigi Senyum Ceria'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\68.png')
Mobile.tap(findTestObject('Object Repository/Promo/Lifestyle/ViewGroup - Back Btn Lifestyle'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\69.png')
Mobile.pressBack()

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Lifestyle\\70.png')
Mobile.closeApplication()