package unit1;

public class Complex {
	double real, imag;
	Complex(double r, double i)
	{
		real = r;
		imag = i;
	}
	void sum(Complex c1, Complex c2)
	{
		this.real = c1.real + c2.real;
		this.imag = c1.imag + c2.imag;
	}
}
