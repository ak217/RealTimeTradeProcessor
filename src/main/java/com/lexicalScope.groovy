def outer() {
    def greeting = "Hello"
    def inner = { name -> println "$greeting, $name" }
    return inner
}

def closure = outer()
closure("Ankur")