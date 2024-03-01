package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!adf")
public class Class80 {

	@OriginalMember(owner = "client!adf", name = "e", descriptor = "J")
	public static final long aLong10 = 94608000L;

	@OriginalMember(owner = "client!adf", name = "<init>", descriptor = "()V", line = 8)
	Class80() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!adf", name = "m", descriptor = "(I)V", line = 251)
	public static void method1364() {
		if (Class362.aClass370Array1 == null) {
			Class362.aClass370Array1 = Class370.method27993();
			Class146.aClass370_3 = Class362.aClass370Array1[0];
			Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
		}
		if (Class653.aClass357_1 == null) {
			Class393.method28317();
		}
		@Pc(19) Class370 local19 = Class146.aClass370_3;
		@Pc(22) int local22 = Class533.method30604();
		if (Class146.aClass370_3 == local19) {
			Class362.aString187 = Class146.aClass370_3.aClass74_177.method1259(Class106.aClass717_8);
			Class531.aString225 = Class362.aString187;
			if (Class146.aClass370_3.aBoolean737) {
				Class66.anInt237 = (Class146.aClass370_3.anInt4591 * 903713925 + (-1203887493 * Class146.aClass370_3.anInt4592 - Class146.aClass370_3.anInt4591 * 903713925) * local22 / 100) * -2053976653;
			}
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + Class66.anInt237 * 1453631867 + "%";
			}
		} else if (Class146.aClass370_3 == Class370.aClass370_21) {
			Class653.aClass357_1 = null;
			Class481.method29756(4);
			if (Class362.aBoolean730) {
				Class362.aBoolean730 = false;
				Class114.method7634(Class7.aString2, Class490.aString217, "", false);
			}
		} else {
			Class362.aString187 = local19.aClass74_178.method1259(Class106.aClass717_8);
			Class531.aString225 = Class362.aString187;
			if (Class146.aClass370_3.aBoolean736) {
				Class531.aString225 = Class531.aString225 + " - " + local19.anInt4592 * -1203887493 + "%";
			}
			Class66.anInt237 = local19.anInt4592 * 640981761;
			if (Class146.aClass370_3.aBoolean737 || local19.aBoolean737) {
				Class661.aLong302 = Class305.method26796() * -5556977673772728225L;
			}
		}
		if (Class653.aClass357_1 == null) {
			return;
		}
		Class653.aClass357_1.method27735(Class661.aLong302 * 3693219987677404063L, Class362.aString187, Class531.aString225, Class66.anInt237 * 1453631867, Class146.aClass370_3);
		if (Class362.anInterface30Array1 == null) {
			return;
		}
		for (@Pc(162) int local162 = Class362.anInt4573 * 815014065 + 1; local162 < Class362.anInterface30Array1.length; local162++) {
			if (Class362.anInterface30Array1[local162].method27932() >= 100 && local162 - 1 == Class362.anInt4573 * 815014065 && client.anInt3435 * -849002901 != 5 && Class653.aClass357_1.method27743()) {
				try {
					Class362.anInterface30Array1[local162].method27923();
				} catch (@Pc(196) Exception local196) {
					Class362.anInterface30Array1 = null;
					break;
				}
				Class653.aClass357_1.method27765(Class362.anInterface30Array1[local162]);
				Class362.anInt4573 += 770058321;
				if (Class362.anInt4573 * 815014065 >= Class362.anInterface30Array1.length - 1 && Class362.anInterface30Array1.length > 1) {
					Class362.anInt4573 = (Class363.aClass81_1.method1374() ? 0 : -1) * 770058321;
				}
			}
		}
	}

	@OriginalMember(owner = "client!adf", name = "bk", descriptor = "(Lclient!arn;B)Ljava/lang/String;", line = 1372)
	static String method1365(@OriginalArg(0) Class93_Sub1_Sub8 arg0) {
		return arg0.aString101 + Class306.method26823(16777215) + " >";
	}
}
