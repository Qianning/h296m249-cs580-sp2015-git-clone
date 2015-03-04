/*
 * A program to demonstrate the linked list class having an inner node
 * class. The list is maintained as a sorted list.  What is interesting
 * is the user of the class never needs to be aware of the internal
 * structure of the linked list, i.e., it is singly linked and not
 * doubly linked.
 */
public class ListDemo
{

    public static void main ( String[] args )
    {
        List list = new List ();

        list.add ( "sophomores" );
        list.add ( "seniors" );
        list.add ( "freshmen" );
        list.add ( "juniors" );
        list.add ( "graduate students" );
        list.add ( "phd students" );

        System.out.println ( "The orginal list:" );
        list.display ();

        System.out.println ();
        System.out.println ( "The list after deletion of freshmen students:" );
        list.delete ( "freshmen" );
        list.display ();

        System.out.println ();
        System.out.println ( "Searching for sophomores" );
        if ( list.search ( "sophomores" ) )
            System.out.println ( "Found sophomores" );
        else
            System.out.println ( "Could not find sophomores" );

        System.out.println ();
        System.out.println ( "Searching for phd students" );
        if ( list.search ( "phd students" ) )
            System.out.println ( "Found phd students" );
        else
            System.out.println ( "Could not find phd students" );

        System.out.println ();
        System.out.println ( "Searching for freshmen" );
        if ( list.search ( "freshmen" ) )
            System.out.println ( "Found freshmen" );
        else
            System.out.println ( "Could not find freshmen" );

        System.out.println ( "\nStudents in the list:" );
        for ( List.ListIterator iterator = list.iterator (); iterator.hasNext (); System.out.println ( iterator.next () ) );
    }
}
