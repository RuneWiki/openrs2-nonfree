package com.jagex;

import com.jagex.twitchtv.TwitchWebcamDevice;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ts")
public class Class562 implements Runnable {

	@OriginalMember(owner = "client!ts", name = "he", descriptor = "Lclient!adn;")
	public static Class80_Sub1_Sub1 aClass80_Sub1_Sub1_2;

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "Ljava/io/IOException;")
	IOException anIOException1;

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "I")
	int anInt5317 = 0;

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "I")
	int anInt5318 = 0;

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream2;

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "I")
	int anInt5316;

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "[B")
	byte[] aByteArray93;

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "Ljava/lang/Thread;")
	Thread aThread9;

	@OriginalMember(owner = "client!ts", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 65)
	Class562(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream2 = arg0;
		this.anInt5316 = (arg1 + 1) * 671741067;
		this.aByteArray93 = new byte[this.anInt5316 * -2015374557];
		this.aThread9 = new Thread(this);
		this.aThread9.setDaemon(true);
		this.aThread9.start();
	}

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "(II)Z", line = 70)
	public static boolean method31306(@OriginalArg(0) int arg0) {
		return arg0 == (arg0 & -arg0);
	}

	@OriginalMember(owner = "client!ts", name = "g", descriptor = "()V", line = 77)
	public void method31307() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5317 * -1709640747 == 0) {
						local26 = this.anInt5316 * -2015374557 - this.anInt5318 * -175092243 - 1;
					} else if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
						local26 = this.anInt5316 * -2015374557 - this.anInt5318 * -175092243;
					} else {
						local26 = this.anInt5317 * -1709640747 - this.anInt5318 * -175092243 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray93, this.anInt5318 * -175092243, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5318 = (local86 + this.anInt5318 * -175092243) % (this.anInt5316 * -2015374557) * -313387035;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "r", descriptor = "()V", line = 77)
	public void method31308() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5317 * -1709640747 == 0) {
						local26 = this.anInt5316 * -2015374557 - this.anInt5318 * -175092243 - 1;
					} else if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
						local26 = this.anInt5316 * -2015374557 - this.anInt5318 * -175092243;
					} else {
						local26 = this.anInt5317 * -1709640747 - this.anInt5318 * -175092243 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray93, this.anInt5318 * -175092243, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5318 = (local86 + this.anInt5318 * -175092243) % (this.anInt5316 * -2015374557) * -313387035;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "run", descriptor = "()V", line = 77)
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt5317 * -1709640747 == 0) {
						local26 = this.anInt5316 * -2015374557 - this.anInt5318 * -175092243 - 1;
					} else if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
						local26 = this.anInt5316 * -2015374557 - this.anInt5318 * -175092243;
					} else {
						local26 = this.anInt5317 * -1709640747 - this.anInt5318 * -175092243 - 1;
					}
					if (local26 > 0) {
						break;
					}
					try {
						this.wait();
					} catch (@Pc(66) InterruptedException local66) {
					}
				}
			}
			@Pc(86) int local86;
			try {
				local86 = this.anInputStream2.read(this.aByteArray93, this.anInt5318 * -175092243, local26);
				if (local86 == -1) {
					throw new EOFException();
				}
			} catch (@Pc(95) IOException local95x) {
				@Pc(95) IOException local95 = local95x;
				synchronized (this) {
					this.anIOException1 = local95;
					return;
				}
			}
			synchronized (this) {
				this.anInt5318 = (local86 + this.anInt5318 * -175092243) % (this.anInt5316 * -2015374557) * -313387035;
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "p", descriptor = "(II)Z", line = 108)
	boolean method31309(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt5316 * -2015374557) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(34) int local34;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local34 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local34 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (local34 >= arg0) {
				return true;
			} else if (this.anIOException1 == null) {
				this.notifyAll();
				return false;
			} else {
				throw new IOException(this.anIOException1.toString());
			}
		}
	}

	@OriginalMember(owner = "client!ts", name = "c", descriptor = "(B)I", line = 123)
	int method31310() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local22 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local22 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ts", name = "w", descriptor = "()I", line = 123)
	int method31311() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local22 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local22 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!ts", name = "x", descriptor = "([BII)I", line = 134)
	int method31312(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local36 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local36 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5317 * -1709640747 + arg2 <= this.anInt5316 * -2015374557) {
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, arg2);
			} else {
				@Pc(102) int local102 = this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747;
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, local102);
				System.arraycopy(this.aByteArray93, 0, arg0, local102 + arg1, arg2 - local102);
			}
			this.anInt5317 = (-1709640747 * this.anInt5317 + arg2) % (-2015374557 * this.anInt5316) * -1746752131;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "v", descriptor = "([BIIS)I", line = 134)
	int method31313(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local36 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local36 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5317 * -1709640747 + arg2 <= this.anInt5316 * -2015374557) {
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, arg2);
			} else {
				@Pc(102) int local102 = this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747;
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, local102);
				System.arraycopy(this.aByteArray93, 0, arg0, local102 + arg1, arg2 - local102);
			}
			this.anInt5317 = (-1709640747 * this.anInt5317 + arg2) % (-2015374557 * this.anInt5316) * -1746752131;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "t", descriptor = "([BII)I", line = 134)
	int method31314(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local36 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local36 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5317 * -1709640747 + arg2 <= this.anInt5316 * -2015374557) {
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, arg2);
			} else {
				@Pc(102) int local102 = this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747;
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, local102);
				System.arraycopy(this.aByteArray93, 0, arg0, local102 + arg1, arg2 - local102);
			}
			this.anInt5317 = (-1709640747 * this.anInt5317 + arg2) % (-2015374557 * this.anInt5316) * -1746752131;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "q", descriptor = "([BII)I", line = 134)
	int method31315(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local36 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local36 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5317 * -1709640747 + arg2 <= this.anInt5316 * -2015374557) {
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, arg2);
			} else {
				@Pc(102) int local102 = this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747;
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, local102);
				System.arraycopy(this.aByteArray93, 0, arg0, local102 + arg1, arg2 - local102);
			}
			this.anInt5317 = (-1709640747 * this.anInt5317 + arg2) % (-2015374557 * this.anInt5316) * -1746752131;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "d", descriptor = "([BII)I", line = 134)
	int method31316(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt5317 * -1709640747 <= this.anInt5318 * -175092243) {
				local36 = this.anInt5318 * -175092243 - this.anInt5317 * -1709640747;
			} else {
				local36 = this.anInt5318 * -175092243 + (this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747);
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (this.anInt5317 * -1709640747 + arg2 <= this.anInt5316 * -2015374557) {
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, arg2);
			} else {
				@Pc(102) int local102 = this.anInt5316 * -2015374557 - this.anInt5317 * -1709640747;
				System.arraycopy(this.aByteArray93, this.anInt5317 * -1709640747, arg0, arg1, local102);
				System.arraycopy(this.aByteArray93, 0, arg0, local102 + arg1, arg2 - local102);
			}
			this.anInt5317 = (-1709640747 * this.anInt5317 + arg2) % (-2015374557 * this.anInt5316) * -1746752131;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!ts", name = "l", descriptor = "(I)V", line = 156)
	void method31317() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!ts", name = "z", descriptor = "()V", line = 156)
	void method31318() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!ts", name = "j", descriptor = "()V", line = 156)
	void method31319() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!ts", name = "s", descriptor = "()V", line = 156)
	void method31320() {
		synchronized (this) {
			if (this.anIOException1 == null) {
				this.anIOException1 = new IOException("");
			}
			this.notifyAll();
		}
		try {
			this.aThread9.join();
		} catch (@Pc(28) InterruptedException local28) {
		}
	}

	@OriginalMember(owner = "client!ts", name = "y", descriptor = "(B)V", line = 167)
	void method31321() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!ts", name = "i", descriptor = "()V", line = 167)
	void method31322() {
		this.anInputStream2 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!ts", name = "av", descriptor = "(II)Lclient!com/jagex/twitchtv/TwitchWebcamDevice;", line = 494)
	public static TwitchWebcamDevice method31323(@OriginalArg(0) int arg0) {
		if (Class574.aTwitchWebcamDeviceArray1 == null) {
			return null;
		}
		for (@Pc(5) int local5 = 0; local5 < Class574.aTwitchWebcamDeviceArray1.length; local5++) {
			if (arg0 == Class574.aTwitchWebcamDeviceArray1[local5].v * -1989490985) {
				return Class574.aTwitchWebcamDeviceArray1[local5];
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!ts", name = "nf", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7058)
	static final void method31324(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray34 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!ts", name = "qe", descriptor = "(Lclient!yf;B)V", line = 7553)
	static final void method31325(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(13) int local13 = -1;
		@Pc(15) int local15 = -1;
		@Pc(20) Class276 local20 = local11.method26633(Class284.aClass86_9);
		if (local20 != null) {
			local13 = local20.anInt3844 * -760407609;
			local15 = local20.anInt3843 * -976807825;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local15;
	}
}
