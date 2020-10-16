package com.github.volodyalombrozo.hgrevisionpluginexample;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HgRevisionPluginExampleApplication implements ApplicationRunner {

    @Value("${hg.bookmarks}")
    private String bookmarks;

    @Value("${hg.author}")
    private String author;

    @Value("${hg.tags}")
    private String tags;

    @Value("${hg.branch}")
    private String branch;

    @Value("${hg.date}")
    private String date;

    @Value("${hg.desc}")
    private String desc;

    @Value("${hg.rev}")
    private String rev;

    @Value("${hg.node}")
    private String node;

    private Logger logger = LoggerFactory.getLogger(HgRevisionPluginExampleApplication.class);

    public static void main(String[] args) {
        SpringApplication.run(HgRevisionPluginExampleApplication.class, args).close();
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        logger.info("Bookmarks: " + bookmarks);
        logger.info("Author: " + author);
        logger.info("Tags: " + tags);
        logger.info("Branch: " + branch);
        logger.info("Date: " + date);
        logger.info("Description: " + desc);
        logger.info("Revision: " + rev);
        logger.info("Node: " + node);
    }
}
