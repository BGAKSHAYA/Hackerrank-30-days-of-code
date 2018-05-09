class Student extends Person{
	private int[] testScores;
   
    /*	
    *   Class Constructor
    *   
    *   @param firstName - A string denoting the Person's first name.
    *   @param lastName - A string denoting the Person's last name.
    *   @param id - An integer denoting the Person's ID number.
    *   @param scores - An array of integers denoting the Person's test scores.
    */
    // Write your constructor here
    Student(String firstName, String lastName, int identification, int testscore[])
    {
        super(firstName,lastName, identification);
        testScores=testscore.clone();
    }

    /*	
    *   Method Name: calculate
    *   @return A character denoting the grade.
    */
    // Write your method here
    char calculate()
    {
        int sum=0;
        for(int i=0;i<testScores.length;i++)
            sum+=testScores[i];
        sum=sum/testScores.length;
        if(sum>=90&&sum<=100) return 'O';
        if(sum>=80&&sum<90) return 'E';
        if(sum>=70&&sum<80) return 'A';
        if(sum>=55&&sum<70) return 'P';
        if(sum>=40&&sum<55) return 'D';
        return 'T';
    }
}