```mermaid
classDiagram
    class Buffer
    class Selection
    class Sheet
    class Line
    class Box
    class LineSegment
    class Point

    class Collection

    Buffer --|> Collection
    Sheet --|> Collection
    Selection --|> Collection

    LineSegment "1..2" o-- "2" Point
    Line "1" *-- "*" LineSegment
    Box "2" -- "*" Line
    Collection "1" o-- "*" Line
    Collection "1" o-- "*" Box
```