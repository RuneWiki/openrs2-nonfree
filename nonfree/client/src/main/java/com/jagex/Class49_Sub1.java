package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aer")
public class Class49_Sub1 extends Class49 {

	@OriginalMember(owner = "client!aer", name = "x", descriptor = "I")
	public final int anInt1020;

	@OriginalMember(owner = "client!aer", name = "<init>", descriptor = "(ILclient!kh;Lclient!kg;III)V", line = 9)
	Class49_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class277 arg1, @OriginalArg(2) Class276 arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		super(arg0, arg1, arg2, arg3, arg4);
		this.anInt1020 = arg5 * 623409821;
	}

	@OriginalMember(owner = "client!aer", name = "u", descriptor = "(Lclient!ahb;)Lclient!kt;", line = 14)
	public static Class49 method9256(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class49 local3 = Class561.method32865(arg0);
		@Pc(7) int local7 = arg0.method20274();
		return new Class49_Sub1(local3.anInt1017 * 1948455005, local3.aClass277_6, local3.aClass276_6, local3.anInt1018 * -1445052455, local3.anInt1019 * -1782123231, local7);
	}

	@OriginalMember(owner = "client!aer", name = "s", descriptor = "(Lclient!ahb;)Lclient!kt;", line = 14)
	public static Class49 method9257(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class49 local3 = Class561.method32865(arg0);
		@Pc(7) int local7 = arg0.method20274();
		return new Class49_Sub1(local3.anInt1017 * 1948455005, local3.aClass277_6, local3.aClass276_6, local3.anInt1018 * -1445052455, local3.anInt1019 * -1782123231, local7);
	}

	@OriginalMember(owner = "client!aer", name = "g", descriptor = "()Lclient!ke;", line = 20)
	@Override
	public Class274 method25539() {
		return Class274.aClass274_6;
	}

	@OriginalMember(owner = "client!aer", name = "a", descriptor = "(I)Lclient!ke;", line = 20)
	@Override
	public Class274 method25540() {
		return Class274.aClass274_6;
	}

	@OriginalMember(owner = "client!aer", name = "z", descriptor = "(B)Lclient!yx;", line = 466)
	static Class611 method9259() {
		@Pc(8) Class611 local8;
		if (!Class250.aBoolean689) {
			local8 = Class224.aClass611_8;
		} else if (Class60_Sub24.aClass14_6 == null || Class462.aClass611_11 == null) {
			local8 = Class224.aClass611_8;
		} else {
			local8 = Class462.aClass611_11;
		}
		Class250.anInt3804 = local8.anInt5536 * -603657401 + local8.anInt5537 * 1808004569;
		return local8;
	}

	@OriginalMember(owner = "client!aer", name = "aej", descriptor = "(Lclient!vs;I)V", line = 9790)
	static final void method9258(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		@Pc(38) Class3_Sub1_Sub13 local38 = Class622.aClass580_2.method33211(local13);
		if (local38.method19280(local23).anInt5248 * 1303174509 != 0) {
			throw new RuntimeException("");
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local38.method19281(local23, local33);
	}
}
