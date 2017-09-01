namespace ToDoList.Models
{
    using System;
    using System.Data.Entity;
    using System.Linq;

    public class TaskDbContext : DbContext
    {
        public TaskDbContext()
            : base("name=TaskDbContext")
        {
        }

        public virtual DbSet<Task> Tasks { get; set; }
    }

    //public class myentity
    //{
    //    public int id { get; set; }
    //    public string name { get; set; }
    //}
}