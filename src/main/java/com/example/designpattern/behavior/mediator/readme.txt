中介者模式
将对象间复杂的关系网状结构变成结构简单的以中介者为核心的星形结构

案例：
租房：房子主人、中介、租客
联合国：国家与国家间的矛盾


缺点：
中介者对象封装了对象之间的关联关系，导致中介者对象变得比较庞大复杂，所承担的责任也比较多，维护起来也比较困难，它需要知道每个对象和他们之间的交互细节，如果它出问题，将会导致整个系统都会出问题。


