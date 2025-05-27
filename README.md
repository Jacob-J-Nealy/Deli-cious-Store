# Deli-cious Sandwich Shopp App

## A CLI Application allows Customers to place a Food Order and after prints a receipt with their Custom Order and the Total.

## 🥪 About the Project
This project is the point of sales application for DELI-cious, a custom sandwich shop. 
Currently at DELI-cious our customers can fully customize their sandwich orders.
Until recently they have been managing all orders in person and are currently taking all orders on paper.
But their business is growing, and they need a way to automate the order process (and eventually even make it available online).
This application I made should take full advantage of Object Oriented Analysis and Design.
In other words, I am going to make use of OOP concepts throughout this process.

 ## Challenges & Reflections
 During the development of this application I have had the most hardships I have ever experienced in the program thus far. I started this application later than a lot of my colleagues
 because it took me significantly longer to finish the UML diagram which is a requirement to even start making the program. Even faced with this circumstance I made the decision to not allow for this situation to cut me down. 
 Instead I made the decision to press forward and do everything I could to get the best grade possible on this Capstone. My goal was a simple one. 
 
 To recieve a score of 10/10 Leading besting my Capstone Grade of 9/10 on our last Capstone.
 I will show myself that when faced with unforeseen circumstances that I can still find success, even greater than the success I have already accomplished.
 This application is birthed from my perseverance, grit, long sleepless nights, and personal dedication to deliver excellent results/work.
 I hope you enjoy it and this inspires you to see that you can always overcome your challenges and do the same.
 
![Class Diagram](C:\Users\jacob\Desktop\pluralsight\capstones\FinancialTracker)

## User Stories (Generated)
Throughout the development of this application, these User Stories played a role in shaping my process and decisions. 
They served as a roadmap, helping me stay focused on creating features that would truly meet the store's and user's needs. 
Each story has details for how I wanted to build an application intuitive, functional, and user-friendly. 
I'm excited to share how these User Stories guided the evolution of the application and brought the vision to life!

🥪 1. As a customer, I want to choose my sandwich size so that I can get the right amount of food.
      - Define size options (4", 8", 12")
      - Create a Sandwich class with a size field
      - Prompt user for sandwich size during sandwich creation
      - Validate the size input

🍞 2. As a customer, I want to select a bread type so that I can enjoy the sandwich base I prefer.
      - Define valid bread types (white, wheat, rye, wrap)
      - Add a breadType field to Sandwich class
      - Prompt user to select from available bread types
      - Validate and set bread type in the sandwich object

🧀 3. As a customer, I want to choose toppings (regular and premium) so that my sandwich is fully customized.
      -  Create a list of available toppings (separated as regular vs premium)
      - Allow user to choose multiple toppings
      - Track whether a topping is selected as “extra”
      - Add method to calculate premium charges
      - Update Sandwich to store selected toppings
      
🔥 4. As a customer, I want to choose whether to toast my sandwich so I can get it warm and crispy.
      - Add a boolean field isToasted to Sandwich
      - Prompt user: “Would you like your sandwich toasted?”
      - Store the result in the sandwich object
    
🧾 5. As a customer, I want to place an order with multiple sandwiches so I can order for myself or others.
      - Create Order class with a list of Sandwich objects
      - Allow user to add multiple sandwiches to a single order
      - Loop the sandwich creation steps for each new sandwich
      
💵 6. As a customer, I want to see a final receipt that shows my sandwich details and total cost, including extra charges.
      - Implement a method in Order to calculate total price
      - Include premium topping charges and size-based pricing
      - Format the output with sandwich details and total
      - Print the receipt when the user finishes the order


## Setup (Generated)
Instructions on how to set up and run the project using IntelliJ IDEA.

1. Open IntelliJ IDEA
   Launch IntelliJ.

On the welcome screen, click "New Project" or "Open" if you already have the folder.

2. Create or Open a Java Project
   If creating new:

Choose "Java".

Make sure SDK is selected (download one if not).

Click Next > Finish.

If opening an existing project:

Go to File > Open and select your project folder.

3. Add a New Java Class (if needed)
   Right-click src > New > Java Class

Name it Main (or your preferred name).

4. Write or Paste Your Code
   Paste your public static void main(String[] args) method in the class.

5. Run the Program
   Click the green ▶ Run button near your main() method, or

Right-click the file > Run 'Main.main()'

### Prerequisites
- IntelliJ IDEA: Ensure you have IntelliJ IDEA installed, which you can download from [here](https://www.jetbrains.com/idea/download/).
- Java SDK: Make sure Java SDK is installed and configured in IntelliJ.

### Running the Application in IntelliJ

Follow these steps to get your application running within IntelliJ IDEA:

1. Open IntelliJ IDEA.
2. Select "Open" and navigate to the directory where you cloned or downloaded the project.
3. After the project opens, wait for IntelliJ to index the files and set up the project.
4. Find the main class with the `public static void main(String[] args)` method.
5. Right-click on the file and select 'Run 'YourMainClassName.main()'' to start the application.

## Technologies Used

- Java 17 Maven.

## Demo

![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20045201.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20045033.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20044618.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20045308.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20045455.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20045622.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20050019.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20050105.png)
![image alt](https://github.com/Jacob-J-Nealy/FinancialTracker/blob/master/Screenshot%202025-05-02%20050122.png)
## Future Work

Outline potential future enhancements or functionalities you might consider adding:

- Custom Transaction Search
- Improvement of current functionalities.
- Try/Catches for all User input errors
- User Login to Display only certain information from csv


- [ChatGPT](https://chatgpt.com/)
- [Effective Java](https://www.example.com)

## Team Members

- **Jacob Nealy** - Main Creator

## Thanks

Shout Out to my Potato Instructor Raymond Mourn for his french fry guidance

Shout out to Walter Donnellan (My Tutor) for sacrificing his lunch breaks and extra time to tutor me

Shoutout Tiffany Obi for help during Breaks

- A special thanks to all classmates for their dedication and teamwork.
- #FullStackFryers
- #SigmaData
