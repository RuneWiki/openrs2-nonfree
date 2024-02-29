package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!abj")
public class Class34 {

	@OriginalMember(owner = "client!abj", name = "p", descriptor = "I")
	static final int anInt132 = 200000000;

	@OriginalMember(owner = "client!abj", name = "y", descriptor = "I")
	int anInt131;

	@OriginalMember(owner = "client!abj", name = "r", descriptor = "J")
	long aLong11;

	@OriginalMember(owner = "client!abj", name = "l", descriptor = "J")
	long aLong7 = 4871811050044947503L;

	@OriginalMember(owner = "client!abj", name = "t", descriptor = "J")
	long aLong8 = -5735858632782862769L;

	@OriginalMember(owner = "client!abj", name = "q", descriptor = "I")
	int anInt130 = 0;

	@OriginalMember(owner = "client!abj", name = "c", descriptor = "Lclient!abb;")
	Class28 aClass28_1;

	@OriginalMember(owner = "client!abj", name = "d", descriptor = "J")
	long aLong10;

	@OriginalMember(owner = "client!abj", name = "s", descriptor = "J")
	long aLong6;

	@OriginalMember(owner = "client!abj", name = "v", descriptor = "[B")
	byte[] aByteArray8;

	@OriginalMember(owner = "client!abj", name = "w", descriptor = "[B")
	byte[] aByteArray7;

	@OriginalMember(owner = "client!abj", name = "x", descriptor = "J")
	long aLong9;

	@OriginalMember(owner = "client!abj", name = "<init>", descriptor = "(Lclient!abb;II)V", line = 19)
	public Class34(@OriginalArg(0) Class28 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass28_1 = arg0;
		this.aLong6 = (this.aLong10 = arg0.method478() * -7942155805858393439L) * -637047553155203193L;
		this.aByteArray8 = new byte[arg1];
		this.aByteArray7 = new byte[arg2];
		this.aLong9 = 0L;
	}

	@OriginalMember(owner = "client!abj", name = "d", descriptor = "()V", line = 28)
	public void method537() throws IOException {
		this.method565();
		this.aClass28_1.method476();
	}

	@OriginalMember(owner = "client!abj", name = "p", descriptor = "(I)V", line = 28)
	public void method538() throws IOException {
		this.method565();
		this.aClass28_1.method476();
	}

	@OriginalMember(owner = "client!abj", name = "s", descriptor = "()V", line = 28)
	public void method539() throws IOException {
		this.method565();
		this.aClass28_1.method476();
	}

	@OriginalMember(owner = "client!abj", name = "r", descriptor = "()V", line = 28)
	public void method540() throws IOException {
		this.method565();
		this.aClass28_1.method476();
	}

	@OriginalMember(owner = "client!abj", name = "x", descriptor = "()V", line = 28)
	public void method541() throws IOException {
		this.method565();
		this.aClass28_1.method476();
	}

	@OriginalMember(owner = "client!abj", name = "c", descriptor = "(J)V", line = 33)
	public void method542(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong9 = arg0 * 3989725537163139883L;
	}

	@OriginalMember(owner = "client!abj", name = "z", descriptor = "(J)V", line = 33)
	public void method543(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong9 = arg0 * 3989725537163139883L;
	}

	@OriginalMember(owner = "client!abj", name = "j", descriptor = "(J)V", line = 33)
	public void method544(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong9 = arg0 * 3989725537163139883L;
	}

	@OriginalMember(owner = "client!abj", name = "i", descriptor = "(J)V", line = 33)
	public void method545(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong9 = arg0 * 3989725537163139883L;
	}

	@OriginalMember(owner = "client!abj", name = "g", descriptor = "(J)V", line = 33)
	public void method546(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong9 = arg0 * 3989725537163139883L;
	}

	@OriginalMember(owner = "client!abj", name = "k", descriptor = "()J", line = 38)
	public long method547() {
		return this.aLong6 * 9104204834373849559L;
	}

	@OriginalMember(owner = "client!abj", name = "e", descriptor = "()J", line = 38)
	public long method548() {
		return this.aLong6 * 9104204834373849559L;
	}

