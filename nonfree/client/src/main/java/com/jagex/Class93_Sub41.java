package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!alw")
public class Class93_Sub41 extends Class93 {

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "J")
	static final long aLong185 = -3932672073523589310L;

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "I")
	public static final int anInt3069 = 5000;

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "I")
	public static final int anInt3071 = 100;

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "I")
	static final int anInt3072 = -306674912;

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "[I")
	static int[] anIntArray262 = new int[256];

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "[J")
	public static long[] aLongArray18;

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "[B")
	public byte[] aByteArray58;

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "I")
	public int anInt3070;

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
			anIntArray262[local4] = local9;
		}
		aLongArray18 = new long[256];
		for (local11 = 0; local11 < 256; local11++) {
			@Pc(49) long local49 = (long) local11;
			for (@Pc(51) int local51 = 0; local51 < 8; local51++) {
				if ((local49 & 0x1L) == 1L) {
					local49 = local49 >>> 1 ^ 0xC96C5795D7870F42L;
				} else {
					local49 >>>= 0x1;
				}
			}
			aLongArray18[local11] = local49;
		}
	}

	@OriginalMember(owner = "client!alw", name = "cr", descriptor = "([BII)I", line = 45)
	static int method22473(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray262[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!alw", name = "cm", descriptor = "([BII)I", line = 45)
	static int method22611(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray262[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!alw", name = "cb", descriptor = "([BI)I", line = 54)
	public static int method22477(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class124_Sub1.method9189(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!alw", name = "cq", descriptor = "([BI)I", line = 54)
	public static int method22599(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class124_Sub1.method9189(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!alw", name = "ch", descriptor = "([BI)I", line = 54)
	public static int method22602(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class124_Sub1.method9189(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(I)V", line = 57)
	public Class93_Sub41(@OriginalArg(0) int arg0) {
		this.aByteArray58 = Class723.method36934(arg0);
		this.anInt3070 = 0;
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "(IZ)V", line = 62)
	public Class93_Sub41(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aByteArray58 = Class723.method36935(arg0, arg1);
	}

	@OriginalMember(owner = "client!alw", name = "<init>", descriptor = "([B)V", line = 66)
	public Class93_Sub41(@OriginalArg(0) byte[] arg0) {
		this.aByteArray58 = arg0;
		this.anInt3070 = 0;
	}

	@OriginalMember(owner = "client!alw", name = "m", descriptor = "(B)V", line = 72)
	public void method22651() {
		if (this.aByteArray58 != null) {
			Class723.method36938(this.aByteArray58);
		}
		this.aByteArray58 = null;
	}

	@OriginalMember(owner = "client!alw", name = "cs", descriptor = "(I)V", line = 77)
	public void method22452(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "k", descriptor = "(IB)V", line = 77)
	public void method22510(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "f", descriptor = "(II)V", line = 81)
	public void method22454(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "cy", descriptor = "(I)V", line = 81)
	public void method22479(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "cc", descriptor = "(I)V", line = 81)
	public void method22480(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "w", descriptor = "(II)V", line = 86)
	public void method22393(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "cd", descriptor = "(I)V", line = 86)
	public void method22409(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "cz", descriptor = "(I)V", line = 86)
	public void method22481(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "cj", descriptor = "(I)V", line = 86)
	public void method22483(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ck", descriptor = "(I)V", line = 86)
	public void method22496(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "l", descriptor = "(IB)V", line = 91)
	public void method22394(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dd", descriptor = "(I)V", line = 91)
	public void method22485(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dr", descriptor = "(I)V", line = 91)
	public void method22486(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "u", descriptor = "(IB)V", line = 97)
	public void method22395(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dt", descriptor = "(I)V", line = 97)
	public void method22488(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "da", descriptor = "(I)V", line = 97)
	public void method22603(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "z", descriptor = "(II)V", line = 104)
	public void method22396(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "do", descriptor = "(I)V", line = 104)
	public void method22489(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "dz", descriptor = "(I)V", line = 104)
	public void method22490(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "dv", descriptor = "(I)V", line = 104)
	public void method22491(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "p", descriptor = "(J)V", line = 111)
	public void method22397(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dc", descriptor = "(J)V", line = 111)
	public void method22494(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dq", descriptor = "(J)V", line = 111)
	public void method22581(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dm", descriptor = "(J)V", line = 111)
	public void method22619(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "d", descriptor = "(J)V", line = 119)
	public void method22398(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dk", descriptor = "(J)V", line = 119)
	public void method22410(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "di", descriptor = "(J)V", line = 119)
	public void method22495(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "c", descriptor = "(J)V", line = 128)
	public void method22399(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 56);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 48);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dn", descriptor = "(J)V", line = 128)
	public void method22591(@OriginalArg(0) long arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 56);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 48);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 40);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 32);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "dw", descriptor = "(JI)V", line = 139)
	public void method22421(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "df", descriptor = "(JI)V", line = 139)
	public void method22498(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ds", descriptor = "(JI)V", line = 139)
	public void method22500(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "r", descriptor = "(JII)V", line = 139)
	public void method22549(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!alw", name = "v", descriptor = "(ZI)V", line = 151)
	public void method22401(@OriginalArg(0) boolean arg0) {
		this.method22510(arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!alw", name = "dl", descriptor = "(Z)V", line = 151)
	public void method22501(@OriginalArg(0) boolean arg0) {
		this.method22510(arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!alw", name = "du", descriptor = "(Z)V", line = 151)
	public void method22574(@OriginalArg(0) boolean arg0) {
		this.method22510(arg0 ? 1 : 0);
	}

	@OriginalMember(owner = "client!alw", name = "dp", descriptor = "(Ljava/lang/String;)I", line = 155)
	public static int method22502(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!alw", name = "dy", descriptor = "(Ljava/lang/String;)I", line = 155)
	public static int method22583(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!alw", name = "x", descriptor = "(Ljava/lang/String;I)V", line = 159)
	public void method22402(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3070 += Class444.method28883(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "dh", descriptor = "(Ljava/lang/String;)V", line = 159)
	public void method22492(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3070 += Class444.method28883(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "db", descriptor = "(Ljava/lang/String;)V", line = 159)
	public void method22504(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3070 += Class444.method28883(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "a", descriptor = "(Ljava/lang/String;I)V", line = 170)
	public void method22403(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.anInt3070 += Class444.method28883(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "dg", descriptor = "(Ljava/lang/String;)V", line = 170)
	public void method22507(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.anInt3070 += Class444.method28883(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "dx", descriptor = "(Ljava/lang/String;)V", line = 170)
	public void method22592(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.anInt3070 += Class444.method28883(arg0, 0, arg0.length(), this.aByteArray58, this.anInt3070 * 212851357) * -1445626955;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
	}

	@OriginalMember(owner = "client!alw", name = "g", descriptor = "(Ljava/lang/CharSequence;I)V", line = 178)
	public void method22404(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class587.method31643(arg0);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.method22412(local3);
		this.anInt3070 += Class54_Sub1.method14885(this.aByteArray58, this.anInt3070 * 212851357, arg0) * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "de", descriptor = "(Ljava/lang/CharSequence;)V", line = 178)
	public void method22550(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class587.method31643(arg0);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = 0;
		this.method22412(local3);
		this.anInt3070 += Class54_Sub1.method14885(this.aByteArray58, this.anInt3070 * 212851357, arg0) * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "i", descriptor = "([BIII)V", line = 185)
	public void method22405(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "dj", descriptor = "([BII)V", line = 185)
	public void method22509(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "ey", descriptor = "([BII)V", line = 185)
	public void method22511(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "eo", descriptor = "([BII)V", line = 185)
	public void method22552(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "eu", descriptor = "(Lclient!alw;)V", line = 189)
	public void method22512(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method22405(arg0.aByteArray58, 0, arg0.anInt3070 * 212851357);
	}

	@OriginalMember(owner = "client!alw", name = "j", descriptor = "(Lclient!alw;B)V", line = 189)
	public void method22620(@OriginalArg(0) Class93_Sub41 arg0) {
		this.method22405(arg0.aByteArray58, 0, arg0.anInt3070 * 212851357);
	}

	@OriginalMember(owner = "client!alw", name = "t", descriptor = "(II)V", line = 193)
	public void method22407(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ee", descriptor = "(I)V", line = 193)
	public void method22472(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ed", descriptor = "(I)V", line = 193)
	public void method22513(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "es", descriptor = "(I)V", line = 193)
	public void method22515(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ei", descriptor = "(I)V", line = 201)
	public void method22516(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "el", descriptor = "(I)V", line = 201)
	public void method22517(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ae", descriptor = "(IB)V", line = 201)
	public void method22537(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray58[this.anInt3070 * 212851357 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "ej", descriptor = "(I)V", line = 208)
	public void method22518(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22510(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22454(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ag", descriptor = "(II)V", line = 208)
	public void method22652(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22510(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22454(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ep", descriptor = "(I)V", line = 220)
	public void method22519(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22510(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22454(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ev", descriptor = "(I)V", line = 220)
	public void method22520(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22510(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22454(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ah", descriptor = "(IB)V", line = 220)
	public void method22639(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22510(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22454(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!alw", name = "al", descriptor = "(II)V", line = 232)
	public void method22411(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22454(32767);
		} else if (arg0 < 32767) {
			this.method22454(arg0);
		} else {
			this.method22395(arg0);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ec", descriptor = "(I)V", line = 232)
	public void method22521(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22454(32767);
		} else if (arg0 < 32767) {
			this.method22454(arg0);
		} else {
			this.method22395(arg0);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ek", descriptor = "(I)V", line = 232)
	public void method22522(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22454(32767);
		} else if (arg0 < 32767) {
			this.method22454(arg0);
		} else {
			this.method22395(arg0);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "em", descriptor = "(I)V", line = 232)
	public void method22523(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22454(32767);
		} else if (arg0 < 32767) {
			this.method22454(arg0);
		} else {
			this.method22395(arg0);
			this.aByteArray58[this.anInt3070 * 212851357 - 4] = (byte) (this.aByteArray58[this.anInt3070 * 212851357 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!alw", name = "ac", descriptor = "(II)V", line = 251)
	void method22412(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22510(arg0 >>> 28 | 0x80);
					}
					this.method22510(arg0 >>> 21 | 0x80);
				}
				this.method22510(arg0 >>> 14 | 0x80);
			}
			this.method22510(arg0 >>> 7 | 0x80);
		}
		this.method22510(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!alw", name = "eh", descriptor = "(I)V", line = 251)
	void method22524(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22510(arg0 >>> 28 | 0x80);
					}
					this.method22510(arg0 >>> 21 | 0x80);
				}
				this.method22510(arg0 >>> 14 | 0x80);
			}
			this.method22510(arg0 >>> 7 | 0x80);
		}
		this.method22510(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!alw", name = "eq", descriptor = "(I)V", line = 251)
	void method22525(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22510(arg0 >>> 28 | 0x80);
					}
					this.method22510(arg0 >>> 21 | 0x80);
				}
				this.method22510(arg0 >>> 14 | 0x80);
			}
			this.method22510(arg0 >>> 7 | 0x80);
		}
		this.method22510(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!alw", name = "eg", descriptor = "(I)V", line = 251)
	void method22526(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22510(arg0 >>> 28 | 0x80);
					}
					this.method22510(arg0 >>> 21 | 0x80);
				}
				this.method22510(arg0 >>> 14 | 0x80);
			}
			this.method22510(arg0 >>> 7 | 0x80);
		}
		this.method22510(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!alw", name = "ai", descriptor = "(S)I", line = 265)
	public int method22413() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ez", descriptor = "()I", line = 265)
	public int method22527() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ef", descriptor = "()I", line = 265)
	public int method22528() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "aw", descriptor = "(I)B", line = 269)
	public byte method22414() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "ea", descriptor = "()B", line = 269)
	public byte method22450() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "ew", descriptor = "()B", line = 269)
	public byte method22586() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "et", descriptor = "()B", line = 269)
	public byte method22626() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "as", descriptor = "(I)I", line = 273)
	public int method22415() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "er", descriptor = "()I", line = 273)
	public int method22532() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "en", descriptor = "()I", line = 273)
	public int method22533() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "at", descriptor = "(B)I", line = 278)
	public int method22482() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "eb", descriptor = "()I", line = 278)
	public int method22534() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ex", descriptor = "()I", line = 278)
	public int method22535() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ad", descriptor = "(S)I", line = 285)
	public int method22417() {
		this.anInt3070 += -41913569;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "fm", descriptor = "()I", line = 285)
	public int method22418() {
		this.anInt3070 += -41913569;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "fg", descriptor = "()I", line = 285)
	public int method22469() {
		this.anInt3070 += -41913569;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "am", descriptor = "(I)I", line = 290)
	public int method22408() {
		this.anInt3070 += -41913569;
		@Pc(45) int local45 = (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!alw", name = "fu", descriptor = "()I", line = 290)
	public int method22607() {
		this.anInt3070 += -41913569;
		@Pc(45) int local45 = (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!alw", name = "au", descriptor = "(I)I", line = 297)
	public int method22419() {
		this.anInt3070 += -1487540524;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "fs", descriptor = "()I", line = 297)
	public int method22539() {
		this.anInt3070 += -1487540524;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ar", descriptor = "(B)I", line = 302)
	public int method22420() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "fj", descriptor = "()I", line = 302)
	public int method22461() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "fz", descriptor = "()I", line = 302)
	public int method22540() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "fd", descriptor = "()I", line = 302)
	public int method22542() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "fn", descriptor = "()J", line = 307)
	public long method22455() {
		@Pc(6) long local6 = (long) this.method22413() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fi", descriptor = "()J", line = 307)
	public long method22544() {
		@Pc(6) long local6 = (long) this.method22413() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ft", descriptor = "()J", line = 307)
	public long method22545() {
		@Pc(6) long local6 = (long) this.method22413() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ap", descriptor = "(I)J", line = 307)
	public long method22609() {
		@Pc(6) long local6 = (long) this.method22413() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "aq", descriptor = "(I)J", line = 313)
	public long method22422() {
		@Pc(6) long local6 = (long) this.method22415() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fx", descriptor = "()J", line = 313)
	public long method22546() {
		@Pc(6) long local6 = (long) this.method22415() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "ax", descriptor = "(I)J", line = 319)
	public long method22423() {
		@Pc(6) long local6 = (long) this.method22419() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fa", descriptor = "()J", line = 319)
	public long method22530() {
		@Pc(6) long local6 = (long) this.method22419() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fc", descriptor = "()J", line = 319)
	public long method22548() {
		@Pc(6) long local6 = (long) this.method22419() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fv", descriptor = "()J", line = 319)
	public long method22601() {
		@Pc(6) long local6 = (long) this.method22419() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fw", descriptor = "()J", line = 319)
	public long method22610() {
		@Pc(6) long local6 = (long) this.method22419() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22419() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!alw", name = "fp", descriptor = "(I)J", line = 325)
	public long method22406(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "av", descriptor = "(II)J", line = 325)
	public long method22424(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "fq", descriptor = "(I)J", line = 325)
	public long method22434(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "ff", descriptor = "(I)J", line = 325)
	public long method22553(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!alw", name = "ao", descriptor = "(I)F", line = 339)
	public float method22425() {
		return Float.intBitsToFloat(this.method22419());
	}

	@OriginalMember(owner = "client!alw", name = "fl", descriptor = "()F", line = 339)
	public float method22554() {
		return Float.intBitsToFloat(this.method22419());
	}

	@OriginalMember(owner = "client!alw", name = "fb", descriptor = "()F", line = 339)
	public float method22555() {
		return Float.intBitsToFloat(this.method22419());
	}

	@OriginalMember(owner = "client!alw", name = "aj", descriptor = "(B)Ljava/lang/String;", line = 343)
	public String method22426() {
		if (this.aByteArray58[this.anInt3070 * 212851357] == 0) {
			this.anInt3070 += -1445626955;
			return null;
		} else {
			return this.method22427();
		}
	}

	@OriginalMember(owner = "client!alw", name = "fo", descriptor = "()Ljava/lang/String;", line = 343)
	public String method22556() {
		if (this.aByteArray58[this.anInt3070 * 212851357] == 0) {
			this.anInt3070 += -1445626955;
			return null;
		} else {
			return this.method22427();
		}
	}

	@OriginalMember(owner = "client!alw", name = "ay", descriptor = "(I)Ljava/lang/String;", line = 351)
	public String method22427() {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3070 * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15308(this.aByteArray58, local4, local29);
	}

	@OriginalMember(owner = "client!alw", name = "fy", descriptor = "()Ljava/lang/String;", line = 351)
	public String method22557() {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3070 * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15308(this.aByteArray58, local4, local29);
	}

	@OriginalMember(owner = "client!alw", name = "fe", descriptor = "()Ljava/lang/String;", line = 351)
	public String method22558() {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3070 * 212851357 - local4 - 1;
		return local29 == 0 ? "" : Class155.method15308(this.aByteArray58, local4, local29);
	}

	@OriginalMember(owner = "client!alw", name = "ab", descriptor = "(I)Ljava/lang/String;", line = 359)
	public String method22428() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3070 * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15308(this.aByteArray58, local26, local51);
	}

	@OriginalMember(owner = "client!alw", name = "fk", descriptor = "()Ljava/lang/String;", line = 359)
	public String method22559() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3070 * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15308(this.aByteArray58, local26, local51);
	}

	@OriginalMember(owner = "client!alw", name = "fh", descriptor = "()Ljava/lang/String;", line = 359)
	public String method22560() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3070 * 212851357;
		while (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3070 * 212851357 - local26 - 1;
		return local51 == 0 ? "" : Class155.method15308(this.aByteArray58, local26, local51);
	}

	@OriginalMember(owner = "client!alw", name = "az", descriptor = "(I)Ljava/lang/String;", line = 369)
	public String method22429() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22437();
		if (local26 + this.anInt3070 * 212851357 > this.aByteArray58.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32754(this.aByteArray58, this.anInt3070 * 212851357, local26);
		this.anInt3070 += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "fr", descriptor = "()Ljava/lang/String;", line = 369)
	public String method22561() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22437();
		if (local26 + this.anInt3070 * 212851357 > this.aByteArray58.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32754(this.aByteArray58, this.anInt3070 * 212851357, local26);
		this.anInt3070 += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "gu", descriptor = "()Ljava/lang/String;", line = 369)
	public String method22562() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22437();
		if (local26 + this.anInt3070 * 212851357 > this.aByteArray58.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class657.method32754(this.aByteArray58, this.anInt3070 * 212851357, local26);
		this.anInt3070 += local26 * -1445626955;
		return local51;
	}

	@OriginalMember(owner = "client!alw", name = "aa", descriptor = "([BIIS)V", line = 379)
	public void method22430(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "gq", descriptor = "([BII)V", line = 379)
	public void method22563(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "gl", descriptor = "([BII)V", line = 379)
	public void method22578(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "go", descriptor = "()I", line = 383)
	public int method22387() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 64 : this.method22415() - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "af", descriptor = "(I)I", line = 383)
	public int method22431() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 64 : this.method22415() - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "gp", descriptor = "()I", line = 383)
	public int method22547() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 64 : this.method22415() - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "gk", descriptor = "()I", line = 383)
	public int method22566() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 64 : this.method22415() - 49152;
	}

	@OriginalMember(owner = "client!alw", name = "gy", descriptor = "()I", line = 389)
	public int method22568() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() : this.method22415() - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "ga", descriptor = "()I", line = 389)
	public int method22569() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() : this.method22415() - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "gn", descriptor = "()I", line = 389)
	public int method22570() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() : this.method22415() - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "ak", descriptor = "(B)I", line = 389)
	public int method22632() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() : this.method22415() - 32768;
	}

	@OriginalMember(owner = "client!alw", name = "an", descriptor = "(B)I", line = 395)
	public int method22433() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 1 : this.method22415() - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "gc", descriptor = "()I", line = 395)
	public int method22571() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 1 : this.method22415() - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "gf", descriptor = "()I", line = 395)
	public int method22572() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 1 : this.method22415() - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "gx", descriptor = "()I", line = 395)
	public int method22573() {
		@Pc(9) int local9 = this.aByteArray58[this.anInt3070 * 212851357] & 0xFF;
		return local9 < 128 ? this.method22413() - 1 : this.method22415() - 32769;
	}

	@OriginalMember(owner = "client!alw", name = "bf", descriptor = "(I)I", line = 401)
	public int method22464() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22632(); local5 == 32767; local5 = this.method22632()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "gg", descriptor = "()I", line = 401)
	public int method22543() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22632(); local5 == 32767; local5 = this.method22632()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "gr", descriptor = "()I", line = 401)
	public int method22576() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22632(); local5 == 32767; local5 = this.method22632()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "gs", descriptor = "()I", line = 401)
	public int method22577() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22632(); local5 == 32767; local5 = this.method22632()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "ge", descriptor = "()I", line = 401)
	public int method22628() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22632(); local5 == 32767; local5 = this.method22632()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!alw", name = "bl", descriptor = "(I)I", line = 412)
	public int method22435() {
		return this.aByteArray58[this.anInt3070 * 212851357] < 0 ? this.method22419() & Integer.MAX_VALUE : this.method22415();
	}

	@OriginalMember(owner = "client!alw", name = "gt", descriptor = "()I", line = 412)
	public int method22462() {
		return this.aByteArray58[this.anInt3070 * 212851357] < 0 ? this.method22419() & Integer.MAX_VALUE : this.method22415();
	}

	@OriginalMember(owner = "client!alw", name = "gh", descriptor = "()I", line = 412)
	public int method22529() {
		return this.aByteArray58[this.anInt3070 * 212851357] < 0 ? this.method22419() & Integer.MAX_VALUE : this.method22415();
	}

	@OriginalMember(owner = "client!alw", name = "gv", descriptor = "()I", line = 417)
	public int method22432() {
		if (this.aByteArray58[this.anInt3070 * 212851357] < 0) {
			return this.method22419() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22415();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "bk", descriptor = "(I)I", line = 417)
	public int method22436() {
		if (this.aByteArray58[this.anInt3070 * 212851357] < 0) {
			return this.method22419() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22415();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "gm", descriptor = "()I", line = 417)
	public int method22580() {
		if (this.aByteArray58[this.anInt3070 * 212851357] < 0) {
			return this.method22419() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22415();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!alw", name = "bh", descriptor = "(I)I", line = 424)
	int method22437() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!alw", name = "gj", descriptor = "()I", line = 424)
	int method22582() {
		@Pc(14) byte local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!alw", name = "gw", descriptor = "()I", line = 435)
	public int method22514() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22413();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "gd", descriptor = "()I", line = 435)
	public int method22584() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22413();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "bx", descriptor = "(S)I", line = 435)
	public int method22596() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22413();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!alw", name = "bd", descriptor = "([II)V", line = 446)
	public void method22475(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22419();
			@Pc(22) int local22 = this.method22419();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local18);
			this.method22395(local22);
		}
	}

	@OriginalMember(owner = "client!alw", name = "gb", descriptor = "([I)V", line = 446)
	public void method22575(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22419();
			@Pc(22) int local22 = this.method22419();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local18);
			this.method22395(local22);
		}
	}

	@OriginalMember(owner = "client!alw", name = "gz", descriptor = "([I)V", line = 446)
	public void method22585(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22419();
			@Pc(22) int local22 = this.method22419();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local18);
			this.method22395(local22);
		}
	}

	@OriginalMember(owner = "client!alw", name = "hm", descriptor = "([I)V", line = 466)
	public void method22388(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22419();
			@Pc(22) int local22 = this.method22419();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local18);
			this.method22395(local22);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bc", descriptor = "([II)V", line = 466)
	public void method22440(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22419();
			@Pc(22) int local22 = this.method22419();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local18);
			this.method22395(local22);
		}
	}

	@OriginalMember(owner = "client!alw", name = "gi", descriptor = "([I)V", line = 466)
	public void method22587(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3070 * 212851357 / 8;
		this.anInt3070 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22419();
			@Pc(22) int local22 = this.method22419();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= local22 + (local22 << 4 ^ local22 >>> 5) ^ local24 + arg0[local24 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local18);
			this.method22395(local22);
		}
	}

	@OriginalMember(owner = "client!alw", name = "bi", descriptor = "([IIIB)V", line = 486)
	public void method22441(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22419();
			@Pc(28) int local28 = this.method22419();
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ local30 + arg0[local30 >>> 11 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local24);
			this.method22395(local28);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "ha", descriptor = "([III)V", line = 486)
	public void method22588(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22419();
			@Pc(28) int local28 = this.method22419();
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += (local28 << 4 ^ local28 >>> 5) + local28 ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ local30 + arg0[local30 >>> 11 & 0x3];
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local24);
			this.method22395(local28);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "hu", descriptor = "([III)V", line = 508)
	public void method22438(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22419();
			@Pc(28) int local28 = this.method22419();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local24);
			this.method22395(local28);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bn", descriptor = "([IIII)V", line = 508)
	public void method22442(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22419();
			@Pc(28) int local28 = this.method22419();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local24);
			this.method22395(local28);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "hk", descriptor = "([III)V", line = 508)
	public void method22589(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = arg1 * -1445626955;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22419();
			@Pc(28) int local28 = this.method22419();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= (local28 << 4 ^ local28 >>> 5) + local28 ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3070 -= 1319886248;
			this.method22395(local24);
			this.method22395(local28);
		}
		this.anInt3070 = local4 * -1445626955;
	}

	@OriginalMember(owner = "client!alw", name = "bt", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;B)V", line = 530)
	public void method22416(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22430(local10, 0, local4);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22454(local29.length);
		this.method22405(local29, 0, local29.length);
	}

	@OriginalMember(owner = "client!alw", name = "hg", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 530)
	public void method22551(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22430(local10, 0, local4);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22454(local29.length);
		this.method22405(local29, 0, local29.length);
	}

	@OriginalMember(owner = "client!alw", name = "hd", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 530)
	public void method22593(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22430(local10, 0, local4);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22454(local29.length);
		this.method22405(local29, 0, local29.length);
	}

	@OriginalMember(owner = "client!alw", name = "hb", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;)V", line = 530)
	public void method22643(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3070 * 212851357;
		this.anInt3070 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22430(local10, 0, local4);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3070 = 0;
		this.method22454(local29.length);
		this.method22405(local29, 0, local29.length);
	}

	@OriginalMember(owner = "client!alw", name = "hx", descriptor = "(I)I", line = 543)
	public int method22493(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357);
		this.method22395(local9);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "bq", descriptor = "(II)I", line = 543)
	public int method22506(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357);
		this.method22395(local9);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "hf", descriptor = "(I)I", line = 543)
	public int method22536(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357);
		this.method22395(local9);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "hq", descriptor = "(I)I", line = 543)
	public int method22595(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357);
		this.method22395(local9);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "hr", descriptor = "(I)I", line = 543)
	public int method22597(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class124_Sub1.method9189(this.aByteArray58, arg0, this.anInt3070 * 212851357);
		this.method22395(local9);
		return local9;
	}

	@OriginalMember(owner = "client!alw", name = "hh", descriptor = "()Z", line = 549)
	public boolean method22463() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357);
		@Pc(19) int local19 = this.method22419();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "hs", descriptor = "()Z", line = 549)
	public boolean method22598() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357);
		@Pc(19) int local19 = this.method22419();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "hp", descriptor = "()Z", line = 549)
	public boolean method22600() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357);
		@Pc(19) int local19 = this.method22419();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "bm", descriptor = "(I)Z", line = 549)
	public boolean method22657() {
		this.anInt3070 -= -1487540524;
		@Pc(15) int local15 = Class124_Sub1.method9189(this.aByteArray58, 0, this.anInt3070 * 212851357);
		@Pc(19) int local19 = this.method22419();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!alw", name = "bb", descriptor = "(II)V", line = 557)
	public void method22446(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "he", descriptor = "(I)V", line = 557)
	public void method22487(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "hy", descriptor = "(I)V", line = 557)
	public void method22636(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "be", descriptor = "(II)V", line = 561)
	public void method22447(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!alw", name = "hn", descriptor = "(I)V", line = 561)
	public void method22505(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!alw", name = "by", descriptor = "(IB)V", line = 565)
	public void method22448(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "hi", descriptor = "(I)V", line = 565)
	public void method22604(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "hw", descriptor = "(I)V", line = 565)
	public void method22605(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "ht", descriptor = "(I)V", line = 565)
	public void method22606(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!alw", name = "bu", descriptor = "(I)I", line = 569)
	public int method22449() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "hc", descriptor = "()I", line = 569)
	public int method22484() {
		return this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "bw", descriptor = "(I)I", line = 573)
	public int method22497() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "hj", descriptor = "()I", line = 573)
	public int method22565() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "ho", descriptor = "()I", line = 573)
	public int method22608() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "hv", descriptor = "()I", line = 573)
	public int method22618() {
		return -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "bo", descriptor = "(I)I", line = 577)
	public int method22499() {
		return 128 - this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!alw", name = "hz", descriptor = "()B", line = 581)
	public byte method22445() {
		return (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128);
	}

	@OriginalMember(owner = "client!alw", name = "bz", descriptor = "(B)B", line = 581)
	public byte method22451() {
		return (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128);
	}

	@OriginalMember(owner = "client!alw", name = "bv", descriptor = "(I)B", line = 585)
	public byte method22389() {
		return (byte) -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "ij", descriptor = "()B", line = 585)
	public byte method22612() {
		return (byte) -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "io", descriptor = "()B", line = 585)
	public byte method22613() {
		return (byte) -this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
	}

	@OriginalMember(owner = "client!alw", name = "br", descriptor = "(I)B", line = 589)
	public byte method22503() {
		return (byte) (128 - this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1]);
	}

	@OriginalMember(owner = "client!alw", name = "bg", descriptor = "(IB)V", line = 593)
	public void method22590(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "iq", descriptor = "(I)V", line = 593)
	public void method22614(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ba", descriptor = "(II)V", line = 598)
	public void method22458(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "ig", descriptor = "(I)V", line = 598)
	public void method22615(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!alw", name = "bp", descriptor = "(IS)V", line = 603)
	public void method22456(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "iv", descriptor = "(I)V", line = 603)
	public void method22616(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ie", descriptor = "(I)V", line = 603)
	public void method22617(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 + 128);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "bj", descriptor = "(I)I", line = 608)
	public int method22457() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "iu", descriptor = "()I", line = 608)
	public int method22470() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "ib", descriptor = "()I", line = 613)
	public int method22439() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "bs", descriptor = "(I)I", line = 613)
	public int method22443() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "in", descriptor = "()I", line = 613)
	public int method22478() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ir", descriptor = "()I", line = 613)
	public int method22567() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "it", descriptor = "()I", line = 613)
	public int method22621() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "ix", descriptor = "()I", line = 613)
	public int method22622() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "is", descriptor = "()I", line = 613)
	public int method22623() {
		this.anInt3070 += 1403713386;
		return ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!alw", name = "cl", descriptor = "(I)I", line = 618)
	public int method22459() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "il", descriptor = "()I", line = 618)
	public int method22625() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "ip", descriptor = "()I", line = 618)
	public int method22627() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "iw", descriptor = "()I", line = 618)
	public int method22633() {
		this.anInt3070 += 1403713386;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] - 128 & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "cg", descriptor = "(I)I", line = 623)
	public int method22460() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ih", descriptor = "()I", line = 623)
	public int method22541() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "id", descriptor = "()I", line = 623)
	public int method22579() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ia", descriptor = "()I", line = 623)
	public int method22629() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "if", descriptor = "()I", line = 623)
	public int method22630() {
		this.anInt3070 += 1403713386;
		@Pc(31) int local31 = ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!alw", name = "ce", descriptor = "(I)I", line = 630)
	public int method22390() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "ii", descriptor = "()I", line = 630)
	public int method22474() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "iy", descriptor = "()I", line = 630)
	public int method22594() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "iz", descriptor = "()I", line = 630)
	public int method22634() {
		this.anInt3070 += 1403713386;
		@Pc(33) int local33 = ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 8) + (this.aByteArray58[this.anInt3070 * 212851357 - 1] - 128 & 0xFF);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!alw", name = "cu", descriptor = "(II)V", line = 637)
	public void method22631(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ik", descriptor = "(I)V", line = 637)
	public void method22635(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ic", descriptor = "(I)V", line = 637)
	public void method22637(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "im", descriptor = "(I)V", line = 637)
	public void method22645(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "ci", descriptor = "(IB)V", line = 643)
	public void method22444(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "jd", descriptor = "(I)V", line = 643)
	public void method22638(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!alw", name = "jf", descriptor = "()I", line = 649)
	public int method22392() {
		this.anInt3070 += -41913569;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!alw", name = "cn", descriptor = "(S)I", line = 649)
	public int method22476() {
		this.anInt3070 += -41913569;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16);
	}

	@OriginalMember(owner = "client!alw", name = "cv", descriptor = "(II)V", line = 654)
	public void method22465(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "ju", descriptor = "(I)V", line = 654)
	public void method22640(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!alw", name = "cp", descriptor = "(II)V", line = 661)
	public void method22466(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jn", descriptor = "(I)V", line = 661)
	public void method22564(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jb", descriptor = "(I)V", line = 661)
	public void method22624(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jy", descriptor = "(I)V", line = 661)
	public void method22641(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jl", descriptor = "(I)V", line = 661)
	public void method22642(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "je", descriptor = "(I)V", line = 661)
	public void method22644(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "jm", descriptor = "(I)V", line = 661)
	public void method22646(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!alw", name = "ca", descriptor = "(IB)V", line = 668)
	public void method22467(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "jw", descriptor = "(I)V", line = 668)
	public void method22647(@OriginalArg(0) int arg0) {
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 16);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 24);
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) arg0;
		this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!alw", name = "jt", descriptor = "()I", line = 675)
	public int method22453() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "cx", descriptor = "(I)I", line = 675)
	public int method22468() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "jr", descriptor = "()I", line = 675)
	public int method22648() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "js", descriptor = "()I", line = 675)
	public int method22649() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "ji", descriptor = "()I", line = 675)
	public int method22650() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 24) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!alw", name = "jq", descriptor = "()I", line = 680)
	public int method22400() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "cw", descriptor = "(I)I", line = 680)
	public int method22508() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "jv", descriptor = "()I", line = 680)
	public int method22653() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "ct", descriptor = "(I)I", line = 685)
	public int method22538() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "ja", descriptor = "()I", line = 685)
	public int method22654() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "jj", descriptor = "()I", line = 685)
	public int method22655() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "jo", descriptor = "()I", line = 685)
	public int method22656() {
		this.anInt3070 += -1487540524;
		return (this.aByteArray58[this.anInt3070 * 212851357 - 2] & 0xFF) + ((this.aByteArray58[this.anInt3070 * 212851357 - 1] & 0xFF) << 8) + ((this.aByteArray58[this.anInt3070 * 212851357 - 4] & 0xFF) << 16) + ((this.aByteArray58[this.anInt3070 * 212851357 - 3] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!alw", name = "jz", descriptor = "([BII)V", line = 690)
	public void method22391(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "cf", descriptor = "([BIIB)V", line = 690)
	public void method22471(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "jc", descriptor = "([BII)V", line = 690)
	public void method22658(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1];
		}
	}

	@OriginalMember(owner = "client!alw", name = "co", descriptor = "([BIII)V", line = 694)
	public void method22531(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			arg0[local1] = (byte) (this.aByteArray58[(this.anInt3070 += -1445626955) * 212851357 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!alw", name = "akf", descriptor = "(Lclient!yf;I)V", line = 11539)
	static final void method22660(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(15) Class93_Sub1_Sub20 local15 = Class159.method14509(local12);
		if (local15 == null) {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = 0;
		} else {
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3166 * -332819059;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3170 * 598304723;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3167 * -1863527503;
			arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local15.anInt3169 * -1436122155;
		}
	}

	@OriginalMember(owner = "client!alw", name = "bfh", descriptor = "(Lclient!yf;I)V", line = 15181)
	static final void method22659(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5888 -= 957530791;
	}
}
