package com.ardsj.dagger2samples.contract

import com.ardsj.dagger2samples.entity.Task

interface TaskRepositoryContract {

    fun createTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit)

    fun updateTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit)

    fun deleteTask(task: Task, actionSuccess: () -> Unit, actionError: (e: Exception) -> Unit)

    fun loadTasks(actionSuccess: (tasks: List<Task>) -> Unit, actionError: (e: Exception) -> Unit)

}