package club;

import tig058.handin01.member.Member;
import java.util.*;
/**
 * Simple comparator which is intenteded to be used when wanting to sort teams.
 * Lists members according to team. Sorts primarily on members of team and
 * secondaily on given name.
 *
 */
public class MemberTeamComparator implements Comparator<Member>{

    public int compare(Member s1, Member s2){

	    return s1.getTeam().compareTo(s2.getTeam());
	}
 
}
