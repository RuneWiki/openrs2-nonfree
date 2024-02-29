package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!pn")
public class Class469 implements Runnable {

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "Lclient!zi;")
	Class691 aClass691_15 = new Class691();

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
	int anInt4989 = 0;

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "Z")
	boolean aBoolean753 = false;

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "Ljava/lang/Thread;")
	Thread aThread8 = new Thread(this);

	@OriginalMember(owner = "client!pn", name = "<init>", descriptor = "()V", line = 13)
	public Class469() {
		this.aThread8.setDaemon(true);
		this.aThread8.start();
		this.aThread8.setPriority(1);
	}

	@OriginalMember(owner = "client!pn", name = "p", descriptor = "(ILclient!tx;I)Lclient!atu;", line = 21)
	Class77_Sub1_Sub18_Sub3 method29570(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 8740441;
		@Pc(10) Class691 local10 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			@Pc(17) Class77_Sub1_Sub18_Sub3 local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36335();
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong230 * -753566336061658369L && local17.aClass566_3 == arg1 && local17.anInt3215 * -1221850647 == 2) {
					local3.aByteArray56 = local17.aByteArray56;
					local3.aBoolean540 = false;
					return local3;
				}
				local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36340();
			}
		}
		local3.aByteArray56 = arg1.method31358(arg0);
		local3.aBoolean540 = false;
		local3.aBoolean538 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "t", descriptor = "(ILclient!tx;)Lclient!atu;", line = 21)
	Class77_Sub1_Sub18_Sub3 method29571(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 8740441;
		@Pc(10) Class691 local10 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			@Pc(17) Class77_Sub1_Sub18_Sub3 local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36335();
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong230 * -753566336061658369L && local17.aClass566_3 == arg1 && local17.anInt3215 * -1221850647 == 2) {
					local3.aByteArray56 = local17.aByteArray56;
					local3.aBoolean540 = false;
					return local3;
				}
				local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36340();
			}
		}
		local3.aByteArray56 = arg1.method31358(arg0);
		local3.aBoolean540 = false;
		local3.aBoolean538 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "q", descriptor = "(ILclient!tx;)Lclient!atu;", line = 21)
	Class77_Sub1_Sub18_Sub3 method29572(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 8740441;
		@Pc(10) Class691 local10 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			@Pc(17) Class77_Sub1_Sub18_Sub3 local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36335();
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong230 * -753566336061658369L && local17.aClass566_3 == arg1 && local17.anInt3215 * -1221850647 == 2) {
					local3.aByteArray56 = local17.aByteArray56;
					local3.aBoolean540 = false;
					return local3;
				}
				local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36340();
			}
		}
		local3.aByteArray56 = arg1.method31358(arg0);
		local3.aBoolean540 = false;
		local3.aBoolean538 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "x", descriptor = "(ILclient!tx;)Lclient!atu;", line = 21)
	Class77_Sub1_Sub18_Sub3 method29573(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 8740441;
		@Pc(10) Class691 local10 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			@Pc(17) Class77_Sub1_Sub18_Sub3 local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36335();
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong230 * -753566336061658369L && local17.aClass566_3 == arg1 && local17.anInt3215 * -1221850647 == 2) {
					local3.aByteArray56 = local17.aByteArray56;
					local3.aBoolean540 = false;
					return local3;
				}
				local17 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36340();
			}
		}
		local3.aByteArray56 = arg1.method31358(arg0);
		local3.aBoolean540 = false;
		local3.aBoolean538 = true;
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "c", descriptor = "(I[BLclient!tx;B)Lclient!atu;", line = 39)
	Class77_Sub1_Sub18_Sub3 method29574(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class566 arg2) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 17480882;
		local3.aLong230 = (long) arg0 * 84410810002887935L;
		local3.aByteArray56 = arg1;
		local3.aClass566_3 = arg2;
		local3.aBoolean538 = false;
		this.method29578(local3);
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "d", descriptor = "(I[BLclient!tx;)Lclient!atu;", line = 39)
	Class77_Sub1_Sub18_Sub3 method29575(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class566 arg2) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 17480882;
		local3.aLong230 = (long) arg0 * 84410810002887935L;
		local3.aByteArray56 = arg1;
		local3.aClass566_3 = arg2;
		local3.aBoolean538 = false;
		this.method29578(local3);
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "s", descriptor = "(I[BLclient!tx;)Lclient!atu;", line = 39)
	Class77_Sub1_Sub18_Sub3 method29576(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class566 arg2) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 17480882;
		local3.aLong230 = (long) arg0 * 84410810002887935L;
		local3.aByteArray56 = arg1;
		local3.aClass566_3 = arg2;
		local3.aBoolean538 = false;
		this.method29578(local3);
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "v", descriptor = "(ILclient!tx;I)Lclient!atu;", line = 50)
	Class77_Sub1_Sub18_Sub3 method29577(@OriginalArg(0) int arg0, @OriginalArg(1) Class566 arg1) {
		@Pc(3) Class77_Sub1_Sub18_Sub3 local3 = new Class77_Sub1_Sub18_Sub3();
		local3.anInt3215 = 26221323;
		local3.aLong230 = (long) arg0 * 84410810002887935L;
		local3.aClass566_3 = arg1;
		local3.aBoolean538 = false;
		this.method29578(local3);
		return local3;
	}

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "(Lclient!atu;B)V", line = 60)
	void method29578(@OriginalArg(0) Class77_Sub1_Sub18_Sub3 arg0) {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.method36326(arg0);
			this.anInt4989 += -506550007;
			this.aClass691_15.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pn", name = "j", descriptor = "(Lclient!atu;)V", line = 60)
	void method29579(@OriginalArg(0) Class77_Sub1_Sub18_Sub3 arg0) {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.method36326(arg0);
			this.anInt4989 += -506550007;
			this.aClass691_15.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pn", name = "z", descriptor = "(Lclient!atu;)V", line = 60)
	void method29580(@OriginalArg(0) Class77_Sub1_Sub18_Sub3 arg0) {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.method36326(arg0);
			this.anInt4989 += -506550007;
			this.aClass691_15.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pn", name = "i", descriptor = "(Lclient!atu;)V", line = 60)
	void method29581(@OriginalArg(0) Class77_Sub1_Sub18_Sub3 arg0) {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.method36326(arg0);
			this.anInt4989 += -506550007;
			this.aClass691_15.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pn", name = "k", descriptor = "(Lclient!atu;)V", line = 60)
	void method29582(@OriginalArg(0) Class77_Sub1_Sub18_Sub3 arg0) {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.method36326(arg0);
			this.anInt4989 += -506550007;
			this.aClass691_15.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pn", name = "u", descriptor = "(Lclient!atu;)V", line = 60)
	void method29583(@OriginalArg(0) Class77_Sub1_Sub18_Sub3 arg0) {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.method36326(arg0);
			this.anInt4989 += -506550007;
			this.aClass691_15.notifyAll();
		}
	}

	@OriginalMember(owner = "client!pn", name = "run", descriptor = "()V", line = 68)
	@Override
	public void run() {
		while (!this.aBoolean753) {
			@Pc(6) Class691 local6 = this.aClass691_15;
			@Pc(13) Class77_Sub1_Sub18_Sub3 local13;
			synchronized (this.aClass691_15) {
				local13 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36331();
				if (local13 == null) {
					try {
						this.aClass691_15.wait();
					} catch (@Pc(28) InterruptedException local28) {
					}
					continue;
				}
				this.anInt4989 -= -506550007;
			}
			try {
				if (local13.anInt3215 * -1221850647 == 2) {
					local13.aClass566_3.method31362((int) (local13.aLong230 * -753566336061658369L), local13.aByteArray56, local13.aByteArray56.length);
				} else if (local13.anInt3215 * -1221850647 == 3) {
					local13.aByteArray56 = local13.aClass566_3.method31358((int) (local13.aLong230 * -753566336061658369L));
				}
			} catch (@Pc(80) Exception local80) {
				Class293.method27014(null, local80);
			}
			local13.aBoolean540 = false;
		}
	}

	@OriginalMember(owner = "client!pn", name = "g", descriptor = "()V", line = 68)
	public void method29584() {
		while (!this.aBoolean753) {
			@Pc(6) Class691 local6 = this.aClass691_15;
			@Pc(13) Class77_Sub1_Sub18_Sub3 local13;
			synchronized (this.aClass691_15) {
				local13 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36331();
				if (local13 == null) {
					try {
						this.aClass691_15.wait();
					} catch (@Pc(28) InterruptedException local28) {
					}
					continue;
				}
				this.anInt4989 -= -506550007;
			}
			try {
				if (local13.anInt3215 * -1221850647 == 2) {
					local13.aClass566_3.method31362((int) (local13.aLong230 * -753566336061658369L), local13.aByteArray56, local13.aByteArray56.length);
				} else if (local13.anInt3215 * -1221850647 == 3) {
					local13.aByteArray56 = local13.aClass566_3.method31358((int) (local13.aLong230 * -753566336061658369L));
				}
			} catch (@Pc(80) Exception local80) {
				Class293.method27014(null, local80);
			}
			local13.aBoolean540 = false;
		}
	}

	@OriginalMember(owner = "client!pn", name = "r", descriptor = "()V", line = 68)
	public void method29585() {
		while (!this.aBoolean753) {
			@Pc(6) Class691 local6 = this.aClass691_15;
			@Pc(13) Class77_Sub1_Sub18_Sub3 local13;
			synchronized (this.aClass691_15) {
				local13 = (Class77_Sub1_Sub18_Sub3) this.aClass691_15.method36331();
				if (local13 == null) {
					try {
						this.aClass691_15.wait();
					} catch (@Pc(28) InterruptedException local28) {
					}
					continue;
				}
				this.anInt4989 -= -506550007;
			}
			try {
				if (local13.anInt3215 * -1221850647 == 2) {
					local13.aClass566_3.method31362((int) (local13.aLong230 * -753566336061658369L), local13.aByteArray56, local13.aByteArray56.length);
				} else if (local13.anInt3215 * -1221850647 == 3) {
					local13.aByteArray56 = local13.aClass566_3.method31358((int) (local13.aLong230 * -753566336061658369L));
				}
			} catch (@Pc(80) Exception local80) {
				Class293.method27014(null, local80);
			}
			local13.aBoolean540 = false;
		}
	}

	@OriginalMember(owner = "client!pn", name = "y", descriptor = "(I)I", line = 97)
	public int method29586() {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			return this.anInt4989 * 720483641;
		}
	}

	@OriginalMember(owner = "client!pn", name = "f", descriptor = "()I", line = 97)
	public int method29587() {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			return this.anInt4989 * 720483641;
		}
	}

	@OriginalMember(owner = "client!pn", name = "e", descriptor = "()I", line = 97)
	public int method29588() {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			return this.anInt4989 * 720483641;
		}
	}

	@OriginalMember(owner = "client!pn", name = "o", descriptor = "()I", line = 97)
	public int method29589() {
		@Pc(3) Class691 local3 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			return this.anInt4989 * 720483641;
		}
	}

	@OriginalMember(owner = "client!pn", name = "n", descriptor = "()V", line = 103)
	public void method29590() {
		this.aBoolean753 = true;
		@Pc(6) Class691 local6 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pn", name = "m", descriptor = "()V", line = 103)
	public void method29591() {
		this.aBoolean753 = true;
		@Pc(6) Class691 local6 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pn", name = "b", descriptor = "()V", line = 103)
	public void method29592() {
		this.aBoolean753 = true;
		@Pc(6) Class691 local6 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pn", name = "w", descriptor = "(I)V", line = 103)
	public void method29593() {
		this.aBoolean753 = true;
		@Pc(6) Class691 local6 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pn", name = "a", descriptor = "()V", line = 103)
	public void method29594() {
		this.aBoolean753 = true;
		@Pc(6) Class691 local6 = this.aClass691_15;
		synchronized (this.aClass691_15) {
			this.aClass691_15.notifyAll();
		}
		try {
			this.aThread8.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread8 = null;
	}

	@OriginalMember(owner = "client!pn", name = "l", descriptor = "(I[II)V", line = 215)
	public static void method29595(@OriginalArg(0) int arg0, @OriginalArg(1) int[] arg1) {
		if (-1 != arg0 && Class211.method25607(arg0, arg1)) {
			@Pc(14) Class277[] local14 = Class35_Sub11.aClass273Array1[arg0].aClass277Array2;
			Class148.method15593(local14);
		}
	}

	@OriginalMember(owner = "client!pn", name = "ani", descriptor = "(Lclient!yf;B)V", line = 11968)
	static final void method29596(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= 85613153;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		Class96_Sub7.method7179(local14, local25, local36, local54);
	}
}
