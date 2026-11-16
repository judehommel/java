/*
   import proper packages
   Name: Jude Hommel
   Description: A cli web browser program featuring a history and site status checker
   Testimony: JH



   Make sure to test your code with proper test cases to find all the cases that causes runtime errors

   Must provide commnets for each class and each method. 
   The comments should explain what the method does and not how it does it.

   Points wil be deducted if your code crashes while I am testing it.
   Think about the cases that the code might crash.


   Required(part of your grade): Explain the following: 
   "No challenge was faced is not accepted"
   what is one of the challenges you faced while implementing the code. Must explain in details
   What was the process of fixing it 

   The biggest challenge I faced when creating this cli browser was understanding the outline.
   I'm confused by the point of the ArrayList<WebPage> history variable because in the Broswer class description and 
   example output only the forward and backward stacks are used. I chose to stick to the class's details as described in the outline
   by only adding the variable's declaration and implementing each function as stated. I think this approach makes more sense than
   adding or altering anothor function that was not mentioned at all. I also was confused by the description of Method #7 (displayHistory()) 
   at first. I was confused about how to traverse the stacks using a for loop without a getter for the ArrayList<T> list variable.
   Then I thought of using a temporary stack where you would store each popped value so that it doesn't break the encapsulation for the stack
   like how adding a getter would. It does change the order of the stack, but I think thats fine because the WebPages have a date accessed 
   variable, so if we wanted we could sort using that or use another temp stack to flip it again.

   Add additional feature to the Browser class: Gets the status code and response phrase to see if site is running
   why did you select this feature: It relates to the https/1.1 server I was building and its not too difficult
   How does it add it funtionality to the program: Allows the user to check if a server is actually active by looking at the response
   */

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class WebHommel // must change the name to a completely new name along with your last name
{
    //no code here
}
/*Must include commnets for every single method*/
class WebPage
{
    private String url;
    private String title;
    private LocalDateTime time;

    // Creates a WebPage object from a String url
    public WebPage(String url) 
    {
        this.url = url;
        this.title = toTitle(url);
        this.time = LocalDateTime.now();
    }

    // Appends either https://www. or http://www. to the beginning of a url
    public String toTitle(String url)
    {
        if (Math.random() < 0.5)
        {
            return "https://www." + url;
        }
        else 
        {
            return "http://www." + url;
        }
    }

    // Returns the url String
    public String getUrl() {
        return url;
    }

    // Returns the title String
    public String getTitle() {
        return title;
    }

    // Returns the date and time that the WebPage accessed 
    public LocalDateTime getTime() {
        return time;
    }

    // Sets the url String
    public void setUrl(String url) {
        this.url = url;
    }

    // Sets the title String
    public void setTitle(String title) {
        this.title = title;
    }

    // Sets the time
    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    // Returns a string representation of the WebPage and its associated information
    public String toString()
    {
        return String.format("Page url: %s%nPage title: %s%nDate and Time accessed: %s", url, title, time.toString());
    }
}
/*Must include commnets for every single method*/
class Stack<T>   // Generic class  
{
    private ArrayList<T> list;

    // Creates a new Stack Data Structure Object
    public Stack()
    {
        list = new ArrayList<T>();
    }

    // Sets the ArrayList, list, that holds objects of type T
    public void setList(ArrayList<T> list) {
        this.list = list;
    }

    // Pushes a new object on top of the stack
    public void push(T obj)
    {
        list.add(obj);
    }

    // Removes an object from the top of the stack and returns it
    public T pop()
    {
        if (list.size() > 0)
        {
            return list.remove(list.size() - 1);
        }
        return null;
    }

    // Clears the Arraylist list
    public void clear()
    {
        list.clear();
    }

    // Returns the size of the Arraylist list
    public int size()
    {
        return list.size();
    }

    // Returns a string representation of all the objects that are inside of list
    public String toString()
    {
        String str = "";

        for (T element : list) 
        {
            str += element.toString() + "\n\n";
        }
        return str;
    }
}
/*Must include commnets for every single method*/
class Browser
{
    // Not all top level domains
    // Expandable
    private static String[] topLevelDomains = {".com", ".org", ".net"};
    private static String[] forbiddenChars = {" ", "<", ">", "\"", "|", "\\", "{", "}", "[", "]", ":", "/", "?", "#", "&", "=", "@"};

    private Stack<WebPage> backward;
    private Stack<WebPage> forward;
    private ArrayList<WebPage> history;
    private WebPage currentPage;

    // Creates a new Browser with the currentPage's url being the url String
    public Browser(String url) 
    {
        this.backward = new Stack<WebPage>();
        this.forward = new Stack<WebPage>();
        this.history = new ArrayList<WebPage>();
        this.currentPage = new WebPage(url);
    }

    // Returns the currentPage WebPage
    public WebPage getCurrentPage()
    {
        return currentPage;
    }

    // Checks if a string is a valid url by checking the ending and for forbidden characters
    public boolean isUrlValid(String url)
    {
        for (int i = 0; i < forbiddenChars.length; i++) 
        {
            if (url.contains(forbiddenChars[i]))
            {
                return false;
            }
        }

        for (int i = 0; i < topLevelDomains.length; i++) 
        {
            if (url.endsWith(topLevelDomains[i]))
            {
                if (!url.startsWith(".")) {
                    return true;
                }
            }
        }

        return false;
    }

