package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ak")
public class Class73 {

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "Lclient!dx;")
	static Class15 aClass15_1;

	@OriginalMember(owner = "client!ak", name = "g", descriptor = "I")
	static int anInt2133;

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "I")
	static int anInt2134;

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "I")
	static int anInt2135;

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "I")
	static int anInt2136;

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "I")
	static int anInt2137;

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "I")
	static int anInt2138;

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "I")
	static int anInt2139;

	@OriginalMember(owner = "client!ak", name = "p", descriptor = "Lclient!kh;")
	static Class277 aClass277_7;

	@OriginalMember(owner = "client!ak", name = "e", descriptor = "[Lclient!abc;")
	static Class15_Sub1[] aClass15_Sub1Array1;

	@OriginalMember(owner = "client!ak", name = "fn", descriptor = "Lclient!ny;")
	public static Class359 aClass359_25;

	@OriginalMember(owner = "client!ak", name = "<init>", descriptor = "()V", line = 27)
	Class73() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ak", name = "l", descriptor = "(Lclient!kh;Lclient!kg;IIIIIIIII)V", line = 32)
	public static void method14928(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		aClass277_7 = arg0;
		Class209.aClass276_8 = arg1;
		anInt2133 = arg2 * 1175810631;
		anInt2134 = arg3 * 955581353;
		anInt2139 = arg4 * 1529395007;
		anInt2135 = arg5 * -826806137;
		anInt2137 = arg6 * -1707206799;
		anInt2138 = arg7 * 1407211083;
		Class269.anInt4213 = arg8 * 412072151;
		Class485.aClass15_3 = null;
		aClass15_1 = null;
		Class428.aClass15_2 = null;
		Class289.anInt4365 = arg9 * -734129733;
		anInt2136 = arg10 * -548738849;
		Class324.method25998();
		Class60_Sub22.aBoolean340 = true;
	}

	@OriginalMember(owner = "client!ak", name = "h", descriptor = "(Lclient!kh;Lclient!kg;IIIIIIIII)V", line = 32)
	public static void method14930(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class276 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10) {
		aClass277_7 = arg0;
		Class209.aClass276_8 = arg1;
		anInt2133 = arg2 * 1175810631;
		anInt2134 = arg3 * 955581353;
		anInt2139 = arg4 * 1529395007;
		anInt2135 = arg5 * -826806137;
		anInt2137 = arg6 * -1707206799;
		anInt2138 = arg7 * 1407211083;
		Class269.anInt4213 = arg8 * 412072151;
		Class485.aClass15_3 = null;
		aClass15_1 = null;
		Class428.aClass15_2 = null;
		Class289.anInt4365 = arg9 * -734129733;
		anInt2136 = arg10 * -548738849;
		Class324.method25998();
		Class60_Sub22.aBoolean340 = true;
	}

	@OriginalMember(owner = "client!ak", name = "x", descriptor = "()Z", line = 51)
	static boolean method14927() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(anInt2138 * 1734034275)) {
				aClass15_1 = Class137.method22937(Class294.aClass359_54, anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(anInt2136 * 566416159)) {
				aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ak", name = "s", descriptor = "()Z", line = 51)
	static boolean method14931() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(anInt2138 * 1734034275)) {
				aClass15_1 = Class137.method22937(Class294.aClass359_54, anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(anInt2136 * 566416159)) {
				aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ak", name = "y", descriptor = "()Z", line = 51)
	static boolean method14933() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(anInt2138 * 1734034275)) {
				aClass15_1 = Class137.method22937(Class294.aClass359_54, anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(anInt2136 * 566416159)) {
				aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ak", name = "b", descriptor = "()Z", line = 51)
	static boolean method14934() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(anInt2138 * 1734034275)) {
				aClass15_1 = Class137.method22937(Class294.aClass359_54, anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(anInt2136 * 566416159)) {
				aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "()Z", line = 51)
	static boolean method14935() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(anInt2138 * 1734034275)) {
				aClass15_1 = Class137.method22937(Class294.aClass359_54, anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(anInt2136 * 566416159)) {
				aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ak", name = "u", descriptor = "()Z", line = 51)
	static boolean method14936() {
		@Pc(1) boolean local1 = true;
		if (Class485.aClass15_3 == null) {
			if (Class294.aClass359_54.method26674(anInt2137 * -725759599)) {
				Class485.aClass15_3 = Class137.method22937(Class294.aClass359_54, anInt2137 * -725759599);
			} else {
				local1 = false;
			}
		}
		if (aClass15_1 == null) {
			if (Class294.aClass359_54.method26674(anInt2138 * 1734034275)) {
				aClass15_1 = Class137.method22937(Class294.aClass359_54, anInt2138 * 1734034275);
			} else {
				local1 = false;
			}
		}
		if (Class428.aClass15_2 == null) {
			if (Class294.aClass359_54.method26674(Class269.anInt4213 * -1851999513)) {
				Class428.aClass15_2 = Class137.method22937(Class294.aClass359_54, Class269.anInt4213 * -1851999513);
			} else {
				local1 = false;
			}
		}
		if (Class325.aClass611_9 == null) {
			if (Class475.aClass359_86.method26674(anInt2136 * 566416159)) {
				Class325.aClass611_9 = Class179.method23534(Class475.aClass359_86, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		if (aClass15_Sub1Array1 == null) {
			if (Class294.aClass359_54.method26674(anInt2136 * 566416159)) {
				aClass15_Sub1Array1 = (Class15_Sub1[]) Class137.method22939(Class294.aClass359_54, anInt2136 * 566416159);
			} else {
				local1 = false;
			}
		}
		return local1;
	}

	@OriginalMember(owner = "client!ak", name = "j", descriptor = "(Ljava/lang/String;ZLclient!de;Lclient!dw;Lclient!yx;)V", line = 86)
	public static void method14929(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) Class611 arg4) {
		@Pc(8) boolean local8 = !Class60_Sub22.aBoolean340 || Class324.method25998();
		if (!local8) {
			return;
		}
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(90) int local90;
		if (Class60_Sub22.aBoolean340 && local8) {
			@Pc(17) Class611 local17 = Class325.aClass611_9;
			@Pc(23) Class14 local23 = arg2.method17096(local17, aClass15_Sub1Array1, true);
			local30 = local17.method33586(arg0, 250, null);
			local41 = local17.method33606(arg0, 250, local17.anInt5538 * 1433409675, null);
			@Pc(44) int local44 = aClass15_1.method3433();
			local48 = local44 + 4;
			local30 += local48 * 2;
			local41 += local48 * 2;
			if (local30 < anInt2139 * 647411903) {
				local30 = anInt2139 * 647411903;
			}
			if (local41 < anInt2135 * -1483877065) {
				local41 = anInt2135 * -1483877065;
			}
			local90 = aClass277_7.method25394(local30, client.anInt3032 * 581921171) + anInt2133 * 1029740407;
			@Pc(102) int local102 = Class209.aClass276_8.method25383(local41, client.anInt3131 * -645382887) + anInt2134 * -997437287;
			arg2.method17089(Class428.aClass15_2, false).method16790(local90 + Class485.aClass15_3.method3433(), local102 + Class485.aClass15_3.method3440(), local30 - Class485.aClass15_3.method3433() * 2, local41 - Class485.aClass15_3.method3440() * 2, 1, -1, 0);
			arg2.method17089(Class485.aClass15_3, true).method16783(local90, local102);
			Class485.aClass15_3.method3445();
			arg2.method17089(Class485.aClass15_3, true).method16783(local90 + local30 - local44, local102);
			Class485.aClass15_3.method3450();
			arg2.method17089(Class485.aClass15_3, true).method16783(local30 + local90 - local44, local41 + local102 - local44);
			Class485.aClass15_3.method3445();
			arg2.method17089(Class485.aClass15_3, true).method16783(local90, local41 + local102 - local44);
			Class485.aClass15_3.method3450();
			arg2.method17089(aClass15_1, true).method16789(local90, local102 + Class485.aClass15_3.method3440(), local44, local41 - Class485.aClass15_3.method3440() * 2);
			aClass15_1.method3447();
			arg2.method17089(aClass15_1, true).method16789(local90 + Class485.aClass15_3.method3433(), local102, local30 - Class485.aClass15_3.method3433() * 2, local44);
			aClass15_1.method3447();
			arg2.method17089(aClass15_1, true).method16789(local30 + local90 - local44, local102 + Class485.aClass15_3.method3440(), local44, local41 - Class485.aClass15_3.method3440() * 2);
			aClass15_1.method3447();
			arg2.method17089(aClass15_1, true).method16789(local90 + Class485.aClass15_3.method3433(), local41 + local102 - local44, local30 - Class485.aClass15_3.method3433() * 2, local44);
			aClass15_1.method3447();
			local23.method3283(arg0, local90 + local48, local102 + local48, local30 - local48 * 2, local41 - local48 * 2, Class289.anInt4365 * -1193211021 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Class198.method24130(local90, local102, local30, local41);
		} else {
			local30 = arg4.method33586(arg0, 250, null);
			local41 = arg4.method33610(arg0, 250, null) * 13;
			@Pc(326) byte local326 = 4;
			local48 = local326 + 6;
			local90 = local326 + 6;
			arg2.method17050(local48 - local326, local90 - local326, local30 + local326 + local326, local326 + local41 + local326, -16777216, 0);
			arg2.method17068(local48 - local326, local90 - local326, local326 + local326 + local30, local326 + local41 + local326, -1, 0);
			arg3.method3283(arg0, local48, local90, local30, local41, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Class198.method24130(local48 - local326, local90 - local326, local326 + local30 + local326, local326 + local41 + local326);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method17028();
			arg2.method17017();
		} catch (@Pc(420) Exception_Sub2 local420) {
		}
	}

	@OriginalMember(owner = "client!ak", name = "z", descriptor = "(Ljava/lang/String;ZLclient!de;Lclient!dw;Lclient!yx;)V", line = 86)
	public static void method14932(@OriginalArg(0) String arg0, @OriginalArg(1) boolean arg1, @OriginalArg(2) Class21 arg2, @OriginalArg(3) Class14 arg3, @OriginalArg(4) Class611 arg4) {
		@Pc(8) boolean local8 = !Class60_Sub22.aBoolean340 || Class324.method25998();
		if (!local8) {
			return;
		}
		@Pc(30) int local30;
		@Pc(41) int local41;
		@Pc(48) int local48;
		@Pc(90) int local90;
		if (Class60_Sub22.aBoolean340 && local8) {
			@Pc(17) Class611 local17 = Class325.aClass611_9;
			@Pc(23) Class14 local23 = arg2.method17096(local17, aClass15_Sub1Array1, true);
			local30 = local17.method33586(arg0, 250, null);
			local41 = local17.method33606(arg0, 250, local17.anInt5538 * 1433409675, null);
			@Pc(44) int local44 = aClass15_1.method3433();
			local48 = local44 + 4;
			local30 += local48 * 2;
			local41 += local48 * 2;
			if (local30 < anInt2139 * 647411903) {
				local30 = anInt2139 * 647411903;
			}
			if (local41 < anInt2135 * -1483877065) {
				local41 = anInt2135 * -1483877065;
			}
			local90 = aClass277_7.method25394(local30, client.anInt3032 * 581921171) + anInt2133 * 1029740407;
			@Pc(102) int local102 = Class209.aClass276_8.method25383(local41, client.anInt3131 * -645382887) + anInt2134 * -997437287;
			arg2.method17089(Class428.aClass15_2, false).method16790(local90 + Class485.aClass15_3.method3433(), local102 + Class485.aClass15_3.method3440(), local30 - Class485.aClass15_3.method3433() * 2, local41 - Class485.aClass15_3.method3440() * 2, 1, -1, 0);
			arg2.method17089(Class485.aClass15_3, true).method16783(local90, local102);
			Class485.aClass15_3.method3445();
			arg2.method17089(Class485.aClass15_3, true).method16783(local90 + local30 - local44, local102);
			Class485.aClass15_3.method3450();
			arg2.method17089(Class485.aClass15_3, true).method16783(local30 + local90 - local44, local41 + local102 - local44);
			Class485.aClass15_3.method3445();
			arg2.method17089(Class485.aClass15_3, true).method16783(local90, local41 + local102 - local44);
			Class485.aClass15_3.method3450();
			arg2.method17089(aClass15_1, true).method16789(local90, local102 + Class485.aClass15_3.method3440(), local44, local41 - Class485.aClass15_3.method3440() * 2);
			aClass15_1.method3447();
			arg2.method17089(aClass15_1, true).method16789(local90 + Class485.aClass15_3.method3433(), local102, local30 - Class485.aClass15_3.method3433() * 2, local44);
			aClass15_1.method3447();
			arg2.method17089(aClass15_1, true).method16789(local30 + local90 - local44, local102 + Class485.aClass15_3.method3440(), local44, local41 - Class485.aClass15_3.method3440() * 2);
			aClass15_1.method3447();
			arg2.method17089(aClass15_1, true).method16789(local90 + Class485.aClass15_3.method3433(), local41 + local102 - local44, local30 - Class485.aClass15_3.method3433() * 2, local44);
			aClass15_1.method3447();
			local23.method3283(arg0, local90 + local48, local102 + local48, local30 - local48 * 2, local41 - local48 * 2, Class289.anInt4365 * -1193211021 | 0xFF000000, -1, 1, 1, 0, null, null, null, 0, 0);
			Class198.method24130(local90, local102, local30, local41);
		} else {
			local30 = arg4.method33586(arg0, 250, null);
			local41 = arg4.method33610(arg0, 250, null) * 13;
			@Pc(326) byte local326 = 4;
			local48 = local326 + 6;
			local90 = local326 + 6;
			arg2.method17050(local48 - local326, local90 - local326, local30 + local326 + local326, local326 + local41 + local326, -16777216, 0);
			arg2.method17068(local48 - local326, local90 - local326, local326 + local326 + local30, local326 + local41 + local326, -1, 0);
			arg3.method3283(arg0, local48, local90, local30, local41, -1, -1, 1, 1, 0, null, null, null, 0, 0);
			Class198.method24130(local48 - local326, local90 - local326, local326 + local30 + local326, local326 + local41 + local326);
		}
		if (!arg1) {
			return;
		}
		try {
			arg2.method17028();
			arg2.method17017();
		} catch (@Pc(420) Exception_Sub2 local420) {
		}
	}

	@OriginalMember(owner = "client!ak", name = "c", descriptor = "(IB)V", line = 118)
	public static void method14938(@OriginalArg(0) int arg0) {
		@Pc(4) Class3_Sub1_Sub11 local4 = Class60_Sub34.method14470(7, (long) arg0);
		local4.method19145();
	}

	@OriginalMember(owner = "client!ak", name = "avk", descriptor = "(Lclient!vs;B)V", line = 12787)
	static final void method14937(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		Class441.method28248(local12);
	}
}
