egzact-java
===================

Installation
-------------------

### gradle

```
repositories {
    // Use jcenter for resolving your dependencies.
    // You can declare any Maven/Ivy/file repository here.
    jcenter()
    maven {
        url  "http://grecure.bintray.com/egzact"
    }
}

```

And add one of the dependency.

```
dependencies {
    implementation 'fun.gre.egzact:egzact:1.0.0'
}
```


Getting Started
-------------------

```
import fun.gre.egzact.Egzact;

public class Main {
    public static void main(String args[]) {
        System.out.println(Egzact.stairl("hoge fuga fuga hoge hoge", " "));
    }
}
```

```
[[hoge], [hoge, hoge], [fuga, hoge, hoge], [fuga, fuga, hoge, hoge], [hoge, fuga, fuga, hoge, hoge]]
```
