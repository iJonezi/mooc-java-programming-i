/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author jones
 */
public class ExerciseManagementTest {
    private ExerciseManagement management;
    
    @Before
    public void initialize(){
        management = new ExerciseManagement();
    }
    
    @Test
    public void exerciseListEmptyAtBeginning() {
        assertEquals(0, management.exerciseList().size());
    }
    
    @Test
    public void addingExerciseListGrowsByOne() {
        management.add("this is a test");
        assertEquals (1, management.exerciseList().size());
    }
    
    @Test
    public void addedExerciseIsInList(){
        management.add("this is a test");
        assertTrue(management.exerciseList().contains("this is a test"));
    }
    
    @Test
    public void exerciseCanBeMarkedAsCompleted() {
        management.add("test");
        management.markAsCompleted("test");
        assertTrue(management.isCompleted("test"));
    }
}
