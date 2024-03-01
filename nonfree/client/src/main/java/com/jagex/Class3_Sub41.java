package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ahb")
public class Class3_Sub41 extends Class3 {

	@OriginalMember(owner = "client!ahb", name = "h", descriptor = "I")
	public static final int anInt2801 = 5000;

	@OriginalMember(owner = "client!ahb", name = "l", descriptor = "I")
	public static final int anInt2802 = 100;

	@OriginalMember(owner = "client!ahb", name = "y", descriptor = "I")
	static final int anInt2804 = -306674912;

	@OriginalMember(owner = "client!ahb", name = "c", descriptor = "J")
	static final long aLong196 = -3932672073523589310L;

	@OriginalMember(owner = "client!ahb", name = "u", descriptor = "[I")
	static int[] anIntArray270 = new int[256];

	@OriginalMember(owner = "client!ahb", name = "b", descriptor = "[J")
	public static long[] aLongArray8;

	@OriginalMember(owner = "client!ahb", name = "s", descriptor = "I")
	public int anInt2803;

	@OriginalMember(owner = "client!ahb", name = "x", descriptor = "[B")
	public byte[] aByteArray51;

	static {
		@Pc(11) int local11;
		for (@Pc(4) int local4 = 0; local4 < 256; local4++) {
			@Pc(9) int local9 = local4;
			for (local11 = 0; local11 < 8; local11++) {
				if ((local9 & 0x1) == 1) {
					local9 = local9 >>> 1 ^ 0xEDB88320;
				} else {
					local9 >>>= 0x1;
				}
			}
			anIntArray270[local4] = local9;
		}
		aLongArray8 = new long[256];
		for (local11 = 0; local11 < 256; local11++) {
			@Pc(49) long local49 = (long) local11;
			for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
				if ((local49 & 0x1L) == 1L) {
					local49 = local49 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local49 >>>= 0x1;
				}
			}
			aLongArray8[local11] = local49;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "cb", descriptor = "([BI)I", line = 54)
	public static int method20328(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class30_Sub2.method16472(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ahb", name = "cz", descriptor = "([BI)I", line = 54)
	public static int method20329(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class30_Sub2.method16472(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!ahb", name = "<init>", descriptor = "(I)V", line = 57)
	public Class3_Sub41(@OriginalArg(0) int arg0) {
		this.aByteArray51 = Class548.method32656(arg0);
		this.anInt2803 = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "<init>", descriptor = "(IZ)V", line = 62)
	public Class3_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aByteArray51 = Class548.method32658(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahb", name = "<init>", descriptor = "([B)V", line = 66)
	public Class3_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray51 = arg0;
		this.anInt2803 = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "g", descriptor = "(I)V", line = 72)
	public void method20249() {
		if (this.aByteArray51 != null) {
			Class548.method32655(this.aByteArray51);
		}
		this.aByteArray51 = null;
	}

	@OriginalMember(owner = "client!ahb", name = "cn", descriptor = "()V", line = 72)
	public void method20330() {
		if (this.aByteArray51 != null) {
			Class548.method32655(this.aByteArray51);
		}
		this.aByteArray51 = null;
	}

	@OriginalMember(owner = "client!ahb", name = "co", descriptor = "()V", line = 72)
	public void method20331() {
		if (this.aByteArray51 != null) {
			Class548.method32655(this.aByteArray51);
		}
		this.aByteArray51 = null;
	}

	@OriginalMember(owner = "client!ahb", name = "l", descriptor = "(IB)V", line = 77)
	public void method20250(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "h", descriptor = "(II)V", line = 81)
	public void method20251(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "cd", descriptor = "(I)V", line = 81)
	public void method20332(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "ch", descriptor = "(I)V", line = 86)
	public void method20333(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "ci", descriptor = "(I)V", line = 86)
	public void method20364(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "x", descriptor = "(IB)V", line = 86)
	public void method20442(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "s", descriptor = "(II)V", line = 91)
	public void method20253(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "ca", descriptor = "(I)V", line = 91)
	public void method20335(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "u", descriptor = "(II)V", line = 97)
	public void method20254(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "y", descriptor = "(IB)V", line = 104)
	public void method20255(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "ce", descriptor = "(I)V", line = 104)
	public void method20338(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "cr", descriptor = "(I)V", line = 104)
	public void method20404(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "cw", descriptor = "(I)V", line = 104)
	public void method20452(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "b", descriptor = "(J)V", line = 111)
	public void method20256(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "cf", descriptor = "(J)V", line = 111)
	public void method20339(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "dv", descriptor = "(J)V", line = 111)
	public void method20340(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "df", descriptor = "(J)V", line = 111)
	public void method20341(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "dh", descriptor = "(J)V", line = 111)
	public void method20342(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "db", descriptor = "(J)V", line = 119)
	public void method20343(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 40);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "c", descriptor = "(J)V", line = 119)
	public void method20381(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 40);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "dp", descriptor = "(J)V", line = 128)
	public void method20401(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 56);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 48);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 40);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "z", descriptor = "(J)V", line = 128)
	public void method20409(@OriginalArg(0) long arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 56);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 48);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 40);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 32);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "j", descriptor = "(JII)V", line = 139)
	public void method20278(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "dk", descriptor = "(JI)V", line = 139)
	public void method20345(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "dy", descriptor = "(JI)V", line = 139)
	public void method20346(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "ds", descriptor = "(Ljava/lang/String;)I", line = 151)
	public static int method20349(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ahb", name = "dg", descriptor = "(Ljava/lang/String;)I", line = 151)
	public static int method20351(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ahb", name = "dq", descriptor = "(Ljava/lang/String;)I", line = 151)
	public static int method20369(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!ahb", name = "i", descriptor = "(Ljava/lang/String;B)V", line = 155)
	public void method20260(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt2803 += Class23.method5944(arg0, 0, arg0.length(), this.aByteArray51, this.anInt2803 * 62066237) * -918980331;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "dr", descriptor = "(Ljava/lang/String;)V", line = 155)
	public void method20350(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt2803 += Class23.method5944(arg0, 0, arg0.length(), this.aByteArray51, this.anInt2803 * 62066237) * -918980331;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "dc", descriptor = "(Ljava/lang/String;)I", line = 162)
	public static int method20457(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!ahb", name = "k", descriptor = "(Ljava/lang/String;B)V", line = 166)
	public void method20261(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
		this.anInt2803 += Class23.method5944(arg0, 0, arg0.length(), this.aByteArray51, this.anInt2803 * 62066237) * -918980331;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "dd", descriptor = "(Ljava/lang/String;)V", line = 166)
	public void method20263(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
		this.anInt2803 += Class23.method5944(arg0, 0, arg0.length(), this.aByteArray51, this.anInt2803 * 62066237) * -918980331;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "dt", descriptor = "(Ljava/lang/String;)V", line = 166)
	public void method20352(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
		this.anInt2803 += Class23.method5944(arg0, 0, arg0.length(), this.aByteArray51, this.anInt2803 * 62066237) * -918980331;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
	}

	@OriginalMember(owner = "client!ahb", name = "at", descriptor = "(Ljava/lang/CharSequence;I)V", line = 174)
	public void method20281(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class546.method32649(arg0);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = 0;
		this.method20268(local3);
		this.anInt2803 += Class330.method26175(this.aByteArray51, this.anInt2803 * 62066237, arg0) * -918980331;
	}

	@OriginalMember(owner = "client!ahb", name = "af", descriptor = "([BIII)V", line = 181)
	public void method20248(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!ahb", name = "da", descriptor = "(Lclient!ahb;)V", line = 185)
	public void method20354(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method20248(arg0.aByteArray51, 0, arg0.anInt2803 * 62066237);
	}

	@OriginalMember(owner = "client!ahb", name = "ak", descriptor = "(Lclient!ahb;B)V", line = 185)
	public void method20471(@OriginalArg(0) Class3_Sub41 arg0) {
		this.method20248(arg0.aByteArray51, 0, arg0.anInt2803 * 62066237);
	}

	@OriginalMember(owner = "client!ahb", name = "aa", descriptor = "(II)V", line = 189)
	public void method20265(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "dz", descriptor = "(I)V", line = 189)
	public void method20355(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "de", descriptor = "(I)V", line = 189)
	public void method20356(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "dl", descriptor = "(I)V", line = 189)
	public void method20357(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "ah", descriptor = "(II)V", line = 194)
	public void method20266(@OriginalArg(0) int arg0) {
		this.aByteArray51[this.anInt2803 * 62066237 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "dx", descriptor = "(I)V", line = 198)
	public void method20257(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method20250(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method20251(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "an", descriptor = "(IB)V", line = 198)
	public void method20267(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method20250(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method20251(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "dj", descriptor = "(I)V", line = 198)
	public void method20276(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method20250(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method20251(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "dm", descriptor = "(I)V", line = 198)
	public void method20372(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method20250(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method20251(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "aj", descriptor = "(II)V", line = 210)
	void method20268(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method20250(arg0 >>> 28 | 0x80);
					}
					this.method20250(arg0 >>> 21 | 0x80);
				}
				this.method20250(arg0 >>> 14 | 0x80);
			}
			this.method20250(arg0 >>> 7 | 0x80);
		}
		this.method20250(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ahb", name = "dw", descriptor = "(I)V", line = 210)
	void method20361(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method20250(arg0 >>> 28 | 0x80);
					}
					this.method20250(arg0 >>> 21 | 0x80);
				}
				this.method20250(arg0 >>> 14 | 0x80);
			}
			this.method20250(arg0 >>> 7 | 0x80);
		}
		this.method20250(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ahb", name = "du", descriptor = "(I)V", line = 210)
	void method20398(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method20250(arg0 >>> 28 | 0x80);
					}
					this.method20250(arg0 >>> 21 | 0x80);
				}
				this.method20250(arg0 >>> 14 | 0x80);
			}
			this.method20250(arg0 >>> 7 | 0x80);
		}
		this.method20250(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!ahb", name = "di", descriptor = "()I", line = 224)
	public int method20258() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "as", descriptor = "(I)I", line = 224)
	public int method20269() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "do", descriptor = "()I", line = 224)
	public int method20363() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "dn", descriptor = "()I", line = 224)
	public int method20365() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "ee", descriptor = "()B", line = 228)
	public byte method20366() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "eb", descriptor = "()B", line = 228)
	public byte method20368() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "ai", descriptor = "(I)B", line = 228)
	public byte method20390() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "ex", descriptor = "()B", line = 228)
	public byte method20391() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "aq", descriptor = "(I)I", line = 232)
	public int method20271() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "av", descriptor = "(I)I", line = 237)
	public int method20272() {
		this.anInt2803 += -1837960662;
		@Pc(31) int local31 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ahb", name = "ef", descriptor = "()I", line = 237)
	public int method20306() {
		this.anInt2803 += -1837960662;
		@Pc(31) int local31 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ahb", name = "er", descriptor = "()I", line = 237)
	public int method20348() {
		this.anInt2803 += -1837960662;
		@Pc(31) int local31 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ahb", name = "ej", descriptor = "()I", line = 237)
	public int method20360() {
		this.anInt2803 += -1837960662;
		@Pc(31) int local31 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ahb", name = "ey", descriptor = "()I", line = 237)
	public int method20370() {
		this.anInt2803 += -1837960662;
		@Pc(31) int local31 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!ahb", name = "ax", descriptor = "(B)I", line = 244)
	public int method20273() {
		this.anInt2803 += 1538026303;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "en", descriptor = "()I", line = 244)
	public int method20459() {
		this.anInt2803 += 1538026303;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "az", descriptor = "(I)I", line = 249)
	public int method20274() {
		this.anInt2803 += 1538026303;
		@Pc(45) int local45 = (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ahb", name = "em", descriptor = "()I", line = 249)
	public int method20305() {
		this.anInt2803 += 1538026303;
		@Pc(45) int local45 = (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ahb", name = "ew", descriptor = "()I", line = 249)
	public int method20374() {
		this.anInt2803 += 1538026303;
		@Pc(45) int local45 = (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ahb", name = "ec", descriptor = "()I", line = 249)
	public int method20376() {
		this.anInt2803 += 1538026303;
		@Pc(45) int local45 = (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ahb", name = "ea", descriptor = "()I", line = 249)
	public int method20377() {
		this.anInt2803 += 1538026303;
		@Pc(45) int local45 = (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!ahb", name = "al", descriptor = "(B)I", line = 256)
	public int method20275() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "ez", descriptor = "()I", line = 256)
	public int method20378() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "ep", descriptor = "()I", line = 256)
	public int method20379() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "ao", descriptor = "(I)I", line = 261)
	public int method20412() {
		this.anInt2803 += 619045972;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "ed", descriptor = "()J", line = 266)
	public long method20270() {
		@Pc(6) long local6 = (long) this.method20269() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20275() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ahb", name = "eq", descriptor = "()J", line = 266)
	public long method20406() {
		@Pc(6) long local6 = (long) this.method20269() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20275() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ahb", name = "ap", descriptor = "(I)J", line = 266)
	public long method20411() {
		@Pc(6) long local6 = (long) this.method20269() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20275() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!ahb", name = "ab", descriptor = "(I)J", line = 272)
	public long method20371() {
		@Pc(6) long local6 = (long) this.method20275() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20275() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!ahb", name = "et", descriptor = "()J", line = 272)
	public long method20380() {
		@Pc(6) long local6 = (long) this.method20275() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20275() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!ahb", name = "ev", descriptor = "()J", line = 272)
	public long method20449() {
		@Pc(6) long local6 = (long) this.method20275() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20275() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!ahb", name = "au", descriptor = "(I)J", line = 278)
	public long method20279() {
		@Pc(6) long local6 = (long) this.method20412() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20412() & 0xFFFFFFFFL;
		return (local13 << 32) + local6;
	}

	@OriginalMember(owner = "client!ahb", name = "ek", descriptor = "()J", line = 278)
	public long method20280() {
		@Pc(6) long local6 = (long) this.method20412() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20412() & 0xFFFFFFFFL;
		return (local13 << 32) + local6;
	}

	@OriginalMember(owner = "client!ahb", name = "eo", descriptor = "()J", line = 278)
	public long method20383() {
		@Pc(6) long local6 = (long) this.method20412() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method20412() & 0xFFFFFFFFL;
		return (local13 << 32) + local6;
	}

	@OriginalMember(owner = "client!ahb", name = "ay", descriptor = "(II)J", line = 284)
	public long method20388(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!ahb", name = "ei", descriptor = "()F", line = 298)
	public float method20385() {
		return Float.intBitsToFloat(this.method20275());
	}

	@OriginalMember(owner = "client!ahb", name = "ag", descriptor = "(I)F", line = 298)
	public float method20448() {
		return Float.intBitsToFloat(this.method20275());
	}

	@OriginalMember(owner = "client!ahb", name = "am", descriptor = "(I)Ljava/lang/String;", line = 302)
	public String method20282() {
		if (this.aByteArray51[this.anInt2803 * 62066237] == 0) {
			this.anInt2803 += -918980331;
			return null;
		} else {
			return this.method20283();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "eg", descriptor = "()Ljava/lang/String;", line = 302)
	public String method20293() {
		if (this.aByteArray51[this.anInt2803 * 62066237] == 0) {
			this.anInt2803 += -918980331;
			return null;
		} else {
			return this.method20283();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "el", descriptor = "()Ljava/lang/String;", line = 302)
	public String method20386() {
		if (this.aByteArray51[this.anInt2803 * 62066237] == 0) {
			this.anInt2803 += -918980331;
			return null;
		} else {
			return this.method20283();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "eu", descriptor = "()Ljava/lang/String;", line = 302)
	public String method20387() {
		if (this.aByteArray51[this.anInt2803 * 62066237] == 0) {
			this.anInt2803 += -918980331;
			return null;
		} else {
			return this.method20283();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "es", descriptor = "()Ljava/lang/String;", line = 302)
	public String method20389() {
		if (this.aByteArray51[this.anInt2803 * 62066237] == 0) {
			this.anInt2803 += -918980331;
			return null;
		} else {
			return this.method20283();
		}
	}

	@OriginalMember(owner = "client!ahb", name = "ar", descriptor = "(B)Ljava/lang/String;", line = 310)
	public String method20283() {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt2803 * 62066237 - local4 - 1;
		return local29 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local4, local29);
	}

	@OriginalMember(owner = "client!ahb", name = "fp", descriptor = "()Ljava/lang/String;", line = 310)
	public String method20367() {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt2803 * 62066237 - local4 - 1;
		return local29 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local4, local29);
	}

	@OriginalMember(owner = "client!ahb", name = "ft", descriptor = "()Ljava/lang/String;", line = 310)
	public String method20440() {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt2803 * 62066237 - local4 - 1;
		return local29 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local4, local29);
	}

	@OriginalMember(owner = "client!ahb", name = "eh", descriptor = "()Ljava/lang/String;", line = 310)
	public String method20458() {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt2803 * 62066237 - local4 - 1;
		return local29 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local4, local29);
	}

	@OriginalMember(owner = "client!ahb", name = "ae", descriptor = "(I)Ljava/lang/String;", line = 318)
	public String method20284() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt2803 * 62066237 - local26 - 1;
		return local51 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local26, local51);
	}

	@OriginalMember(owner = "client!ahb", name = "fm", descriptor = "()Ljava/lang/String;", line = 318)
	public String method20393() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt2803 * 62066237 - local26 - 1;
		return local51 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local26, local51);
	}

	@OriginalMember(owner = "client!ahb", name = "fn", descriptor = "()Ljava/lang/String;", line = 318)
	public String method20394() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt2803 * 62066237;
		while (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt2803 * 62066237 - local26 - 1;
		return local51 == 0 ? "" : Class60_Sub7.method13289(this.aByteArray51, local26, local51);
	}

	@OriginalMember(owner = "client!ahb", name = "fx", descriptor = "()Ljava/lang/String;", line = 328)
	public String method20264() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(25) int local25 = this.method20463();
		if (local25 + this.anInt2803 * 62066237 > this.aByteArray51.length) {
			throw new IllegalStateException("");
		}
		@Pc(50) String local50 = Class122.method22834(this.aByteArray51, this.anInt2803 * 62066237, local25);
		this.anInt2803 += local25 * -918980331;
		return local50;
	}

	@OriginalMember(owner = "client!ahb", name = "ad", descriptor = "(I)Ljava/lang/String;", line = 328)
	public String method20285() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(25) int local25 = this.method20463();
		if (local25 + this.anInt2803 * 62066237 > this.aByteArray51.length) {
			throw new IllegalStateException("");
		}
		@Pc(50) String local50 = Class122.method22834(this.aByteArray51, this.anInt2803 * 62066237, local25);
		this.anInt2803 += local25 * -918980331;
		return local50;
	}

	@OriginalMember(owner = "client!ahb", name = "fs", descriptor = "()Ljava/lang/String;", line = 328)
	public String method20395() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(25) int local25 = this.method20463();
		if (local25 + this.anInt2803 * 62066237 > this.aByteArray51.length) {
			throw new IllegalStateException("");
		}
		@Pc(50) String local50 = Class122.method22834(this.aByteArray51, this.anInt2803 * 62066237, local25);
		this.anInt2803 += local25 * -918980331;
		return local50;
	}

	@OriginalMember(owner = "client!ahb", name = "aw", descriptor = "([BIIB)V", line = 338)
	public void method20286(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		}
	}

	@OriginalMember(owner = "client!ahb", name = "fh", descriptor = "([BII)V", line = 338)
	public void method20397(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		}
	}

	@OriginalMember(owner = "client!ahb", name = "ac", descriptor = "(B)I", line = 342)
	public int method20262() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() - 64 : this.method20271() - 49152;
	}

	@OriginalMember(owner = "client!ahb", name = "fu", descriptor = "()I", line = 342)
	public int method20469() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() - 64 : this.method20271() - 49152;
	}

	@OriginalMember(owner = "client!ahb", name = "bw", descriptor = "(I)I", line = 348)
	public int method20334() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() : this.method20271() - 32768;
	}

	@OriginalMember(owner = "client!ahb", name = "fg", descriptor = "()I", line = 348)
	public int method20399() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() : this.method20271() - 32768;
	}

	@OriginalMember(owner = "client!ahb", name = "fb", descriptor = "()I", line = 348)
	public int method20400() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() : this.method20271() - 32768;
	}

	@OriginalMember(owner = "client!ahb", name = "bp", descriptor = "(B)I", line = 354)
	public int method20289() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() - 1 : this.method20271() - 32769;
	}

	@OriginalMember(owner = "client!ahb", name = "fd", descriptor = "()I", line = 354)
	public int method20337() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() - 1 : this.method20271() - 32769;
	}

	@OriginalMember(owner = "client!ahb", name = "fz", descriptor = "()I", line = 354)
	public int method20402() {
		@Pc(9) int local9 = this.aByteArray51[this.anInt2803 * 62066237] & 0xFF;
		return local9 < 128 ? this.method20269() - 1 : this.method20271() - 32769;
	}

	@OriginalMember(owner = "client!ahb", name = "bd", descriptor = "(I)I", line = 360)
	public int method20290() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method20334(); local5 == 32767; local5 = this.method20334()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!ahb", name = "bs", descriptor = "(I)I", line = 371)
	public int method20291() {
		return this.aByteArray51[this.anInt2803 * 62066237] < 0 ? this.method20275() & Integer.MAX_VALUE : this.method20271();
	}

	@OriginalMember(owner = "client!ahb", name = "bm", descriptor = "(I)I", line = 376)
	public int method20375() {
		if (this.aByteArray51[this.anInt2803 * 62066237] < 0) {
			return this.method20275() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method20271();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "fv", descriptor = "()I", line = 376)
	public int method20403() {
		if (this.aByteArray51[this.anInt2803 * 62066237] < 0) {
			return this.method20275() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method20271();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "fe", descriptor = "()I", line = 376)
	public int method20405() {
		if (this.aByteArray51[this.anInt2803 * 62066237] < 0) {
			return this.method20275() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method20271();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "fy", descriptor = "()I", line = 376)
	public int method20466() {
		if (this.aByteArray51[this.anInt2803 * 62066237] < 0) {
			return this.method20275() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method20271();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!ahb", name = "fw", descriptor = "()I", line = 383)
	int method20311() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!ahb", name = "fo", descriptor = "()I", line = 383)
	int method20407() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!ahb", name = "fl", descriptor = "()I", line = 383)
	int method20408() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!ahb", name = "bf", descriptor = "(I)I", line = 383)
	int method20463() {
		@Pc(14) byte local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!ahb", name = "fj", descriptor = "([I)V", line = 393)
	public void method20292(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt2803 * 62066237 / 8;
		this.anInt2803 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method20275();
			@Pc(22) int local22 = this.method20275();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += local18 + (local18 << 4 ^ local18 >>> 5) ^ local24 + arg0[local24 >>> 11 & 0x3];
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local18);
			this.method20254(local22);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "ff", descriptor = "([I)V", line = 393)
	public void method20320(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt2803 * 62066237 / 8;
		this.anInt2803 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method20275();
			@Pc(22) int local22 = this.method20275();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += local18 + (local18 << 4 ^ local18 >>> 5) ^ local24 + arg0[local24 >>> 11 & 0x3];
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local18);
			this.method20254(local22);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "bt", descriptor = "([II)V", line = 393)
	public void method20359(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt2803 * 62066237 / 8;
		this.anInt2803 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method20275();
			@Pc(22) int local22 = this.method20275();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += local18 + (local18 << 4 ^ local18 >>> 5) ^ local24 + arg0[local24 >>> 11 & 0x3];
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local18);
			this.method20254(local22);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "fk", descriptor = "([I)V", line = 393)
	public void method20410(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt2803 * 62066237 / 8;
		this.anInt2803 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method20275();
			@Pc(22) int local22 = this.method20275();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += local18 + (local18 << 4 ^ local18 >>> 5) ^ local24 + arg0[local24 >>> 11 & 0x3];
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local18);
			this.method20254(local22);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "bk", descriptor = "([II)V", line = 413)
	public void method20295(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt2803 * 62066237 / 8;
		this.anInt2803 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method20275();
			@Pc(22) int local22 = this.method20275();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ local24 + arg0[local24 >>> 11 & 0x3];
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local18);
			this.method20254(local22);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "bg", descriptor = "([IIII)V", line = 433)
	public void method20296(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		this.anInt2803 = arg1 * -918980331;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method20275();
			@Pc(28) int local28 = this.method20275();
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += local24 + (local24 << 4 ^ local24 >>> 5) ^ arg0[local30 >>> 11 & 0x3] + local30;
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local24);
			this.method20254(local28);
		}
		this.anInt2803 = local4 * -918980331;
	}

	@OriginalMember(owner = "client!ahb", name = "fa", descriptor = "([III)V", line = 433)
	public void method20392(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		this.anInt2803 = arg1 * -918980331;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method20275();
			@Pc(28) int local28 = this.method20275();
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += local24 + (local24 << 4 ^ local24 >>> 5) ^ arg0[local30 >>> 11 & 0x3] + local30;
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local24);
			this.method20254(local28);
		}
		this.anInt2803 = local4 * -918980331;
	}

	@OriginalMember(owner = "client!ahb", name = "br", descriptor = "([IIIB)V", line = 455)
	public void method20297(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		this.anInt2803 = arg1 * -918980331;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method20275();
			@Pc(28) int local28 = this.method20275();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= local24 + (local24 << 4 ^ local24 >>> 5) ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt2803 -= 1238091944;
			this.method20254(local24);
			this.method20254(local28);
		}
		this.anInt2803 = local4 * -918980331;
	}

	@OriginalMember(owner = "client!ahb", name = "bb", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V", line = 477)
	public void method20298(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt2803 * 62066237;
		this.anInt2803 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method20286(local10, 0, local4);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt2803 = 0;
		this.method20251(local29.length);
		this.method20248(local29, 0, local29.length);
	}

	@OriginalMember(owner = "client!ahb", name = "by", descriptor = "(II)I", line = 490)
	public int method20299(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30_Sub2.method16472(this.aByteArray51, arg0, this.anInt2803 * 62066237);
		this.method20254(local9);
		return local9;
	}

	@OriginalMember(owner = "client!ahb", name = "fq", descriptor = "(I)I", line = 490)
	public int method20413(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30_Sub2.method16472(this.aByteArray51, arg0, this.anInt2803 * 62066237);
		this.method20254(local9);
		return local9;
	}

	@OriginalMember(owner = "client!ahb", name = "fc", descriptor = "(I)I", line = 490)
	public int method20414(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class30_Sub2.method16472(this.aByteArray51, arg0, this.anInt2803 * 62066237);
		this.method20254(local9);
		return local9;
	}

	@OriginalMember(owner = "client!ahb", name = "bl", descriptor = "(B)Z", line = 496)
	public boolean method20300() {
		this.anInt2803 -= 619045972;
		@Pc(15) int local15 = Class30_Sub2.method16472(this.aByteArray51, 0, this.anInt2803 * 62066237);
		@Pc(19) int local19 = this.method20275();
		return local15 == local19;
	}

	@OriginalMember(owner = "client!ahb", name = "fi", descriptor = "()Z", line = 496)
	public boolean method20415() {
		this.anInt2803 -= 619045972;
		@Pc(15) int local15 = Class30_Sub2.method16472(this.aByteArray51, 0, this.anInt2803 * 62066237);
		@Pc(19) int local19 = this.method20275();
		return local15 == local19;
	}

	@OriginalMember(owner = "client!ahb", name = "fr", descriptor = "()Z", line = 496)
	public boolean method20416() {
		this.anInt2803 -= 619045972;
		@Pc(15) int local15 = Class30_Sub2.method16472(this.aByteArray51, 0, this.anInt2803 * 62066237);
		@Pc(19) int local19 = this.method20275();
		return local15 == local19;
	}

	@OriginalMember(owner = "client!ahb", name = "bi", descriptor = "(II)V", line = 504)
	public void method20301(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ahb", name = "gf", descriptor = "(I)V", line = 504)
	public void method20417(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ahb", name = "gy", descriptor = "(I)V", line = 504)
	public void method20432(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ahb", name = "bu", descriptor = "(II)V", line = 508)
	public void method20302(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "gp", descriptor = "(I)V", line = 508)
	public void method20419(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "ge", descriptor = "(I)V", line = 508)
	public void method20420(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "gj", descriptor = "(I)V", line = 508)
	public void method20421(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!ahb", name = "ba", descriptor = "(II)V", line = 512)
	public void method20303(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ahb", name = "gd", descriptor = "(I)V", line = 512)
	public void method20344(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ahb", name = "gm", descriptor = "(I)V", line = 512)
	public void method20423(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!ahb", name = "bo", descriptor = "(I)I", line = 516)
	public int method20304() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gn", descriptor = "()I", line = 516)
	public int method20424() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gv", descriptor = "()I", line = 516)
	public int method20425() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gz", descriptor = "()I", line = 516)
	public int method20427() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gq", descriptor = "()I", line = 516)
	public int method20428() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gh", descriptor = "()I", line = 516)
	public int method20468() {
		return this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "bc", descriptor = "(B)I", line = 520)
	public int method20317() {
		return -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gt", descriptor = "()I", line = 520)
	public int method20429() {
		return -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "ga", descriptor = "()I", line = 520)
	public int method20430() {
		return -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "bn", descriptor = "(I)I", line = 524)
	public int method20310() {
		return 128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!ahb", name = "gr", descriptor = "()B", line = 528)
	public byte method20288() {
		return (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
	}

	@OriginalMember(owner = "client!ahb", name = "be", descriptor = "(S)B", line = 528)
	public byte method20307() {
		return (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
	}

	@OriginalMember(owner = "client!ahb", name = "gx", descriptor = "()B", line = 532)
	public byte method20252() {
		return (byte) -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "bx", descriptor = "(I)B", line = 532)
	public byte method20308() {
		return (byte) -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "gk", descriptor = "()B", line = 532)
	public byte method20433() {
		return (byte) -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "gs", descriptor = "()B", line = 532)
	public byte method20434() {
		return (byte) -this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1];
	}

	@OriginalMember(owner = "client!ahb", name = "bh", descriptor = "(I)B", line = 536)
	public byte method20309() {
		return (byte) (128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "gc", descriptor = "()B", line = 536)
	public byte method20435() {
		return (byte) (128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "gw", descriptor = "()B", line = 536)
	public byte method20436() {
		return (byte) (128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "go", descriptor = "()B", line = 536)
	public byte method20437() {
		return (byte) (128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "gi", descriptor = "()B", line = 536)
	public byte method20438() {
		return (byte) (128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "gb", descriptor = "()B", line = 536)
	public byte method20439() {
		return (byte) (128 - this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1]);
	}

	@OriginalMember(owner = "client!ahb", name = "bj", descriptor = "(IB)V", line = 540)
	public void method20287(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "gl", descriptor = "(I)V", line = 540)
	public void method20426(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "bq", descriptor = "(II)V", line = 545)
	public void method20318(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ahb", name = "gg", descriptor = "(I)V", line = 545)
	public void method20347(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ahb", name = "gu", descriptor = "(I)V", line = 545)
	public void method20441(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!ahb", name = "hc", descriptor = "(I)V", line = 550)
	public void method20259(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "bv", descriptor = "(IS)V", line = 550)
	public void method20312(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hi", descriptor = "(I)V", line = 550)
	public void method20443(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hk", descriptor = "(I)V", line = 550)
	public void method20444(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "ha", descriptor = "(I)V", line = 550)
	public void method20445(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hg", descriptor = "(I)V", line = 550)
	public void method20465(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 + 128);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "bz", descriptor = "(I)I", line = 555)
	public int method20313() {
		this.anInt2803 += -1837960662;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "ho", descriptor = "()I", line = 555)
	public int method20358() {
		this.anInt2803 += -1837960662;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "hd", descriptor = "()I", line = 555)
	public int method20382() {
		this.anInt2803 += -1837960662;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "ck", descriptor = "(I)I", line = 560)
	public int method20314() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hx", descriptor = "()I", line = 560)
	public int method20327() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hb", descriptor = "()I", line = 560)
	public int method20450() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hz", descriptor = "()I", line = 560)
	public int method20451() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hs", descriptor = "()I", line = 560)
	public int method20453() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "cm", descriptor = "(I)I", line = 565)
	public int method20315() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 2] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hn", descriptor = "()I", line = 565)
	public int method20454() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 2] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hw", descriptor = "()I", line = 565)
	public int method20455() {
		this.anInt2803 += -1837960662;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 2] - 128 & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "cj", descriptor = "(I)I", line = 570)
	public int method20316() {
		this.anInt2803 += -1837960662;
		@Pc(33) int local33 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ahb", name = "hy", descriptor = "()I", line = 570)
	public int method20456() {
		this.anInt2803 += -1837960662;
		@Pc(33) int local33 = ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ahb", name = "cu", descriptor = "(I)I", line = 577)
	public int method20422() {
		this.anInt2803 += -1837960662;
		@Pc(33) int local33 = ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ahb", name = "hr", descriptor = "()I", line = 577)
	public int method20446() {
		this.anInt2803 += -1837960662;
		@Pc(33) int local33 = ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!ahb", name = "hf", descriptor = "(I)V", line = 584)
	public void method20321(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ahb", name = "cv", descriptor = "(II)V", line = 584)
	public void method20336(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ahb", name = "cl", descriptor = "(IS)V", line = 590)
	public void method20319(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hp", descriptor = "(I)V", line = 590)
	public void method20373(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hq", descriptor = "(I)V", line = 590)
	public void method20460(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "cq", descriptor = "(IB)V", line = 596)
	public void method20277(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "hv", descriptor = "(I)V", line = 596)
	public void method20461(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "ht", descriptor = "(I)V", line = 596)
	public void method20462(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!ahb", name = "cg", descriptor = "(IB)V", line = 603)
	public void method20353(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!ahb", name = "cp", descriptor = "(II)V", line = 610)
	public void method20322(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "he", descriptor = "(I)V", line = 610)
	public void method20362(@OriginalArg(0) int arg0) {
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 16);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 24);
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) arg0;
		this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!ahb", name = "cc", descriptor = "(I)I", line = 617)
	public int method20323() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "cs", descriptor = "(I)I", line = 622)
	public int method20324() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hl", descriptor = "()I", line = 622)
	public int method20396() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hu", descriptor = "()I", line = 622)
	public int method20431() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "hj", descriptor = "()I", line = 622)
	public int method20464() {
		this.anInt2803 += 619045972;
		return (this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!ahb", name = "id", descriptor = "()I", line = 627)
	public int method20294() {
		this.anInt2803 += 619045972;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "ct", descriptor = "(I)I", line = 627)
	public int method20325() {
		this.anInt2803 += 619045972;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "il", descriptor = "()I", line = 627)
	public int method20447() {
		this.anInt2803 += 619045972;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "ik", descriptor = "()I", line = 627)
	public int method20467() {
		this.anInt2803 += 619045972;
		return ((this.aByteArray51[this.anInt2803 * 62066237 - 3] & 0xFF) << 24) + ((this.aByteArray51[this.anInt2803 * 62066237 - 4] & 0xFF) << 16) + ((this.aByteArray51[this.anInt2803 * 62066237 - 1] & 0xFF) << 8) + (this.aByteArray51[this.anInt2803 * 62066237 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!ahb", name = "cx", descriptor = "([BIIB)V", line = 632)
	public void method20326(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "iu", descriptor = "([BII)V", line = 632)
	public void method20470(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "cy", descriptor = "([BIII)V", line = 636)
	public void method20384(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg2 + arg1 - 1; local5 >= arg1; local5--) {
			arg0[local5] = (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "iq", descriptor = "([BII)V", line = 636)
	public void method20418(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg2 + arg1 - 1; local5 >= arg1; local5--) {
			arg0[local5] = (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!ahb", name = "im", descriptor = "([BII)V", line = 636)
	public void method20472(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg2 + arg1 - 1; local5 >= arg1; local5--) {
			arg0[local5] = (byte) (this.aByteArray51[(this.anInt2803 += -918980331) * 62066237 - 1] - 128);
		}
	}
}
