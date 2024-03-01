package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!xa")
public class Class569 {

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "I")
	static final int anInt5381 = 200000000;

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "I")
	int anInt5383;

	@OriginalMember(owner = "client!xa", name = "z", descriptor = "J")
	long aLong290;

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "J")
	long aLong286 = 7706112700509590177L;

	@OriginalMember(owner = "client!xa", name = "s", descriptor = "J")
	long aLong289 = -4370404429417470825L;

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "I")
	int anInt5382 = 0;

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "Lclient!xz;")
	Class592 aClass592_1;

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "J")
	long aLong287;

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "J")
	long aLong291;

	@OriginalMember(owner = "client!xa", name = "g", descriptor = "[B")
	byte[] aByteArray105;

	@OriginalMember(owner = "client!xa", name = "x", descriptor = "[B")
	byte[] aByteArray106;

	@OriginalMember(owner = "client!xa", name = "y", descriptor = "J")
	long aLong288;

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "(Lclient!mx;B)F", line = 13)
	public static float method33007(@OriginalArg(0) Class335 arg0) {
		@Pc(4) Class320 local4 = Class320.method25891(0.0F, 0.0F, 1.0F);
		local4.method25889(arg0);
		@Pc(14) double local14 = 1.5707963267948966D - Math.acos((double) local4.aFloat260);
		local4.method25874();
		return (float) local14;
	}

	@OriginalMember(owner = "client!xa", name = "<init>", descriptor = "(Lclient!xz;II)V", line = 19)
	public Class569(@OriginalArg(0) Class592 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		this.aClass592_1 = arg0;
		this.aLong291 = (this.aLong287 = arg0.method33340() * -8298375817666510867L) * 2283726078224344835L;
		this.aByteArray105 = new byte[arg1];
		this.aByteArray106 = new byte[arg2];
		this.aLong288 = 0L;
	}

	@OriginalMember(owner = "client!xa", name = "b", descriptor = "()V", line = 28)
	public void method32980() throws IOException {
		this.method32997();
		this.aClass592_1.method33339();
	}

	@OriginalMember(owner = "client!xa", name = "p", descriptor = "(I)V", line = 28)
	public void method32981() throws IOException {
		this.method32997();
		this.aClass592_1.method33339();
	}

	@OriginalMember(owner = "client!xa", name = "y", descriptor = "()V", line = 28)
	public void method32987() throws IOException {
		this.method32997();
		this.aClass592_1.method33339();
	}

	@OriginalMember(owner = "client!xa", name = "c", descriptor = "()V", line = 28)
	public void method32991() throws IOException {
		this.method32997();
		this.aClass592_1.method33339();
	}

	@OriginalMember(owner = "client!xa", name = "a", descriptor = "(J)V", line = 33)
	public void method32982(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong288 = arg0 * -7207108854882236815L;
	}

	@OriginalMember(owner = "client!xa", name = "z", descriptor = "(J)V", line = 33)
	public void method32992(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong288 = arg0 * -7207108854882236815L;
	}

	@OriginalMember(owner = "client!xa", name = "j", descriptor = "(J)V", line = 33)
	public void method32993(@OriginalArg(0) long arg0) throws IOException {
		if (arg0 < 0L) {
			throw new IOException();
		}
		this.aLong288 = arg0 * -7207108854882236815L;
	}

	@OriginalMember(owner = "client!xa", name = "n", descriptor = "()J", line = 38)
	public long method32990() {
		return this.aLong291 * -6086163582722193673L;
	}

	@OriginalMember(owner = "client!xa", name = "g", descriptor = "(I)J", line = 38)
	public long method32994() {
		return this.aLong291 * -6086163582722193673L;
	}

	@OriginalMember(owner = "client!xa", name = "e", descriptor = "()J", line = 38)
	public long method33000() {
		return this.aLong291 * -6086163582722193673L;
	}

	@OriginalMember(owner = "client!xa", name = "l", descriptor = "([BI)V", line = 42)
	public void method32988(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method32985(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!xa", name = "r", descriptor = "([B)V", line = 42)
	public void method32995(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method32985(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!xa", name = "d", descriptor = "([B)V", line = 42)
	public void method32996(@OriginalArg(0) byte[] arg0) throws IOException {
		this.method32985(arg0, 0, arg0.length);
	}

	@OriginalMember(owner = "client!xa", name = "h", descriptor = "([BIIB)V", line = 47)
	public void method32985(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
			}
			if (this.aLong289 * 633671740944377049L != -1L && this.aLong288 * -5095828789910898031L >= this.aLong289 * 633671740944377049L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
				System.arraycopy(this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg0, arg1, arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				return;
			}
			@Pc(82) long local82 = this.aLong288 * -5095828789910898031L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
				local129 = (int) ((long) (this.anInt5383 * 2050253525) - (this.aLong288 * -5095828789910898031L - this.aLong286 * 1897360544393571999L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray105, (int) (this.aLong288 * -5095828789910898031L - this.aLong286 * 1897360544393571999L), arg0, arg1, local129);
				this.aLong288 += (long) local129 * -7207108854882236815L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray105.length) {
				this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
				this.aLong290 = this.aLong288 * 6568470021198690171L;
				while (arg2 > 0) {
					local129 = this.aClass592_1.method33341(arg0, arg1, arg2);
					if (local129 == -1) {
						break;
					}
					this.aLong290 += (long) local129 * -433939964350505141L;
					this.aLong288 += (long) local129 * -7207108854882236815L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method32986();
				local129 = arg2;
				if (arg2 > this.anInt5383 * 2050253525) {
					local129 = this.anInt5383 * 2050253525;
				}
				System.arraycopy(this.aByteArray105, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong288 += (long) local129 * -7207108854882236815L;
			}
			if (this.aLong289 * 633671740944377049L != -1L) {
				if (this.aLong289 * 633671740944377049L > this.aLong288 * -5095828789910898031L && arg2 > 0) {
					local129 = (int) (this.aLong289 * 633671740944377049L - this.aLong288 * -5095828789910898031L) + arg1;
					if (local129 > arg2 + arg1) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong288 += -7207108854882236815L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong289 * 633671740944377049L >= local82 && this.aLong289 * 633671740944377049L < (long) local86 + local82) {
					local327 = this.aLong289 * 633671740944377049L;
				} else if (local82 >= this.aLong289 * 633671740944377049L && local82 < this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
					local327 = local82;
				}
				if (this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) > local82 && this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) <= (long) local86 + local82) {
					local329 = (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L;
				} else if (local82 + (long) local86 > this.aLong289 * 633671740944377049L && (long) local86 + local82 <= (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray106, (int) (local327 - this.aLong289 * 633671740944377049L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong288 * -5095828789910898031L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong288 * -5095828789910898031L));
						this.aLong288 = local329 * -7207108854882236815L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong290 = 433939964350505141L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!xa", name = "m", descriptor = "([BII)V", line = 47)
	public void method32998(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
			}
			if (this.aLong289 * 633671740944377049L != -1L && this.aLong288 * -5095828789910898031L >= this.aLong289 * 633671740944377049L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
				System.arraycopy(this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg0, arg1, arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				return;
			}
			@Pc(82) long local82 = this.aLong288 * -5095828789910898031L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
				local129 = (int) ((long) (this.anInt5383 * 2050253525) - (this.aLong288 * -5095828789910898031L - this.aLong286 * 1897360544393571999L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray105, (int) (this.aLong288 * -5095828789910898031L - this.aLong286 * 1897360544393571999L), arg0, arg1, local129);
				this.aLong288 += (long) local129 * -7207108854882236815L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray105.length) {
				this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
				this.aLong290 = this.aLong288 * 6568470021198690171L;
				while (arg2 > 0) {
					local129 = this.aClass592_1.method33341(arg0, arg1, arg2);
					if (local129 == -1) {
						break;
					}
					this.aLong290 += (long) local129 * -433939964350505141L;
					this.aLong288 += (long) local129 * -7207108854882236815L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method32986();
				local129 = arg2;
				if (arg2 > this.anInt5383 * 2050253525) {
					local129 = this.anInt5383 * 2050253525;
				}
				System.arraycopy(this.aByteArray105, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong288 += (long) local129 * -7207108854882236815L;
			}
			if (this.aLong289 * 633671740944377049L != -1L) {
				if (this.aLong289 * 633671740944377049L > this.aLong288 * -5095828789910898031L && arg2 > 0) {
					local129 = (int) (this.aLong289 * 633671740944377049L - this.aLong288 * -5095828789910898031L) + arg1;
					if (local129 > arg2 + arg1) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong288 += -7207108854882236815L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong289 * 633671740944377049L >= local82 && this.aLong289 * 633671740944377049L < (long) local86 + local82) {
					local327 = this.aLong289 * 633671740944377049L;
				} else if (local82 >= this.aLong289 * 633671740944377049L && local82 < this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
					local327 = local82;
				}
				if (this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) > local82 && this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) <= (long) local86 + local82) {
					local329 = (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L;
				} else if (local82 + (long) local86 > this.aLong289 * 633671740944377049L && (long) local86 + local82 <= (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray106, (int) (local327 - this.aLong289 * 633671740944377049L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong288 * -5095828789910898031L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong288 * -5095828789910898031L));
						this.aLong288 = local329 * -7207108854882236815L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong290 = 433939964350505141L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!xa", name = "q", descriptor = "([BII)V", line = 47)
	public void method33001(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if (arg1 + arg2 > arg0.length) {
				throw new ArrayIndexOutOfBoundsException(arg1 + arg2 - arg0.length);
			}
			if (this.aLong289 * 633671740944377049L != -1L && this.aLong288 * -5095828789910898031L >= this.aLong289 * 633671740944377049L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
				System.arraycopy(this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg0, arg1, arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				return;
			}
			@Pc(82) long local82 = this.aLong288 * -5095828789910898031L;
			@Pc(84) int local84 = arg1;
			@Pc(86) int local86 = arg2;
			@Pc(129) int local129;
			if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
				local129 = (int) ((long) (this.anInt5383 * 2050253525) - (this.aLong288 * -5095828789910898031L - this.aLong286 * 1897360544393571999L));
				if (local129 > arg2) {
					local129 = arg2;
				}
				System.arraycopy(this.aByteArray105, (int) (this.aLong288 * -5095828789910898031L - this.aLong286 * 1897360544393571999L), arg0, arg1, local129);
				this.aLong288 += (long) local129 * -7207108854882236815L;
				arg1 += local129;
				arg2 -= local129;
			}
			if (arg2 > this.aByteArray105.length) {
				this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
				this.aLong290 = this.aLong288 * 6568470021198690171L;
				while (arg2 > 0) {
					local129 = this.aClass592_1.method33341(arg0, arg1, arg2);
					if (local129 == -1) {
						break;
					}
					this.aLong290 += (long) local129 * -433939964350505141L;
					this.aLong288 += (long) local129 * -7207108854882236815L;
					arg1 += local129;
					arg2 -= local129;
				}
			} else if (arg2 > 0) {
				this.method32986();
				local129 = arg2;
				if (arg2 > this.anInt5383 * 2050253525) {
					local129 = this.anInt5383 * 2050253525;
				}
				System.arraycopy(this.aByteArray105, 0, arg0, arg1, local129);
				arg1 += local129;
				arg2 -= local129;
				this.aLong288 += (long) local129 * -7207108854882236815L;
			}
			if (this.aLong289 * 633671740944377049L != -1L) {
				if (this.aLong289 * 633671740944377049L > this.aLong288 * -5095828789910898031L && arg2 > 0) {
					local129 = (int) (this.aLong289 * 633671740944377049L - this.aLong288 * -5095828789910898031L) + arg1;
					if (local129 > arg2 + arg1) {
						local129 = arg2 + arg1;
					}
					while (arg1 < local129) {
						arg0[arg1++] = 0;
						arg2--;
						this.aLong288 += -7207108854882236815L;
					}
				}
				@Pc(327) long local327 = -1L;
				@Pc(329) long local329 = -1L;
				if (this.aLong289 * 633671740944377049L >= local82 && this.aLong289 * 633671740944377049L < (long) local86 + local82) {
					local327 = this.aLong289 * 633671740944377049L;
				} else if (local82 >= this.aLong289 * 633671740944377049L && local82 < this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
					local327 = local82;
				}
				if (this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) > local82 && this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) <= (long) local86 + local82) {
					local329 = (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L;
				} else if (local82 + (long) local86 > this.aLong289 * 633671740944377049L && (long) local86 + local82 <= (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L) {
					local329 = (long) local86 + local82;
				}
				if (local327 > -1L && local329 > local327) {
					@Pc(459) int local459 = (int) (local329 - local327);
					System.arraycopy(this.aByteArray106, (int) (local327 - this.aLong289 * 633671740944377049L), arg0, (int) (local327 - local82) + local84, local459);
					if (local329 > this.aLong288 * -5095828789910898031L) {
						arg2 = (int) ((long) arg2 - (local329 - this.aLong288 * -5095828789910898031L));
						this.aLong288 = local329 * -7207108854882236815L;
					}
				}
			}
		} catch (@Pc(502) IOException local502) {
			this.aLong290 = 433939964350505141L;
			throw local502;
		}
		if (arg2 > 0) {
			throw new EOFException();
		}
	}

	@OriginalMember(owner = "client!xa", name = "y", descriptor = "(I)V", line = 64)
	public static void method33005() {
		Class196.aMap9.clear();
		Class196.aClass581_27.method33222();
		Class196.aClass546_14.method32620();
		Class196.anInt3685 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "x", descriptor = "(I)V", line = 128)
	void method32986() throws IOException {
		this.anInt5383 = 0;
		if (this.aLong290 * 733518405317767779L != this.aLong288 * -5095828789910898031L) {
			this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
			this.aLong290 = this.aLong288 * 6568470021198690171L;
		}
		this.aLong286 = this.aLong288 * 3688090910100175055L;
		while (this.anInt5383 * 2050253525 < this.aByteArray105.length) {
			@Pc(48) int local48 = this.aByteArray105.length - this.anInt5383 * 2050253525;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass592_1.method33341(this.aByteArray105, this.anInt5383 * 2050253525, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong290 += (long) local65 * -433939964350505141L;
			this.anInt5383 += local65 * -1349532035;
		}
	}

	@OriginalMember(owner = "client!xa", name = "v", descriptor = "()V", line = 128)
	void method32999() throws IOException {
		this.anInt5383 = 0;
		if (this.aLong290 * 733518405317767779L != this.aLong288 * -5095828789910898031L) {
			this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
			this.aLong290 = this.aLong288 * 6568470021198690171L;
		}
		this.aLong286 = this.aLong288 * 3688090910100175055L;
		while (this.anInt5383 * 2050253525 < this.aByteArray105.length) {
			@Pc(48) int local48 = this.aByteArray105.length - this.anInt5383 * 2050253525;
			if (local48 > 200000000) {
				local48 = 200000000;
			}
			@Pc(65) int local65 = this.aClass592_1.method33341(this.aByteArray105, this.anInt5383 * 2050253525, local48);
			if (local65 == -1) {
				break;
			}
			this.aLong290 += (long) local65 * -433939964350505141L;
			this.anInt5383 += local65 * -1349532035;
		}
	}

	@OriginalMember(owner = "client!xa", name = "w", descriptor = "([BII)V", line = 146)
	public void method32983(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong291 * -6086163582722193673L) {
				this.aLong291 = (this.aLong288 * -5095828789910898031L + (long) arg2) * 3129958727861787335L;
			}
			if (this.aLong289 * 633671740944377049L != -1L && (this.aLong288 * -5095828789910898031L < this.aLong289 * 633671740944377049L || this.aLong288 * -5095828789910898031L > (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L)) {
				this.method32997();
			}
			if (this.aLong289 * 633671740944377049L != -1L && (long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong289 * 633671740944377049L + (long) this.aByteArray106.length) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray106.length - (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L));
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), local100);
				this.aLong288 += (long) local100 * -7207108854882236815L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt5382 = this.aByteArray106.length * 279514861;
				this.method32997();
			}
			if (arg2 > this.aByteArray106.length) {
				if (this.aLong288 * -5095828789910898031L != this.aLong290 * 733518405317767779L) {
					this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
					this.aLong290 = this.aLong288 * 6568470021198690171L;
				}
				this.aClass592_1.method33338(arg0, arg1, arg2);
				this.aLong290 += (long) arg2 * -433939964350505141L;
				if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
					this.aLong287 = this.aLong290 * 3330931491590931111L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local205 = this.aLong288 * -5095828789910898031L;
				} else if (this.aLong286 * 1897360544393571999L >= this.aLong288 * -5095828789910898031L && this.aLong286 * 1897360544393571999L < this.aLong288 * -5095828789910898031L + (long) arg2) {
					local205 = this.aLong286 * 1897360544393571999L;
				}
				if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong286 * 1897360544393571999L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local207 = this.aLong288 * -5095828789910898031L + (long) arg2;
				} else if (this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) > this.aLong288 * -5095828789910898031L && (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L <= this.aLong288 * -5095828789910898031L + (long) arg2) {
					local207 = this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525);
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong288 * -5095828789910898031L), this.aByteArray105, (int) (local205 - this.aLong286 * 1897360544393571999L), local367);
				}
				this.aLong288 += (long) arg2 * -7207108854882236815L;
			} else if (arg2 > 0) {
				if (this.aLong289 * 633671740944377049L == -1L) {
					this.aLong289 = this.aLong288 * -4460100513319432071L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				if (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L > (long) (this.anInt5382 * 377585381)) {
					this.anInt5382 = (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L) * 279514861;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong290 = 433939964350505141L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!xa", name = "s", descriptor = "([BIII)V", line = 146)
	public void method32984(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong291 * -6086163582722193673L) {
				this.aLong291 = (this.aLong288 * -5095828789910898031L + (long) arg2) * 3129958727861787335L;
			}
			if (this.aLong289 * 633671740944377049L != -1L && (this.aLong288 * -5095828789910898031L < this.aLong289 * 633671740944377049L || this.aLong288 * -5095828789910898031L > (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L)) {
				this.method32997();
			}
			if (this.aLong289 * 633671740944377049L != -1L && (long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong289 * 633671740944377049L + (long) this.aByteArray106.length) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray106.length - (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L));
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), local100);
				this.aLong288 += (long) local100 * -7207108854882236815L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt5382 = this.aByteArray106.length * 279514861;
				this.method32997();
			}
			if (arg2 > this.aByteArray106.length) {
				if (this.aLong288 * -5095828789910898031L != this.aLong290 * 733518405317767779L) {
					this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
					this.aLong290 = this.aLong288 * 6568470021198690171L;
				}
				this.aClass592_1.method33338(arg0, arg1, arg2);
				this.aLong290 += (long) arg2 * -433939964350505141L;
				if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
					this.aLong287 = this.aLong290 * 3330931491590931111L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local205 = this.aLong288 * -5095828789910898031L;
				} else if (this.aLong286 * 1897360544393571999L >= this.aLong288 * -5095828789910898031L && this.aLong286 * 1897360544393571999L < this.aLong288 * -5095828789910898031L + (long) arg2) {
					local205 = this.aLong286 * 1897360544393571999L;
				}
				if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong286 * 1897360544393571999L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local207 = this.aLong288 * -5095828789910898031L + (long) arg2;
				} else if (this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) > this.aLong288 * -5095828789910898031L && (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L <= this.aLong288 * -5095828789910898031L + (long) arg2) {
					local207 = this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525);
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong288 * -5095828789910898031L), this.aByteArray105, (int) (local205 - this.aLong286 * 1897360544393571999L), local367);
				}
				this.aLong288 += (long) arg2 * -7207108854882236815L;
			} else if (arg2 > 0) {
				if (this.aLong289 * 633671740944377049L == -1L) {
					this.aLong289 = this.aLong288 * -4460100513319432071L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				if (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L > (long) (this.anInt5382 * 377585381)) {
					this.anInt5382 = (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L) * 279514861;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong290 = 433939964350505141L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!xa", name = "t", descriptor = "([BII)V", line = 146)
	public void method32989(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong291 * -6086163582722193673L) {
				this.aLong291 = (this.aLong288 * -5095828789910898031L + (long) arg2) * 3129958727861787335L;
			}
			if (this.aLong289 * 633671740944377049L != -1L && (this.aLong288 * -5095828789910898031L < this.aLong289 * 633671740944377049L || this.aLong288 * -5095828789910898031L > (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L)) {
				this.method32997();
			}
			if (this.aLong289 * 633671740944377049L != -1L && (long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong289 * 633671740944377049L + (long) this.aByteArray106.length) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray106.length - (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L));
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), local100);
				this.aLong288 += (long) local100 * -7207108854882236815L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt5382 = this.aByteArray106.length * 279514861;
				this.method32997();
			}
			if (arg2 > this.aByteArray106.length) {
				if (this.aLong288 * -5095828789910898031L != this.aLong290 * 733518405317767779L) {
					this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
					this.aLong290 = this.aLong288 * 6568470021198690171L;
				}
				this.aClass592_1.method33338(arg0, arg1, arg2);
				this.aLong290 += (long) arg2 * -433939964350505141L;
				if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
					this.aLong287 = this.aLong290 * 3330931491590931111L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local205 = this.aLong288 * -5095828789910898031L;
				} else if (this.aLong286 * 1897360544393571999L >= this.aLong288 * -5095828789910898031L && this.aLong286 * 1897360544393571999L < this.aLong288 * -5095828789910898031L + (long) arg2) {
					local205 = this.aLong286 * 1897360544393571999L;
				}
				if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong286 * 1897360544393571999L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local207 = this.aLong288 * -5095828789910898031L + (long) arg2;
				} else if (this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) > this.aLong288 * -5095828789910898031L && (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L <= this.aLong288 * -5095828789910898031L + (long) arg2) {
					local207 = this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525);
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong288 * -5095828789910898031L), this.aByteArray105, (int) (local205 - this.aLong286 * 1897360544393571999L), local367);
				}
				this.aLong288 += (long) arg2 * -7207108854882236815L;
			} else if (arg2 > 0) {
				if (this.aLong289 * 633671740944377049L == -1L) {
					this.aLong289 = this.aLong288 * -4460100513319432071L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				if (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L > (long) (this.anInt5382 * 377585381)) {
					this.anInt5382 = (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L) * 279514861;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong290 = 433939964350505141L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!xa", name = "o", descriptor = "([BII)V", line = 146)
	public void method33002(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong291 * -6086163582722193673L) {
				this.aLong291 = (this.aLong288 * -5095828789910898031L + (long) arg2) * 3129958727861787335L;
			}
			if (this.aLong289 * 633671740944377049L != -1L && (this.aLong288 * -5095828789910898031L < this.aLong289 * 633671740944377049L || this.aLong288 * -5095828789910898031L > (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L)) {
				this.method32997();
			}
			if (this.aLong289 * 633671740944377049L != -1L && (long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong289 * 633671740944377049L + (long) this.aByteArray106.length) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray106.length - (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L));
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), local100);
				this.aLong288 += (long) local100 * -7207108854882236815L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt5382 = this.aByteArray106.length * 279514861;
				this.method32997();
			}
			if (arg2 > this.aByteArray106.length) {
				if (this.aLong288 * -5095828789910898031L != this.aLong290 * 733518405317767779L) {
					this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
					this.aLong290 = this.aLong288 * 6568470021198690171L;
				}
				this.aClass592_1.method33338(arg0, arg1, arg2);
				this.aLong290 += (long) arg2 * -433939964350505141L;
				if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
					this.aLong287 = this.aLong290 * 3330931491590931111L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local205 = this.aLong288 * -5095828789910898031L;
				} else if (this.aLong286 * 1897360544393571999L >= this.aLong288 * -5095828789910898031L && this.aLong286 * 1897360544393571999L < this.aLong288 * -5095828789910898031L + (long) arg2) {
					local205 = this.aLong286 * 1897360544393571999L;
				}
				if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong286 * 1897360544393571999L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local207 = this.aLong288 * -5095828789910898031L + (long) arg2;
				} else if (this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) > this.aLong288 * -5095828789910898031L && (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L <= this.aLong288 * -5095828789910898031L + (long) arg2) {
					local207 = this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525);
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong288 * -5095828789910898031L), this.aByteArray105, (int) (local205 - this.aLong286 * 1897360544393571999L), local367);
				}
				this.aLong288 += (long) arg2 * -7207108854882236815L;
			} else if (arg2 > 0) {
				if (this.aLong289 * 633671740944377049L == -1L) {
					this.aLong289 = this.aLong288 * -4460100513319432071L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				if (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L > (long) (this.anInt5382 * 377585381)) {
					this.anInt5382 = (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L) * 279514861;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong290 = 433939964350505141L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!xa", name = "i", descriptor = "([BII)V", line = 146)
	public void method33003(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		try {
			if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong291 * -6086163582722193673L) {
				this.aLong291 = (this.aLong288 * -5095828789910898031L + (long) arg2) * 3129958727861787335L;
			}
			if (this.aLong289 * 633671740944377049L != -1L && (this.aLong288 * -5095828789910898031L < this.aLong289 * 633671740944377049L || this.aLong288 * -5095828789910898031L > (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L)) {
				this.method32997();
			}
			if (this.aLong289 * 633671740944377049L != -1L && (long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong289 * 633671740944377049L + (long) this.aByteArray106.length) {
				@Pc(100) int local100 = (int) ((long) this.aByteArray106.length - (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L));
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), local100);
				this.aLong288 += (long) local100 * -7207108854882236815L;
				arg1 += local100;
				arg2 -= local100;
				this.anInt5382 = this.aByteArray106.length * 279514861;
				this.method32997();
			}
			if (arg2 > this.aByteArray106.length) {
				if (this.aLong288 * -5095828789910898031L != this.aLong290 * 733518405317767779L) {
					this.aClass592_1.method33345(this.aLong288 * -5095828789910898031L);
					this.aLong290 = this.aLong288 * 6568470021198690171L;
				}
				this.aClass592_1.method33338(arg0, arg1, arg2);
				this.aLong290 += (long) arg2 * -433939964350505141L;
				if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
					this.aLong287 = this.aLong290 * 3330931491590931111L;
				}
				@Pc(205) long local205 = -1L;
				@Pc(207) long local207 = -1L;
				if (this.aLong288 * -5095828789910898031L >= this.aLong286 * 1897360544393571999L && this.aLong288 * -5095828789910898031L < this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local205 = this.aLong288 * -5095828789910898031L;
				} else if (this.aLong286 * 1897360544393571999L >= this.aLong288 * -5095828789910898031L && this.aLong286 * 1897360544393571999L < this.aLong288 * -5095828789910898031L + (long) arg2) {
					local205 = this.aLong286 * 1897360544393571999L;
				}
				if ((long) arg2 + this.aLong288 * -5095828789910898031L > this.aLong286 * 1897360544393571999L && (long) arg2 + this.aLong288 * -5095828789910898031L <= this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525)) {
					local207 = this.aLong288 * -5095828789910898031L + (long) arg2;
				} else if (this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) > this.aLong288 * -5095828789910898031L && (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L <= this.aLong288 * -5095828789910898031L + (long) arg2) {
					local207 = this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525);
				}
				if (local205 > -1L && local207 > local205) {
					@Pc(367) int local367 = (int) (local207 - local205);
					System.arraycopy(arg0, (int) ((long) arg1 + local205 - this.aLong288 * -5095828789910898031L), this.aByteArray105, (int) (local205 - this.aLong286 * 1897360544393571999L), local367);
				}
				this.aLong288 += (long) arg2 * -7207108854882236815L;
			} else if (arg2 > 0) {
				if (this.aLong289 * 633671740944377049L == -1L) {
					this.aLong289 = this.aLong288 * -4460100513319432071L;
				}
				System.arraycopy(arg0, arg1, this.aByteArray106, (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L), arg2);
				this.aLong288 += (long) arg2 * -7207108854882236815L;
				if (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L > (long) (this.anInt5382 * 377585381)) {
					this.anInt5382 = (int) (this.aLong288 * -5095828789910898031L - this.aLong289 * 633671740944377049L) * 279514861;
				}
			}
		} catch (@Pc(472) IOException local472) {
			this.aLong290 = 433939964350505141L;
			throw local472;
		}
	}

	@OriginalMember(owner = "client!xa", name = "u", descriptor = "(I)V", line = 203)
	void method32997() throws IOException {
		if (this.aLong289 * 633671740944377049L == -1L) {
			return;
		}
		if (this.aLong290 * 733518405317767779L != this.aLong289 * 633671740944377049L) {
			this.aClass592_1.method33345(this.aLong289 * 633671740944377049L);
			this.aLong290 = this.aLong289 * -4486910500112985453L;
		}
		this.aClass592_1.method33338(this.aByteArray106, 0, this.anInt5382 * 377585381);
		this.aLong290 += (long) this.anInt5382 * -1011710066855008233L;
		if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
			this.aLong287 = this.aLong290 * 3330931491590931111L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong289 * 633671740944377049L >= this.aLong286 * 1897360544393571999L && this.aLong289 * 633671740944377049L < (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L) {
			local68 = this.aLong289 * 633671740944377049L;
		} else if (this.aLong286 * 1897360544393571999L >= this.aLong289 * 633671740944377049L && this.aLong286 * 1897360544393571999L < (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L) {
			local68 = this.aLong286 * 1897360544393571999L;
		}
		if (this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) > this.aLong286 * 1897360544393571999L && this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) <= (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L) {
			local70 = (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L;
		} else if ((long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L > this.aLong289 * 633671740944377049L && this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) <= this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
			local70 = (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray106, (int) (local68 - this.aLong289 * 633671740944377049L), this.aByteArray105, (int) (local68 - this.aLong286 * 1897360544393571999L), local245);
		}
		this.aLong289 = -4370404429417470825L;
		this.anInt5382 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "f", descriptor = "()V", line = 203)
	void method33004() throws IOException {
		if (this.aLong289 * 633671740944377049L == -1L) {
			return;
		}
		if (this.aLong290 * 733518405317767779L != this.aLong289 * 633671740944377049L) {
			this.aClass592_1.method33345(this.aLong289 * 633671740944377049L);
			this.aLong290 = this.aLong289 * -4486910500112985453L;
		}
		this.aClass592_1.method33338(this.aByteArray106, 0, this.anInt5382 * 377585381);
		this.aLong290 += (long) this.anInt5382 * -1011710066855008233L;
		if (this.aLong290 * 733518405317767779L > this.aLong287 * 1564545634711533029L) {
			this.aLong287 = this.aLong290 * 3330931491590931111L;
		}
		@Pc(68) long local68 = -1L;
		@Pc(70) long local70 = -1L;
		if (this.aLong289 * 633671740944377049L >= this.aLong286 * 1897360544393571999L && this.aLong289 * 633671740944377049L < (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L) {
			local68 = this.aLong289 * 633671740944377049L;
		} else if (this.aLong286 * 1897360544393571999L >= this.aLong289 * 633671740944377049L && this.aLong286 * 1897360544393571999L < (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L) {
			local68 = this.aLong286 * 1897360544393571999L;
		}
		if (this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) > this.aLong286 * 1897360544393571999L && this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381) <= (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L) {
			local70 = (long) (this.anInt5382 * 377585381) + this.aLong289 * 633671740944377049L;
		} else if ((long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L > this.aLong289 * 633671740944377049L && this.aLong286 * 1897360544393571999L + (long) (this.anInt5383 * 2050253525) <= this.aLong289 * 633671740944377049L + (long) (this.anInt5382 * 377585381)) {
			local70 = (long) (this.anInt5383 * 2050253525) + this.aLong286 * 1897360544393571999L;
		}
		if (local68 > -1L && local70 > local68) {
			@Pc(245) int local245 = (int) (local70 - local68);
			System.arraycopy(this.aByteArray106, (int) (local68 - this.aLong289 * 633671740944377049L), this.aByteArray105, (int) (local68 - this.aLong286 * 1897360544393571999L), local245);
		}
		this.aLong289 = -4370404429417470825L;
		this.anInt5382 = 0;
	}

	@OriginalMember(owner = "client!xa", name = "ho", descriptor = "(I)V", line = 3710)
	static final void method33006() {
		@Pc(3) int local3 = Class52.anInt1127 * 701602229;
		@Pc(5) int[] local5 = Class52.anIntArray167;
		for (@Pc(7) int local7 = 0; local7 < local3; local7++) {
			@Pc(16) Class26_Sub1_Sub1_Sub1_Sub2 local16 = client.aClass26_Sub1_Sub1_Sub1_Sub2Array1[local5[local7]];
			if (local16 != null) {
				Class536.method32541(local16, false);
			}
		}
	}
}
