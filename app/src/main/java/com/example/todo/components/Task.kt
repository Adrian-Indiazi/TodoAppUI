package com.example.todo.components

data class Task (
    val id: Int,
    val title: String,
    val body: String? = null,
    val startTime: String,
    val endTime: String
)
    val taskList = listOf<Task>(
        Task(
            1,
            "Do Laundry",
            "Wash and fold Clothes",
            "10:00",
            "11:00"
        ),
        Task(2,
            "Go Grocery Shopping",
            "Buy vegetables, fruits, and groceries",
            "15:30",
            "17:00"
        ),
                Task(3,
                    "Read Book",
                    "Finish the last chapter of 'The Great Gatsby'",
                    "20:00",
                    "21:30"
                ),
Task(4,
    "Attend Team Meeting",
    "Discuss project updates and upcoming tasks",
    "14:00",
    "15:30"
),
Task(5, "Exercise",
    "Go for a jog in the park",
    "07:00",
    "08:00"
),
Task(6,
    "Write Blog Post",
    "Create content for the upcoming blog post",
    "13:00",
    "15:00"
),
Task(7,
    "Call Mom",
    "Catch up with mom and share recent news",
    "18:30",
    "19:00"
),
Task(8,
    "Learn Kotlin Programming",
    "Complete exercises from Kotlin tutorial",
    "10:30",
    "12:30"
),
Task(9,
    "Watch Movie",
    "Relax and enjoy a movie night",
    "19:00",
    "21:30"
),
Task(10,
    "Practice Guitar",
    "Learn a new song on the guitar",
    "16:00",
    "17:30"
)

    )
