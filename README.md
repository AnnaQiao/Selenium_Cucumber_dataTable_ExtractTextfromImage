# SeleniumeExtractTextfromImage
This demo demonstrates that how to extract text form image by using tesseract in Selenium, whilst it used data tabe  of cucunber
## About this demo story
Recently, my ten years old son study hacker skills, he is success when he attacked ** web sever, I can not believe it. His behavior inspired me whichsecurity verfication technologies are more safety,so I start doing some research about verfication code skills of website, one of them is doing jigsaw that moving one of piece to slide it's correct position, If you are curious about which technology is more safety, first please access https://github.com/AnnaQiao/CucumberOutline_SeleniumSlidermovement. Today, let me explaining the solution how to extract code from picture in Selenium by using Tesseract.
## getting started
### 1. prerequesite
 - Installing Tesseract
 - add Tess4J dependency to pom.xlm
 - installing related automation tools JDE, Selenium, Cucumber,so on.
### 2. What is Tesseract
   Tesseract is a famous open source OCR engine. Tesseract support a wide variety of image formats and convert them to text in over 60 languages.
   installing Tesseract, Please refer https://github.com/tesseract-ocr/tesseractReadme page for installation instructions.
   an addition to Tesseract (written in C++), we need a Java wrapper called Tess4J which provides JNA wrapper for Tesseract OCR API.
   - add Tess4J dependency to POM.XML, please refer the following picture. 
   
![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/dependency.JPG)
### 3. how to use DataTable of Cucumber
  Data Tables in cucumber are quite interesting and can be used in different way, it is also used to handle large amount of data.most people confused with Data table and scenario outline, but they work completely differently.
  - scenario outline:
    1. using "Example" keyword to define the test data for the Scenario.
    2. this works for the whole test
    3. cucumber run the times of scenario automationlly equal to the number of data in the test set
 - Data table
    1. No keyword is used to define the data
    2. this work  only for the single step, below which it is defined.
    3. it can be run single or mutiple times but again for the single step, not for complete test.
  - The following picture is Data table in feature 
  
   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/feature.JPG)

  - Here is java test script by using DataTable which navigates to register in aliexpress website.

   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/dataTable.JPG)
### How to extract text code from picture verification in selenium
    - Following picture is java code about how to get screenshot in selenium
   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/screenshot.JPG)
    
    - This follow java code is that how to convert picture to text by using Tesseract
    
   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/extract.JPG)
### Testing result
   1. we can get test.jpg under it's directory, for example I got this screenshot by testing code

   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/test.JPG)
  
   2. test result of this instance, the following picture.
      ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/testResult.JPG)
      
