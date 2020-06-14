# Setup for writing ImageJ Plugins with Eclipse, IntelliJ or NetBeans
This repo contains a minimal setup for writing ImageJ plugins with [IntelliJ](https://www.jetbrains.com/idea/). It loosely follows the [**imagingbook**](http://imagingbook.com) support suite and was originally adopted from https://imagingbook.com/2017/04/29/new-github-repo-for-eclipseintellij-setup/.

The projects are set up with ``<project-root>/plugins/`` as the default output folder (for generated ``.class`` files).

## Adding other libraries (jars)
This project uses **no dependency management** (such as *Maven*) to keep things simple. If any external libraries are required, just do the following:
- Copy the associated JAR file ``xxx.jar`` into ``jars/``.
- In your IDE, add the JAR file to the Java build path.
- Restart ImageJ.


## Additional ImageJ resources

- [ImageJ Home](https://imagej.nih.gov/ij/index.html)
- [ImageJ Plugins](http://rsbweb.nih.gov/ij/plugins/index.html)
- [ImageJ API (JavaDoc)](http://rsbweb.nih.gov/ij/developer/api/index.html)
- [ImagingBook (book and source code)](http://imagingbook.com)
# imagej
