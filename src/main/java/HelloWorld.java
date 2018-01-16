import spark.servlet.SparkApplication;

import static spark.Spark.get;

public class HelloWorld implements SparkApplication {
	public static void main(String[] args) {
		new HelloWorld().init();
	}

	@Override
	public void init() {
		get("/hello", (req, res) -> "<!DOCTYPE html>
<html>
<body style="background-color:LightGray;">
<h1 style="color:black; text-align:center">Test App</h1>
<p>Application Status
<a href="https://www.w3schools.com/html/"> Nagios Output</a></p>
<p>DB Status <a href="https://www.w3schools.com/html/">Nagios Output</a></p>
</body>
</html>
");
	}
}
