import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Scanner keyboard = new Scanner(System.in);
            FamilyTree<String> tree;

            System.out.print("Enter the path to the genealogies file: ");
            tree = loadTree(keyboard.nextLine().trim());

            while(true)
            {
                System.out.print("Enter a parent and child separated by a comma: ");
                String line = keyboard.nextLine();

                String[] names = line.split(", ");

                if(isDescendant(names[1], names[0], tree))
                {
                    System.out.println(getLineage(names[1], names[0], tree, names[1]));
                }
                else
                {
                    System.out.println(names[1] + " is not a descendant of " + names[0] + ".");
                }
            }
        }
        catch(FileNotFoundException e)
        {
            System.out.println("A file doesn\'t exist there!");
        }
    }

    private static FamilyTree<String> loadTree(String path) throws FileNotFoundException
    {
        File file = new File(path);
        Scanner scanner = new Scanner(file);

        FamilyTree<String> tree;

        int entries = Integer.parseInt(scanner.nextLine());

        // Initial setup of tree
        {
            String line = scanner.nextLine();
            String[] words = getWords(line);

            tree = new FamilyTree<String>(words[0]);

            for(int i = 1; i < words.length; i++)
            {
                tree.addNode(words[i]);
            }
        }

        for(int i = 1; i < entries; i++)
        {
            String line = scanner.nextLine();
            String[] words = getWords(line);

            FamilyTree<String> person = tree.getTree(words[0]);

            for(int j = 1; j < words.length; j++)
            {
                person.addNode(words[j]);
            }
        }

        return tree;
    }

    private static String[] getWords(String line)
    {
        return line.split("\\  *[\\d*]?[  *]?\\s*");
    }

    private static boolean isDescendant(String child, String target, FamilyTree<String> tree)
    {
        FamilyTree<String> childTree = tree.getTree(child);
        FamilyTree<String> parentTree = tree.getTree(target);

        return parentTree.getTree(childTree.getHead()) == null ? false : true;
    }

    /**
     * Gets the lineage in a family from person to as far back as recorded.
     *
     * @param child Child to get lineage of.
     * @param target Target to get lineage to.
     * @param tree Master family tree.
     * @param lineage The current lineage. Pass the same value as the person argument.
     * @return The lineage from the supplied person to as far back as target.
     */
    private static String getLineage(String child, String target, FamilyTree<String> tree, String lineage)
    {
        FamilyTree<String> childTree = tree.getTree(child);
        FamilyTree<String> parentTree = childTree.getParent();

        if(!parentTree.getHead().equals(target))
        {
            return getLineage(parentTree.getHead(), target, tree, lineage + " -> " + parentTree.getHead());
        }
        else
        {
            return lineage + " -> " + parentTree.getHead();
        }
    }
}
