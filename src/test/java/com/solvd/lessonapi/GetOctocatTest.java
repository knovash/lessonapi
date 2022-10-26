package com.solvd.lessonapi;

import org.apache.commons.io.FileUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import org.testng.reporters.jq.Main;

import java.io.File;
import java.io.IOException;
import java.net.URL;

public class GetOctocatTest {

    private static final Logger LOGGER = LogManager.getLogger(GetOctocatTest.class);

    @Test(testName = "Verifies compare octocat")
    public void GetOctocatTest() throws IOException {
        GetOctocatMethod getOctocatMethod = new GetOctocatMethod();
        getOctocatMethod.callAPI();
        String rs = getOctocatMethod.callAPI().asString();
        URL resource = Main.class.getClassLoader().getResource("octocat.txt");
        String octocat = FileUtils.readFileToString(new File(resource.getFile()));
        LOGGER.info(octocat);
        SoftAssert sa = new SoftAssert();
        sa.assertEquals(rs, octocat,"different octocat");
        sa.assertAll();
    }
}
