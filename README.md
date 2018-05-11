# SeleniumeExtractTextfromImage
This demo demonstrates that how to extract text from the image by using tesseract in Selenium, whilst it used a data table  of cucumber
## About this demo story
Recently, my ten years old son study hacker skills, he is a success when he attacked ** web server, I can not believe it. His behavior inspired me which security verification technologies are more safety, so I start doing some research about verification code skills of the website, one of them is doing jigsaw that moving one of the pieces to slide it's correct position, If you are curious about which technology is more safety, first please access https://github.com/AnnaQiao/CucumberOutline_SeleniumSlidermovement. Today, let me explain the solution how to extract code from the picture in Selenium by using Tesseract.
## getting started
### 1. prerequisite
 - Installing Tesseract
 - add the Tess4J dependency to pom.xlm
 - installing related automation tools JDE, Selenium, Cucumber,so on.
### 2. What is Tesseract
   Tesseract is a famous open source OCR engine. Tesseract supports a wide variety of image formats and converts them to text in over 60 languages.
   installing Tesseract, Please refer https://github.com/tesseract-ocr/tesseractReadme page for installation instructions.
   an addition to Tesseract (written in C++), we need a Java wrapper called Tess4J which provides JNA wrapper for Tesseract OCR API.
   - add the Tess4J dependency to POM.XML, please refer the following picture. 
   
![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/dependency.JPG)
### 3. how to use DataTable of Cucumber
  Data Tables in cucumber are quite interesting and can be used in a different way, it is also used to handle a large amount of data. most people confused with Data table and scenario outline, but they work completely differently.
  - scenario outline:
    1. using "Example" keyword to define the test data for the Scenario.
    2. this works for the whole test
    3. cucumber run the times of scenario automatically equal to the number of data in the test set
 - Data table
    1. No keyword is used to define the data
    2. this work only for the single step, below which it is defined.
    3. it can be run single or multiple times but again for the single step, not for the complete test.
  - The following picture is Data table in feature 
  
   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/feature.JPG)

  - Here is java test script by using DataTable which navigates to register on the express website.

   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/dataTable.JPG)
### 4.How to extract text code from picture verification in selenium
  - The following picture is java code about how to get screenshot in selenium
   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/screenshot.JPG)
    
  - This follows java code is that how to convert picture to text by using Tesseract
    
   ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/extract.JPG)
### 5.Testing result
  - we can get test.jpg under its directory, for example, I got this screenshot by testing code

  ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/test.jpg)
  
  - the test result of this instance, the following picture.
   
 ![](https://github.com/AnnaQiao/SeleniumeExtractTextfromImage/blob/master/pictures/testResult.JPG)
  
## Conclusion
  The characters picture verification code is more strong than slider picture verification !!!, I can not use Tesseract to get the verification code.
