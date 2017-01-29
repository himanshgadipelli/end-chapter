package com.impatient.eleven.one;

import com.impatient.eleven.two.BugReport;
import com.impatient.eleven.two.Reference;
import com.impatient.eleven.two.Test;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.util.List;

/**
 * Created by bobby on 1/28/2017.
 */

@interface Entity {
}

@interface Param {
    String value();
}

@Target(ElementType.TYPE_PARAMETER)
@interface Immutable {
}


public abstract class AnnotationDemo {
    @Test
    public void checkRandomInsertions() {
    }

    @Test(timeout = 10000)
    public void hopefullyNotTooSlowAlgo() {
    }

    class CacheTest {
    }

    @BugReport(showStopper = true,
            assignedTo = "Harry",
            testClass = CacheTest.class,
            status = BugReport.Status.CONFIRMED)
    public void buggyMethod() {
    }

    @BugReport(reportedBy = {"Harry", "Fred"})
    public void anotherBuggyMethod() {
    }

    @BugReport(ref = @Reference(id = 11235811))
    public void andAnotherBuggyMethod() {
    }

    @Test
    @BugReport(showStopper = true, reportedBy = "Joe")
    public void checkMoreRandomInsertions() {
    }

    @BugReport(showStopper = true, reportedBy = "Joe")
    @BugReport(reportedBy = {"Harry", "Carl"})
    public void checkEvenMoreRandomInsertions() {
    }

    public abstract List<?> getList(String table);

    @Entity
    public class User {
    }

    @SuppressWarnings("unchecked")
    List<User> user = (List<User>) getList("users");

    public User getUser(@Param("id") String userId) {
        return null;
    }

    public class Cache<@Immutable V> {
    }

}
