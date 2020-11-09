import demo.Hello
import groovy.time.TimeCategory
import org.yaml.snakeyaml.Yaml


// Defining a variable in lowercase
int x = 5;

// Defining a variable in uppercase
int X = 6;

// Defining a variable with the underscore in it's name
def _Name = "Joe";

println(x);
println(X);
println(_Name);


def sum(int a , int b) {
    return (a + b)
}
println(sum(1,5))


new Hello().init("luffy").sayBye()
//println(new Hello().init("groovy").sayHi().sayBye())


def exceptionDemo(){
    try{
        println( 10/0)
    }catch(Exception ex){
        //
        println("exception detected")
        println("error is :" + ex.toString())
    }

}
exceptionDemo()

println(123)


int counter = 0
while (counter < 10){
    //println(counter)
    counter++
    if(counter == 5){
        break
    }
}

println("while done")



use( TimeCategory ) {
    def endTime = TimeCategory.plus(new Date(), TimeCategory.getSeconds(2))
    def sum = 0
    while(true) {
        println(sum++)
        sleep(1000)
        if (new Date() >= endTime) {
            println("done")
            break
        }
    }
}

def readYaml(){
    def content = new File('myblog.yaml').text
    Yaml parser = new Yaml()
    def data = parser.load(content)
    def kind = data["kind"]
    def name = data["metadata"]["name"]
    println(data["spec"]["replicas"])
    println(kind)
    println(name)
}
readYaml()


String repo = "192.168.136.10:5000/demo/myblog"
def sp = repo.split("/")
println(sp[0])
println(sp[1])