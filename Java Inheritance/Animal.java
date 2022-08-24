public class Animal {
    String m_name, m_running, m_eating;
    int m_age, m_weight;

    public Animal(String name, int age, int weight, String running, String eating){
        m_name = name;
        m_age = age;
        m_weight = weight;
        m_running = running;
        m_eating = eating;
    }
    public String getName(){
        return m_name;
    }

    public String getRunning()
    {
        return m_running;
    }

    public String getEating(){
        return m_eating;
    }

    public int getAge(){
        return m_age;
    }

    public int getWeight(){
        return m_weight;
    }

    public String toString(){
        return "age: " + m_age +", weight: " + m_weight + 
        ", running: " + m_running + ", eating: " + m_eating;
    }
}
