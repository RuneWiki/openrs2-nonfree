package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dt")
public class Class135 {

	@OriginalMember(owner = "client!dt", name = "ay", descriptor = "I")
	public static int anInt3398;

	@OriginalMember(owner = "client!dt", name = "hq", descriptor = "Lclient!ajx;")
	public static Class70_Sub1_Sub2 aClass70_Sub1_Sub2_10;

	@OriginalMember(owner = "client!dt", name = "lt", descriptor = "I")
	public static int anInt3399;

	@OriginalMember(owner = "client!dt", name = "z", descriptor = "I")
	public int anInt3384;

	@OriginalMember(owner = "client!dt", name = "b", descriptor = "I")
	public int anInt3385;

	@OriginalMember(owner = "client!dt", name = "y", descriptor = "I")
	public int anInt3390;

	@OriginalMember(owner = "client!dt", name = "u", descriptor = "I")
	public int anInt3391;

	@OriginalMember(owner = "client!dt", name = "c", descriptor = "I")
	public int anInt3392;

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "Lclient!dt;")
	public Class135 aClass135_1;

	@OriginalMember(owner = "client!dt", name = "j", descriptor = "I")
	public int anInt3394;

	@OriginalMember(owner = "client!dt", name = "n", descriptor = "I")
	public int anInt3395;

	@OriginalMember(owner = "client!dt", name = "e", descriptor = "I")
	public int anInt3396;

	@OriginalMember(owner = "client!dt", name = "r", descriptor = "I")
	public int anInt3397;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "I")
	public final int anInt3393;

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "I")
	public final int anInt3386;

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "I")
	public final int anInt3387;

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "I")
	public final int anInt3388;

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "I")
	public final int anInt3389;

	@OriginalMember(owner = "client!dt", name = "s", descriptor = "B")
	final byte aByte122;

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "(Lclient!de;IIIIILclient!dh;IIIILclient!wi;I)Lclient!dh;", line = 20)
	public static Class20 method22919(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class20 arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) Class71 arg11) {
		if (arg6 == null) {
			return null;
		}
		@Pc(5) int local5 = 2055;
		if (arg11 != null) {
			local5 |= arg11.method20035();
			local5 &= 0xFFFFFDFF;
		}
		@Pc(38) long local38 = ((long) arg7 << 32) + (long) (arg5 + (arg9 << 16) + (arg10 << 24)) + ((long) arg8 << 48);
		@Pc(41) Class161 local41 = Class519.aClass161_58;
		@Pc(47) Class20 local47;
		synchronized (Class519.aClass161_58) {
			local47 = (Class20) Class519.aClass161_58.method23219(local38);
		}
		if (local47 == null || arg0.method17117(local47.method5327(), local5) != 0) {
			if (local47 != null) {
				local5 = arg0.method17102(local5, local47.method5327());
			}
			@Pc(78) byte local78;
			if (arg5 == 1) {
				local78 = 9;
			} else if (arg5 == 2) {
				local78 = 12;
			} else if (arg5 == 3) {
				local78 = 15;
			} else if (arg5 == 4) {
				local78 = 18;
			} else {
				local78 = 21;
			}
			@Pc(101) byte local101 = 3;
			@Pc(116) int[] local116 = new int[] { 64, 96, 128 };
			@Pc(133) Class138 local133 = new Class138(local101 * local78 + 1, local78 * 2 * local101 - local78, 0);
			@Pc(139) int local139 = local133.method22958(0, 0, 0);
			@Pc(143) int[][] local143 = new int[local101][local78];
			@Pc(145) int local145;
			@Pc(152) int local152;
			@Pc(156) int local156;
			@Pc(175) int local175;
			for (local145 = 0; local145 < local101; local145++) {
				local152 = local116[local145];
				local156 = local116[local145];
				for (@Pc(158) int local158 = 0; local158 < local78; local158++) {
					@Pc(167) int local167 = (local158 << 14) / local78;
					local175 = local152 * Class317.anIntArray419[local167] >> 14;
					@Pc(183) int local183 = Class317.anIntArray420[local167] * local156 >> 14;
					local143[local145][local158] = local133.method22958(local175, 0, local183);
				}
			}
			for (local145 = 0; local145 < local101; local145++) {
				local152 = (local145 * 256 + 128) / local101;
				local156 = 256 - local152;
				@Pc(225) byte local225 = (byte) (arg9 * local156 + local152 * arg10 >> 8);
				@Pc(270) short local270 = (short) ((local152 * (arg8 & 0x7F) + (arg7 & 0x7F) * local156 & 0x7F00) + (local156 * (arg7 & 0xFC00) + local152 * (arg8 & 0xFC00) & 0xFC0000) + (local152 * (arg8 & 0x380) + local156 * (arg7 & 0x380) & 0x38000) >> 8);
				for (local175 = 0; local175 < local78; local175++) {
					if (local145 == 0) {
						local133.method22959(local139, local143[0][(local175 + 1) % local78], local143[0][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					} else {
						local133.method22959(local143[local145 - 1][local175], local143[local145 - 1][(local175 + 1) % local78], local143[local145][(local175 + 1) % local78], (byte) 1, (byte) -1, local270, local225, (short) -1);
						local133.method22959(local143[local145 - 1][local175], local143[local145][(local175 + 1) % local78], local143[local145][local175], (byte) 1, (byte) -1, local270, local225, (short) -1);
					}
				}
			}
			local47 = arg0.method17100(local133, local5, Class519.anInt5283 * -359614695, 64, 768);
			@Pc(383) Class161 local383 = Class519.aClass161_58;
			synchronized (Class519.aClass161_58) {
				Class519.aClass161_58.method23222(local47, local38);
			}
		}
		@Pc(399) int local399 = arg6.method5363();
		@Pc(402) int local402 = arg6.method5358();
		@Pc(405) int local405 = arg6.method5450();
		@Pc(408) int local408 = arg6.method5362();
		if (arg11 == null) {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
		} else {
			local47 = local47.method5430((byte) 3, local5, true);
			local47.method5335(local402 - local399 >> 1, 128, local408 - local405 >> 1);
			local47.method5333(local399 + local402 >> 1, 0, local405 + local408 >> 1);
			arg11.method20077(local47);
		}
		if (arg2 != 0) {
			local47.method5331(arg2);
		}
		if (arg3 != 0) {
			local47.method5482(arg3);
		}
		if (arg4 != 0) {
			local47.method5333(0, arg4, 0);
		}
		return local47;
	}

	@OriginalMember(owner = "client!dt", name = "<init>", descriptor = "(IIIIIB)V", line = 23)
	Class135(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) byte arg5) {
		this.anInt3393 = arg0 * -1665533509;
		this.anInt3386 = arg1 * -836051989;
		this.anInt3387 = arg2 * 1378560575;
		this.anInt3388 = arg3 * 1345299659;
		this.anInt3389 = arg4 * -1541451759;
		this.aByte122 = arg5;
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(CI)Z", line = 28)
	static final boolean method22923(@OriginalArg(0) char arg0) {
		if (Character.isISOControl(arg0)) {
			return false;
		} else if (Exception_Sub5.method14670(arg0)) {
			return true;
		} else {
			@Pc(12) char[] local12 = Class632.aCharArray7;
			@Pc(14) int local14;
			@Pc(22) char local22;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			local12 = Class632.aCharArray8;
			for (local14 = 0; local14 < local12.length; local14++) {
				local22 = local12[local14];
				if (local22 == arg0) {
					return true;
				}
			}
			return false;
		}
	}

	@OriginalMember(owner = "client!dt", name = "p", descriptor = "(I)Lclient!kb;", line = 33)
	public Class271 method22912() {
		return Class298.method25629(this.anInt3393 * -1647516813);
	}

	@OriginalMember(owner = "client!dt", name = "l", descriptor = "()Lclient!kb;", line = 33)
	public Class271 method22913() {
		return Class298.method25629(this.anInt3393 * -1647516813);
	}

	@OriginalMember(owner = "client!dt", name = "g", descriptor = "()Lclient!kb;", line = 33)
	public Class271 method22915() {
		return Class298.method25629(this.anInt3393 * -1647516813);
	}

	@OriginalMember(owner = "client!dt", name = "a", descriptor = "(IIIII)Lclient!dt;", line = 37)
	Class135 method22914(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135(this.anInt3393 * -1647516813, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dt", name = "h", descriptor = "(IIII)Lclient!dt;", line = 37)
	Class135 method22916(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135(this.anInt3393 * -1647516813, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dt", name = "x", descriptor = "(IIII)Lclient!dt;", line = 37)
	Class135 method22917(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		return new Class135(this.anInt3393 * -1647516813, arg0, arg1, arg2, arg3, this.aByte122);
	}

	@OriginalMember(owner = "client!dt", name = "ac", descriptor = "(Lclient!de;IIIIILclient!dw;Lclient!yx;Ljava/lang/String;I)V", line = 1233)
	static void method22918(@OriginalArg(0) Class21 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class14 arg6, @OriginalArg(7) Class611 arg7, @OriginalArg(8) String arg8) {
		@Pc(9) int local9 = 255 - Class3_Sub23.anInt1294 * 1561819579 - Class250.anInt3818 * 565960411;
		if (local9 < 0) {
			local9 = 0;
		}
		if (Class456.aClass6_34 == null || Class250.aClass6_25 == null) {
			if (Class294.aClass359_54.method26674(Class26_Sub1_Sub2_Sub1.anInt1093 * -1799489661) && Class294.aClass359_54.method26674(Class43.anInt1086 * -769457771)) {
				Class456.aClass6_34 = arg0.method17089(Class137.method22938(Class294.aClass359_54, Class26_Sub1_Sub2_Sub1.anInt1093 * -1799489661, 0), true);
				@Pc(48) Class15 local48 = Class137.method22938(Class294.aClass359_54, Class43.anInt1086 * -769457771, 0);
				Class250.aClass6_25 = arg0.method17089(local48, true);
				local48.method3445();
				Class533.aClass6_35 = arg0.method17089(local48, true);
			} else {
				arg0.method17050(arg1, arg2, arg3, arg5, local9 << 24 | anInt3398 * -1891239097, 1);
			}
		}
		if (Class456.aClass6_34 != null && Class250.aClass6_25 != null) {
			@Pc(91) int local91 = (arg3 - Class250.aClass6_25.method16782() * 2) / Class456.aClass6_34.method16782();
			for (@Pc(93) int local93 = 0; local93 < local91; local93++) {
				Class456.aClass6_34.method16783(arg1 + Class250.aClass6_25.method16782() + local93 * Class456.aClass6_34.method16782(), arg2);
			}
			Class250.aClass6_25.method16783(arg1, arg2);
			Class533.aClass6_35.method16783(arg3 + arg1 - Class533.aClass6_35.method16782(), arg2);
		}
		arg6.method3329(arg8, arg1 + 3, arg2 + arg7.anInt5537 * -1760037867 + (20 - arg7.anInt5537 * -1760037867) / 2, Class539.anInt5324 * -546648355 | 0xFF000000, -1);
		arg0.method17050(arg1, arg5 + arg2, arg3, arg4 - arg5, local9 << 24 | anInt3398 * -1891239097, 1);
	}

	@OriginalMember(owner = "client!dt", name = "gx", descriptor = "(II)V", line = 3392)
	static final void method22924(@OriginalArg(0) int arg0) {
		@Pc(5) int local5 = client.anInt3034 - client.anInt3165 * -498100181;
		if (local5 >= 100) {
			Class72.anInt2086 = Class205.method24189() * 224556581;
			Class47.anInt1011 = -1801069635;
			Class449.anInt5013 = 2127832081;
			return;
		}
		@Pc(35) float local35 = 1.0F - (float) ((100 - local5) * (100 - local5) * (100 - local5)) / 1000000.0F;
		@Pc(188) int local188;
		if (Class205.method24189() == 3) {
			@Pc(45) Class3_Sub32 local45 = Class80.aClass23_Sub1_1.method5827().method16428();
			@Pc(49) Class464 local49 = client.aClass370_1.method26942();
			Class30.anInt2350 = ((int) ((double) Class80.aClass23_Sub1_1.method5835() * 2607.5945876176133D) & 0x3FFF) * 1250124359;
			Class3_Sub35_Sub1.anInt2644 = ((int) ((double) Class80.aClass23_Sub1_1.method5836() * -2607.5945876176133D) & 0x3FFF) * 1729985211;
			Class150.anInt3437 = 0;
			client.anInt3171 = (int) ((float) (Class404.anInt4809 * 1297701465) + (float) ((int) ((double) (client.anInt3169 * -1579786087) / (Math.tan((double) (Class80.aClass23_Sub1_1.method5886() / 2.0F)) * 4.0D)) - Class404.anInt4809 * 1297701465) * local35) * 1925140967;
			Class586.anInt5460 = (int) ((float) (Class36_Sub2.anInt886 * 1715151307) + local35 * (float) (local45.anInt1343 * 2061226997 - local49.anInt5071 * 439329280 - Class36_Sub2.anInt886 * 1715151307)) * 1317181071;
			Class140.anInt3424 = (int) (local35 * (float) (-(local45.anInt1345 * -799586411) - Class3_Sub27.anInt1312 * -738353445) + (float) (Class3_Sub27.anInt1312 * -738353445)) * -1930901799;
			Class149.anInt3434 = (int) ((float) (Class462.anInt5068 * -326506023) + (float) (local45.anInt1344 * 615450365 - local49.anInt5073 * 625123840 - Class462.anInt5068 * -326506023) * local35) * 1723080977;
			local188 = -(Class3_Sub35_Sub1.anInt2644 * -446514573) - Class44.anInt2202 * 887699401 & 0x3FFF;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		} else {
			@Pc(201) int local201 = (int) client.aFloat237;
			if (client.anInt3090 * -1278643255 >> 8 > local201) {
				local201 = client.anInt3090 * -1278643255 >> 8;
			}
			if (client.aBooleanArray22[4] && client.anIntArray291[4] + 128 > local201) {
				local201 = client.anIntArray291[4] + 128;
			}
			@Pc(240) int local240 = (int) client.aFloat238 + client.anInt3079 * -872004161 & 0x3FFF;
			@Pc(244) Class320 local244 = Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.method21431().aClass320_61;
			Class412.method27703(Class403.anInt4808 * 110680385, Class186.method23926((int) local244.aFloat259, (int) local244.aFloat261, Class141.anInt3427 * 1197232991) - client.anInt3089 * 1439269037, Class48.anInt1088 * 1640811813, local201, local240, (local201 >> 3) * 3 + 600 << 2, arg0);
			Class586.anInt5460 = (int) ((float) (Class36_Sub2.anInt886 * 1715151307) + (float) (Class586.anInt5460 * -1129330577 - Class36_Sub2.anInt886 * 1715151307) * local35) * 1317181071;
			Class140.anInt3424 = (int) ((float) (Class140.anInt3424 * 1701665129 - -738353445 * Class3_Sub27.anInt1312) * local35 + (float) (-738353445 * Class3_Sub27.anInt1312)) * -1930901799;
			Class149.anInt3434 = (int) ((float) (Class462.anInt5068 * -326506023) + local35 * (float) (Class149.anInt3434 * -324079631 - Class462.anInt5068 * -326506023)) * 1723080977;
			Class30.anInt2350 = (int) ((float) (Class542.anInt5325 * -49948327) + local35 * (float) (Class30.anInt2350 * 1495770999 - Class542.anInt5325 * -49948327)) * 1250124359;
			local188 = Class3_Sub35_Sub1.anInt2644 * -446514573 - Class44.anInt2202 * 887699401;
			if (local188 > 8192) {
				local188 -= 16384;
			} else if (local188 < -8192) {
				local188 += 16384;
			}
		}
		Class3_Sub35_Sub1.anInt2644 = (int) ((float) local188 * local35 + (float) (Class44.anInt2202 * 887699401)) * 1729985211;
		Class3_Sub35_Sub1.anInt2644 = (Class3_Sub35_Sub1.anInt2644 * -446514573 & 0x3FFF) * 1729985211;
		client.anInt3171 = (int) (local35 * (float) (client.anInt3171 * -845991465 - Class404.anInt4809 * 1297701465) + (float) (Class404.anInt4809 * 1297701465)) * 1925140967;
	}

	@OriginalMember(owner = "client!dt", name = "do", descriptor = "(Lclient!vs;I)V", line = 4758)
	static final void method22920(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class277.method25402(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!dt", name = "aeg", descriptor = "(Lclient!vs;B)V", line = 9619)
	static final void method22921(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 312124549;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class206.method24216(local13);
	}

	@OriginalMember(owner = "client!dt", name = "aqh", descriptor = "(Lclient!vs;I)V", line = 11889)
	static final void method22926(@OriginalArg(0) Class536 arg0) {
		Class342.method26473();
	}

	@OriginalMember(owner = "client!dt", name = "aqy", descriptor = "(Lclient!vs;B)V", line = 11937)
	static final void method22922(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		if (Class178.aClass186Array1[local12] == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class178.aClass186Array1[local12].aClass178Array8.length;
		}
	}

	@OriginalMember(owner = "client!dt", name = "atx", descriptor = "(Lclient!vs;B)V", line = 12467)
	static final void method22925(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub8_1.method14599(local12);
	}
}