	@OriginalMember(owner = "client!abj", name = "u", descriptor = "()J", line = 38)
	public long method549() {
		return this.aLong6 * 9104204834373849559L;
	}

	@OriginalMember(owner = "client!abj", name = "v", descriptor = "(B)J", line = 38)
	public long method550() {
		return this.aLong6 * 9104204834373849559L;
	}

	@OriginalMember(owner = "client!abj", name = "f", descriptor = "()J", line = 38)
	public long method551() {
		return this.aLong6 * 9104204834373849559L;
	}

	@OriginalMember(owner = "client!abj", name = "l", descriptor = "([BB)V", line = 42)
	public void method552(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method553(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!abj", name = "y", descriptor = "([BIII)V", line = 47)
	public void method553(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong8 * -8118601995883557039L != -1L && this.aLong9 * 6067788942835321731L >= this.aLong8 * -8118601995883557039L && (long) arg2 + this.aLong9 * 6067788942835321731L <= (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L) {
				System.arraycopy(this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), arg0, arg1, arg2);
				this.aLong9 += (long) arg2 * 3989725537163139883L;
				return;
			}
			@Pc(82) long local82 = this.aLong9 * 6067788942835321731L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong9 * 6067788942835321731L >= this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
				local129 = (int) ((long) (this.anInt131 * -2034529659) - (this.aLong9 * 6067788942835321731L - this.aLong7 * 7235580931784160561L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray8, (int) (this.aLong9 * 6067788942835321731L - this.aLong7 * 7235580931784160561L), arg0, arg1, local129);
				this.aLong9 += (long) local129 * 3989725537163139883L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray8.length) {
				this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
				this.aLong11 = this.aLong9 * -5666985623075236569L;
				while (arg2 > 0) {
					local129 = this.aClass28_1.method486(arg0, arg1, arg2);
					if (local129 == -1) {
						break;
					}
					this.aLong11 += (long) local129 * 8113706793027840653L;
					this.aLong9 += (long) local129 * 3989725537163139883L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method556();
				local129 = arg2;
				if (arg2 > this.anInt131 * -2034529659) {
					local129 = this.anInt131 * -2034529659;
				}
				System.arraycopy(this.aByteArray8, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong9 += (long) local129 * 3989725537163139883L;
			}
			if (-8118601995883557039L * this.aLong8 != -1L) {
				if (this.aLong8 * -8118601995883557039L > this.aLong9 * 6067788942835321731L && arg2 > 0) {
					local129 = arg1 + (int) (this.aLong8 * -8118601995883557039L - this.aLong9 * 6067788942835321731L);
					if (local129 > arg2 + arg1) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong9 += 3989725537163139883L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong8 * -8118601995883557039L >= local82 && this.aLong8 * -8118601995883557039L < (long) local86 + local82) {
					local327 = this.aLong8 * -8118601995883557039L;
				} else if (local82 >= this.aLong8 * -8118601995883557039L && local82 < (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L) {
					local327 = local82;
				}
				if (this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183) > local82 && this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183) <= local82 + (long) local86) {
					local329 = this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183);
				} else if ((long) local86 + local82 > this.aLong8 * -8118601995883557039L && (long) local86 + local82 <= this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183)) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray7, (int) (local327 - this.aLong8 * -8118601995883557039L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong9 * 6067788942835321731L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong9 * 6067788942835321731L));
						this.aLong9 = local329 * 3989725537163139883L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong11 = -8113706793027840653L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abj", name = "o", descriptor = "([BII)V", line = 47)
	public void method554(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg2 + arg1 - arg0.length);
			}
			if (this.aLong8 * -8118601995883557039L != -1L && this.aLong9 * 6067788942835321731L >= this.aLong8 * -8118601995883557039L && (long) arg2 + this.aLong9 * 6067788942835321731L <= (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L) {
				System.arraycopy(this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), arg0, arg1, arg2);
				this.aLong9 += (long) arg2 * 3989725537163139883L;
				return;
			}
			@Pc(82) long local82 = this.aLong9 * 6067788942835321731L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong9 * 6067788942835321731L >= this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
				local129 = (int) ((long) (this.anInt131 * -2034529659) - (this.aLong9 * 6067788942835321731L - this.aLong7 * 7235580931784160561L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray8, (int) (this.aLong9 * 6067788942835321731L - this.aLong7 * 7235580931784160561L), arg0, arg1, local129);
				this.aLong9 += (long) local129 * 3989725537163139883L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray8.length) {
				this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
				this.aLong11 = this.aLong9 * -5666985623075236569L;
				while (arg2 > 0) {
					local129 = this.aClass28_1.method486(arg0, arg1, arg2);
					if (local129 == -1) {
						break;
					}
					this.aLong11 += (long) local129 * 8113706793027840653L;
					this.aLong9 += (long) local129 * 3989725537163139883L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method556();
				local129 = arg2;
				if (arg2 > this.anInt131 * -2034529659) {
					local129 = this.anInt131 * -2034529659;
				}
				System.arraycopy(this.aByteArray8, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong9 += (long) local129 * 3989725537163139883L;
			}
			if (-8118601995883557039L * this.aLong8 != -1L) {
				if (this.aLong8 * -8118601995883557039L > this.aLong9 * 6067788942835321731L && arg2 > 0) {
					local129 = arg1 + (int) (this.aLong8 * -8118601995883557039L - this.aLong9 * 6067788942835321731L);
					if (local129 > arg2 + arg1) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong9 += 3989725537163139883L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong8 * -8118601995883557039L >= local82 && this.aLong8 * -8118601995883557039L < (long) local86 + local82) {
					local327 = this.aLong8 * -8118601995883557039L;
				} else if (local82 >= this.aLong8 * -8118601995883557039L && local82 < (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L) {
					local327 = local82;
				}
				if (this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183) > local82 && this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183) <= local82 + (long) local86) {
					local329 = this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183);
				} else if ((long) local86 + local82 > this.aLong8 * -8118601995883557039L && (long) local86 + local82 <= this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183)) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray7, (int) (local327 - this.aLong8 * -8118601995883557039L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong9 * 6067788942835321731L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong9 * 6067788942835321731L));
						this.aLong9 = local329 * 3989725537163139883L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong11 = -8113706793027840653L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!abj", name = "x", descriptor = "(II)[I", line = 104)
	public static int[] method555(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class694.method36377(Class290.method26994(arg0));
		local2[0] = Class61.aCalendar2.get(5);
		local2[1] = Class61.aCalendar2.get(2);
		local2[2] = Class61.aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!abj", name = "w", descriptor = "(I)V", line = 128)
	void method556() throws IOException {
		this.anInt131 = 0;
		if (this.aLong9 * 6067788942835321731L != this.aLong11 * 349747260834687045L) {
			this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
			this.aLong11 = this.aLong9 * -5666985623075236569L;
		}
		this.aLong7 = this.aLong9 * 7026873020493360883L;
		while (this.anInt131 * -2034529659 < this.aByteArray8.length) {
			@Pc(48) int local48 = this.aByteArray8.length - this.anInt131 * -2034529659;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass28_1.method486(this.aByteArray8, this.anInt131 * -2034529659, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong11 += (long) local65 * 8113706793027840653L;
			this.anInt131 += local65 * -552018355;
		}
	}

	@OriginalMember(owner = "client!abj", name = "b", descriptor = "()V", line = 128)
	void method557() throws IOException {
		this.anInt131 = 0;
		if (this.aLong9 * 6067788942835321731L != this.aLong11 * 349747260834687045L) {
			this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
			this.aLong11 = this.aLong9 * -5666985623075236569L;
		}
		this.aLong7 = this.aLong9 * 7026873020493360883L;
		while (this.anInt131 * -2034529659 < this.aByteArray8.length) {
			@Pc(48) int local48 = this.aByteArray8.length - this.anInt131 * -2034529659;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass28_1.method486(this.aByteArray8, this.anInt131 * -2034529659, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong11 += (long) local65 * 8113706793027840653L;
			this.anInt131 += local65 * -552018355;
		}
	}

	@OriginalMember(owner = "client!abj", name = "n", descriptor = "()V", line = 128)
	void method558() throws IOException {
		this.anInt131 = 0;
		if (this.aLong9 * 6067788942835321731L != this.aLong11 * 349747260834687045L) {
			this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
			this.aLong11 = this.aLong9 * -5666985623075236569L;
		}
		this.aLong7 = this.aLong9 * 7026873020493360883L;
		while (this.anInt131 * -2034529659 < this.aByteArray8.length) {
			@Pc(48) int local48 = this.aByteArray8.length - this.anInt131 * -2034529659;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass28_1.method486(this.aByteArray8, this.anInt131 * -2034529659, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong11 += (long) local65 * 8113706793027840653L;
			this.anInt131 += local65 * -552018355;
		}
	}

	@OriginalMember(owner = "client!abj", name = "a", descriptor = "()V", line = 128)
	void method559() throws IOException {
		this.anInt131 = 0;
		if (this.aLong9 * 6067788942835321731L != this.aLong11 * 349747260834687045L) {
			this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
			this.aLong11 = this.aLong9 * -5666985623075236569L;
		}
		this.aLong7 = this.aLong9 * 7026873020493360883L;
		while (this.anInt131 * -2034529659 < this.aByteArray8.length) {
			@Pc(48) int local48 = this.aByteArray8.length - this.anInt131 * -2034529659;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass28_1.method486(this.aByteArray8, this.anInt131 * -2034529659, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong11 += (long) local65 * 8113706793027840653L;
			this.anInt131 += local65 * -552018355;
		}
	}

	@OriginalMember(owner = "client!abj", name = "m", descriptor = "()V", line = 128)
	void method560() throws IOException {
		this.anInt131 = 0;
		if (this.aLong9 * 6067788942835321731L != this.aLong11 * 349747260834687045L) {
			this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
			this.aLong11 = this.aLong9 * -5666985623075236569L;
		}
		this.aLong7 = this.aLong9 * 7026873020493360883L;
		while (this.anInt131 * -2034529659 < this.aByteArray8.length) {
			@Pc(48) int local48 = this.aByteArray8.length - this.anInt131 * -2034529659;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass28_1.method486(this.aByteArray8, this.anInt131 * -2034529659, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong11 += (long) local65 * 8113706793027840653L;
			this.anInt131 += local65 * -552018355;
		}
	}

	@OriginalMember(owner = "client!abj", name = "h", descriptor = "()V", line = 128)
	void method561() throws IOException {
		this.anInt131 = 0;
		if (this.aLong9 * 6067788942835321731L != this.aLong11 * 349747260834687045L) {
			this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
			this.aLong11 = this.aLong9 * -5666985623075236569L;
		}
		this.aLong7 = this.aLong9 * 7026873020493360883L;
		while (this.anInt131 * -2034529659 < this.aByteArray8.length) {
			@Pc(48) int local48 = this.aByteArray8.length - this.anInt131 * -2034529659;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass28_1.method486(this.aByteArray8, this.anInt131 * -2034529659, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong11 += (long) local65 * 8113706793027840653L;
			this.anInt131 += local65 * -552018355;
		}
	}

	@OriginalMember(owner = "client!abj", name = "t", descriptor = "([BIII)V", line = 146)
	public void method562(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong9 * 6067788942835321731L > this.aLong6 * 9104204834373849559L) {
				this.aLong6 = ((long) arg2 + this.aLong9 * 6067788942835321731L) * 1698876887390302695L;
			}
			if (-8118601995883557039L * this.aLong8 != -1L && (this.aLong9 * 6067788942835321731L < this.aLong8 * -8118601995883557039L || this.aLong9 * 6067788942835321731L > this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183))) {
				this.method565();
			}
			if (this.aLong8 * -8118601995883557039L != -1L && (long) arg2 + this.aLong9 * 6067788942835321731L > (long) this.aByteArray7.length + this.aLong8 * -8118601995883557039L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray7.length - (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L));
				System.arraycopy(arg0, arg1, this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), local100);
				this.aLong9 += (long) local100 * 3989725537163139883L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt130 = this.aByteArray7.length * -1928896511;
				this.method565();
			}
			if (arg2 > this.aByteArray7.length) {
				if (this.aLong11 * 349747260834687045L != this.aLong9 * 6067788942835321731L) {
					this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
					this.aLong11 = this.aLong9 * -5666985623075236569L;
				}
				this.aClass28_1.method475(arg0, arg1, arg2);
				this.aLong11 += (long) arg2 * 8113706793027840653L;
				if (this.aLong11 * 349747260834687045L > this.aLong10 * 3842458647390277985L) {
					this.aLong10 = this.aLong11 * 4957939853558459749L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong9 * 6067788942835321731L >= this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
					local205 = this.aLong9 * 6067788942835321731L;
				} else if (this.aLong7 * 7235580931784160561L >= this.aLong9 * 6067788942835321731L && this.aLong7 * 7235580931784160561L < (long) arg2 + this.aLong9 * 6067788942835321731L) {
					local205 = this.aLong7 * 7235580931784160561L;
				}
				if (this.aLong9 * 6067788942835321731L + (long) arg2 > this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L + (long) arg2 <= this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
					local207 = this.aLong9 * 6067788942835321731L + (long) arg2;
				} else if ((long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L > this.aLong9 * 6067788942835321731L && (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L <= this.aLong9 * 6067788942835321731L + (long) arg2) {
					local207 = (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) (local205 + (long) arg1 - this.aLong9 * 6067788942835321731L), this.aByteArray8, (int) (local205 - this.aLong7 * 7235580931784160561L), local367);
				}
				this.aLong9 += (long) arg2 * 3989725537163139883L;
			} else if (arg2 > 0) {
				if (this.aLong8 * -8118601995883557039L == -1L) {
					this.aLong8 = this.aLong9 * 5444352448561512595L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), arg2);
				this.aLong9 += (long) arg2 * 3989725537163139883L;
				if (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L > (long) (this.anInt130 * -688349183)) {
					this.anInt130 = (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L) * -1928896511;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong11 = -8113706793027840653L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "aj", descriptor = "([BII)V", line = 146)
	public void method563(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong9 * 6067788942835321731L > this.aLong6 * 9104204834373849559L) {
				this.aLong6 = ((long) arg2 + this.aLong9 * 6067788942835321731L) * 1698876887390302695L;
			}
			if (-8118601995883557039L * this.aLong8 != -1L && (this.aLong9 * 6067788942835321731L < this.aLong8 * -8118601995883557039L || this.aLong9 * 6067788942835321731L > this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183))) {
				this.method565();
			}
			if (this.aLong8 * -8118601995883557039L != -1L && (long) arg2 + this.aLong9 * 6067788942835321731L > (long) this.aByteArray7.length + this.aLong8 * -8118601995883557039L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray7.length - (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L));
				System.arraycopy(arg0, arg1, this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), local100);
				this.aLong9 += (long) local100 * 3989725537163139883L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt130 = this.aByteArray7.length * -1928896511;
				this.method565();
			}
			if (arg2 > this.aByteArray7.length) {
				if (this.aLong11 * 349747260834687045L != this.aLong9 * 6067788942835321731L) {
					this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
					this.aLong11 = this.aLong9 * -5666985623075236569L;
				}
				this.aClass28_1.method475(arg0, arg1, arg2);
				this.aLong11 += (long) arg2 * 8113706793027840653L;
				if (this.aLong11 * 349747260834687045L > this.aLong10 * 3842458647390277985L) {
					this.aLong10 = this.aLong11 * 4957939853558459749L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong9 * 6067788942835321731L >= this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
					local205 = this.aLong9 * 6067788942835321731L;
				} else if (this.aLong7 * 7235580931784160561L >= this.aLong9 * 6067788942835321731L && this.aLong7 * 7235580931784160561L < (long) arg2 + this.aLong9 * 6067788942835321731L) {
					local205 = this.aLong7 * 7235580931784160561L;
				}
				if (this.aLong9 * 6067788942835321731L + (long) arg2 > this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L + (long) arg2 <= this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
					local207 = this.aLong9 * 6067788942835321731L + (long) arg2;
				} else if ((long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L > this.aLong9 * 6067788942835321731L && (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L <= this.aLong9 * 6067788942835321731L + (long) arg2) {
					local207 = (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) (local205 + (long) arg1 - this.aLong9 * 6067788942835321731L), this.aByteArray8, (int) (local205 - this.aLong7 * 7235580931784160561L), local367);
				}
				this.aLong9 += (long) arg2 * 3989725537163139883L;
			} else if (arg2 > 0) {
				if (this.aLong8 * -8118601995883557039L == -1L) {
					this.aLong8 = this.aLong9 * 5444352448561512595L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), arg2);
				this.aLong9 += (long) arg2 * 3989725537163139883L;
				if (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L > (long) (this.anInt130 * -688349183)) {
					this.anInt130 = (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L) * -1928896511;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong11 = -8113706793027840653L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "ai", descriptor = "([BII)V", line = 146)
	public void method564(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong9 * 6067788942835321731L > this.aLong6 * 9104204834373849559L) {
				this.aLong6 = ((long) arg2 + this.aLong9 * 6067788942835321731L) * 1698876887390302695L;
			}
			if (-8118601995883557039L * this.aLong8 != -1L && (this.aLong9 * 6067788942835321731L < this.aLong8 * -8118601995883557039L || this.aLong9 * 6067788942835321731L > this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183))) {
				this.method565();
			}
			if (this.aLong8 * -8118601995883557039L != -1L && (long) arg2 + this.aLong9 * 6067788942835321731L > (long) this.aByteArray7.length + this.aLong8 * -8118601995883557039L) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray7.length - (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L));
				System.arraycopy(arg0, arg1, this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), local100);
				this.aLong9 += (long) local100 * 3989725537163139883L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt130 = this.aByteArray7.length * -1928896511;
				this.method565();
			}
			if (arg2 > this.aByteArray7.length) {
				if (this.aLong11 * 349747260834687045L != this.aLong9 * 6067788942835321731L) {
					this.aClass28_1.method471(this.aLong9 * 6067788942835321731L);
					this.aLong11 = this.aLong9 * -5666985623075236569L;
				}
				this.aClass28_1.method475(arg0, arg1, arg2);
				this.aLong11 += (long) arg2 * 8113706793027840653L;
				if (this.aLong11 * 349747260834687045L > this.aLong10 * 3842458647390277985L) {
					this.aLong10 = this.aLong11 * 4957939853558459749L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong9 * 6067788942835321731L >= this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
					local205 = this.aLong9 * 6067788942835321731L;
				} else if (this.aLong7 * 7235580931784160561L >= this.aLong9 * 6067788942835321731L && this.aLong7 * 7235580931784160561L < (long) arg2 + this.aLong9 * 6067788942835321731L) {
					local205 = this.aLong7 * 7235580931784160561L;
				}
				if (this.aLong9 * 6067788942835321731L + (long) arg2 > this.aLong7 * 7235580931784160561L && this.aLong9 * 6067788942835321731L + (long) arg2 <= this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
					local207 = this.aLong9 * 6067788942835321731L + (long) arg2;
				} else if ((long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L > this.aLong9 * 6067788942835321731L && (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L <= this.aLong9 * 6067788942835321731L + (long) arg2) {
					local207 = (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L;
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) (local205 + (long) arg1 - this.aLong9 * 6067788942835321731L), this.aByteArray8, (int) (local205 - this.aLong7 * 7235580931784160561L), local367);
				}
				this.aLong9 += (long) arg2 * 3989725537163139883L;
			} else if (arg2 > 0) {
				if (this.aLong8 * -8118601995883557039L == -1L) {
					this.aLong8 = this.aLong9 * 5444352448561512595L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray7, (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L), arg2);
				this.aLong9 += (long) arg2 * 3989725537163139883L;
				if (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L > (long) (this.anInt130 * -688349183)) {
					this.anInt130 = (int) (this.aLong9 * 6067788942835321731L - this.aLong8 * -8118601995883557039L) * -1928896511;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong11 = -8113706793027840653L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!abj", name = "q", descriptor = "(I)V", line = 203)
	void method565() throws IOException {
		if (-8118601995883557039L * this.aLong8 == -1L) {
			return;
		}
		if (this.aLong11 * 349747260834687045L != this.aLong8 * -8118601995883557039L) {
			this.aClass28_1.method471(this.aLong8 * -8118601995883557039L);
			this.aLong11 = this.aLong8 * 5722967004091578781L;
		}
		this.aClass28_1.method475(this.aByteArray7, 0, this.anInt130 * -688349183);
		this.aLong11 += (long) this.anInt130 * 2421171938581367437L;
		if (this.aLong11 * 349747260834687045L > this.aLong10 * 3842458647390277985L) {
			this.aLong10 = this.aLong11 * 4957939853558459749L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong8 * -8118601995883557039L >= this.aLong7 * 7235580931784160561L && this.aLong8 * -8118601995883557039L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
			local68 = this.aLong8 * -8118601995883557039L;
		} else if (this.aLong7 * 7235580931784160561L >= this.aLong8 * -8118601995883557039L && this.aLong7 * 7235580931784160561L < (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L) {
			local68 = this.aLong7 * 7235580931784160561L;
		}
		if ((long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L > this.aLong7 * 7235580931784160561L && (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L <= (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L) {
			local70 = this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183);
		} else if ((long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L > this.aLong8 * -8118601995883557039L && (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L <= this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183)) {
			local70 = (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray7, (int) (local68 - this.aLong8 * -8118601995883557039L), this.aByteArray8, (int) (local68 - this.aLong7 * 7235580931784160561L), local245);
		}
		this.aLong8 = -5735858632782862769L;
		this.anInt130 = 0;
	}

	@OriginalMember(owner = "client!abj", name = "ag", descriptor = "()V", line = 203)
	void method566() throws IOException {
		if (-8118601995883557039L * this.aLong8 == -1L) {
			return;
		}
		if (this.aLong11 * 349747260834687045L != this.aLong8 * -8118601995883557039L) {
			this.aClass28_1.method471(this.aLong8 * -8118601995883557039L);
			this.aLong11 = this.aLong8 * 5722967004091578781L;
		}
		this.aClass28_1.method475(this.aByteArray7, 0, this.anInt130 * -688349183);
		this.aLong11 += (long) this.anInt130 * 2421171938581367437L;
		if (this.aLong11 * 349747260834687045L > this.aLong10 * 3842458647390277985L) {
			this.aLong10 = this.aLong11 * 4957939853558459749L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong8 * -8118601995883557039L >= this.aLong7 * 7235580931784160561L && this.aLong8 * -8118601995883557039L < this.aLong7 * 7235580931784160561L + (long) (this.anInt131 * -2034529659)) {
			local68 = this.aLong8 * -8118601995883557039L;
		} else if (this.aLong7 * 7235580931784160561L >= this.aLong8 * -8118601995883557039L && this.aLong7 * 7235580931784160561L < (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L) {
			local68 = this.aLong7 * 7235580931784160561L;
		}
		if ((long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L > this.aLong7 * 7235580931784160561L && (long) (this.anInt130 * -688349183) + this.aLong8 * -8118601995883557039L <= (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L) {
			local70 = this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183);
		} else if ((long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L > this.aLong8 * -8118601995883557039L && (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L <= this.aLong8 * -8118601995883557039L + (long) (this.anInt130 * -688349183)) {
			local70 = (long) (this.anInt131 * -2034529659) + this.aLong7 * 7235580931784160561L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray7, (int) (local68 - this.aLong8 * -8118601995883557039L), this.aByteArray8, (int) (local68 - this.aLong7 * 7235580931784160561L), local245);
		}
		this.aLong8 = -5735858632782862769L;
		this.anInt130 = 0;
	}

	@OriginalMember(owner = "client!abj", name = "oq", descriptor = "(Lclient!yf;I)V", line = 7258)
	static final void method567(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class619.method32396(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!abj", name = "atr", descriptor = "(Lclient!yf;B)V", line = 12905)
	static final void method568(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 926998689;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		@Pc(33) int local33 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 2];
		Class496.method30164(local33, Class60.method884(local13, local23), arg0);
	}
}
