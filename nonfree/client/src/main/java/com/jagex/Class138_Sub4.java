package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aiu")
final class Class138_Sub4 extends Class138 {

	@OriginalMember(owner = "client!aiu", name = "e", descriptor = "(II)Lclient!jf;", line = 14)
	static Class359 method11517(@OriginalArg(0) int arg0) {
		if (arg0 == Class359.aClass359_3.anInt4568 * 106242889) {
			return Class359.aClass359_3;
		} else if (arg0 == Class359.aClass359_5.anInt4568 * 106242889) {
			return Class359.aClass359_5;
		} else if (arg0 == Class359.aClass359_4.anInt4568 * 106242889) {
			return Class359.aClass359_4;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!aiu", name = "<init>", descriptor = "(Lclient!xq;IZZ)V", line = 35)
	Class138_Sub4(@OriginalArg(0) Class667 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2, @OriginalArg(3) boolean arg3) {
		super(arg0, arg1, arg2, arg3, (Class138_Sub1) null);
	}

	@OriginalMember(owner = "client!aiu", name = "l", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 37)
	@Override
	Object method11524(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_88 || arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!aiu", name = "w", descriptor = "(Lclient!ec;I)Ljava/lang/Object;", line = 37)
	@Override
	Object method11522(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_88 || arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!aiu", name = "u", descriptor = "(Lclient!ec;)Ljava/lang/Object;", line = 37)
	@Override
	Object method11523(@OriginalArg(0) Class108 arg0) {
		return arg0.aClass519_6 == Class519.aClass519_88 || arg0.aClass519_6 == Class519.aClass519_8 ? -1 : arg0.aClass519_6.method30317();
	}

	@OriginalMember(owner = "client!aiu", name = "gy", descriptor = "(Lclient!hf;Lclient!hq;Lclient!yf;I)V", line = 6081)
	static final void method11516(@OriginalArg(0) Class312 arg0, @OriginalArg(1) Class320 arg1, @OriginalArg(2) Class681 arg2) {
		arg2.anInt5891 -= -725861497;
		@Pc(13) int local13 = arg2.anIntArray519[arg2.anInt5891 * -1497248091];
		@Pc(24) short local24 = (short) arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 1];
		@Pc(35) short local35 = (short) arg2.anIntArray519[arg2.anInt5891 * -1497248091 + 2];
		if (local13 < 0 || local13 >= 5) {
			return;
		}
		arg0.method26901(local13, local24, local35);
		Class354.method27696(arg0);
		if (arg0.anInt3970 * 532402067 == -1 && !arg1.aBoolean708) {
			Class225.method25605(arg0.anInt3953 * -1549590237, local13);
		}
	}
}
