java_library(
    name = "qsync",
    srcs = glob(["*.java"]),
    visibility = [
        "//javatests/com/google/devtools/intellij/blaze/plugin/aswb:__pkg__",
        "//querysync:__subpackages__",
    ],
    deps = [
        "//querysync/java/com/google/idea/blaze/qsync/project",
        "//querysync/java/com/google/idea/blaze/qsync/project:project_java_proto",
        "//querysync/java/com/google/idea/blaze/qsync/query",
        "//querysync/java/com/google/idea/blaze/qsync/query:querysummary_java_proto",
        "//shared",
        "//shared:vcs",
        "//third_party/auto_value",
        "@com_google_guava_guava//jar",
        "@error_prone_annotations//jar",
        "@jsr305_annotations//jar",
    ],
)
