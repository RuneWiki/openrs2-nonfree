package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tw")
public class Class565 implements Runnable {

	@OriginalMember(owner = "client!tw", name = "lp", descriptor = "I")
	static int anInt5338;

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "Ljava/io/IOException;")
	IOException anIOException2;

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "Z")
	boolean aBoolean800;

	@OriginalMember(owner = "client!tw", name = "y", descriptor = "I")
	int anInt5336 = 0;

	@OriginalMember(owner = "client!tw", name = "w", descriptor = "I")
	int anInt5337 = 0;

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream2;

	@OriginalMember(owner = "client!tw", name = "v", descriptor = "I")
	int anInt5335;

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "[B")
	byte[] aByteArray96;

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "Ljava/lang/Thread;")
	Thread aThread10;

	@OriginalMember(owner = "client!tw", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 181)
	Class565(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream2 = arg0;
		this.anInt5335 = (arg1 + 1) * -1088857551;
		this.aByteArray96 = new byte[this.anInt5335 * 1827520209];
		this.aThread10 = new Thread(this);
		this.aThread10.setDaemon(true);
		this.aThread10.start();
	}

	@OriginalMember(owner = "client!tw", name = "p", descriptor = "(I)Z", line = 191)
	boolean method31342() {
		if (!this.aBoolean800) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(17) IOException local17) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local17);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "w", descriptor = "()Z", line = 191)
	boolean method31343() {
		if (!this.aBoolean800) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(17) IOException local17) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local17);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "y", descriptor = "()Z", line = 191)
	boolean method31344() {
		if (!this.aBoolean800) {
			return false;
		}
		try {
			this.anOutputStream2.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(17) IOException local17) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local17);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!tw", name = "run", descriptor = "()V", line = 207)
	@Override
	public void run() {
		do {
			@Pc(28) int local28;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5336 * -1912667095 <= this.anInt5337 * 790570033) {
						local28 = this.anInt5337 * 790570033 - this.anInt5336 * -1912667095;
					} else {
						local28 = this.anInt5337 * 790570033 + (this.anInt5335 * 1827520209 - this.anInt5336 * -1912667095);
					}
					if (local28 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(52) IOException local52) {
						this.anIOException2 = local52;
						return;
					}
					if (this.method31342()) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(69) InterruptedException local69) {
					}
				}
			}
			try {
				if (this.anInt5336 * -1912667095 + local28 <= this.anInt5335 * 1827520209) {
					this.anOutputStream2.write(this.aByteArray96, this.anInt5336 * -1912667095, local28);
				} else {
					@Pc(110) int local110 = this.anInt5335 * 1827520209 - this.anInt5336 * -1912667095;
					this.anOutputStream2.write(this.aByteArray96, this.anInt5336 * -1912667095, local110);
					this.anOutputStream2.write(this.aByteArray96, 0, local28 - local110);
				}
			} catch (@Pc(131) IOException local131x) {
				@Pc(131) IOException local131 = local131x;
				synchronized (this) {
					this.anIOException2 = local131;
					return;
				}
			}
			synchronized (this) {
				this.anInt5336 = (local28 + this.anInt5336 * -1912667095) % (this.anInt5335 * 1827520209) * -1532569575;
			}
		} while (!this.method31342());
	}

	@OriginalMember(owner = "client!tw", name = "r", descriptor = "()V", line = 207)
	public void method31345() {
		do {
			@Pc(28) int local28;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5336 * -1912667095 <= this.anInt5337 * 790570033) {
						local28 = this.anInt5337 * 790570033 - this.anInt5336 * -1912667095;
					} else {
						local28 = this.anInt5337 * 790570033 + (this.anInt5335 * 1827520209 - this.anInt5336 * -1912667095);
					}
					if (local28 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(52) IOException local52) {
						this.anIOException2 = local52;
						return;
					}
					if (this.method31342()) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(69) InterruptedException local69) {
					}
				}
			}
			try {
				if (this.anInt5336 * -1912667095 + local28 <= this.anInt5335 * 1827520209) {
					this.anOutputStream2.write(this.aByteArray96, this.anInt5336 * -1912667095, local28);
				} else {
					@Pc(110) int local110 = this.anInt5335 * 1827520209 - this.anInt5336 * -1912667095;
					this.anOutputStream2.write(this.aByteArray96, this.anInt5336 * -1912667095, local110);
					this.anOutputStream2.write(this.aByteArray96, 0, local28 - local110);
				}
			} catch (@Pc(131) IOException local131x) {
				@Pc(131) IOException local131 = local131x;
				synchronized (this) {
					this.anIOException2 = local131;
					return;
				}
			}
			synchronized (this) {
				this.anInt5336 = (local28 + this.anInt5336 * -1912667095) % (this.anInt5335 * 1827520209) * -1532569575;
			}
		} while (!this.method31342());
	}

	@OriginalMember(owner = "client!tw", name = "g", descriptor = "()V", line = 207)
	public void method31346() {
		do {
			@Pc(28) int local28;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt5336 * -1912667095 <= this.anInt5337 * 790570033) {
						local28 = this.anInt5337 * 790570033 - this.anInt5336 * -1912667095;
					} else {
						local28 = this.anInt5337 * 790570033 + (this.anInt5335 * 1827520209 - this.anInt5336 * -1912667095);
					}
					if (local28 > 0) {
						break;
					}
					try {
						this.anOutputStream2.flush();
					} catch (@Pc(52) IOException local52) {
						this.anIOException2 = local52;
						return;
					}
					if (this.method31342()) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(69) InterruptedException local69) {
					}
				}
			}
			try {
				if (this.anInt5336 * -1912667095 + local28 <= this.anInt5335 * 1827520209) {
					this.anOutputStream2.write(this.aByteArray96, this.anInt5336 * -1912667095, local28);
				} else {
					@Pc(110) int local110 = this.anInt5335 * 1827520209 - this.anInt5336 * -1912667095;
					this.anOutputStream2.write(this.aByteArray96, this.anInt5336 * -1912667095, local110);
					this.anOutputStream2.write(this.aByteArray96, 0, local28 - local110);
				}
			} catch (@Pc(131) IOException local131x) {
				@Pc(131) IOException local131 = local131x;
				synchronized (this) {
					this.anIOException2 = local131;
					return;
				}
			}
			synchronized (this) {
				this.anInt5336 = (local28 + this.anInt5336 * -1912667095) % (this.anInt5335 * 1827520209) * -1532569575;
			}
		} while (!this.method31342());
	}

	@OriginalMember(owner = "client!tw", name = "c", descriptor = "([BIII)V", line = 251)
	void method31347(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(53) int local53;
			if (this.anInt5336 * -1912667095 <= this.anInt5337 * 790570033) {
				local53 = this.anInt5335 * 1827520209 - this.anInt5337 * 790570033 + this.anInt5336 * -1912667095 - 1;
			} else {
				local53 = this.anInt5336 * -1912667095 - this.anInt5337 * 790570033 - 1;
			}
			if (local53 < arg2) {
				throw new IOException("");
			}
			if (this.anInt5337 * 790570033 + arg2 <= this.anInt5335 * 1827520209) {
				System.arraycopy(arg0, arg1, this.aByteArray96, this.anInt5337 * 790570033, arg2);
			} else {
				@Pc(106) int local106 = this.anInt5335 * 1827520209 - this.anInt5337 * 790570033;
				System.arraycopy(arg0, arg1, this.aByteArray96, this.anInt5337 * 790570033, local106);
				System.arraycopy(arg0, local106 + arg1, this.aByteArray96, 0, arg2 - local106);
			}
			this.anInt5337 = (this.anInt5337 * 790570033 + arg2) % (this.anInt5335 * 1827520209) * -1863207727;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tw", name = "t", descriptor = "([BII)V", line = 251)
	void method31348(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(53) int local53;
			if (this.anInt5336 * -1912667095 <= this.anInt5337 * 790570033) {
				local53 = this.anInt5335 * 1827520209 - this.anInt5337 * 790570033 + this.anInt5336 * -1912667095 - 1;
			} else {
				local53 = this.anInt5336 * -1912667095 - this.anInt5337 * 790570033 - 1;
			}
			if (local53 < arg2) {
				throw new IOException("");
			}
			if (this.anInt5337 * 790570033 + arg2 <= this.anInt5335 * 1827520209) {
				System.arraycopy(arg0, arg1, this.aByteArray96, this.anInt5337 * 790570033, arg2);
			} else {
				@Pc(106) int local106 = this.anInt5335 * 1827520209 - this.anInt5337 * 790570033;
				System.arraycopy(arg0, arg1, this.aByteArray96, this.anInt5337 * 790570033, local106);
				System.arraycopy(arg0, local106 + arg1, this.aByteArray96, 0, arg2 - local106);
			}
			this.anInt5337 = (this.anInt5337 * 790570033 + arg2) % (this.anInt5335 * 1827520209) * -1863207727;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tw", name = "q", descriptor = "([BII)V", line = 251)
	void method31349(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(53) int local53;
			if (this.anInt5336 * -1912667095 <= this.anInt5337 * 790570033) {
				local53 = this.anInt5335 * 1827520209 - this.anInt5337 * 790570033 + this.anInt5336 * -1912667095 - 1;
			} else {
				local53 = this.anInt5336 * -1912667095 - this.anInt5337 * 790570033 - 1;
			}
			if (local53 < arg2) {
				throw new IOException("");
			}
			if (this.anInt5337 * 790570033 + arg2 <= this.anInt5335 * 1827520209) {
				System.arraycopy(arg0, arg1, this.aByteArray96, this.anInt5337 * 790570033, arg2);
			} else {
				@Pc(106) int local106 = this.anInt5335 * 1827520209 - this.anInt5337 * 790570033;
				System.arraycopy(arg0, arg1, this.aByteArray96, this.anInt5337 * 790570033, local106);
				System.arraycopy(arg0, local106 + arg1, this.aByteArray96, 0, arg2 - local106);
			}
			this.anInt5337 = (this.anInt5337 * 790570033 + arg2) % (this.anInt5335 * 1827520209) * -1863207727;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!tw", name = "x", descriptor = "()V", line = 272)
	void method31350() {
		synchronized (this) {
			this.aBoolean800 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!tw", name = "v", descriptor = "(I)V", line = 272)
	void method31351() {
		synchronized (this) {
			this.aBoolean800 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!tw", name = "l", descriptor = "(B)V", line = 283)
	void method31352() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!tw", name = "d", descriptor = "()V", line = 283)
	void method31353() {
		this.anOutputStream2 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!tw", name = "it", descriptor = "(Lclient!yf;S)V", line = 6004)
	static final void method31354(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class25.method457(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tw", name = "wy", descriptor = "(Lclient!yf;I)V", line = 8507)
	static final void method31355(@OriginalArg(0) Class665 arg0) {
		if (client.anInt3467 * 136304939 >= 5 && client.anInt3467 * 136304939 <= 9) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 1;
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		}
	}

	@OriginalMember(owner = "client!tw", name = "akw", descriptor = "(Lclient!yf;I)V", line = 11254)
	static final void method31356(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
	}

	@OriginalMember(owner = "client!tw", name = "lb", descriptor = "([Lclient!gm;II)V", line = 11644)
	static final void method31357(@OriginalArg(0) Class277[] arg0, @OriginalArg(1) int arg1) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class277 local9 = arg0[local1];
			if (local9 != null) {
				if (local9.anInt3857 * -1960530827 == 0) {
					if (local9.aClass277Array4 != null) {
						method31357(local9.aClass277Array4, arg1);
					}
					@Pc(36) Class77_Sub38 local36 = (Class77_Sub38) client.aClass12_20.method173((long) (local9.anInt3863 * -1278450723));
					if (local36 != null) {
						Class611.method32232(local36.anInt3113 * 1225863589, arg1);
					}
				}
				@Pc(56) Class77_Sub41 local56;
				if (arg1 == 0 && local9.anObjectArray17 != null) {
					local56 = new Class77_Sub41();
					local56.aClass277_2 = local9;
					local56.anObjectArray4 = local9.anObjectArray17;
					Class72.method1019(local56);
				}
				if (arg1 == 1 && local9.anObjectArray10 != null) {
					if (local9.anInt3927 * 1365669833 >= 0) {
						@Pc(84) Class277 local84 = Class155.method23628(local9.anInt3863 * -1278450723);
						if (local84 == null || local84.aClass277Array3 == null || local9.anInt3927 * 1365669833 >= local84.aClass277Array3.length || local84.aClass277Array3[local9.anInt3927 * 1365669833] != local9) {
							continue;
						}
					}
					local56 = new Class77_Sub41();
					local56.aClass277_2 = local9;
					local56.anObjectArray4 = local9.anObjectArray10;
					Class72.method1019(local56);
				}
			}
		}
	}
}
