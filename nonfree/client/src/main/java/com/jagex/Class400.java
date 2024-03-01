package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!px")
public class Class400 implements Interface48 {

	@OriginalMember(owner = "client!px", name = "x", descriptor = "I")
	public static int anInt4803;

	@OriginalMember(owner = "client!px", name = "fq", descriptor = "Lclient!ny;")
	public static Class359 aClass359_64;

	@OriginalMember(owner = "client!px", name = "p", descriptor = "Lclient!aoz;")
	final Class26_Sub1_Sub1_Sub6 aClass26_Sub1_Sub1_Sub6_1;

	@OriginalMember(owner = "client!px", name = "p", descriptor = "(I)[Lclient!kg;", line = 12)
	public static Class276[] method27575() {
		return new Class276[] { Class276.aClass276_10, Class276.aClass276_9, Class276.aClass276_11 };
	}

	@OriginalMember(owner = "client!px", name = "<init>", descriptor = "(Lclient!aoz;)V", line = 119)
	Class400(@OriginalArg(0) Class26_Sub1_Sub1_Sub6 arg0) {
		this.aClass26_Sub1_Sub1_Sub6_1 = arg0;
	}

	@OriginalMember(owner = "client!px", name = "a", descriptor = "(Lclient!ano;)Z", line = 124)
	@Override
	public boolean method33352(@OriginalArg(0) Class26_Sub1_Sub1 arg0) {
		return arg0 == this.aClass26_Sub1_Sub1_Sub6_1;
	}

	@OriginalMember(owner = "client!px", name = "p", descriptor = "(Lclient!ano;S)Z", line = 124)
	@Override
	public boolean method33353(@OriginalArg(0) Class26_Sub1_Sub1 arg0) {
		return arg0 == this.aClass26_Sub1_Sub1_Sub6_1;
	}

	@OriginalMember(owner = "client!px", name = "kk", descriptor = "(Lclient!fo;IIILclient!vs;I)V", line = 5968)
	static final void method27574(@OriginalArg(0) Class178 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class536 arg4) {
		if (arg0.anIntArray364 == null) {
			throw new RuntimeException();
		}
		arg0.anIntArray364[arg1] = arg2;
		arg0.anIntArray361[arg1] = arg3;
	}

	@OriginalMember(owner = "client!px", name = "yz", descriptor = "(Lclient!vs;I)V", line = 8487)
	static final void method27576(@OriginalArg(0) Class536 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray42[(arg0.anInt5315 -= 790013775) * 996806575];
		if (local13.startsWith(Class301.method25664(0)) || local13.startsWith(Class301.method25664(1))) {
			local13 = local13.substring(7);
		}
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class470.method28766(local13);
	}
}
