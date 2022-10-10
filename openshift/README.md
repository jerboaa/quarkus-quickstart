# Getting started with OpenShift resources

## Requirements

In order to recreate the demo projects, one needs to have the `oc` CLI
tool installed on a system. Access to an OpenShift cluster is required too.
Log in using the `oc` CLI and create a new `project` (namespace) or switch
to one you have write permissions to.

## Loading Demos

Clone the source code and switch to the `openshift` folder:

```
$ oc create -f limit_range.yaml
$ oc create -f <demo_file_to_try_out>
```

For example to re-create the OpenJDK runtime example deployment use:

```
$ oc create -f limit_range.yaml
$ oc create -f demo_setup_runtime_image.yaml
```
