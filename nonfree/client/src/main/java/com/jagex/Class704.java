package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!zg")
public class Class704 implements Interface75 {

	@OriginalMember(owner = "client!zg", name = "e", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_5 = new Class704(-2);

	@OriginalMember(owner = "client!zg", name = "n", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_3 = new Class704(-3);

	@OriginalMember(owner = "client!zg", name = "m", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_2 = new Class704(2);

	@OriginalMember(owner = "client!zg", name = "k", descriptor = "Lclient!zg;")
	public static final Class704 aClass704_4 = new Class704(3);

	@OriginalMember(owner = "client!zg", name = "f", descriptor = "Lclient!zg;")
	static final Class704 aClass704_6 = new Class704(4);

	@OriginalMember(owner = "client!zg", name = "w", descriptor = "I")
	final int anInt5954;

	@OriginalMember(owner = "client!zg", name = "f", descriptor = "()[Lclient!zg;", line = 16)
	public static Class704[] method36728() {
		return new Class704[] { aClass704_2, aClass704_6, aClass704_5, aClass704_4, aClass704_3 };
	}

	@OriginalMember(owner = "client!zg", name = "m", descriptor = "()[Lclient!zg;", line = 16)
	public static Class704[] method36729() {
		return new Class704[] { aClass704_2, aClass704_6, aClass704_5, aClass704_4, aClass704_3 };
	}

	@OriginalMember(owner = "client!zg", name = "w", descriptor = "()[Lclient!zg;", line = 16)
	public static Class704[] method36730() {
		return new Class704[] { aClass704_2, aClass704_6, aClass704_5, aClass704_4, aClass704_3 };
	}

	@OriginalMember(owner = "client!zg", name = "<init>", descriptor = "(I)V", line = 19)
	Class704(@OriginalArg(0) int arg0) {
		this.anInt5954 = arg0 * 1236995261;
	}

	@OriginalMember(owner = "client!zg", name = "n", descriptor = "()I", line = 24)
	@Override
	public int method36920() {
		return this.anInt5954 * -1656729963;
	}

	@OriginalMember(owner = "client!zg", name = "k", descriptor = "()I", line = 24)
	@Override
	public int method36919() {
		return this.anInt5954 * -1656729963;
	}

	@OriginalMember(owner = "client!zg", name = "bz", descriptor = "(III)B", line = 82)
	static byte method36734(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class615.aClass615_6.anInt5628 * 948246811 == arg0) {
			return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
		} else {
			return 0;
		}
	}

	@OriginalMember(owner = "client!zg", name = "d", descriptor = "(Ljava/lang/CharSequence;I)I", line = 147)
	public static int method36731(@OriginalArg(0) CharSequence arg0) {
		@Pc(2) int local2 = arg0.length();
		@Pc(4) int local4 = 0;
		for (@Pc(6) int local6 = 0; local6 < local2; local6++) {
			local4 = (local4 << 5) - local4 + arg0.charAt(local6);
		}
		return local4;
	}

	@OriginalMember(owner = "client!zg", name = "ea", descriptor = "(ILjava/lang/String;ZB)V", line = 2019)
	static void method36732(@OriginalArg(0) int arg0, @OriginalArg(1) String arg1, @OriginalArg(2) boolean arg2) {
		Class560.method31135();
		Class507.method30229();
		Class84.method1430();
		Class293.method26588(arg0, arg1, arg2);
		Class157.aClass462_2.method29237();
		Class157.aClass462_2.method29236(client.anInterface50_1);
		Class157.aClass462_2.method29243();
		Class520.method30339(Class694.aClass104_14);
		Class379.method28101(Class694.aClass104_14, Class110_Sub7.aClass497_22);
		Class389.method28266();
		Class635.method32441();
		Class610.method32021();
		if (client.anInt3435 * -849002901 == 4) {
			Class481.method29756(10);
		} else if (client.anInt3435 * -849002901 == 13) {
			Class481.method29756(6);
		} else if (client.anInt3435 * -849002901 == 15) {
			Class481.method29756(16);
		} else if (client.anInt3435 * -849002901 == 18) {
			Class481.method29756(3);
		} else if (client.anInt3435 * -849002901 == 11 || client.anInt3435 * -849002901 == 1) {
			Exception_Sub1.method17631();
		} else if (client.anInt3435 * -849002901 == 0) {
			Class481.method29756(8);
		} else if (client.anInt3435 * -849002901 == 3) {
			Class707.method36752(false);
		}
	}

	@OriginalMember(owner = "client!zg", name = "ln", descriptor = "(S)Z", line = 12312)
	static boolean method36733() {
		client.anInt3455 += -1136575289;
		client.aBoolean634 = true;
		return true;
	}
}
