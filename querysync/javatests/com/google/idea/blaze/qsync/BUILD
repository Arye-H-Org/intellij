java_library(
    name = "TestUtils",
    srcs = [
        "LoggingContext.java",
        "NoopContext.java",
        "QuerySyncTestUtils.java",
    ],
    visibility = [":__subpackages__"],
    deps = [
        "//querysync/java/com/google/idea/blaze/qsync",
        "//querysync/java/com/google/idea/blaze/qsync/query",
        "//querysync/javatests/com/google/idea/blaze/qsync/testdata",
        "//shared",
        "//shared:vcs",
        "//third_party/java/flogger",
        "@com_google_guava_guava//jar",
    ],
)

java_test(
    name = "GraphToProjectConverterTest",
    srcs = ["GraphToProjectConverterTest.java"],
    deps = [
        ":TestUtils",
        "//querysync/java/com/google/idea/blaze/qsync",
        "//querysync/java/com/google/idea/blaze/qsync/project",
        "//querysync/java/com/google/idea/blaze/qsync/project:project_java_proto",
        "//querysync/javatests/com/google/idea/blaze/qsync/testdata",
        "@com_google_guava_guava//jar",
        "@junit//jar",
        "@truth//jar",
    ],
)

java_test(
    name = "AffectedPackagesTest",
    size = "small",
    srcs = ["AffectedPackagesTest.java"],
    deps = [
        ":TestUtils",
        "//querysync/java/com/google/idea/blaze/qsync",
        "//querysync/java/com/google/idea/blaze/qsync/query",
        "//querysync/javatests/com/google/idea/blaze/qsync/query:QuerySummaryTestUtil",
        "//shared:vcs",
        "@com_google_guava_guava//jar",
        "@junit//jar",
        "@truth//jar",
    ],
)

java_test(
    name = "ProjectRefresherTest",
    size = "small",
    srcs = ["ProjectRefresherTest.java"],
    deps = [
        ":TestUtils",
        "//querysync/java/com/google/idea/blaze/qsync",
        "//querysync/java/com/google/idea/blaze/qsync/project",
        "//querysync/java/com/google/idea/blaze/qsync/query",
        "//querysync/java/com/google/idea/blaze/qsync/query:querysummary_java_proto",
        "//querysync/javatests/com/google/idea/blaze/qsync/query:QuerySummaryTestUtil",
        "//shared:vcs",
        "@com_google_guava_guava//jar",
        "@junit//jar",
        "@truth//jar",
    ],
)

java_test(
    name = "PartialProjectRefreshTest",
    size = "small",
    srcs = ["PartialProjectRefreshTest.java"],
    deps = [
        ":TestUtils",
        "//querysync/java/com/google/idea/blaze/qsync",
        "//querysync/java/com/google/idea/blaze/qsync/project",
        "//querysync/java/com/google/idea/blaze/qsync/query",
        "//querysync/java/com/google/idea/blaze/qsync/query:querysummary_java_proto",
        "//shared",
        "@com_google_guava_guava//jar",
        "@junit//jar",
        "@truth//jar",
    ],
)

java_test(
    name = "GeneratedSourceProjectUpdaterTest",
    size = "small",
    srcs = ["GeneratedSourceProjectUpdaterTest.java"],
    deps = [
        ":TestUtils",
        "//querysync/java/com/google/idea/blaze/qsync",
        "//querysync/java/com/google/idea/blaze/qsync/project",
        "//querysync/java/com/google/idea/blaze/qsync/project:project_java_proto",
        "//querysync/javatests/com/google/idea/blaze/qsync/testdata",
        "@com_google_guava_guava//jar",
        "@junit//jar",
        "@truth//jar",
    ],
)
