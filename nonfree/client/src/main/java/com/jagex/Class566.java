package com.jagex;

import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!wy")
public class Class566 {

	@OriginalMember(owner = "client!wy", name = "p", descriptor = "Lclient!wy;")
	static final Class566 aClass566_2 = new Class566(0);

	@OriginalMember(owner = "client!wy", name = "a", descriptor = "Lclient!wy;")
	public static final Class566 aClass566_3 = new Class566(1);

	@OriginalMember(owner = "client!wy", name = "g", descriptor = "Lclient!wy;")
	static final Class566 aClass566_4 = new Class566(2);

	@OriginalMember(owner = "client!wy", name = "l", descriptor = "I")
	public final int anInt5371;

	@OriginalMember(owner = "client!wy", name = "g", descriptor = "()[Lclient!wy;", line = 11)
	static Class566[] method32915() {
		return new Class566[] { aClass566_4, aClass566_2, aClass566_3 };
	}

	@OriginalMember(owner = "client!wy", name = "l", descriptor = "()[Lclient!wy;", line = 11)
	static Class566[] method32916() {
		return new Class566[] { aClass566_4, aClass566_2, aClass566_3 };
	}

	@OriginalMember(owner = "client!wy", name = "h", descriptor = "()[Lclient!wy;", line = 11)
	static Class566[] method32917() {
		return new Class566[] { aClass566_4, aClass566_2, aClass566_3 };
	}

	@OriginalMember(owner = "client!wy", name = "p", descriptor = "(II)Lclient!hi;", line = 13)
	public static Class223 method32919(@OriginalArg(0) int arg0) {
		if (Class223.aClass223_1.anInt3731 * 228292035 == arg0) {
			return Class223.aClass223_1;
		} else if (arg0 == Class223.aClass223_2.anInt3731 * 228292035) {
			return Class223.aClass223_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!wy", name = "<init>", descriptor = "(I)V", line = 14)
	Class566(@OriginalArg(0) int arg0) {
		this.anInt5371 = arg0 * 1200567205;
	}

	@OriginalMember(owner = "client!wy", name = "x", descriptor = "(I)Lclient!wy;", line = 20)
	public static Class566 method32918(@OriginalArg(0) int arg0) {
		@Pc(2) Class566[] local2 = Exception_Sub5.method14671();
		for (@Pc(4) int local4 = 0; local4 < local2.length; local4++) {
			@Pc(12) Class566 local12 = local2[local4];
			if (local12.anInt5371 * 1519418413 == arg0) {
				return local12;
			}
		}
		return null;
	}

	@OriginalMember(owner = "client!wy", name = "e", descriptor = "(I)Z", line = 202)
	static boolean method32921() {
		Class190.anInt3670 = 860545150;
		Class615.aClass82_3 = client.aClass82_1;
		if (client.aByteArray57 != null) {
			@Pc(11) Class3_Sub41 local11 = new Class3_Sub41(client.aByteArray57);
			Class190.aLong241 = local11.method20371() * 8189732161531925055L;
			Class190.aLong242 = local11.method20371() * 2016401035969746977L;
		}
		if (Class190.aLong241 * -7592338111309603393L < 0L) {
			Class43.method9493(35);
			return false;
		} else {
			return Class65.method13153(false, true, "", "", Class190.aLong241 * -7592338111309603393L);
		}
	}

	@OriginalMember(owner = "client!wy", name = "fw", descriptor = "(IIIIZS)V", line = 2179)
	static void method32920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		if (Class552.aBoolean823 && Class350.aFrame3 != null && (arg1 != 3 || Class76.anInt2902 * 380872341 != arg2 || arg3 != Class219.anInt3728 * -668175823)) {
			Class283.method25453(Class3_Sub24_Sub9.aClass556_1, Class350.aFrame3);
			Class350.aFrame3 = null;
		}
		if (Class552.aBoolean823 && arg1 == 3 && Class350.aFrame3 == null) {
			Class350.aFrame3 = Class363.method26781(Class3_Sub24_Sub9.aClass556_1, arg2, arg3, 0, 0);
			if (Class350.aFrame3 != null) {
				Class76.anInt2902 = arg2 * -902236995;
				Class219.anInt3728 = arg3 * -291789103;
				Class26_Sub1_Sub1_Sub1.method16728();
			}
		}
		if (arg1 == 3 && (!Class552.aBoolean823 || Class350.aFrame3 == null)) {
			method32920(arg0, Class510.aClass3_Sub45_37.aClass60_Sub11_1.method13403(), -1, -1, true);
			return;
		}
		@Pc(71) Container local71 = Class3_Sub45.method13019();
		@Pc(87) Insets local87;
		if (Class350.aFrame3 != null) {
			client.anInt3026 = arg2 * -1727552665;
			Class613.anInt5546 = arg3 * 744274357;
		} else if (Class212.aFrame2 == null) {
			client.anInt3026 = local71.getSize().width * -1727552665;
			Class613.anInt5546 = local71.getSize().height * 744274357;
		} else {
			local87 = Class212.aFrame2.getInsets();
			@Pc(95) int local95 = local87.right + local87.left;
			client.anInt3026 = (Class212.aFrame2.getSize().width - local95) * -1727552665;
			@Pc(107) int local107 = local87.top + local87.bottom;
			Class613.anInt5546 = (Class212.aFrame2.getSize().height - local107) * 744274357;
		}
		if (client.anInt3026 * -2098608041 <= 0) {
			client.anInt3026 = -1727552665;
		}
		if (Class613.anInt5546 * -457495395 <= 0) {
			Class613.anInt5546 = 744274357;
		}
		if (arg1 == 1) {
			Class128.anInt3317 = client.anInt3032 * -2139987369;
			client.anInt3022 = (client.anInt3026 * -2098608041 - client.anInt3032 * 581921171) / 2 * 1964245899;
			Class575.anInt5428 = client.anInt3131 * 1536191391;
			client.anInt3024 = 0;
		} else {
			Class19_Sub1.method20892();
		}
		if (Class1.aClass527_1 != Class527.aClass527_10 && Class128.anInt3317 * 2037417253 < 1024 && Class575.anInt5428 * 1261116487 < 768) {
		}
		if (arg4) {
			Class633.method33875();
		} else {
			Class106.aCanvas6.setSize(Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			Class613.aClass21_13.method17043(Class106.aCanvas6, Class128.anInt3317 * 2037417253, Class575.anInt5428 * 1261116487);
			if (local71 == Class212.aFrame2) {
				local87 = Class212.aFrame2.getInsets();
				Class106.aCanvas6.setLocation(client.anInt3022 * 426445859 + local87.left, client.anInt3024 * 2076797327 + local87.top);
			} else {
				Class106.aCanvas6.setLocation(client.anInt3022 * 426445859, client.anInt3024 * 2076797327);
			}
		}
		if (arg1 >= 2) {
			client.aBoolean589 = true;
		} else {
			client.aBoolean589 = false;
		}
		Class68.method14037();
		if (client.anInt3125 * -1579500007 != -1) {
			Class298.method25633(true);
		}
		if (Class406.method27657().method21621() != null && (Class594.method33424(client.anInt3039 * 1115111877) || Class108.method21938(client.anInt3039 * 1115111877))) {
			Class75.method19526(Class406.method27657());
		}
		for (@Pc(270) int local270 = 0; local270 < 112; local270++) {
			client.aBooleanArray19[local270] = true;
		}
		client.aBoolean558 = true;
	}
}
