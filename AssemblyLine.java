public class AssemblyLine {

    //Declaring Fields
    private String assemblyName;
    private int widgetMade;
    private int widgetRejected;

   /**
      No-Arg Constructor
   */
    public AssemblyLine() {
        assemblyName = "";
        widgetMade = 0;
        widgetRejected = 0;
    }

   /**
      Constructor that accepts argument for each field
      @param n The name of the assembly line
      @param t The total number of widgets that were manufactured 
      @param r The number of rejected widgets that were manufactured   
   */
    public AssemblyLine(String n, int m, int r) {
        assemblyName = n;
        widgetMade = m;
        widgetRejected = r;

    }

    //Setters
    
    /**
      The setAssemblyName method sets the name of the assembly line
      @param n The name.
   */
    public void setAssemblyName(String n){
        assemblyName = n;
    }

    /**
      The setWidgetsMade method sets the total number of widgets that were manufactured
      @param t The total number of widgets.
   */
    public void setWidgetsMade(int m){
        widgetMade = m;
    }

   /**
      The setWidgetsRejected method sets the number of rejected widgets that were manufactured
      @param t The number of rejected widgets.
   */
    public void setWidgetRejected(int r){
        widgetRejected = r;
    }


    //Getters
    
    /**
      The getName method returns the name of the assembly line
      @return The name.
   */
    public String getAssemblyName(){
        return assemblyName;
    }   
    /**
      The getWidgetsMade method returns the total number of widgets that were manufactured
      @return The total number of widgets.
   */
   public int getWidgetsMade(){
        return widgetMade;
    }

    /**
      The getWidgetsRejected method returns the number of rejected widgets that were manufactured
      @return The number of rejected widgets.
   */
    public int getWidgetsRejected(){
        return widgetRejected;
    }

   //Other methods

   /**
      The calcAcceptableWidgets method calculates and returns the number of acceptable widgets that were manufactured
      @return The number of acceptable widgets.
   */
    public int calcAcceptableWidgets(){
        return widgetMade - widgetRejected;
    }

    
     /**
      The calcQuality method calculates and returns the overall quality of the assembly line
      @return The overall quality.
   */  
    public double calcQualityOfLine(){
        return (double)calcAcceptableWidgets() / (double)widgetMade;
    }

    

}//End Class