package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nj")
public class Class347 implements Runnable {

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "Lclient!wc;")
	Class546 aClass546_16 = new Class546();

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "I")
	int anInt4622 = 0;

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "Z")
	boolean aBoolean720 = false;

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "Ljava/lang/Thread;")
	Thread aThread7 = new Thread(this);

	@OriginalMember(owner = "client!nj", name = "<init>", descriptor = "()V", line = 13)
	public Class347() {
		this.aThread7.setDaemon(true);
		this.aThread7.start();
		this.aThread7.setPriority(1);
	}

	@OriginalMember(owner = "client!nj", name = "s", descriptor = "(ILclient!qa;)Lclient!aom;", line = 21)
	Class3_Sub1_Sub12_Sub2 method26527(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = -755091409;
		@Pc(10) Class546 local10 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			@Pc(17) Class3_Sub1_Sub12_Sub2 local17 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32623();
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong297 * -2884094411549009029L && local17.aClass403_8 == arg1 && local17.anInt2864 * -2097017137 == 2) {
					local3.aByteArray53 = local17.aByteArray53;
					local3.aBoolean516 = false;
					return local3;
				}
				local17 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32645();
			}
		}
		local3.aByteArray53 = arg1.method27623(arg0);
		local3.aBoolean516 = false;
		local3.aBoolean515 = true;
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "p", descriptor = "(ILclient!qa;B)Lclient!aom;", line = 21)
	Class3_Sub1_Sub12_Sub2 method26537(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = -755091409;
		@Pc(10) Class546 local10 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			@Pc(17) Class3_Sub1_Sub12_Sub2 local17 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32623();
			while (true) {
				if (local17 == null) {
					break;
				}
				if ((long) arg0 == local17.aLong297 * -2884094411549009029L && local17.aClass403_8 == arg1 && local17.anInt2864 * -2097017137 == 2) {
					local3.aByteArray53 = local17.aByteArray53;
					local3.aBoolean516 = false;
					return local3;
				}
				local17 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32645();
			}
		}
		local3.aByteArray53 = arg1.method27623(arg0);
		local3.aBoolean516 = false;
		local3.aBoolean515 = true;
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "a", descriptor = "(I[BLclient!qa;I)Lclient!aom;", line = 39)
	Class3_Sub1_Sub12_Sub2 method26520(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class403 arg2) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = -1510182818;
		local3.aLong297 = (long) arg0 * -2199417693621122125L;
		local3.aByteArray53 = arg1;
		local3.aClass403_8 = arg2;
		local3.aBoolean515 = false;
		this.method26522(local3);
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "u", descriptor = "(I[BLclient!qa;)Lclient!aom;", line = 39)
	Class3_Sub1_Sub12_Sub2 method26521(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class403 arg2) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = -1510182818;
		local3.aLong297 = (long) arg0 * -2199417693621122125L;
		local3.aByteArray53 = arg1;
		local3.aClass403_8 = arg2;
		local3.aBoolean515 = false;
		this.method26522(local3);
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "y", descriptor = "(I[BLclient!qa;)Lclient!aom;", line = 39)
	Class3_Sub1_Sub12_Sub2 method26528(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class403 arg2) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = -1510182818;
		local3.aLong297 = (long) arg0 * -2199417693621122125L;
		local3.aByteArray53 = arg1;
		local3.aClass403_8 = arg2;
		local3.aBoolean515 = false;
		this.method26522(local3);
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "b", descriptor = "(I[BLclient!qa;)Lclient!aom;", line = 39)
	Class3_Sub1_Sub12_Sub2 method26531(@OriginalArg(0) int arg0, @OriginalArg(1) byte[] arg1, @OriginalArg(2) Class403 arg2) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = -1510182818;
		local3.aLong297 = (long) arg0 * -2199417693621122125L;
		local3.aByteArray53 = arg1;
		local3.aClass403_8 = arg2;
		local3.aBoolean515 = false;
		this.method26522(local3);
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "c", descriptor = "(ILclient!qa;)Lclient!aom;", line = 50)
	Class3_Sub1_Sub12_Sub2 method26519(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = 2029693069;
		local3.aLong297 = (long) arg0 * -2199417693621122125L;
		local3.aClass403_8 = arg1;
		local3.aBoolean515 = false;
		this.method26522(local3);
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "g", descriptor = "(ILclient!qa;B)Lclient!aom;", line = 50)
	Class3_Sub1_Sub12_Sub2 method26535(@OriginalArg(0) int arg0, @OriginalArg(1) Class403 arg1) {
		@Pc(3) Class3_Sub1_Sub12_Sub2 local3 = new Class3_Sub1_Sub12_Sub2();
		local3.anInt2864 = 2029693069;
		local3.aLong297 = (long) arg0 * -2199417693621122125L;
		local3.aClass403_8 = arg1;
		local3.aBoolean515 = false;
		this.method26522(local3);
		return local3;
	}

	@OriginalMember(owner = "client!nj", name = "l", descriptor = "(Lclient!aom;I)V", line = 60)
	void method26522(@OriginalArg(0) Class3_Sub1_Sub12_Sub2 arg0) {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			this.aClass546_16.method32621(arg0);
			this.anInt4622 += 1330200191;
			this.aClass546_16.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nj", name = "z", descriptor = "(Lclient!aom;)V", line = 60)
	void method26530(@OriginalArg(0) Class3_Sub1_Sub12_Sub2 arg0) {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			this.aClass546_16.method32621(arg0);
			this.anInt4622 += 1330200191;
			this.aClass546_16.notifyAll();
		}
	}

	@OriginalMember(owner = "client!nj", name = "run", descriptor = "()V", line = 68)
	@Override
	public void run() {
		while (!this.aBoolean720) {
			@Pc(6) Class546 local6 = this.aClass546_16;
			@Pc(13) Class3_Sub1_Sub12_Sub2 local13;
			synchronized (this.aClass546_16) {
				local13 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32622();
				if (local13 == null) {
					try {
						this.aClass546_16.wait();
					} catch (@Pc(28) InterruptedException local28) {
					}
					continue;
				}
				this.anInt4622 -= 1330200191;
			}
			try {
				if (local13.anInt2864 * -2097017137 == 2) {
					local13.aClass403_8.method27624((int) (local13.aLong297 * -2884094411549009029L), local13.aByteArray53, local13.aByteArray53.length);
				} else if (local13.anInt2864 * -2097017137 == 3) {
					local13.aByteArray53 = local13.aClass403_8.method27623((int) (local13.aLong297 * -2884094411549009029L));
				}
			} catch (@Pc(80) Exception local80) {
				Class27_Sub1.method7214(null, local80);
			}
			local13.aBoolean516 = false;
		}
	}

	@OriginalMember(owner = "client!nj", name = "j", descriptor = "()V", line = 68)
	public void method26525() {
		while (!this.aBoolean720) {
			@Pc(6) Class546 local6 = this.aClass546_16;
			@Pc(13) Class3_Sub1_Sub12_Sub2 local13;
			synchronized (this.aClass546_16) {
				local13 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32622();
				if (local13 == null) {
					try {
						this.aClass546_16.wait();
					} catch (@Pc(28) InterruptedException local28) {
					}
					continue;
				}
				this.anInt4622 -= 1330200191;
			}
			try {
				if (local13.anInt2864 * -2097017137 == 2) {
					local13.aClass403_8.method27624((int) (local13.aLong297 * -2884094411549009029L), local13.aByteArray53, local13.aByteArray53.length);
				} else if (local13.anInt2864 * -2097017137 == 3) {
					local13.aByteArray53 = local13.aClass403_8.method27623((int) (local13.aLong297 * -2884094411549009029L));
				}
			} catch (@Pc(80) Exception local80) {
				Class27_Sub1.method7214(null, local80);
			}
			local13.aBoolean516 = false;
		}
	}

	@OriginalMember(owner = "client!nj", name = "n", descriptor = "()V", line = 68)
	public void method26526() {
		while (!this.aBoolean720) {
			@Pc(6) Class546 local6 = this.aClass546_16;
			@Pc(13) Class3_Sub1_Sub12_Sub2 local13;
			synchronized (this.aClass546_16) {
				local13 = (Class3_Sub1_Sub12_Sub2) this.aClass546_16.method32622();
				if (local13 == null) {
					try {
						this.aClass546_16.wait();
					} catch (@Pc(28) InterruptedException local28) {
					}
					continue;
				}
				this.anInt4622 -= 1330200191;
			}
			try {
				if (local13.anInt2864 * -2097017137 == 2) {
					local13.aClass403_8.method27624((int) (local13.aLong297 * -2884094411549009029L), local13.aByteArray53, local13.aByteArray53.length);
				} else if (local13.anInt2864 * -2097017137 == 3) {
					local13.aByteArray53 = local13.aClass403_8.method27623((int) (local13.aLong297 * -2884094411549009029L));
				}
			} catch (@Pc(80) Exception local80) {
				Class27_Sub1.method7214(null, local80);
			}
			local13.aBoolean516 = false;
		}
	}

	@OriginalMember(owner = "client!nj", name = "h", descriptor = "(S)I", line = 97)
	public int method26523() {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			return this.anInt4622 * 2144633215;
		}
	}

	@OriginalMember(owner = "client!nj", name = "q", descriptor = "()I", line = 97)
	public int method26529() {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			return this.anInt4622 * 2144633215;
		}
	}

	@OriginalMember(owner = "client!nj", name = "e", descriptor = "()I", line = 97)
	public int method26532() {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			return this.anInt4622 * 2144633215;
		}
	}

	@OriginalMember(owner = "client!nj", name = "r", descriptor = "()I", line = 97)
	public int method26533() {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			return this.anInt4622 * 2144633215;
		}
	}

	@OriginalMember(owner = "client!nj", name = "d", descriptor = "()I", line = 97)
	public int method26534() {
		@Pc(3) Class546 local3 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			return this.anInt4622 * 2144633215;
		}
	}

	@OriginalMember(owner = "client!nj", name = "x", descriptor = "(I)V", line = 103)
	public void method26518() {
		this.aBoolean720 = true;
		@Pc(6) Class546 local6 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			this.aClass546_16.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!nj", name = "v", descriptor = "()V", line = 103)
	public void method26524() {
		this.aBoolean720 = true;
		@Pc(6) Class546 local6 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			this.aClass546_16.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!nj", name = "m", descriptor = "()V", line = 103)
	public void method26536() {
		this.aBoolean720 = true;
		@Pc(6) Class546 local6 = this.aClass546_16;
		synchronized (this.aClass546_16) {
			this.aClass546_16.notifyAll();
		}
		try {
			this.aThread7.join();
		} catch (@Pc(23) InterruptedException local23) {
		}
		this.aThread7 = null;
	}

	@OriginalMember(owner = "client!nj", name = "abf", descriptor = "(Lclient!vs;S)V", line = 8985)
	static final void method26538(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5315 -= 1580027550;
		@Pc(14) String local14 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575];
		@Pc(25) String local25 = (String) arg0.anObjectArray42[arg0.anInt5315 * 996806575 + 1];
		if (arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381] == 1) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local14;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local25;
		}
	}

	@OriginalMember(owner = "client!nj", name = "aeu", descriptor = "(Lclient!vs;I)V", line = 9747)
	static final void method26539(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local23 == -1) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub23.aClass343_1.method26476(local13).method19322((char) local23);
		}
	}

	@OriginalMember(owner = "client!nj", name = "apq", descriptor = "(Lclient!vs;I)V", line = 11723)
	static final void method26541(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aShort149;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.aShort151;
	}

	@OriginalMember(owner = "client!nj", name = "auu", descriptor = "(Lclient!vs;I)V", line = 12581)
	static final void method26540(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class26_Sub1_Sub1_Sub1_Sub1 local16 = (Class26_Sub1_Sub1_Sub1_Sub1) arg0.aClass26_Sub1_Sub1_Sub1_4;
		@Pc(21) int local21 = local16.method15503(local12);
		@Pc(26) int local26 = local16.method15504(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local21;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local26;
	}
}
