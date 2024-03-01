package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!dj")
public class Class127 {

	@OriginalMember(owner = "client!dj", name = "gj", descriptor = "Lclient!ny;")
	public static Class359 aClass359_33;

	@OriginalMember(owner = "client!dj", name = "p", descriptor = "Lclient!dj;")
	static final Class127 aClass127_25 = new Class127(3, 1);

	@OriginalMember(owner = "client!dj", name = "a", descriptor = "Lclient!dj;")
	static final Class127 aClass127_18 = new Class127(6, 2);

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "Lclient!dj;")
	static final Class127 aClass127_19 = new Class127(8, 4);

	@OriginalMember(owner = "client!dj", name = "l", descriptor = "Lclient!dj;")
	public static final Class127 aClass127_23 = new Class127(1, 1);

	@OriginalMember(owner = "client!dj", name = "h", descriptor = "Lclient!dj;")
	public static final Class127 aClass127_21 = new Class127(5, 2);

	@OriginalMember(owner = "client!dj", name = "x", descriptor = "Lclient!dj;")
	public static final Class127 aClass127_22 = new Class127(2, 3);

	@OriginalMember(owner = "client!dj", name = "s", descriptor = "Lclient!dj;")
	static final Class127 aClass127_26 = new Class127(0, 4);

	@OriginalMember(owner = "client!dj", name = "u", descriptor = "Lclient!dj;")
	public static final Class127 aClass127_24 = new Class127(7, 2);

	@OriginalMember(owner = "client!dj", name = "y", descriptor = "Lclient!dj;")
	public static final Class127 aClass127_20 = new Class127(4, 4);

	@OriginalMember(owner = "client!dj", name = "b", descriptor = "I")
	public final int anInt3314;

	@OriginalMember(owner = "client!dj", name = "c", descriptor = "I")
	public final int anInt3315;

	@OriginalMember(owner = "client!dj", name = "<init>", descriptor = "(II)V", line = 18)
	Class127(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		this.anInt3314 = arg0 * 704223277;
		this.anInt3315 = arg1 * -1017515571;
	}

	@OriginalMember(owner = "client!dj", name = "g", descriptor = "(I)V", line = 79)
	static void method22879() {
		Class147.anInt3433 = Class224.aClass611_8.anInt5537 * 738681091 + -192438930 + Class224.aClass611_8.anInt5536 * -1664384675;
		Class67.anInt1834 = Class222.aClass611_7.anInt5536 * 1311339935 + Class222.aClass611_7.anInt5537 * -596823935 + 1193841530;
		Class67.aStringArray7 = new String[500];
		for (@Pc(28) int local28 = 0; local28 < Class67.aStringArray7.length; local28++) {
			Class67.aStringArray7[local28] = "";
		}
		Class215.method24289(Class601.aClass601_172.method33512(Class469.aClass530_2));
	}

	@OriginalMember(owner = "client!dj", name = "ak", descriptor = "(I)V", line = 989)
	static void method22878() {
		Class66.method13208();
	}

	@OriginalMember(owner = "client!dj", name = "ahe", descriptor = "(Lclient!vs;B)V", line = 10299)
	static final void method22880(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class492.method29292();
	}

	@OriginalMember(owner = "client!dj", name = "ajw", descriptor = "(Lclient!vs;I)V", line = 10738)
	static final void method22881(@OriginalArg(0) Class536 arg0) throws Exception_Sub4 {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		Class80.aClass23_Sub1_1.method5818((float) (2.0D * 3.141592653589793D * (double) local13 / 16384.0D), (float) ((double) local23 * 3.141592653589793D * 2.0D / 16384.0D));
	}
}
