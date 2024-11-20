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
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\01.png')

Mobile.tap(findTestObject('Object Repository/Promo/Dining/01. Button - Promo'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\02.png')

Mobile.tap(findTestObject('Object Repository/Promo/Dining/02. ViewGroup - Dining'), 0)

Mobile.delay(1)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\03.png')

Mobile.tap(findTestObject('Object Repository/Promo/Dining/03. ViewGroup - Dining 1'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\04.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\05.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/04. TextView - Dining 2'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\06.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\07.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/05. TextView - Dining 3'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\08.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\09.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/06. TextView - Dining 4'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\10.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\11.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/07. TextView - Dining 5'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\12.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\13.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/08. TextView - Dining 6'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\14.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\15.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/09. TextView - Dining 7'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\16.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\17.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/10. TextView - Dining 8'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\18.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\19.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/11. TextView - Dining 9'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\20.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\21.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/12. TextView - Dining 10'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\22.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\23.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/13. TextView - Dining 11'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\24.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\25.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/14. TextView - Dining 12'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\26.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\27.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/15. TextView - Dining 13'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\28.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\29.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/16. TextView - Dining 14'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\30.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\31.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/17. TextView - Dining 15'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\32.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\33.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/18. TextView - Dining 16'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\34.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\35.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/19. TextView - Dining 17'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\36.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\37.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/20. TextView - Dining 18'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\38.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\39.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/21. TextView - Dining 19'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\40.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\41.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/22. TextView - Dining 20'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\42.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\43.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/23. TextView - Dining 21'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\44.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\45.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/24. TextView - Dining 22'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\46.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\47.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/25. TextView - Dining 23'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\48.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\49.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/26. TextView - Dining 24'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\50.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\51.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/27. TextView - Dining 25'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\52.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\53.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/28. TextView - Dining 26'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\54.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\55.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/29. TextView - Dining 27'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\56.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\57.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/30. TextView - Dining 28'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\58.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\59.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/31. TextView - Dining 29'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\60.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\61.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/32. TextView - Dining 30'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\62.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\63.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/33. TextView - Dining 31'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\64.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\65.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/34. TextView - Dining 32'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\66.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\67.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/35. TextView - Dining 33'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\68.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\69.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/36. TextView - Dining 34'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\70.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\71.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/37. TextView - Dining 35'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\72.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\73.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/38. TextView - Dining 36'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\74.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\75.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/39. TextView - Dining 37'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\76.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\77.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/40. TextView - Dining 38'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\78.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\79.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/41. TextView - Dining 39'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\80.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\81.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/42. TextView - Dining 40'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\82.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\83.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/43. TextView - Dining 41'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\84.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\85.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/44. TextView - Dining 42'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\86.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.swipe(500, 1200, 500, 500)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\87.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/45. TextView - Dining 43'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\88.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\89.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/46. TextView - Dining 44'), 0)

Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\90.png')
Mobile.tap(findTestObject('Object Repository/Promo/Dining/ViewGroup - Back Button'), 0)

Mobile.pressBack()
Mobile.delay(2)
Mobile.takeScreenshot('C:\\Users\\H23070017\\Katalon Studio\\Msmile Revamp\\Screenshot\\P-TC-PROMO - Dining\\91.png')

Mobile.closeApplication()

