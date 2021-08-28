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
        maven('clean package','java-tomcat-sample/pom.xml')
    }
    publishers{
        archiveArtifacts('**/*.jar')
    }
}
