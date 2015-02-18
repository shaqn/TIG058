package club;

import tig058.handin01.member.Member;
import java.util.*;
/**
 * Simple compator class intented to be used when wanting to Sort
 * lists of members according to team. Sorts primarily on members of team and
 * secondaily on given name.
 *
 */
public class MemberEmailComparator implements Comparator<Member>{

    public int compare(Member s1, Member s2){

	    return s1.getEmail().compareTo(s2.getEmail());
	}
 
}
