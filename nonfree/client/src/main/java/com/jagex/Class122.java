package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!cx")
public class Class122 implements Interface56 {

	@OriginalMember(owner = "client!cx", name = "p", descriptor = "Lclient!cx;")
	static final Class122 aClass122_2 = new Class122(2, 1);

	@OriginalMember(owner = "client!cx", name = "a", descriptor = "Lclient!cx;")
	static final Class122 aClass122_1 = new Class122(6, 2);

	@OriginalMember(owner = "client!cx", name = "g", descriptor = "Lclient!cx;")
	static final Class122 aClass122_3 = new Class122(5, 3);

	@OriginalMember(owner = "client!cx", name = "l", descriptor = "Lclient!cx;")
	static final Class122 aClass122_4 = new Class122(1, 4);

	@OriginalMember(owner = "client!cx", name = "h", descriptor = "Lclient!cx;")
	static final Class122 aClass122_5 = new Class122(0, 5);

	@OriginalMember(owner = "client!cx", name = "x", descriptor = "Lclient!cx;")
	static final Class122 aClass122_7 = new Class122(4, 6);

	@OriginalMember(owner = "client!cx", name = "s", descriptor = "Lclient!cx;")
	static final Class122 aClass122_6 = new Class122(3, 7);

	@OriginalMember(owner = "client!cx", name = "u", descriptor = "I")
	final int anInt3212;

	@OriginalMember(owner = "client!cx", name = "y", descriptor = "I")
	final int anInt3213;

	@OriginalMember(owner = "client!cx", name = "g", descriptor = "()[Lclient!cx;", line = 19)
	static Class122[] method22833() {
		return new Class122[] { aClass122_1, aClass122_4, aClass122_2, aClass122_6, aClass122_7, aClass122_5, aClass122_3 };
	}

	@OriginalMember(owner = "client!cx", name = "<init>", descriptor = "(II)V", line = 22)
	Class122(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3212 = arg0 * 1117492591;
		this.anInt3213 = arg1 * 298745783;
	}

	@OriginalMember(owner = "client!cx", name = "x", descriptor = "()I", line = 28)
	@Override
	public int method33764() {
		return this.anInt3213 * 1972735495;
	}

	@OriginalMember(owner = "client!cx", name = "a", descriptor = "(I)I", line = 28)
	@Override
	public int method33765() {
		return this.anInt3213 * 1972735495;
	}

	@OriginalMember(owner = "client!cx", name = "h", descriptor = "()I", line = 28)
	@Override
	public int method33766() {
		return this.anInt3213 * 1972735495;
	}

	@OriginalMember(owner = "client!cx", name = "l", descriptor = "()I", line = 28)
	@Override
	public int method33767() {
		return this.anInt3213 * 1972735495;
	}

	@OriginalMember(owner = "client!cx", name = "g", descriptor = "([BIII)Ljava/lang/String;", line = 42)
	public static String method22834(@OriginalArg(0) byte[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(2) char[] local2 = new char[arg2];
		@Pc(4) int local4 = 0;
		@Pc(6) int local6 = arg1;
		@Pc(10) int local10 = arg1 + arg2;
		while (local6 < local10) {
			@Pc(20) int local20 = arg0[local6++] & 0xFF;
			@Pc(27) int local27;
			if (local20 < 128) {
				if (local20 == 0) {
					local27 = 65533;
				} else {
					local27 = local20;
				}
			} else if (local20 < 192) {
				local27 = 65533;
			} else if (local20 < 224) {
				if (local6 < local10 && (arg0[local6] & 0xC0) == 128) {
					local27 = (local20 & 0x1F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 128) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 < 240) {
				if (local6 + 1 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128) {
					local27 = (local20 & 0xF) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
					if (local27 < 2048) {
						local27 = 65533;
					}
				} else {
					local27 = 65533;
				}
			} else if (local20 >= 248) {
				local27 = 65533;
			} else if (local6 + 2 < local10 && (arg0[local6] & 0xC0) == 128 && (arg0[local6 + 1] & 0xC0) == 128 && (arg0[local6 + 2] & 0xC0) == 128) {
				local27 = (local20 & 0x7) << 18 | (arg0[local6++] & 0x3F) << 12 | (arg0[local6++] & 0x3F) << 6 | arg0[local6++] & 0x3F;
				if (local27 >= 65536 && local27 <= 1114111) {
					local27 = 65533;
				} else {
					local27 = 65533;
				}
			} else {
				local27 = 65533;
			}
			local2[local4++] = (char) local27;
		}
		return new String(local2, 0, local4);
	}

	@OriginalMember(owner = "client!cx", name = "p", descriptor = "(Lclient!ny;I)V", line = 95)
	public static void method22838(@OriginalArg(0) Class359 arg0) {
		Class271.aClass359_50 = arg0;
	}

	@OriginalMember(owner = "client!cx", name = "cm", descriptor = "(Lclient!vs;I)V", line = 4400)
	static final void method22835(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class245.method24865(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!cx", name = "aea", descriptor = "(Lclient!vs;I)V", line = 9755)
	static final void method22836(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		if (local23 == -1) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class13_Sub23.aClass343_1.method26476(local13).method19326((char) local23);
		}
	}

	@OriginalMember(owner = "client!cx", name = "agx", descriptor = "(Lclient!vs;I)V", line = 9980)
	static final void method22837(@OriginalArg(0) Class536 arg0) {
		@Pc(2) Class3_Sub26 local2 = Class343.method26480();
		if (local2 == null) {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = -1;
		} else {
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local2.anInt1304 * 1865552421;
			@Pc(77) int local77 = local2.anInt1307 * 940032479 << 28 | Class58.anInt1429 + local2.anInt1303 * -582755297 << 14 | Class58.anInt1406 + local2.anInt1306 * 1667122095;
			arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local77;
		}
	}
}
