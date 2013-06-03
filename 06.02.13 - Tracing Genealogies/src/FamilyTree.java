import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;

public class FamilyTree<T>
{
    private T head;
    private ArrayList<FamilyTree<T>> nodes = new ArrayList<FamilyTree<T>>();
    private FamilyTree<T> parent = null;
    private HashMap<T, FamilyTree<T>> locate = new HashMap<T, FamilyTree<T>>();
    
    public FamilyTree(T head)
    {
        this.head = head;
        locate.put(head, this);
    }
    
    public FamilyTree<T> addNode(T node)
    {
        FamilyTree<T> t = new FamilyTree<T>(node);
        nodes.add(t);
        t.parent = this;
        t.locate = this.locate;
        locate.put(node, t);
        return t;
    }

    public FamilyTree<T> setAsParent(T parentRoot)
    {
        FamilyTree<T> t = new FamilyTree<T>(parentRoot);
        t.nodes.add(this);
        t.parent = t;
        t.locate.put(head, this);
        t.locate.put(parentRoot, t);
        return t;
    }

    public T getHead()
    {
        return head;
    }

    public FamilyTree<T> getTree(T element)
    {
        return locate.get(element);
    }
    
    public FamilyTree<T> getParent()
    {
        return parent;
    }

    public Collection<T> getSuccessors(T root)
    {
        Collection<T> successors = new ArrayList<T>();
        FamilyTree<T> tree = getTree(root);

        if(tree != null)
        {
            for(FamilyTree<T> node : tree.nodes)
            {
                successors.add(node.head);
            }
        }

        return successors;
    }

    public Collection<FamilyTree<T>> getSubTrees()
    {
        return nodes;
    }

    public static <T> Collection<T> getSuccessors(T of, Collection<FamilyTree<T>> in)
    {
        for(FamilyTree<T> tree : in)
        {
            if(tree.locate.containsKey(of))
            {
                return tree.getSuccessors(of);
            }
        }

        return new ArrayList<T>();
    }

    @Override
    public String toString()
    {
        return printTree(0);
    }

    private static final int indent = 2;

    private String printTree(int increment)
    {
        String s, inc = "";

        for(int i = 0; i < increment; i++)
        {
            inc = inc + " ";
        }

        s = inc + head;

        for(FamilyTree<T> child : nodes)
        {
            s += "\n" + child.printTree(increment + indent);
        }

        return s;
    }
    
}
