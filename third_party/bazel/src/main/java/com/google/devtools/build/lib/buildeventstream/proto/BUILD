load("@rules_java//java:defs.bzl", "java_proto_library")
load("@rules_proto//proto:defs.bzl", "proto_library")

package(default_visibility = ["//src:__subpackages__"])

filegroup(
    name = "srcs",
    srcs = glob(["**"]),
    visibility = ["//third_party/bazel/src/main/java/com/google/devtools/build/lib:__pkg__"],
)

java_proto_library(
    name = "build_event_stream_java_proto",
    # The Bazel IntelliJ plugin uses this.
    visibility = ["//visibility:public"],
    deps = ["build_event_stream_proto"],
)

proto_library(
    name = "build_event_stream_proto",
    srcs = ["build_event_stream.proto"],
    deps = [
        "//third_party/bazel/src/main/java/com/google/devtools/build/lib/packages/metrics:package_load_metrics_proto",
        "//third_party/bazel/src/main/protobuf:command_line_proto",
        "//third_party/bazel/src/main/protobuf:failure_details_proto",
        "//third_party/bazel/src/main/protobuf:invocation_policy_proto",
        "@com_google_protobuf//:duration_proto",
        "@com_google_protobuf//:timestamp_proto",
    ],
)
