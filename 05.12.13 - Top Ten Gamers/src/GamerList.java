import java.util.LinkedList;
import java.util.List;

public class GamerList
{
    private static int MAX_SIZE = 10;

    private List<Gamer> list;

    public GamerList()
    {
        list = new LinkedList<Gamer>();
    }

    public void insert(String name, int score)
    {
        boolean isHighScore = false;

        for(int i = 0; i < list.size(); i++)
        {
            Gamer gamer = list.get(i);

            if(score > gamer.score)
            {
                isHighScore = true;
                list.add(i, new Gamer(name, score));
            }
        }

        if(!isHighScore && !tooBig())
        {
            list.add(new Gamer(name, score));
        }

        if(tooBig())
        {
            list.remove(list.size() - 1);
        }
    }

    public String getName(int index)
    {
        return list.get(index).name;
    }

    public int getScore(int index)
    {
        return list.get(index).score;
    }

    private boolean tooBig()
    {
        return list.size() > MAX_SIZE;
    }

    private class Gamer
    {
        public String name;
        public int score;

        public Gamer(String name, int score)
        {
            this.name = name;
            this.score = score;
        }
    }
}
