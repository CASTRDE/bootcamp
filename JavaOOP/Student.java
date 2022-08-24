public class Student
{
    private String m_name;
    private int m_age;
    private String m_gender;
    private int m_idNo;

    public Student(String name, int age, String gender, int idNo)
    {
        m_name = name;
        m_age = age;
        m_gender = gender;
        m_idNo = idNo;
    }

    public String getName()
    {
        return m_name;
    }

    public int getAge()
    {
        return m_age;
    }

    public String getGender()
    {
        return m_gender;
    }

    public int getIdNo()
    {
        return m_idNo;
    }

    public String toString()
    {
        return "name: " + m_name + ", age: " + m_age + 
               ", gender: " + m_gender + ", ID No: " + m_idNo;
    }
}