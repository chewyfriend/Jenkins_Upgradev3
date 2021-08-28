freeStyleJob("First-Job-via-dsl")
{
    description("My first job using dsl(domain specific language)")
    scm{
        git('https://github.com/chewyfriend/Jenkins_Upgradev3.git','master')
    }
    triggers{
        scm('* * * * *')
    }
    steps{
        maven('clean package','maven-samples/single-module/pom.xml')
    }
    publishers{
        archiveArtifacts('**/*.jar')
    }
}
