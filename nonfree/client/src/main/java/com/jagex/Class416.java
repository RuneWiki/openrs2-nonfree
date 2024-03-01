package com.jagex;

import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!qr")
public class Class416 implements Runnable {

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "Ljava/io/IOException;")
	IOException anIOException2;

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "Z")
	boolean aBoolean756;

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "I")
	int anInt4836 = 0;

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "I")
	int anInt4835 = 0;

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "Ljava/io/OutputStream;")
	OutputStream anOutputStream1;

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "I")
	int anInt4834;

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "[B")
	byte[] aByteArray86;

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "Ljava/lang/Thread;")
	Thread aThread10;

	@OriginalMember(owner = "client!qr", name = "<init>", descriptor = "(Ljava/io/OutputStream;I)V", line = 179)
	Class416(@OriginalArg(0) OutputStream arg0, @OriginalArg(1) int arg1) {
		this.anOutputStream1 = arg0;
		this.anInt4834 = (arg1 + 1) * -29955491;
		this.aByteArray86 = new byte[this.anInt4834 * -501270027];
		this.aThread10 = new Thread(this);
		this.aThread10.setDaemon(true);
		this.aThread10.start();
	}

	@OriginalMember(owner = "client!qr", name = "p", descriptor = "(I)Z", line = 189)
	boolean method27773() {
		if (!this.aBoolean756) {
			return false;
		}
		try {
			this.anOutputStream1.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "h", descriptor = "()Z", line = 189)
	boolean method27778() {
		if (!this.aBoolean756) {
			return false;
		}
		try {
			this.anOutputStream1.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "x", descriptor = "()Z", line = 189)
	boolean method27779() {
		if (!this.aBoolean756) {
			return false;
		}
		try {
			this.anOutputStream1.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "s", descriptor = "()Z", line = 189)
	boolean method27780() {
		if (!this.aBoolean756) {
			return false;
		}
		try {
			this.anOutputStream1.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "u", descriptor = "()Z", line = 189)
	boolean method27781() {
		if (!this.aBoolean756) {
			return false;
		}
		try {
			this.anOutputStream1.close();
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException("");
			}
		} catch (@Pc(16) IOException local16) {
			if (this.anIOException2 == null) {
				this.anIOException2 = new IOException(local16);
			}
		}
		return true;
	}

	@OriginalMember(owner = "client!qr", name = "run", descriptor = "()V", line = 205)
	@Override
	public void run() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4836 * 648471517 <= this.anInt4835 * 749286793) {
						local29 = this.anInt4835 * 749286793 - this.anInt4836 * 648471517;
					} else {
						local29 = this.anInt4835 * 749286793 + (this.anInt4834 * -501270027 - this.anInt4836 * 648471517);
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method27773()) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (this.anInt4836 * 648471517 + local29 <= this.anInt4834 * -501270027) {
					this.anOutputStream1.write(this.aByteArray86, this.anInt4836 * 648471517, local29);
				} else {
					@Pc(111) int local111 = this.anInt4834 * -501270027 - this.anInt4836 * 648471517;
					this.anOutputStream1.write(this.aByteArray86, this.anInt4836 * 648471517, local111);
					this.anOutputStream1.write(this.aByteArray86, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt4836 = (this.anInt4836 * 648471517 + local29) % (this.anInt4834 * -501270027) * -1371435915;
			}
		} while (!this.method27773());
	}

	@OriginalMember(owner = "client!qr", name = "n", descriptor = "()V", line = 205)
	public void method27777() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4836 * 648471517 <= this.anInt4835 * 749286793) {
						local29 = this.anInt4835 * 749286793 - this.anInt4836 * 648471517;
					} else {
						local29 = this.anInt4835 * 749286793 + (this.anInt4834 * -501270027 - this.anInt4836 * 648471517);
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method27773()) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (this.anInt4836 * 648471517 + local29 <= this.anInt4834 * -501270027) {
					this.anOutputStream1.write(this.aByteArray86, this.anInt4836 * 648471517, local29);
				} else {
					@Pc(111) int local111 = this.anInt4834 * -501270027 - this.anInt4836 * 648471517;
					this.anOutputStream1.write(this.aByteArray86, this.anInt4836 * 648471517, local111);
					this.anOutputStream1.write(this.aByteArray86, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt4836 = (this.anInt4836 * 648471517 + local29) % (this.anInt4834 * -501270027) * -1371435915;
			}
		} while (!this.method27773());
	}

	@OriginalMember(owner = "client!qr", name = "j", descriptor = "()V", line = 205)
	public void method27782() {
		do {
			@Pc(29) int local29;
			synchronized (this) {
				while (true) {
					if (this.anIOException2 != null) {
						return;
					}
					if (this.anInt4836 * 648471517 <= this.anInt4835 * 749286793) {
						local29 = this.anInt4835 * 749286793 - this.anInt4836 * 648471517;
					} else {
						local29 = this.anInt4835 * 749286793 + (this.anInt4834 * -501270027 - this.anInt4836 * 648471517);
					}
					if (local29 > 0) {
						break;
					}
					try {
						this.anOutputStream1.flush();
					} catch (@Pc(53) IOException local53) {
						this.anIOException2 = local53;
						return;
					}
					if (this.method27773()) {
						return;
					}
					try {
						this.wait();
					} catch (@Pc(70) InterruptedException local70) {
					}
				}
			}
			try {
				if (this.anInt4836 * 648471517 + local29 <= this.anInt4834 * -501270027) {
					this.anOutputStream1.write(this.aByteArray86, this.anInt4836 * 648471517, local29);
				} else {
					@Pc(111) int local111 = this.anInt4834 * -501270027 - this.anInt4836 * 648471517;
					this.anOutputStream1.write(this.aByteArray86, this.anInt4836 * 648471517, local111);
					this.anOutputStream1.write(this.aByteArray86, 0, local29 - local111);
				}
			} catch (@Pc(132) IOException local132x) {
				@Pc(132) IOException local132 = local132x;
				synchronized (this) {
					this.anIOException2 = local132;
					return;
				}
			}
			synchronized (this) {
				this.anInt4836 = (this.anInt4836 * 648471517 + local29) % (this.anInt4834 * -501270027) * -1371435915;
			}
		} while (!this.method27773());
	}

	@OriginalMember(owner = "client!qr", name = "a", descriptor = "([BIII)V", line = 249)
	void method27774(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt4836 * 648471517 <= this.anInt4835 * 749286793) {
				local54 = this.anInt4834 * -501270027 - this.anInt4835 * 749286793 + this.anInt4836 * 648471517 - 1;
			} else {
				local54 = this.anInt4836 * 648471517 - this.anInt4835 * 749286793 - 1;
			}
			if (local54 < arg2) {
				throw new IOException("");
			}
			if (arg2 + this.anInt4835 * 749286793 <= this.anInt4834 * -501270027) {
				System.arraycopy(arg0, arg1, this.aByteArray86, this.anInt4835 * 749286793, arg2);
			} else {
				@Pc(107) int local107 = this.anInt4834 * -501270027 - this.anInt4835 * 749286793;
				System.arraycopy(arg0, arg1, this.aByteArray86, this.anInt4835 * 749286793, local107);
				System.arraycopy(arg0, local107 + arg1, this.aByteArray86, 0, arg2 - local107);
			}
			this.anInt4835 = (this.anInt4835 * 749286793 + arg2) % (this.anInt4834 * -501270027) * 1194447033;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qr", name = "b", descriptor = "([BII)V", line = 249)
	void method27783(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt4836 * 648471517 <= this.anInt4835 * 749286793) {
				local54 = this.anInt4834 * -501270027 - this.anInt4835 * 749286793 + this.anInt4836 * 648471517 - 1;
			} else {
				local54 = this.anInt4836 * 648471517 - this.anInt4835 * 749286793 - 1;
			}
			if (local54 < arg2) {
				throw new IOException("");
			}
			if (arg2 + this.anInt4835 * 749286793 <= this.anInt4834 * -501270027) {
				System.arraycopy(arg0, arg1, this.aByteArray86, this.anInt4835 * 749286793, arg2);
			} else {
				@Pc(107) int local107 = this.anInt4834 * -501270027 - this.anInt4835 * 749286793;
				System.arraycopy(arg0, arg1, this.aByteArray86, this.anInt4835 * 749286793, local107);
				System.arraycopy(arg0, local107 + arg1, this.aByteArray86, 0, arg2 - local107);
			}
			this.anInt4835 = (this.anInt4835 * 749286793 + arg2) % (this.anInt4834 * -501270027) * 1194447033;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qr", name = "y", descriptor = "([BII)V", line = 249)
	void method27784(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) throws IOException {
		if (arg2 < 0 || arg1 < 0 || arg2 + arg1 > arg0.length) {
			throw new IOException();
		}
		synchronized (this) {
			if (this.anIOException2 != null) {
				throw new IOException(this.anIOException2.toString());
			}
			@Pc(54) int local54;
			if (this.anInt4836 * 648471517 <= this.anInt4835 * 749286793) {
				local54 = this.anInt4834 * -501270027 - this.anInt4835 * 749286793 + this.anInt4836 * 648471517 - 1;
			} else {
				local54 = this.anInt4836 * 648471517 - this.anInt4835 * 749286793 - 1;
			}
			if (local54 < arg2) {
				throw new IOException("");
			}
			if (arg2 + this.anInt4835 * 749286793 <= this.anInt4834 * -501270027) {
				System.arraycopy(arg0, arg1, this.aByteArray86, this.anInt4835 * 749286793, arg2);
			} else {
				@Pc(107) int local107 = this.anInt4834 * -501270027 - this.anInt4835 * 749286793;
				System.arraycopy(arg0, arg1, this.aByteArray86, this.anInt4835 * 749286793, local107);
				System.arraycopy(arg0, local107 + arg1, this.aByteArray86, 0, arg2 - local107);
			}
			this.anInt4835 = (this.anInt4835 * 749286793 + arg2) % (this.anInt4834 * -501270027) * 1194447033;
			this.notifyAll();
		}
	}

	@OriginalMember(owner = "client!qr", name = "g", descriptor = "(I)V", line = 270)
	void method27785() {
		synchronized (this) {
			this.aBoolean756 = true;
			this.notifyAll();
		}
		try {
			this.aThread10.join();
		} catch (@Pc(21) InterruptedException local21) {
		}
	}

	@OriginalMember(owner = "client!qr", name = "z", descriptor = "()V", line = 281)
	void method27772() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!qr", name = "l", descriptor = "(I)V", line = 281)
	void method27775() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!qr", name = "c", descriptor = "()V", line = 281)
	void method27776() {
		this.anOutputStream1 = new OutputStream_Sub1();
	}

	@OriginalMember(owner = "client!qr", name = "cd", descriptor = "(Lclient!vs;S)V", line = 4518)
	static final void method27788(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class480.method28970(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!qr", name = "mj", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;I)V", line = 6318)
	static final void method27786(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray26 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!qr", name = "aju", descriptor = "(Lclient!vs;I)V", line = 10755)
	static final void method27787(@OriginalArg(0) Class536 arg0) {
		@Pc(13) Class3_Sub32 local13 = (Class3_Sub32) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (Class80.aClass23_Sub1_1.method5887() != Class204.aClass204_5) {
			throw new RuntimeException();
		}
		@Pc(27) Class30_Sub1 local27 = (Class30_Sub1) Class80.aClass23_Sub1_1.method5827();
		local27.method7446(local13);
		client.aBoolean586 = true;
	}
}
