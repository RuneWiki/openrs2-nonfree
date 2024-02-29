package com.jagex;

import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akv")
public class Class77_Sub39 extends Class77 {

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "I")
	public static final int anInt3087 = 100;

	@OriginalMember(owner = "client!akv", name = "y", descriptor = "I")
	public static final int anInt3088 = 5000;

	@OriginalMember(owner = "client!akv", name = "x", descriptor = "I")
	static final int anInt3090 = -306674912;

	@OriginalMember(owner = "client!akv", name = "s", descriptor = "J")
	static final long aLong186 = -3932672073523589310L;

	@OriginalMember(owner = "client!akv", name = "q", descriptor = "[I")
	static int[] anIntArray286 = new int[256];

	@OriginalMember(owner = "client!akv", name = "d", descriptor = "[J")
	public static long[] aLongArray18;

	@OriginalMember(owner = "client!akv", name = "w", descriptor = "[B")
	public byte[] aByteArray53;

	@OriginalMember(owner = "client!akv", name = "t", descriptor = "I")
	public int anInt3089;

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
			anIntArray286[local4] = local9;
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

	@OriginalMember(owner = "client!akv", name = "ct", descriptor = "([BII)I", line = 45)
	static int method22397(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(1) int local1 = -1;
		for (@Pc(3) int local3 = arg1; local3 < arg2; local3++) {
			local1 = local1 >>> 8 ^ anIntArray286[(local1 ^ arg0[local3]) & 0xFF];
		}
		return ~local1;
	}

	@OriginalMember(owner = "client!akv", name = "cm", descriptor = "([BI)I", line = 54)
	public static int method22398(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class526.method30674(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!akv", name = "cu", descriptor = "([BI)I", line = 54)
	public static int method22399(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class526.method30674(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!akv", name = "cv", descriptor = "([BI)I", line = 54)
	public static int method22400(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1) {
		return Class526.method30674(arg0, 0, arg1);
	}

	@OriginalMember(owner = "client!akv", name = "<init>", descriptor = "(I)V", line = 57)
	public Class77_Sub39(@OriginalArg(0) int arg0) {
		this.aByteArray53 = Class686.method36282(arg0);
		this.anInt3089 = 0;
	}

	@OriginalMember(owner = "client!akv", name = "<init>", descriptor = "(IZ)V", line = 62)
	public Class77_Sub39(@OriginalArg(0) int arg0, @OriginalArg(1) boolean arg1) {
		this.aByteArray53 = Class686.method36278(arg0, arg1);
	}

	@OriginalMember(owner = "client!akv", name = "<init>", descriptor = "([B)V", line = 66)
	public Class77_Sub39(@OriginalArg(0) byte[] arg0) {
		this.aByteArray53 = arg0;
		this.anInt3089 = 0;
	}

	@OriginalMember(owner = "client!akv", name = "v", descriptor = "(B)V", line = 72)
	public void method22401() {
		if (this.aByteArray53 != null) {
			Class686.method36283(this.aByteArray53);
		}
		this.aByteArray53 = null;
	}

	@OriginalMember(owner = "client!akv", name = "ci", descriptor = "()V", line = 72)
	public void method22402() {
		if (this.aByteArray53 != null) {
			Class686.method36283(this.aByteArray53);
		}
		this.aByteArray53 = null;
	}

	@OriginalMember(owner = "client!akv", name = "l", descriptor = "(II)V", line = 77)
	public void method22403(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "co", descriptor = "(I)V", line = 77)
	public void method22404(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "cn", descriptor = "(I)V", line = 77)
	public void method22405(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "cq", descriptor = "(I)V", line = 77)
	public void method22406(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "cy", descriptor = "(I)V", line = 77)
	public void method22407(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "y", descriptor = "(II)V", line = 81)
	public void method22408(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "cs", descriptor = "(I)V", line = 81)
	public void method22409(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "cd", descriptor = "(I)V", line = 86)
	public void method22410(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "cj", descriptor = "(I)V", line = 86)
	public void method22411(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "w", descriptor = "(II)V", line = 86)
	public void method22412(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "t", descriptor = "(II)V", line = 91)
	public void method22413(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "ce", descriptor = "(I)V", line = 91)
	public void method22414(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dt", descriptor = "(I)V", line = 91)
	public void method22415(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "do", descriptor = "(I)V", line = 91)
	public void method22416(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "q", descriptor = "(II)V", line = 97)
	public void method22417(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dh", descriptor = "(I)V", line = 97)
	public void method22418(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dq", descriptor = "(I)V", line = 97)
	public void method22419(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "x", descriptor = "(II)V", line = 104)
	public void method22420(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!akv", name = "dn", descriptor = "(I)V", line = 104)
	public void method22421(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!akv", name = "dy", descriptor = "(J)V", line = 111)
	public void method22422(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dm", descriptor = "(J)V", line = 111)
	public void method22423(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "d", descriptor = "(J)V", line = 111)
	public void method22424(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "da", descriptor = "(J)V", line = 111)
	public void method22425(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dv", descriptor = "(J)V", line = 111)
	public void method22426(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "s", descriptor = "(J)V", line = 119)
	public void method22427(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 40);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "r", descriptor = "(J)V", line = 128)
	public void method22428(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 56);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 48);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 40);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dz", descriptor = "(J)V", line = 128)
	public void method22429(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 56);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 48);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 40);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "di", descriptor = "(J)V", line = 128)
	public void method22430(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 56);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 48);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 40);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "dw", descriptor = "(J)V", line = 128)
	public void method22431(@OriginalArg(0) long arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 56);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 48);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 40);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 32);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "g", descriptor = "(JII)V", line = 139)
	public void method22432(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!akv", name = "dr", descriptor = "(JI)V", line = 139)
	public void method22433(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!akv", name = "dp", descriptor = "(JI)V", line = 139)
	public void method22434(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1) {
		@Pc(0) int local0 = arg1 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		for (@Pc(13) int local13 = local0 * 8; local13 >= 0; local13 -= 8) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> local13);
		}
	}

	@OriginalMember(owner = "client!akv", name = "de", descriptor = "(Ljava/lang/String;)I", line = 151)
	public static int method22435(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!akv", name = "du", descriptor = "(Ljava/lang/String;)I", line = 151)
	public static int method22436(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!akv", name = "dk", descriptor = "(Ljava/lang/String;)I", line = 151)
	public static int method22437(@OriginalArg(0) String arg0) {
		return arg0.length() + 1;
	}

	@OriginalMember(owner = "client!akv", name = "ds", descriptor = "(Ljava/lang/String;)V", line = 155)
	public void method22438(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "df", descriptor = "(Ljava/lang/String;)V", line = 155)
	public void method22439(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "j", descriptor = "(Ljava/lang/String;I)V", line = 155)
	public void method22440(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "dc", descriptor = "(Ljava/lang/String;)I", line = 162)
	public static int method22441(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!akv", name = "db", descriptor = "(Ljava/lang/String;)I", line = 162)
	public static int method22442(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!akv", name = "dx", descriptor = "(Ljava/lang/String;)I", line = 162)
	public static int method22443(@OriginalArg(0) String arg0) {
		return arg0.length() + 2;
	}

	@OriginalMember(owner = "client!akv", name = "n", descriptor = "(Ljava/lang/String;B)V", line = 166)
	public void method22444(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "dj", descriptor = "(Ljava/lang/String;)V", line = 166)
	public void method22445(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "dd", descriptor = "(Ljava/lang/String;)V", line = 166)
	public void method22446(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "dg", descriptor = "(Ljava/lang/String;)V", line = 166)
	public void method22447(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "dl", descriptor = "(Ljava/lang/String;)V", line = 166)
	public void method22448(@OriginalArg(0) String arg0) {
		@Pc(3) int local3 = arg0.indexOf(0);
		if (local3 >= 0) {
			throw new IllegalArgumentException("");
		}
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.anInt3089 += Class94_Sub4.method7452(arg0, 0, arg0.length(), this.aByteArray53, this.anInt3089 * 31645619) * -1387468933;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
	}

	@OriginalMember(owner = "client!akv", name = "a", descriptor = "(Ljava/lang/CharSequence;I)V", line = 174)
	public void method22449(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class341.method27747(arg0);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.method22475(local3);
		this.anInt3089 += Class131.method23060(this.aByteArray53, this.anInt3089 * 31645619, arg0) * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "eh", descriptor = "(Ljava/lang/CharSequence;)V", line = 174)
	public void method22450(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class341.method27747(arg0);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.method22475(local3);
		this.anInt3089 += Class131.method23060(this.aByteArray53, this.anInt3089 * 31645619, arg0) * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "ej", descriptor = "(Ljava/lang/CharSequence;)V", line = 174)
	public void method22451(@OriginalArg(0) CharSequence arg0) {
		@Pc(3) int local3 = Class341.method27747(arg0);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = 0;
		this.method22475(local3);
		this.anInt3089 += Class131.method23060(this.aByteArray53, this.anInt3089 * 31645619, arg0) * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "m", descriptor = "([BIII)V", line = 181)
	public void method22452(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "eo", descriptor = "([BII)V", line = 181)
	public void method22453(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "ep", descriptor = "([BII)V", line = 181)
	public void method22454(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "eq", descriptor = "([BII)V", line = 181)
	public void method22455(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "es", descriptor = "([BII)V", line = 181)
	public void method22456(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg2 + arg1; local1++) {
			this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = arg0[local1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "h", descriptor = "(Lclient!akv;I)V", line = 185)
	public void method22457(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method22452(arg0.aByteArray53, 0, arg0.anInt3089 * 31645619);
	}

	@OriginalMember(owner = "client!akv", name = "ei", descriptor = "(Lclient!akv;)V", line = 185)
	public void method22458(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method22452(arg0.aByteArray53, 0, arg0.anInt3089 * 31645619);
	}

	@OriginalMember(owner = "client!akv", name = "ed", descriptor = "(Lclient!akv;)V", line = 185)
	public void method22459(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method22452(arg0.aByteArray53, 0, arg0.anInt3089 * 31645619);
	}

	@OriginalMember(owner = "client!akv", name = "ee", descriptor = "(Lclient!akv;)V", line = 185)
	public void method22460(@OriginalArg(0) Class77_Sub39 arg0) {
		this.method22452(arg0.aByteArray53, 0, arg0.anInt3089 * 31645619);
	}

	@OriginalMember(owner = "client!akv", name = "en", descriptor = "(I)V", line = 189)
	public void method22461(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "aj", descriptor = "(II)V", line = 189)
	public void method22462(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 65535) {
			throw new IllegalArgumentException();
		}
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 2] = (byte) (arg0 >> 8);
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "ai", descriptor = "(II)V", line = 197)
	public void method22463(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "er", descriptor = "(I)V", line = 197)
	public void method22464(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "ex", descriptor = "(I)V", line = 197)
	public void method22465(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "ef", descriptor = "(I)V", line = 197)
	public void method22466(@OriginalArg(0) int arg0) {
		if (arg0 < 0 || arg0 > 255) {
			throw new IllegalArgumentException();
		}
		this.aByteArray53[this.anInt3089 * 31645619 - arg0 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "em", descriptor = "(I)V", line = 204)
	public void method22467(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22403(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22408(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akv", name = "et", descriptor = "(I)V", line = 204)
	public void method22468(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22403(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22408(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akv", name = "ag", descriptor = "(II)V", line = 204)
	public void method22469(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22403(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22408(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akv", name = "ew", descriptor = "(I)V", line = 204)
	public void method22470(@OriginalArg(0) int arg0) {
		if (arg0 < 64 && arg0 >= -64) {
			this.method22403(arg0 + 64);
		} else if (arg0 < 16384 && arg0 >= -16384) {
			this.method22408(arg0 + 49152);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akv", name = "al", descriptor = "(II)V", line = 216)
	public void method22471(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22403(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22408(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akv", name = "eu", descriptor = "(I)V", line = 216)
	public void method22472(@OriginalArg(0) int arg0) {
		if (arg0 >= 0 && arg0 < 128) {
			this.method22403(arg0);
		} else if (arg0 >= 0 && arg0 < 32768) {
			this.method22408(arg0 + 32768);
		} else {
			throw new IllegalArgumentException();
		}
	}

	@OriginalMember(owner = "client!akv", name = "ea", descriptor = "(I)V", line = 228)
	public void method22473(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22408(32767);
		} else if (arg0 < 32767) {
			this.method22408(arg0);
		} else {
			this.method22417(arg0);
			this.aByteArray53[this.anInt3089 * 31645619 - 4] = (byte) (this.aByteArray53[this.anInt3089 * 31645619 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!akv", name = "ao", descriptor = "(IB)V", line = 228)
	public void method22474(@OriginalArg(0) int arg0) {
		if (arg0 < -1) {
			throw new IllegalArgumentException();
		} else if (arg0 == -1) {
			this.method22408(32767);
		} else if (arg0 < 32767) {
			this.method22408(arg0);
		} else {
			this.method22417(arg0);
			this.aByteArray53[this.anInt3089 * 31645619 - 4] = (byte) (this.aByteArray53[this.anInt3089 * 31645619 - 4] | 0x80);
		}
	}

	@OriginalMember(owner = "client!akv", name = "ak", descriptor = "(II)V", line = 247)
	void method22475(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22403(arg0 >>> 28 | 0x80);
					}
					this.method22403(arg0 >>> 21 | 0x80);
				}
				this.method22403(arg0 >>> 14 | 0x80);
			}
			this.method22403(arg0 >>> 7 | 0x80);
		}
		this.method22403(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!akv", name = "el", descriptor = "(I)V", line = 247)
	void method22476(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22403(arg0 >>> 28 | 0x80);
					}
					this.method22403(arg0 >>> 21 | 0x80);
				}
				this.method22403(arg0 >>> 14 | 0x80);
			}
			this.method22403(arg0 >>> 7 | 0x80);
		}
		this.method22403(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!akv", name = "ec", descriptor = "(I)V", line = 247)
	void method22477(@OriginalArg(0) int arg0) {
		if ((arg0 & 0xFFFFFF80) != 0) {
			if ((arg0 & 0xFFFFC000) != 0) {
				if ((arg0 & 0xFFE00000) != 0) {
					if ((arg0 & 0xF0000000) != 0) {
						this.method22403(arg0 >>> 28 | 0x80);
					}
					this.method22403(arg0 >>> 21 | 0x80);
				}
				this.method22403(arg0 >>> 14 | 0x80);
			}
			this.method22403(arg0 >>> 7 | 0x80);
		}
		this.method22403(arg0 & 0x7F);
	}

	@OriginalMember(owner = "client!akv", name = "au", descriptor = "(I)I", line = 261)
	public int method22478() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "ey", descriptor = "()I", line = 261)
	public int method22479() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "eg", descriptor = "()I", line = 261)
	public int method22480() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "ax", descriptor = "(B)B", line = 265)
	public byte method22481() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
	}

	@OriginalMember(owner = "client!akv", name = "eb", descriptor = "()B", line = 265)
	public byte method22482() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
	}

	@OriginalMember(owner = "client!akv", name = "ar", descriptor = "(B)I", line = 269)
	public int method22483() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ez", descriptor = "()I", line = 269)
	public int method22484() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ev", descriptor = "()I", line = 269)
	public int method22485() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ek", descriptor = "()I", line = 269)
	public int method22486() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ad", descriptor = "(B)I", line = 274)
	public int method22487() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "fv", descriptor = "()I", line = 274)
	public int method22488() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "fq", descriptor = "()I", line = 274)
	public int method22489() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "fm", descriptor = "()I", line = 274)
	public int method22490() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "fl", descriptor = "()I", line = 274)
	public int method22491() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "ac", descriptor = "(I)I", line = 281)
	public int method22492() {
		this.anInt3089 += 132560497;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "fk", descriptor = "()I", line = 281)
	public int method22493() {
		this.anInt3089 += 132560497;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "fe", descriptor = "()I", line = 281)
	public int method22494() {
		this.anInt3089 += 132560497;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "ft", descriptor = "()I", line = 281)
	public int method22495() {
		this.anInt3089 += 132560497;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "av", descriptor = "(I)I", line = 286)
	public int method22496() {
		this.anInt3089 += 132560497;
		@Pc(45) int local45 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!akv", name = "fw", descriptor = "()I", line = 286)
	public int method22497() {
		this.anInt3089 += 132560497;
		@Pc(45) int local45 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!akv", name = "fi", descriptor = "()I", line = 286)
	public int method22498() {
		this.anInt3089 += 132560497;
		@Pc(45) int local45 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!akv", name = "fz", descriptor = "()I", line = 286)
	public int method22499() {
		this.anInt3089 += 132560497;
		@Pc(45) int local45 = (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
		if (local45 > 8388607) {
			local45 -= 16777216;
		}
		return local45;
	}

	@OriginalMember(owner = "client!akv", name = "at", descriptor = "(I)I", line = 293)
	public int method22500() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "fs", descriptor = "()I", line = 293)
	public int method22501() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "ff", descriptor = "()I", line = 293)
	public int method22502() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "fb", descriptor = "()I", line = 298)
	public int method22503() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!akv", name = "ae", descriptor = "(I)I", line = 298)
	public int method22504() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 24);
	}

	@OriginalMember(owner = "client!akv", name = "ah", descriptor = "(I)J", line = 303)
	public long method22505() {
		@Pc(6) long local6 = (long) this.method22478() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!akv", name = "fu", descriptor = "()J", line = 303)
	public long method22506() {
		@Pc(6) long local6 = (long) this.method22478() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return local13 + (local6 << 32);
	}

	@OriginalMember(owner = "client!akv", name = "fo", descriptor = "()J", line = 309)
	public long method22507() {
		@Pc(6) long local6 = (long) this.method22483() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "fd", descriptor = "()J", line = 309)
	public long method22508() {
		@Pc(6) long local6 = (long) this.method22483() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "as", descriptor = "(I)J", line = 309)
	public long method22509() {
		@Pc(6) long local6 = (long) this.method22483() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "aq", descriptor = "(I)J", line = 315)
	public long method22510() {
		@Pc(6) long local6 = (long) this.method22500() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "fg", descriptor = "()J", line = 315)
	public long method22511() {
		@Pc(6) long local6 = (long) this.method22500() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "fj", descriptor = "()J", line = 315)
	public long method22512() {
		@Pc(6) long local6 = (long) this.method22500() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "fh", descriptor = "()J", line = 315)
	public long method22513() {
		@Pc(6) long local6 = (long) this.method22500() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "fn", descriptor = "()J", line = 315)
	public long method22514() {
		@Pc(6) long local6 = (long) this.method22500() & 0xFFFFFFFFL;
		@Pc(13) long local13 = (long) this.method22500() & 0xFFFFFFFFL;
		return (local6 << 32) + local13;
	}

	@OriginalMember(owner = "client!akv", name = "am", descriptor = "(IB)J", line = 321)
	public long method22515(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!akv", name = "fa", descriptor = "(I)J", line = 321)
	public long method22516(@OriginalArg(0) int arg0) {
		@Pc(0) int local0 = arg0 - 1;
		if (local0 < 0 || local0 > 7) {
			throw new IllegalArgumentException();
		}
		@Pc(13) int local13 = local0 * 8;
		@Pc(15) long local15 = 0L;
		while (local13 >= 0) {
			local15 |= ((long) this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFFL) << local13;
			local13 -= 8;
		}
		return local15;
	}

	@OriginalMember(owner = "client!akv", name = "ay", descriptor = "(I)F", line = 335)
	public float method22517() {
		return Float.intBitsToFloat(this.method22500());
	}

	@OriginalMember(owner = "client!akv", name = "fp", descriptor = "()F", line = 335)
	public float method22518() {
		return Float.intBitsToFloat(this.method22500());
	}

	@OriginalMember(owner = "client!akv", name = "fy", descriptor = "()F", line = 335)
	public float method22519() {
		return Float.intBitsToFloat(this.method22500());
	}

	@OriginalMember(owner = "client!akv", name = "af", descriptor = "(I)Ljava/lang/String;", line = 339)
	public String method22520() {
		if (this.aByteArray53[this.anInt3089 * 31645619] == 0) {
			this.anInt3089 += -1387468933;
			return null;
		} else {
			return this.method22523();
		}
	}

	@OriginalMember(owner = "client!akv", name = "fx", descriptor = "()Ljava/lang/String;", line = 339)
	public String method22521() {
		if (this.aByteArray53[this.anInt3089 * 31645619] == 0) {
			this.anInt3089 += -1387468933;
			return null;
		} else {
			return this.method22523();
		}
	}

	@OriginalMember(owner = "client!akv", name = "gr", descriptor = "()Ljava/lang/String;", line = 347)
	public String method22522() {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3089 * 31645619 - local4 - 1;
		return local29 == 0 ? "" : Class386.method28347(this.aByteArray53, local4, local29);
	}

	@OriginalMember(owner = "client!akv", name = "an", descriptor = "(B)Ljava/lang/String;", line = 347)
	public String method22523() {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3089 * 31645619 - local4 - 1;
		return local29 == 0 ? "" : Class386.method28347(this.aByteArray53, local4, local29);
	}

	@OriginalMember(owner = "client!akv", name = "fc", descriptor = "()Ljava/lang/String;", line = 347)
	public String method22524() {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3089 * 31645619 - local4 - 1;
		return local29 == 0 ? "" : Class386.method28347(this.aByteArray53, local4, local29);
	}

	@OriginalMember(owner = "client!akv", name = "fr", descriptor = "()Ljava/lang/String;", line = 347)
	public String method22525() {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(29) int local29 = this.anInt3089 * 31645619 - local4 - 1;
		return local29 == 0 ? "" : Class386.method28347(this.aByteArray53, local4, local29);
	}

	@OriginalMember(owner = "client!akv", name = "ab", descriptor = "(I)Ljava/lang/String;", line = 355)
	public String method22526() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3089 * 31645619 - local26 - 1;
		return local51 == 0 ? "" : Class386.method28347(this.aByteArray53, local26, local51);
	}

	@OriginalMember(owner = "client!akv", name = "gj", descriptor = "()Ljava/lang/String;", line = 355)
	public String method22527() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3089 * 31645619 - local26 - 1;
		return local51 == 0 ? "" : Class386.method28347(this.aByteArray53, local26, local51);
	}

	@OriginalMember(owner = "client!akv", name = "gi", descriptor = "()Ljava/lang/String;", line = 355)
	public String method22528() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.anInt3089 * 31645619;
		while (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] != 0) {
		}
		@Pc(51) int local51 = this.anInt3089 * 31645619 - local26 - 1;
		return local51 == 0 ? "" : Class386.method28347(this.aByteArray53, local26, local51);
	}

	@OriginalMember(owner = "client!akv", name = "aa", descriptor = "(I)Ljava/lang/String;", line = 365)
	public String method22529() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22551();
		if (this.anInt3089 * 31645619 + local26 > this.aByteArray53.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class483.method29836(this.aByteArray53, this.anInt3089 * 31645619, local26);
		this.anInt3089 += local26 * -1387468933;
		return local51;
	}

	@OriginalMember(owner = "client!akv", name = "gt", descriptor = "()Ljava/lang/String;", line = 365)
	public String method22530() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22551();
		if (this.anInt3089 * 31645619 + local26 > this.aByteArray53.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class483.method29836(this.aByteArray53, this.anInt3089 * 31645619, local26);
		this.anInt3089 += local26 * -1387468933;
		return local51;
	}

	@OriginalMember(owner = "client!akv", name = "ga", descriptor = "()Ljava/lang/String;", line = 365)
	public String method22531() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		if (local14 != 0) {
			throw new IllegalStateException("");
		}
		@Pc(26) int local26 = this.method22551();
		if (this.anInt3089 * 31645619 + local26 > this.aByteArray53.length) {
			throw new IllegalStateException("");
		}
		@Pc(51) String local51 = Class483.method29836(this.aByteArray53, this.anInt3089 * 31645619, local26);
		this.anInt3089 += local26 * -1387468933;
		return local51;
	}

	@OriginalMember(owner = "client!akv", name = "gy", descriptor = "([BII)V", line = 375)
	public void method22532(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "ap", descriptor = "([BIIS)V", line = 375)
	public void method22533(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "gc", descriptor = "([BII)V", line = 375)
	public void method22534(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(1) int local1 = arg1; local1 < arg1 + arg2; local1++) {
			arg0[local1] = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		}
	}

	@OriginalMember(owner = "client!akv", name = "aw", descriptor = "(B)I", line = 379)
	public int method22535() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 64 : this.method22483() - 49152;
	}

	@OriginalMember(owner = "client!akv", name = "gz", descriptor = "()I", line = 379)
	public int method22536() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 64 : this.method22483() - 49152;
	}

	@OriginalMember(owner = "client!akv", name = "az", descriptor = "(I)I", line = 385)
	public int method22537() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() : this.method22483() - 32768;
	}

	@OriginalMember(owner = "client!akv", name = "gu", descriptor = "()I", line = 385)
	public int method22538() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() : this.method22483() - 32768;
	}

	@OriginalMember(owner = "client!akv", name = "gb", descriptor = "()I", line = 385)
	public int method22539() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() : this.method22483() - 32768;
	}

	@OriginalMember(owner = "client!akv", name = "gk", descriptor = "()I", line = 391)
	public int method22540() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 1 : this.method22483() - 32769;
	}

	@OriginalMember(owner = "client!akv", name = "bc", descriptor = "(I)I", line = 391)
	public int method22541() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 1 : this.method22483() - 32769;
	}

	@OriginalMember(owner = "client!akv", name = "gp", descriptor = "()I", line = 391)
	public int method22542() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 1 : this.method22483() - 32769;
	}

	@OriginalMember(owner = "client!akv", name = "ge", descriptor = "()I", line = 391)
	public int method22543() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 1 : this.method22483() - 32769;
	}

	@OriginalMember(owner = "client!akv", name = "gq", descriptor = "()I", line = 391)
	public int method22544() {
		@Pc(9) int local9 = this.aByteArray53[this.anInt3089 * 31645619] & 0xFF;
		return local9 < 128 ? this.method22478() - 1 : this.method22483() - 32769;
	}

	@OriginalMember(owner = "client!akv", name = "bj", descriptor = "(B)I", line = 397)
	public int method22545() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22537(); local5 == 32767; local5 = this.method22537()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!akv", name = "gf", descriptor = "()I", line = 397)
	public int method22546() {
		@Pc(1) int local1 = 0;
		@Pc(5) int local5;
		for (local5 = this.method22537(); local5 == 32767; local5 = this.method22537()) {
			local1 += 32767;
		}
		return local1 + local5;
	}

	@OriginalMember(owner = "client!akv", name = "bv", descriptor = "(I)I", line = 408)
	public int method22547() {
		return this.aByteArray53[this.anInt3089 * 31645619] < 0 ? this.method22500() & Integer.MAX_VALUE : this.method22483();
	}

	@OriginalMember(owner = "client!akv", name = "go", descriptor = "()I", line = 408)
	public int method22548() {
		return this.aByteArray53[this.anInt3089 * 31645619] < 0 ? this.method22500() & Integer.MAX_VALUE : this.method22483();
	}

	@OriginalMember(owner = "client!akv", name = "ba", descriptor = "(B)I", line = 413)
	public int method22549() {
		if (this.aByteArray53[this.anInt3089 * 31645619] < 0) {
			return this.method22500() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22483();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!akv", name = "gx", descriptor = "()I", line = 413)
	public int method22550() {
		if (this.aByteArray53[this.anInt3089 * 31645619] < 0) {
			return this.method22500() & Integer.MAX_VALUE;
		} else {
			@Pc(17) int local17 = this.method22483();
			return local17 == 32767 ? -1 : local17;
		}
	}

	@OriginalMember(owner = "client!akv", name = "bl", descriptor = "(S)I", line = 420)
	int method22551() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!akv", name = "gv", descriptor = "()I", line = 420)
	int method22552() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!akv", name = "gd", descriptor = "()I", line = 420)
	int method22553() {
		@Pc(14) byte local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		@Pc(16) int local16 = 0;
		while (local14 < 0) {
			local16 = (local16 | local14 & 0x7F) << 7;
			local14 = this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
		}
		return local16 | local14;
	}

	@OriginalMember(owner = "client!akv", name = "gl", descriptor = "()I", line = 431)
	public int method22554() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22478();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!akv", name = "bb", descriptor = "(S)I", line = 431)
	public int method22555() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22478();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!akv", name = "gn", descriptor = "()I", line = 431)
	public int method22556() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22478();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!akv", name = "gs", descriptor = "()I", line = 431)
	public int method22557() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22478();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!akv", name = "gg", descriptor = "()I", line = 431)
	public int method22558() {
		@Pc(1) int local1 = 0;
		@Pc(3) int local3 = 0;
		@Pc(7) int local7;
		do {
			local7 = this.method22478();
			local1 |= (local7 & 0x7F) << local3;
			local3 += 7;
		} while (local7 > 127);
		return local1;
	}

	@OriginalMember(owner = "client!akv", name = "bd", descriptor = "([II)V", line = 442)
	public void method22559(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += (local22 << 4 ^ local22 >>> 5) + local22 ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ local24 + arg0[local24 >>> 11 & 0x3];
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "gh", descriptor = "([I)V", line = 442)
	public void method22560(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = 0;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local18 += (local22 << 4 ^ local22 >>> 5) + local22 ^ local24 + arg0[local24 & 0x3];
				local24 += local26;
				local22 += (local18 << 4 ^ local18 >>> 5) + local18 ^ local24 + arg0[local24 >>> 11 & 0x3];
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "by", descriptor = "([IB)V", line = 462)
	public void method22561(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "hl", descriptor = "([I)V", line = 462)
	public void method22562(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "gm", descriptor = "([I)V", line = 462)
	public void method22563(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "hu", descriptor = "([I)V", line = 462)
	public void method22564(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "gw", descriptor = "([I)V", line = 462)
	public void method22565(@OriginalArg(0) int[] arg0) {
		@Pc(6) int local6 = this.anInt3089 * 31645619 / 8;
		this.anInt3089 = 0;
		for (@Pc(11) int local11 = 0; local11 < local6; local11++) {
			@Pc(18) int local18 = this.method22500();
			@Pc(22) int local22 = this.method22500();
			@Pc(24) int local24 = -957401312;
			@Pc(26) int local26 = -1640531527;
			@Pc(28) int local28 = 32;
			while (local28-- > 0) {
				local22 -= (local18 << 4 ^ local18 >>> 5) + local18 ^ arg0[local24 >>> 11 & 0x3] + local24;
				local24 -= local26;
				local18 -= (local22 << 4 ^ local22 >>> 5) + local22 ^ arg0[local24 & 0x3] + local24;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local18);
			this.method22417(local22);
		}
	}

	@OriginalMember(owner = "client!akv", name = "hw", descriptor = "([III)V", line = 482)
	public void method22566(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = arg1 * -1387468933;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22500();
			@Pc(28) int local28 = this.method22500();
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += local28 + (local28 << 4 ^ local28 >>> 5) ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local24);
			this.method22417(local28);
		}
		this.anInt3089 = local4 * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "bx", descriptor = "([IIIB)V", line = 482)
	public void method22567(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = arg1 * -1387468933;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22500();
			@Pc(28) int local28 = this.method22500();
			@Pc(30) int local30 = 0;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local24 += local28 + (local28 << 4 ^ local28 >>> 5) ^ local30 + arg0[local30 & 0x3];
				local30 += local32;
				local28 += (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local24);
			this.method22417(local28);
		}
		this.anInt3089 = local4 * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "bw", descriptor = "([IIII)V", line = 504)
	public void method22568(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = arg1 * -1387468933;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22500();
			@Pc(28) int local28 = this.method22500();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local24);
			this.method22417(local28);
		}
		this.anInt3089 = local4 * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "hq", descriptor = "([III)V", line = 504)
	public void method22569(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = arg1 * -1387468933;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22500();
			@Pc(28) int local28 = this.method22500();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local24);
			this.method22417(local28);
		}
		this.anInt3089 = local4 * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "ht", descriptor = "([III)V", line = 504)
	public void method22570(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = arg1 * -1387468933;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22500();
			@Pc(28) int local28 = this.method22500();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local24);
			this.method22417(local28);
		}
		this.anInt3089 = local4 * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "hz", descriptor = "([III)V", line = 504)
	public void method22571(@OriginalArg(0) int[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = arg1 * -1387468933;
		@Pc(15) int local15 = (arg2 - arg1) / 8;
		for (@Pc(17) int local17 = 0; local17 < local15; local17++) {
			@Pc(24) int local24 = this.method22500();
			@Pc(28) int local28 = this.method22500();
			@Pc(30) int local30 = -957401312;
			@Pc(32) int local32 = -1640531527;
			@Pc(34) int local34 = 32;
			while (local34-- > 0) {
				local28 -= (local24 << 4 ^ local24 >>> 5) + local24 ^ arg0[local30 >>> 11 & 0x3] + local30;
				local30 -= local32;
				local24 -= local28 + (local28 << 4 ^ local28 >>> 5) ^ arg0[local30 & 0x3] + local30;
			}
			this.anInt3089 -= 1785150424;
			this.method22417(local24);
			this.method22417(local28);
		}
		this.anInt3089 = local4 * -1387468933;
	}

	@OriginalMember(owner = "client!akv", name = "bi", descriptor = "(Ljava/math/BigInteger;Ljava/math/BigInteger;I)V", line = 526)
	public void method22572(@OriginalArg(0) BigInteger arg0, @OriginalArg(1) BigInteger arg1) {
		@Pc(4) int local4 = this.anInt3089 * 31645619;
		this.anInt3089 = 0;
		@Pc(10) byte[] local10 = new byte[local4];
		this.method22533(local10, 0, local4);
		@Pc(21) BigInteger local21 = new BigInteger(local10);
		@Pc(26) BigInteger local26 = local21.modPow(arg0, arg1);
		@Pc(29) byte[] local29 = local26.toByteArray();
		this.anInt3089 = 0;
		this.method22408(local29.length);
		this.method22452(local29, 0, local29.length);
	}

	@OriginalMember(owner = "client!akv", name = "bg", descriptor = "(II)I", line = 539)
	public int method22573(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class526.method30674(this.aByteArray53, arg0, this.anInt3089 * 31645619);
		this.method22417(local9);
		return local9;
	}

	@OriginalMember(owner = "client!akv", name = "hr", descriptor = "(I)I", line = 539)
	public int method22574(@OriginalArg(0) int arg0) {
		@Pc(9) int local9 = Class526.method30674(this.aByteArray53, arg0, this.anInt3089 * 31645619);
		this.method22417(local9);
		return local9;
	}

	@OriginalMember(owner = "client!akv", name = "hh", descriptor = "()Z", line = 545)
	public boolean method22575() {
		this.anInt3089 -= -1254908436;
		@Pc(15) int local15 = Class526.method30674(this.aByteArray53, 0, this.anInt3089 * 31645619);
		@Pc(19) int local19 = this.method22500();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!akv", name = "bs", descriptor = "(I)Z", line = 545)
	public boolean method22576() {
		this.anInt3089 -= -1254908436;
		@Pc(15) int local15 = Class526.method30674(this.aByteArray53, 0, this.anInt3089 * 31645619);
		@Pc(19) int local19 = this.method22500();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!akv", name = "hj", descriptor = "()Z", line = 545)
	public boolean method22577() {
		this.anInt3089 -= -1254908436;
		@Pc(15) int local15 = Class526.method30674(this.aByteArray53, 0, this.anInt3089 * 31645619);
		@Pc(19) int local19 = this.method22500();
		return local19 == local15;
	}

	@OriginalMember(owner = "client!akv", name = "bt", descriptor = "(II)V", line = 553)
	public void method22578(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!akv", name = "hv", descriptor = "(I)V", line = 553)
	public void method22579(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!akv", name = "hg", descriptor = "(I)V", line = 553)
	public void method22580(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!akv", name = "hb", descriptor = "(I)V", line = 553)
	public void method22581(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!akv", name = "hk", descriptor = "(I)V", line = 553)
	public void method22582(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!akv", name = "bz", descriptor = "(II)V", line = 557)
	public void method22583(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!akv", name = "hy", descriptor = "(I)V", line = 557)
	public void method22584(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!akv", name = "hs", descriptor = "(I)V", line = 557)
	public void method22585(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) -arg0;
	}

	@OriginalMember(owner = "client!akv", name = "hx", descriptor = "(I)V", line = 561)
	public void method22586(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!akv", name = "bu", descriptor = "(II)V", line = 561)
	public void method22587(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!akv", name = "hm", descriptor = "(I)V", line = 561)
	public void method22588(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (128 - arg0);
	}

	@OriginalMember(owner = "client!akv", name = "bf", descriptor = "(I)I", line = 565)
	public int method22589() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "he", descriptor = "()I", line = 565)
	public int method22590() {
		return this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128 & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "bn", descriptor = "(B)I", line = 569)
	public int method22591() {
		return -this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "ho", descriptor = "()I", line = 569)
	public int method22592() {
		return -this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "ib", descriptor = "()I", line = 573)
	public int method22593() {
		return 128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "if", descriptor = "()I", line = 573)
	public int method22594() {
		return 128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "ii", descriptor = "()I", line = 573)
	public int method22595() {
		return 128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "iq", descriptor = "()I", line = 573)
	public int method22596() {
		return 128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "id", descriptor = "()I", line = 573)
	public int method22597() {
		return 128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "bp", descriptor = "(I)I", line = 573)
	public int method22598() {
		return 128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] & 0xFF;
	}

	@OriginalMember(owner = "client!akv", name = "ip", descriptor = "()B", line = 577)
	public byte method22599() {
		return (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128);
	}

	@OriginalMember(owner = "client!akv", name = "bm", descriptor = "(I)B", line = 577)
	public byte method22600() {
		return (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128);
	}

	@OriginalMember(owner = "client!akv", name = "bo", descriptor = "(I)B", line = 581)
	public byte method22601() {
		return (byte) -this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
	}

	@OriginalMember(owner = "client!akv", name = "iw", descriptor = "()B", line = 581)
	public byte method22602() {
		return (byte) -this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1];
	}

	@OriginalMember(owner = "client!akv", name = "bk", descriptor = "(B)B", line = 585)
	public byte method22603() {
		return (byte) (128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1]);
	}

	@OriginalMember(owner = "client!akv", name = "it", descriptor = "()B", line = 585)
	public byte method22604() {
		return (byte) (128 - this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1]);
	}

	@OriginalMember(owner = "client!akv", name = "br", descriptor = "(II)V", line = 589)
	public void method22605(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "ig", descriptor = "(I)V", line = 589)
	public void method22606(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "ic", descriptor = "(I)V", line = 589)
	public void method22607(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "in", descriptor = "(I)V", line = 589)
	public void method22608(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "bq", descriptor = "(II)V", line = 594)
	public void method22609(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
	}

	@OriginalMember(owner = "client!akv", name = "bh", descriptor = "(II)V", line = 599)
	public void method22610(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "iy", descriptor = "(I)V", line = 599)
	public void method22611(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 + 128);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "be", descriptor = "(I)I", line = 604)
	public int method22612() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "is", descriptor = "()I", line = 604)
	public int method22613() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "iu", descriptor = "()I", line = 604)
	public int method22614() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "iz", descriptor = "()I", line = 604)
	public int method22615() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ix", descriptor = "()I", line = 604)
	public int method22616() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "cb", descriptor = "(B)I", line = 609)
	public int method22617() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ij", descriptor = "()I", line = 609)
	public int method22618() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ik", descriptor = "()I", line = 609)
	public int method22619() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ia", descriptor = "()I", line = 609)
	public int method22620() {
		this.anInt3089 += 1520029430;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] - 128 & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "cg", descriptor = "(I)I", line = 614)
	public int method22621() {
		this.anInt3089 += 1520029430;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "ir", descriptor = "()I", line = 614)
	public int method22622() {
		this.anInt3089 += 1520029430;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "im", descriptor = "()I", line = 614)
	public int method22623() {
		this.anInt3089 += 1520029430;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "il", descriptor = "()I", line = 619)
	public int method22624() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "cc", descriptor = "(B)I", line = 619)
	public int method22625() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "io", descriptor = "()I", line = 619)
	public int method22626() {
		this.anInt3089 += 1520029430;
		@Pc(31) int local31 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local31 > 32767) {
			local31 -= 65536;
		}
		return local31;
	}

	@OriginalMember(owner = "client!akv", name = "cf", descriptor = "(B)I", line = 626)
	public int method22627() {
		this.anInt3089 += 1520029430;
		@Pc(33) int local33 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!akv", name = "iv", descriptor = "()I", line = 626)
	public int method22628() {
		this.anInt3089 += 1520029430;
		@Pc(33) int local33 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!akv", name = "ie", descriptor = "()I", line = 626)
	public int method22629() {
		this.anInt3089 += 1520029430;
		@Pc(33) int local33 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!akv", name = "ih", descriptor = "()I", line = 626)
	public int method22630() {
		this.anInt3089 += 1520029430;
		@Pc(33) int local33 = (this.aByteArray53[this.anInt3089 * 31645619 - 2] - 128 & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
		if (local33 > 32767) {
			local33 -= 65536;
		}
		return local33;
	}

	@OriginalMember(owner = "client!akv", name = "cl", descriptor = "(IB)V", line = 633)
	public void method22631(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "jz", descriptor = "(I)V", line = 633)
	public void method22632(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
	}

	@OriginalMember(owner = "client!akv", name = "cp", descriptor = "(I)I", line = 639)
	public int method22633() {
		this.anInt3089 += 132560497;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "js", descriptor = "()I", line = 639)
	public int method22634() {
		this.anInt3089 += 132560497;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "cw", descriptor = "(II)V", line = 644)
	public void method22635(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!akv", name = "jv", descriptor = "(I)V", line = 644)
	public void method22636(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!akv", name = "jr", descriptor = "(I)V", line = 644)
	public void method22637(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
	}

	@OriginalMember(owner = "client!akv", name = "ck", descriptor = "(II)V", line = 651)
	public void method22638(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!akv", name = "jl", descriptor = "(I)V", line = 651)
	public void method22639(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!akv", name = "jo", descriptor = "(I)V", line = 651)
	public void method22640(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
	}

	@OriginalMember(owner = "client!akv", name = "ch", descriptor = "(II)V", line = 658)
	public void method22641(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "jd", descriptor = "(I)V", line = 658)
	public void method22642(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "jn", descriptor = "(I)V", line = 658)
	public void method22643(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "jk", descriptor = "(I)V", line = 658)
	public void method22644(@OriginalArg(0) int arg0) {
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 16);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 24);
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) arg0;
		this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] = (byte) (arg0 >> 8);
	}

	@OriginalMember(owner = "client!akv", name = "cz", descriptor = "(S)I", line = 665)
	public int method22645() {
		this.anInt3089 += -1254908436;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "jp", descriptor = "()I", line = 665)
	public int method22646() {
		this.anInt3089 += -1254908436;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "jg", descriptor = "()I", line = 665)
	public int method22647() {
		this.anInt3089 += -1254908436;
		return ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 8) + (this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF);
	}

	@OriginalMember(owner = "client!akv", name = "ca", descriptor = "(I)I", line = 670)
	public int method22648() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "jw", descriptor = "()I", line = 670)
	public int method22649() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "jx", descriptor = "()I", line = 670)
	public int method22650() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "jh", descriptor = "()I", line = 670)
	public int method22651() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "jy", descriptor = "()I", line = 675)
	public int method22652() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "cr", descriptor = "(I)I", line = 675)
	public int method22653() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "jb", descriptor = "()I", line = 675)
	public int method22654() {
		this.anInt3089 += -1254908436;
		return (this.aByteArray53[this.anInt3089 * 31645619 - 2] & 0xFF) + ((this.aByteArray53[this.anInt3089 * 31645619 - 3] & 0xFF) << 24) + ((this.aByteArray53[this.anInt3089 * 31645619 - 4] & 0xFF) << 16) + ((this.aByteArray53[this.anInt3089 * 31645619 - 1] & 0xFF) << 8);
	}

	@OriginalMember(owner = "client!akv", name = "jc", descriptor = "([BII)V", line = 680)
	public void method22655(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!akv", name = "cx", descriptor = "([BIII)V", line = 680)
	public void method22656(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!akv", name = "ja", descriptor = "([BII)V", line = 680)
	public void method22657(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		for (@Pc(5) int local5 = arg1 + arg2 - 1; local5 >= arg1; local5--) {
			arg0[local5] = (byte) (this.aByteArray53[(this.anInt3089 += -1387468933) * 31645619 - 1] - 128);
		}
	}

	@OriginalMember(owner = "client!akv", name = "axn", descriptor = "(Lclient!yf;I)V", line = 13529)
	static final void method22658(@OriginalArg(0) Class665 arg0) {
		Class124.method11103((Class104_Sub1) arg0.anInterface61_1, arg0);
	}
}
