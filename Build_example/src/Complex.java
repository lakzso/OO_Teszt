
public class Complex {
	private final double x;
	private final double y;

	public static class Builder {
		private double x;
		private double y;

		public Builder() {
			x = 0;
			y = 0;
		}

		public Builder x(double xx)

		{
			x = xx;
			return this;
		}

		public Builder y(double yy)

		{
			y = yy;
			return this;
		}

		public Complex build() {
			return new Complex(this);
		}
	}

	private Complex(Builder builder) {
		x = builder.x;
		y = builder.y;

	}

}
