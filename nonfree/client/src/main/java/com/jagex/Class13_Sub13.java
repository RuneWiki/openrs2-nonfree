package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acm")
public class Class13_Sub13 extends Class13 {

	@OriginalMember(owner = "client!acm", name = "u", descriptor = "Lclient!wm;")
	static Class555 aClass555_1;

	@OriginalMember(owner = "client!acm", name = "a", descriptor = "I")
	final int anInt644;

	@OriginalMember(owner = "client!acm", name = "g", descriptor = "I")
	final int anInt643;

	@OriginalMember(owner = "client!acm", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 11)
	Class13_Sub13(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt644 = arg0.method20271() * -467946333;
		this.anInt643 = arg0.method20269() * -253015387;
	}

	@OriginalMember(owner = "client!acm", name = "h", descriptor = "()V", line = 17)
	@Override
	public void method16896() {
		Class510.aClass183_1.method23600(this.anInt644 * 130719499, this.anInt643 * -390361811);
	}

	@OriginalMember(owner = "client!acm", name = "a", descriptor = "(I)V", line = 17)
	@Override
	public void method16888() {
		Class510.aClass183_1.method23600(this.anInt644 * 130719499, this.anInt643 * -390361811);
	}

	@OriginalMember(owner = "client!acm", name = "gr", descriptor = "(B)V", line = 3319)
	static final void method6522() {
		@Pc(5) int local5 = Class272.anInt4297 * 1425243648 + 256;
		@Pc(11) int local11 = Class177.anInt3473 * -1766019584 + 256;
		@Pc(23) int local23 = Class186.method23926(local5, local11, Class141.anInt3427 * 1197232991) - Class225.anInt3732 * 771787247;
		if (Class476.anInt5134 * -260346047 >= 100) {
			Class586.anInt5460 = Class272.anInt4297 * 467100160 + -2104062208;
			Class149.anInt3434 = Class177.anInt3473 * -1393193472 + -1272901376;
			Class140.anInt3424 = (Class186.method23926(Class586.anInt5460 * -1129330577, Class149.anInt3434 * -324079631, Class141.anInt3427 * 1197232991) - Class225.anInt3732 * 771787247) * -1930901799;
		} else {
			if (Class586.anInt5460 * -1129330577 < local5) {
				Class586.anInt5460 += (Class370.anInt4674 * -61917517 + (local5 - Class586.anInt5460 * -1129330577) * -260346047 * Class476.anInt5134 / 1000) * 1317181071;
				if (Class586.anInt5460 * -1129330577 > local5) {
					Class586.anInt5460 = local5 * 1317181071;
				}
			}
			if (Class586.anInt5460 * -1129330577 > local5) {
				Class586.anInt5460 -= (Class370.anInt4674 * -61917517 + Class476.anInt5134 * -260346047 * (Class586.anInt5460 * -1129330577 - local5) / 1000) * 1317181071;
				if (Class586.anInt5460 * -1129330577 < local5) {
					Class586.anInt5460 = local5 * 1317181071;
				}
			}
			if (Class140.anInt3424 * 1701665129 < local23) {
				Class140.anInt3424 += (Class370.anInt4674 * -61917517 + -260346047 * Class476.anInt5134 * (local23 - Class140.anInt3424 * 1701665129) / 1000) * -1930901799;
				if (Class140.anInt3424 * 1701665129 > local23) {
					Class140.anInt3424 = local23 * -1930901799;
				}
			}
			if (Class140.anInt3424 * 1701665129 > local23) {
				Class140.anInt3424 -= (-61917517 * Class370.anInt4674 + Class476.anInt5134 * -260346047 * (Class140.anInt3424 * 1701665129 - local23) / 1000) * -1930901799;
				if (Class140.anInt3424 * 1701665129 < local23) {
					Class140.anInt3424 = local23 * -1930901799;
				}
			}
			if (Class149.anInt3434 * -324079631 < local11) {
				Class149.anInt3434 += (Class370.anInt4674 * -61917517 + (local11 - Class149.anInt3434 * -324079631) * Class476.anInt5134 * -260346047 / 1000) * 1723080977;
				if (Class149.anInt3434 * -324079631 > local11) {
					Class149.anInt3434 = local11 * 1723080977;
				}
			}
			if (Class149.anInt3434 * -324079631 > local11) {
				Class149.anInt3434 -= (Class476.anInt5134 * -260346047 * (Class149.anInt3434 * -324079631 - local11) / 1000 + Class370.anInt4674 * -61917517) * 1723080977;
				if (Class149.anInt3434 * -324079631 < local11) {
					Class149.anInt3434 = local11 * 1723080977;
				}
			}
		}
		local5 = Class346.anInt4621 * 369843712 + 256;
		local11 = Class309.anInt4525 * -1223866880 + 256;
		local23 = Class186.method23926(local5, local11, Class141.anInt3427 * 1197232991) - Class316.anInt4548 * -616425307;
		@Pc(293) int local293 = local5 - Class586.anInt5460 * -1129330577;
		@Pc(299) int local299 = local23 - Class140.anInt3424 * 1701665129;
		@Pc(305) int local305 = local11 - Class149.anInt3434 * -324079631;
		@Pc(316) int local316 = (int) Math.sqrt((double) (local305 * local305 + local293 * local293));
		@Pc(327) int local327 = (int) (Math.atan2((double) local299, (double) local316) * 2607.5945876176133D) & 0x3FFF;
		@Pc(338) int local338 = (int) (Math.atan2((double) local293, (double) local305) * -2607.5945876176133D) & 0x3FFF;
		if (local327 < 1024) {
			local327 = 1024;
		}
		if (local327 > 3072) {
			local327 = 3072;
		}
		if (Class30.anInt2350 * 1495770999 < local327) {
			Class30.anInt2350 += (Class60_Sub10.anInt1865 * -1274068291 + Class117.anInt3204 * -616497789 * (local327 - Class30.anInt2350 * 1495770999 >> 3) / 1000 << 3) * 1250124359;
			if (Class30.anInt2350 * 1495770999 > local327) {
				Class30.anInt2350 = local327 * 1250124359;
			}
		}
		if (Class30.anInt2350 * 1495770999 > local327) {
			Class30.anInt2350 -= (Class117.anInt3204 * -616497789 * (Class30.anInt2350 * 1495770999 - local327 >> 3) / 1000 + Class60_Sub10.anInt1865 * -1274068291 << 3) * 1250124359;
			if (Class30.anInt2350 * 1495770999 < local327) {
				Class30.anInt2350 = local327 * 1250124359;
			}
		}
		@Pc(430) int local430 = local338 - Class3_Sub35_Sub1.anInt2644 * -446514573;
		if (local430 > 8192) {
			local430 -= 16384;
		}
		if (local430 < -8192) {
			local430 += 16384;
		}
		local430 >>= 0x3;
		if (local430 > 0) {
			Class3_Sub35_Sub1.anInt2644 += (Class60_Sub10.anInt1865 * -1274068291 + local430 * Class117.anInt3204 * -616497789 / 1000 << 3) * 1729985211;
			Class3_Sub35_Sub1.anInt2644 = (Class3_Sub35_Sub1.anInt2644 * -446514573 & 0x3FFF) * 1729985211;
		}
		if (local430 < 0) {
			Class3_Sub35_Sub1.anInt2644 -= (Class60_Sub10.anInt1865 * -1274068291 + -local430 * Class117.anInt3204 * -616497789 / 1000 << 3) * 1729985211;
			Class3_Sub35_Sub1.anInt2644 = (Class3_Sub35_Sub1.anInt2644 * -446514573 & 0x3FFF) * 1729985211;
		}
		@Pc(505) int local505 = local338 - Class3_Sub35_Sub1.anInt2644 * -446514573;
		if (local505 > 8192) {
			local505 -= 16384;
		}
		if (local505 < -8192) {
			local505 += 16384;
		}
		if (local505 < 0 && local430 > 0 || local505 > 0 && local430 < 0) {
			Class3_Sub35_Sub1.anInt2644 = local338 * 1729985211;
		}
		Class150.anInt3437 = 0;
	}

	@OriginalMember(owner = "client!acm", name = "abg", descriptor = "(Lclient!vs;I)V", line = 8906)
	static final void method6521(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class515.anIntArray490[local12 & 0xFFFF];
	}
}
