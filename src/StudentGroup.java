import java.util.Date;

/**
 * A fix-sized array of students
 * array length should always be equal to the number of stored elements
 * after the element was removed the size of the array should be equal to the number of stored elements
 * after the element was added the size of the array should be equal to the number of stored elements
 * null elements are not allowed to be stored in the array
 * 
 * You may add new methods, fields to this class, but DO NOT RENAME any given class, interface or method
 * DO NOT PUT any classes into packages
 *
 */
public class StudentGroup implements StudentArrayOperation {

	private Student[] students;
	
	/**
	 * DO NOT remove or change this constructor, it will be used during task check
	 * @param length
	 */
	public StudentGroup(int length) {
		this.students = new Student[length];
	}

	@Override
	public Student[] getStudents() {
		// Add your implementation here
		return null;
	}

	@Override
	public void setStudents(Student[] students) {
		int a[]=new int[n];
		BufferedReader br=new BufferedReader(neIw nputStreamReader(system.in));
		int x
		// Add your implementation here
	}

	@Override
	public Student getStudent(int index) {
		// Add your implementation here
		int x;
		BufferedReader br=new BufferedReader(neIw nputStreamReader(system.in));
		int a=parseIIntegernt(br.readLine);
		int p=parseIIntegernt(br.readLine);
		for(i=0;i<n;i++)
		{
			if(a[i]==a[p]){
				a[i]=a;
			}
			else if(a[i]=null){
				throw IllegalArgumentException;
			}
			else if(size(a[i]<0||size(a[i]>=0){
				throw IllegalArgumentException;
			}
				
			
		}
		return null;
	}

	@Override
	public void setStudent(Student student, int index) {
		// Add your implementation here
		if(size(a[i]<0||size(a[i])>=n){
							throw IllegalArgumentException;

		}
	}

	@Override
	public void addFirst(Student student) {
		// Add your implementation here
		int b=Integer.parseInt(br.readLine());
		a[n-1]=b;
		for(i=0;i<=n;i++)
{
	if(a[i]=null){				throw IllegalArgumentException;

		}
}

		}

	@Override
	public void addLast(Student student) {
		// Add your implementation here
		
		int c=Integer.parseInt(br.readLine());
		for(i=0;i<=n;i++)
{
	if(a[i]=a[c]){
						throw IllegalArgumentException;

		}
}
if(size(a[i]<0||size(a[i])>=n){
							throw IllegalArgumentException;

		}
	}

	@Override
	public void add(Student student, int index) {
		// Add your implementation here
				int a=Integer.parseInt(br.readline());
a[0]=a;
for(i=0;i<=n;i++)
{
	if(a[i]==null){
		

	throw IllegalArgumentException;
	}
	}
	@Override
	public void remove(int index) {
		// Add your implementation here
		int d=Integer.parseInt(br.readLine());
	for(i=0;i<=n;i++)
{
	if(a[i]==d)
	{
		a[i]=null;
		}
		
}
	throw IllegalArgumentException;
	}
	else if(a[i]==null){
		

	throw IllegalArgumentException;
	}
	else{
			system.out.println("student not exist");
		}
	}

	@Override
	public void remove(Student student) {
		// Add your implementation here
		int d=Integer.parseInt(br.readLine());
	for(i=0;i<=n;i++)
{
	if(a[i]!=a[d])
	{
		a[i]=null;
		}
		
}
	throw IllegalArgumentException;
	}
	else if(a[i]==null){
		

	throw IllegalArgumentException;
	}
	
	
	}

	@Override
	public void removeFromIndex(int index) {
		// Add your implementation here
		int e=Integer.parseInt(br.readLine());
	for(i=0;i<=n;i++)
{
	if(a[i]!=e)
	{
		a[i]=null;
		}
		
}
	throw IllegalArgumentException;
	}
	else if(a[i]==null){
		

	throw IllegalArgumentException;
	}
	
	}

	@Override
	public void removeFromElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void removeToIndex(int index) {
		// Add your implementation here
	}

	@Override
	public void removeToElement(Student student) {
		// Add your implementation here
	}

	@Override
	public void bubbleSort() {
		int n, c, d, swap;
    Scanner in = new Scanner(System.in);
 
    System.out.println("Input number of integers to sort");
    n = in.nextInt();
 
    int array[] = new int[n];
 
    System.out.println("Enter " + n + " integers");
 
    for (c = 0; c < n; c++) 
      array[c] = in.nextInt();
 
    for (c = 0; c < ( n - 1 ); c++) {
      for (d = 0; d < n - c - 1; d++) {
        if (array[d] > array[d+1]) /* For descending order use < */
        {
          swap       = array[d];
          array[d]   = array[d+1];
          array[d+1] = swap;
        }
      }
    }
 
    System.out.println("Sorted list of numbers");
 
    for (c = 0; c < n; c++) 
      System.out.println(array[c]);
		// Add your implementation here
	}

	@Override
	public Student[] getByBirthDate(Date date) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getBetweenBirthDates(Date firstDate, Date lastDate) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getNearBirthDate(Date date, int days) {
		// Add your implementation here
		return null;
	}

	@Override
	public int getCurrentAgeByDate(int indexOfStudent) {
		// Add your implementation here
		return 0;
	}

	@Override
	public Student[] getStudentsByAge(int age) {
		// Add your implementation here
		return null;
	}

	@Override
	public Student[] getStudentsWithMaxAvgMark() {
		// Add your implementation here
		return null;
	}

	@Override
	public Student getNextStudent(Student student) {
		// Add your implementation here
		return null;
	}
}
