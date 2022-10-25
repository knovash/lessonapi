package com.solvd.lessonapi;

import org.testng.annotations.Test;

public class GetGitRepoTest {

    @Test
    public void GetGitRepoTest(){
        GetGitRepoMethod getGitRepoMethod = new GetGitRepoMethod();
        getGitRepoMethod.callAPI();
        getGitRepoMethod.validateResponse();
    }
}
