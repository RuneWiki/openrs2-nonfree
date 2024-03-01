package com.jagex;

import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qm")
public class Class411 implements Runnable {

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "Ljava/io/IOException;")
	IOException anIOException1;

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "I")
	int anInt4821 = 0;

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "I")
	int anInt4822 = 0;

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "Ljava/io/InputStream;")
	InputStream anInputStream1;

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "I")
	int anInt4820;

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "[B")
	byte[] aByteArray85;

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "Ljava/lang/Thread;")
	Thread aThread9;

	@OriginalMember(owner = "client!qm", name = "<init>", descriptor = "(Ljava/io/InputStream;I)V", line = 63)
	Class411(@OriginalArg(0) InputStream arg0, @OriginalArg(1) int arg1) {
		this.anInputStream1 = arg0;
		this.anInt4820 = (arg1 + 1) * 344682267;
		this.aByteArray85 = new byte[this.anInt4820 * 1257460499];
		this.aThread9 = new Thread(this);
		this.aThread9.setDaemon(true);
		this.aThread9.start();
	}

	@OriginalMember(owner = "client!qm", name = "run", descriptor = "()V", line = 75)
	@Override
	public void run() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4821 * 1300537589 == 0) {
						local26 = this.anInt4820 * 1257460499 - this.anInt4822 * -1327921255 - 1;
					} else if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
						local26 = this.anInt4820 * 1257460499 - this.anInt4822 * -1327921255;
					} else {
						local26 = this.anInt4821 * 1300537589 - this.anInt4822 * -1327921255 - 1;
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
				local86 = this.anInputStream1.read(this.aByteArray85, this.anInt4822 * -1327921255, local26);
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
				this.anInt4822 = (local86 + this.anInt4822 * -1327921255) % (this.anInt4820 * 1257460499) * -2121343831;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "j", descriptor = "()V", line = 75)
	public void method27683() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4821 * 1300537589 == 0) {
						local26 = this.anInt4820 * 1257460499 - this.anInt4822 * -1327921255 - 1;
					} else if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
						local26 = this.anInt4820 * 1257460499 - this.anInt4822 * -1327921255;
					} else {
						local26 = this.anInt4821 * 1300537589 - this.anInt4822 * -1327921255 - 1;
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
				local86 = this.anInputStream1.read(this.aByteArray85, this.anInt4822 * -1327921255, local26);
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
				this.anInt4822 = (local86 + this.anInt4822 * -1327921255) % (this.anInt4820 * 1257460499) * -2121343831;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "n", descriptor = "()V", line = 75)
	public void method27684() {
		while (true) {
			@Pc(26) int local26;
			synchronized (this) {
				while (true) {
					if (this.anIOException1 != null) {
						return;
					}
					if (this.anInt4821 * 1300537589 == 0) {
						local26 = this.anInt4820 * 1257460499 - this.anInt4822 * -1327921255 - 1;
					} else if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
						local26 = this.anInt4820 * 1257460499 - this.anInt4822 * -1327921255;
					} else {
						local26 = this.anInt4821 * 1300537589 - this.anInt4822 * -1327921255 - 1;
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
				local86 = this.anInputStream1.read(this.aByteArray85, this.anInt4822 * -1327921255, local26);
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
				this.anInt4822 = (local86 + this.anInt4822 * -1327921255) % (this.anInt4820 * 1257460499) * -2121343831;
			}
		}
	}

	@OriginalMember(owner = "client!qm", name = "p", descriptor = "(IB)Z", line = 106)
	boolean method27692(@OriginalArg(0) int arg0) throws IOException {
		if (arg0 <= 0 || arg0 >= this.anInt4820 * 1257460499) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(34) int local34;
			if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
				local34 = this.anInt4822 * -1327921255 - this.anInt4821 * 1300537589;
			} else {
				local34 = this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589 + this.anInt4822 * -1327921255;
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

	@OriginalMember(owner = "client!qm", name = "a", descriptor = "(I)I", line = 121)
	int method27679() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
				local22 = this.anInt4822 * -1327921255 - this.anInt4821 * 1300537589;
			} else {
				local22 = this.anInt4822 * -1327921255 + (this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589);
			}
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!qm", name = "x", descriptor = "()I", line = 121)
	int method27685() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
				local22 = this.anInt4822 * -1327921255 - this.anInt4821 * 1300537589;
			} else {
				local22 = this.anInt4822 * -1327921255 + (this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589);
			}
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!qm", name = "s", descriptor = "()I", line = 121)
	int method27686() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
				local22 = this.anInt4822 * -1327921255 - this.anInt4821 * 1300537589;
			} else {
				local22 = this.anInt4822 * -1327921255 + (this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589);
			}
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!qm", name = "u", descriptor = "()I", line = 121)
	int method27687() throws IOException {
		synchronized (this) {
			@Pc(22) int local22;
			if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
				local22 = this.anInt4822 * -1327921255 - this.anInt4821 * 1300537589;
			} else {
				local22 = this.anInt4822 * -1327921255 + (this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589);
			}
			if (this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			this.notifyAll();
			return local22;
		}
	}

	@OriginalMember(owner = "client!qm", name = "g", descriptor = "([BIII)I", line = 132)
	int method27690(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg1 + arg2 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			@Pc(36) int local36;
			if (this.anInt4821 * 1300537589 <= this.anInt4822 * -1327921255) {
				local36 = this.anInt4822 * -1327921255 - this.anInt4821 * 1300537589;
			} else {
				local36 = this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589 + this.anInt4822 * -1327921255;
			}
			if (arg2 > local36) {
				arg2 = local36;
			}
			if (arg2 == 0 && this.anIOException1 != null) {
				throw new IOException(this.anIOException1.toString());
			}
			if (arg2 + this.anInt4821 * 1300537589 <= this.anInt4820 * 1257460499) {
				System.arraycopy(this.aByteArray85, this.anInt4821 * 1300537589, arg0, arg1, arg2);
			} else {
				@Pc(103) int local103 = this.anInt4820 * 1257460499 - this.anInt4821 * 1300537589;
				System.arraycopy(this.aByteArray85, this.anInt4821 * 1300537589, arg0, arg1, local103);
				System.arraycopy(this.aByteArray85, 0, arg0, local103 + arg1, arg2 - local103);
			}
			this.anInt4821 = (this.anInt4821 * 1300537589 + arg2) % (this.anInt4820 * 1257460499) * -135591075;
			this.notifyAll();
			return arg2;
		}
	}

	@OriginalMember(owner = "client!qm", name = "z", descriptor = "()V", line = 154)
	void method27678() {
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

	@OriginalMember(owner = "client!qm", name = "c", descriptor = "()V", line = 154)
	void method27680() {
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

	@OriginalMember(owner = "client!qm", name = "l", descriptor = "(I)V", line = 154)
	void method27681() {
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

	@OriginalMember(owner = "client!qm", name = "y", descriptor = "()V", line = 154)
	void method27688() {
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

	@OriginalMember(owner = "client!qm", name = "b", descriptor = "()V", line = 154)
	void method27694() {
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

	@OriginalMember(owner = "client!qm", name = "h", descriptor = "(I)V", line = 165)
	void method27682() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!qm", name = "d", descriptor = "()V", line = 165)
	void method27689() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!qm", name = "r", descriptor = "()V", line = 165)
	void method27691() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!qm", name = "e", descriptor = "()V", line = 165)
	void method27693() {
		this.anInputStream1 = new InputStream_Sub1();
	}

	@OriginalMember(owner = "client!qm", name = "bw", descriptor = "(IIII)V", line = 274)
	static void method27697(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(11, (long) arg0);
		local4.method19155();
		local4.anInt2693 = arg1 * 1666161167;
		local4.anInt2695 = arg2 * 378120307;
	}

	@OriginalMember(owner = "client!qm", name = "adf", descriptor = "(Lclient!vs;I)V", line = 9272)
	static final void method27695(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (local28.method33850()) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class583.aClass609_1.method33571(local13).method18930(local23, local28.aString248);
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class583.aClass609_1.method33571(local13).method18934(local23, local28.anInt5585 * 100041865);
		}
	}

	@OriginalMember(owner = "client!qm", name = "avh", descriptor = "(Lclient!vs;I)V", line = 12750)
	static final void method27696(@OriginalArg(0) Class536 arg0) {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		for (@Pc(5) int local5 = 0; local5 < Class296.aClass46_Sub1Array1.length; local5++) {
			if (Class296.aClass46_Sub1Array1[local5] != null && Class296.aClass46_Sub1Array1[local5].method8530()) {
				local1 += Class296.aClass46_Sub1Array1[local5].method8531();
				local3 += Class296.aClass46_Sub1Array1[local5].method8533();
			}
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local1 == 0 ? 0 : local3 * 100 / local1;
	}
}
