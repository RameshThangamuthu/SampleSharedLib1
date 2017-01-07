def setName(value) {
    this.name = value;
}
def getName() {
    return this.name;
}
def caution(message) {
    echo "Hello, ${this.name}! CAUTION: ${message}"
}