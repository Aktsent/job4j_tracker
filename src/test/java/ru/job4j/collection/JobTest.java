package ru.job4j.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

public class JobTest {

    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNmPr = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNmPr.compare(
                new Job("Impl task", 1),
                new Job("Impl task", 0)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void whenJobDescByPriority() {
        Job job = new Job("A", 1);
        Job job1 = new Job("B", 2);
        Job job2 = new Job("C", 3);
        List<Job> jobs = Arrays.asList(job, job1, job2);
        Collections.sort(jobs, new JobDescByPriority());
        List<Job> expected = Arrays.asList(job2, job1, job);
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobAscByPriority() {
        Job job = new Job("A", 1);
        Job job1 = new Job("B", 2);
        Job job2 = new Job("C", 3);
        List<Job> jobs = Arrays.asList(job2, job, job1);
        Collections.sort(jobs, new JobAscByPriority());
        List<Job> expected = Arrays.asList(job, job1, job2);
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobAscByName() {
        Job job = new Job("A", 1);
        Job job1 = new Job("B", 2);
        Job job2 = new Job("C", 3);
        List<Job> jobs = Arrays.asList(job1, job2, job);
        Collections.sort(jobs, new JobAscByName());
        List<Job> expected = Arrays.asList(job, job1, job2);
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenJobDescByName() {
        Job job = new Job("A", 1);
        Job job1 = new Job("B", 2);
        Job job2 = new Job("C", 3);
        List<Job> jobs = Arrays.asList(job, job1, job2);
        Collections.sort(jobs, new JobDescByName());
        List<Job> expected = Arrays.asList(job2, job1, job);
        assertThat(jobs, is(expected));
    }

    @Test
    public void whenCompatorByProrityAndName() {
        Comparator<Job> cmpPrNm = new JobAscByPriority().thenComparing(new JobAscByName());
        int rsl = cmpPrNm.compare(
                new Job("A", 1),
                new Job("B", 2)
        );
        assertThat(rsl, lessThan(0));
    }
}