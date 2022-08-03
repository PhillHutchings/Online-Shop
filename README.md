# Online-Shop

This is a program i created as part of an idea given to me by my tutor from my online coarse in java, it was suggested that i create an online shop to showcase, i was told that i could write in program form and not an actually online shop n the web, aslong as it acted like a shop in practice, so this is what i came up with, all in all it was quite an easy project the design is all my own which i am quite proud of, as i think it looks very good, coding wise it is ok, but i didnt make enough comments and it could be a bit tidier

the hardest part about writing this program was the menu action, which after not too much trial and error i came up with a cool way to do it, where there is infinite ammount of product to be added to the categories, every time you click what you want the program reads the database and feeds it into the 6 windows and you click next or back to read the next 6 items, only when there is no more items to show does the next button not work, the program autofills any empty product spaces with a coming soon picture.
the action listener that goes with the buttons to check which panel the button was clicked on and what product occupies that window was very technical but i managed to complete it all on my own.

The only pitfall on this program is that i couldnt even though i tried for literally days was to set up a mailing system for the program in the contact us window, i either could not get the computer to allow acces through localhost, or achieving that could not get it to connect to the mailing server for the email address used, i tried many ways and scoured the internet for advice and solutions but could not find one that worked, this may not be good portfolio wise, but i hold my hands up in defeat, the only thing through my learning that i have done to, im not even sure that had i got it working on my personal computer that it would be replicable on another.


HOW IT WORKS

1:
	on opening the program a method is run to check if an admin has entered into the database, if not the add admin window will open for you to enter an admin, the admin has special privillages to change things with in the program.

2:
	Once you have entered the admin details, go to the log in button on the main menu bar and enter the details of the admin, be sure to check the admin toggle in the top right hand corner of the window,
once in the admin panel at the top right of the main page wil appear.

ADMIN

add category:

enter the category name in the field, click to add new product which will add a row to fill out for that category, click search image and a file chooser will open in the product images folder, where you can deposit images for your category before hand or add them later, if you have them already choose them to add to the table row, once complete click dsave and the category will be saved, a new folder will be created and all images will be moved to that folder.

edit products:

here you can edit the existing categories by either removing/adding products or adding/ updating the image once complete click update.

remove category:

will completely remove the chosen category.

change pictures:

this is for changing the background picture of the widows in the program, choose which window from the drop down menu click add image, file chooser will open in the shop pics folder, click on the image and you will get a preview of the image in the box, click apply to apply, changes will be saved in a text file that will be read at on the opening of the program to automatically add the saved backgrounds.

customers:

this is a list of all customers signed up along with their details, mailing options do not work. but you can click on the get last order button to see what they ordered last.

sales:

you can check all the sales of items by day or by catgory and day.

add admin:

To add another admin.

CUSTOMER

shop:

Click on the shop to open out the list of categories, click on the category you wish to see see and the menu will open up, cycle through the next and previous buttons, choose amount you want and click add to basket.

log in:

You will be promted to log in if you attemt to add to the basket and you are not logged in.

sign up:

if you are not already signed up, sign up here.

contact us:

Mailing part that was not succesful.

about us:

A little statement with a changing background, can be edited by admin in the window itself.

my basket:

where all the items added are shown, button to add the last order you made, either to your existing items or to start a fresh with just your last order, check out to pay.. no payment feature.
