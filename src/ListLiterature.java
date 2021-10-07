import java.util.ArrayList;

public class ListLiterature {

    ArrayList list = new ArrayList();

    public void setList(Literature obj)
    {
        list.add(obj);

    }

    public void printList()
    {
        for (int i = 0; i < list.size(); i++)
        {
            System.out.println(list.get(i));
        }
    }

}
