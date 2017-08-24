const Task = require('../models/Task');

module.exports = {
    index: (req, res) => {
        Task.find().then(t => {
            res.render('task/index', {'tasks': t });
        });
    },
	createGet: (req, res) => {
        res.render('task/create');
	},
	createPost: (req, res) => {
        let task = req.body;

        Task.create(task).then(t => {res.redirect("/")})
	},
	deleteGet: (req, res) => {
        let task = Task.findById(req.params.id)
			.then(t => {res.render('task/delete', t)
			});
	},
	deletePost: (req, res) => {
        let task = Task.findByIdAndRemove(req.params.id)
            .then(t => {res.redirect('/')
            });
	}
};