    // Sets current page and updates forward and backward stacks, if url is valid
    public void visitPage(String url)
    {
        if (!isUrlValid(url))
        {
            System.out.println("Could not visit page");
            System.out.println("Url invalid");
            return;
        }

        backward.push(currentPage);
        currentPage = new WebPage(url);
        forward.clear();
        System.out.println("Current Page: " + url);
    }

    // Sets currentPage back one page
    public void backPage()
    {
        WebPage poppedPage = backward.pop();

        if (poppedPage != null)
        {
            forward.push(currentPage);
            currentPage = poppedPage;
            System.out.println("Current Page: " + currentPage.getUrl());
        }
        else
        {
            System.out.println("Could not go backward any farther");
            System.out.println("Current Page: " + currentPage.getUrl());
        }
    }

    // Sets currentPage forward one page
    public void forwardPage()
    {
        WebPage poppedPage = forward.pop();

        if (poppedPage != null)
        {
            backward.push(currentPage);
            currentPage = poppedPage;
            System.out.println("Current Page: " + currentPage.getUrl());
        }
        else
        {
            System.out.println("Could not go forward any farther");
            System.out.println("Current Page: " + currentPage.getUrl());
        }
    }

    // Prints the current page url
    public void refreshPage()
    {
        System.out.println("Current Page: " + currentPage.getUrl());
    }

    // Prints all current page information
    public void displayPage()
    {
        System.out.println(currentPage.toString());
    }

    // Prints page informations for backward history, forward history, and the current page
    public void displayHistory()
    {
        System.out.println("Backward History: ");
        Stack<WebPage> tmpStack = new Stack<WebPage>();
        while (backward.size() != 0)
        {
            WebPage page = backward.pop();
            System.out.println(page.getUrl() + " " + page.getTime().toString());
            tmpStack.push(page);
        }
        while (tmpStack.size() != 0)
        {
            backward.push(tmpStack.pop());
        }

        if (backward.size() == 0)
        {
            System.out.println("No backward history");
        }

        tmpStack.clear();

        System.out.println();
        System.out.println("Current Page: ");
        System.out.println(currentPage.getUrl() + " " + currentPage.getTime().toString());
        System.out.println();

        System.out.println("Forward History: ");
        while (forward.size() != 0)
        {
            WebPage page = forward.pop();
            System.out.println(page.getUrl() + " " + page.getTime().toString());
            tmpStack.push(page);
        }

        while (tmpStack.size() != 0)
        {
            forward.push(tmpStack.pop());
        }

        if (forward.size() == 0)
        {
            System.out.println("No forward history");
        }
    }

    // Clears the forward and backward history stacks
    public void clearHistory()
    {
        forward.clear();
        backward.clear();
    }
}
/*Must include commnets for every single method*/
class Driver
{
    // Returns status code and reason phrase of the status line for an http head response
    public static String getSiteStatus(String title)
    {
        try
        {
            URI uri = new URI(title);
            HttpURLConnection conn = (HttpURLConnection) uri.toURL().openConnection();
            conn.setRequestMethod("HEAD");
            String code = String.valueOf(conn.getResponseCode());
            String message = conn.getResponseMessage();
            conn.disconnect();
            return "Page Response: " + code + " " + message;
        }
        catch (URISyntaxException err)
        {
            return "Invalid URL";
        }
        catch (IOException err)
        {
            return "An error occurred";
        }
    }

    // The main function manages IO
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Browser browser = new Browser("home.com");

        boolean isRunning = true;
        while (isRunning)
        {
            System.out.println("======= Browser Menu =======");
            System.out.println("1. Visit new page");
            System.out.println("2. Go backward");
            System.out.println("3. Go forward");
            System.out.println("4. Refresh page");
            System.out.println("5. Show current page");
            System.out.println("6. Show browsing history");
            System.out.println("7. Clear history");
            System.out.println("8. Check page status");
            System.out.println("9. Exit");

            System.out.print("Select an option: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Please enter a number between 1 and 9.\n");
                scanner.next();
                continue;
            }
            int option = scanner.nextInt();
            scanner.nextLine();
            System.out.println();
            switch (option)
            {
                case 1:
                    System.out.print("Enter url: ");
                    String url = scanner.nextLine();
                    browser.visitPage(url);
                    break;
                case 2:
                    browser.backPage();
                    break;
                case 3:
                    browser.forwardPage();
                    break;
                case 4:
                    browser.refreshPage();
                    break;
                case 5:
                    System.out.println(browser.getCurrentPage().toString());
                    break;
                case 6:
                    browser.displayHistory();
                    break;
                case 7:
                    browser.clearHistory();
                    break;
                case 8:
                    String title = browser.getCurrentPage().getTitle();
                    System.out.println(getSiteStatus(title));
                    break;
                case 9:
                    isRunning = false;
                    break;
                default:
                    System.out.println("Invalid input. Please enter a number between 1 and 9.\n");
                    break;
            }
            System.out.println();
        }
        scanner.close();
    }
}
