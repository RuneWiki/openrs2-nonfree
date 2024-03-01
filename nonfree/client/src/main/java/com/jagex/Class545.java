package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wb")
public class Class545 {

	@OriginalMember(owner = "client!wb", name = "nq", descriptor = "J")
	public static long aLong284;

	@OriginalMember(owner = "client!wb", name = "<init>", descriptor = "()V", line = 4)
	Class545() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!wb", name = "g", descriptor = "([B)[B", line = 9)
	public static byte[] method32612(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(8) byte[] local8 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local8, 0, arg0.length);
			return local8;
		}
	}

	@OriginalMember(owner = "client!wb", name = "l", descriptor = "([B)[B", line = 9)
	public static byte[] method32613(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(8) byte[] local8 = new byte[arg0.length];
			System.arraycopy(arg0, 0, local8, 0, arg0.length);
			return local8;
		}
	}

	@OriginalMember(owner = "client!wb", name = "h", descriptor = "([S)[S", line = 16)
	public static short[] method32614(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!wb", name = "x", descriptor = "([S)[S", line = 16)
	public static short[] method32615(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!wb", name = "s", descriptor = "([S)[S", line = 16)
	public static short[] method32616(@OriginalArg(0) short[] arg0) {
		if (arg0 == null) {
			return null;
		} else {
			@Pc(7) short[] local7 = new short[arg0.length];
			System.arraycopy(arg0, 0, local7, 0, arg0.length);
			return local7;
		}
	}

	@OriginalMember(owner = "client!wb", name = "hk", descriptor = "(IIIIII)V", line = 3614)
	public static final void method32618(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		Class346.anInt4621 = arg0 * -1684442801;
		Class309.anInt4525 = arg1 * -1799856885;
		Class316.anInt4548 = arg2 * 1798311725;
		Class60_Sub10.anInt1865 = arg3 * 1137526933;
		Class117.anInt3204 = arg4 * -1247020757;
		if (Class72.anInt2086 * 81180077 == 3) {
			Class324.method25999();
		}
		if (Class117.anInt3204 * -616497789 >= 100) {
			@Pc(37) int local37 = Class346.anInt4621 * 369843712 + 256;
			@Pc(43) int local43 = Class309.anInt4525 * -1223866880 + 256;
			@Pc(55) int local55 = Class186.method23926(local37, local43, Class141.anInt3427 * 1197232991) - Class316.anInt4548 * -616425307;
			@Pc(61) int local61 = local37 - Class586.anInt5460 * -1129330577;
			@Pc(67) int local67 = local55 - Class140.anInt3424 * 1701665129;
			@Pc(73) int local73 = local43 - Class149.anInt3434 * -324079631;
			@Pc(84) int local84 = (int) Math.sqrt((double) (local61 * local61 + local73 * local73));
			Class30.anInt2350 = ((int) (Math.atan2((double) local67, (double) local84) * 2607.5945876176133D) & 0x3FFF) * 1250124359;
			Class3_Sub35_Sub1.anInt2644 = ((int) (Math.atan2((double) local61, (double) local73) * -2607.5945876176133D) & 0x3FFF) * 1729985211;
			Class150.anInt3437 = 0;
			if (Class30.anInt2350 * 1495770999 < 1024) {
				Class30.anInt2350 = 227089408;
			}
			if (Class30.anInt2350 * 1495770999 > 3072) {
				Class30.anInt2350 = 681268224;
			}
		}
		Class72.anInt2086 = 449113162;
		Class47.anInt1011 = -1801069635;
		Class449.anInt5013 = 2127832081;
	}

	@OriginalMember(owner = "client!wb", name = "ln", descriptor = "(Lclient!vs;I)V", line = 6239)
	static final void method32617(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class371.method27200(local16, local22, arg0);
	}
}
