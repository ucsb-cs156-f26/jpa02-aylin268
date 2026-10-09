package edu.ucsb.cs156.spring.hello;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TeamTest {

    Team team;

    @BeforeEach
    public void setup() {
        team = new Team("test-team");    
    }

    @Test
    public void getName_returns_correct_name() {
       assert(team.getName().equals("test-team"));
    }

   
    // TODO: Add additional tests as needed to get to 100% jacoco line coverage, and
    // 100% mutation coverage (all mutants timed out or killed)
    @Test
    public void toString_returns_correct_string() {
        assertEquals("Team(name=test-team, members=[])", team.toString());
    }

    @Test
    public void sameobject_test(){
        assertEquals(true, team.equals(team));
    }


    @Test
    public void different_class(){
        String other = "not-a-team";
        assertEquals(false, team.equals(other));
    }

    @Test
    public void equals_members_not_same_test(){
        Team other = new Team("test-team");
        other.addMember("new-member");
        assertEquals(false, team.equals(other));
    }

    @Test
    public void equals_same_name_different_members_test(){
        Team other = new Team("different-team");
        assertEquals(false, team.equals(other));
    }


    @Test
    public void equals_same_name_member_test(){
        Team other = new Team("test-team");
        assertEquals(true, team.equals(other));
    }

    @Test
     void same_name_same_members_hashcode(){
        Team t1 = new Team();
        t1.setName("foo");
        t1.addMember("bar");
        Team t2 = new Team();
        t2.setName("foo");
        t2.addMember("bar");
        assertEquals(t1.hashCode(), t2.hashCode());
      }



    @Test
     void hashCodeFunc_test(){
        Team t = new Team();
        int result = t.hashCode();
        int expectedResult = 1;
        assertEquals(expectedResult, result);
    }

    }





