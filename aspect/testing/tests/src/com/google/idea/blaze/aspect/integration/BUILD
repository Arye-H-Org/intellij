load(
    "@contrib_rules_bazel_integration_test//bazel_integration_test:defs.bzl",
    "bazel_integration_tests",
)

java_binary(
    name = "BazelInvokingIntegrationTestRunner",
    testonly = True,
    srcs = ["BazelInvokingIntegrationTestRunner.java"],
    data = [
        "//aspect:aspect_files",
    ],
    main_class = "com.google.idea.blaze.aspect.integration.BazelInvokingIntegrationTestRunner",
    deps = [
        "//aspect/testing:guava",
        "//base",
    ],
)

bazel_integration_tests(
    name = "bazel_invocation_integration_tests",
    bazel_versions = [
        "4.0.0",
        "6.0.0",
    ],
    # set tags = [] because otherwise bazel_integration_tests sets
    # tags = ["manual"] and the target is not be detected via test //pkg/...
    tags = [],
    test_runner = ":BazelInvokingIntegrationTestRunner",
    workspace_path = "testdata",
)
