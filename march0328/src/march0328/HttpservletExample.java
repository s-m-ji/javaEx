package march0328;

public class HttpservletExample {
	public static void main(String[] args) {
		method(new LoginServlet());
		method(new FileDownloadServlet());
	}

	private static void method(HttpServlet hs) {
		hs.service();
	}
}
