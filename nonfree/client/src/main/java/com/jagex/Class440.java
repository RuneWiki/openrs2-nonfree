package com.jagex;

import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!nk")
public class Class440 {

	@OriginalMember(owner = "client!nk", name = "e", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_8 = new Class440(5);

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_2 = new Class440(10);

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_1 = new Class440(-1);

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_4 = new Class440(7);

	@OriginalMember(owner = "client!nk", name = "f", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_5 = new Class440(7);

	@OriginalMember(owner = "client!nk", name = "w", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_14 = new Class440(2);

	@OriginalMember(owner = "client!nk", name = "l", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_7 = new Class440(9);

	@OriginalMember(owner = "client!nk", name = "u", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_3 = new Class440(18);

	@OriginalMember(owner = "client!nk", name = "z", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_9 = new Class440(7);

	@OriginalMember(owner = "client!nk", name = "p", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_6 = new Class440(3);

	@OriginalMember(owner = "client!nk", name = "d", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_11 = new Class440(-1);

	@OriginalMember(owner = "client!nk", name = "c", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_12 = new Class440(-1);

	@OriginalMember(owner = "client!nk", name = "r", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_13 = new Class440(21);

	@OriginalMember(owner = "client!nk", name = "v", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_10 = new Class440(5);

	@OriginalMember(owner = "client!nk", name = "o", descriptor = "Lclient!nk;")
	public static final Class440 aClass440_15 = new Class440(8);

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "()[Lclient!nk;", line = 22)
	public static Class440[] method28844() {
		return new Class440[] { aClass440_8, aClass440_2, aClass440_1, aClass440_4, aClass440_5, aClass440_14, aClass440_7, aClass440_3, aClass440_9, aClass440_6, aClass440_11, aClass440_12, aClass440_13, aClass440_10, aClass440_15 };
	}

	@OriginalMember(owner = "client!nk", name = "m", descriptor = "()[Lclient!nk;", line = 22)
	public static Class440[] method28845() {
		return new Class440[] { aClass440_8, aClass440_2, aClass440_1, aClass440_4, aClass440_5, aClass440_14, aClass440_7, aClass440_3, aClass440_9, aClass440_6, aClass440_11, aClass440_12, aClass440_13, aClass440_10, aClass440_15 };
	}

	@OriginalMember(owner = "client!nk", name = "k", descriptor = "()[Lclient!nk;", line = 22)
	public static Class440[] method28846() {
		return new Class440[] { aClass440_8, aClass440_2, aClass440_1, aClass440_4, aClass440_5, aClass440_14, aClass440_7, aClass440_3, aClass440_9, aClass440_6, aClass440_11, aClass440_12, aClass440_13, aClass440_10, aClass440_15 };
	}

	@OriginalMember(owner = "client!nk", name = "<init>", descriptor = "(I)V", line = 25)
	Class440(@OriginalArg(0) int arg0) {
	}

	@OriginalMember(owner = "client!nk", name = "n", descriptor = "(JIZB)Ljava/lang/String;", line = 40)
	public static String method28852(@OriginalArg(0) long arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		@Pc(5) Calendar local5;
		if (arg2) {
			Class543.method30947(arg0);
			local5 = Class69.aCalendar2;
		} else {
			Class337.method27459(arg0);
			local5 = Class69.aCalendar1;
		}
		@Pc(14) int local14 = local5.get(5);
		@Pc(18) int local18 = local5.get(2);
		@Pc(22) int local22 = local5.get(1);
		@Pc(26) int local26 = local5.get(11);
		@Pc(30) int local30 = local5.get(12);
		return arg1 == 3 ? Class362.method27848(arg0, arg1, arg2) : Integer.toString(local14 / 10) + local14 % 10 + "-" + Class69.aStringArrayArray1[arg1][local18] + "-" + local22 + " " + local26 / 10 + local26 % 10 + ":" + local30 / 10 + local30 % 10;
	}

	@OriginalMember(owner = "client!nk", name = "q", descriptor = "(Ljava/lang/String;I)I", line = 249)
	public static int method28850(@OriginalArg(0) String arg0) {
		return Class166_Sub13.aTwitchTV1.SetStreamTitle(arg0, client.aClass702_4.aString242);
	}

	@OriginalMember(owner = "client!nk", name = "bx", descriptor = "(Lclient!yf;I)V", line = 5101)
	static final void method28847(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5894 -= 1566132618;
		if (arg0.aLongArray27[arg0.anInt5894 * -2000995827] >= arg0.aLongArray27[arg0.anInt5894 * -2000995827 + 1]) {
			arg0.anInt5889 += arg0.anIntArray520[arg0.anInt5889 * -709694321] * 2047914607;
		}
	}

	@OriginalMember(owner = "client!nk", name = "fd", descriptor = "(Lclient!yf;I)V", line = 5898)
	static final void method28848(@OriginalArg(0) Class681 arg0) {
		@Pc(12) int local12 = arg0.anIntArray519[(arg0.anInt5891 -= 1189701933) * -1497248091];
		@Pc(16) Class312 local16 = Class659.method32805(local12);
		@Pc(22) Class320 local22 = Class166_Sub1.aClass320Array1[local12 >> 16];
		Class583.method31424(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!nk", name = "ss", descriptor = "(Lclient!yf;I)V", line = 8182)
	static final void method28853(@OriginalArg(0) Class681 arg0) {
		@Pc(8) Class677 local8 = arg0.aBoolean875 ? arg0.aClass677_2 : arg0.aClass677_1;
		@Pc(11) Class312 local11 = local8.aClass312_13;
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = local11.anInt4028 * -822913903;
	}

	@OriginalMember(owner = "client!nk", name = "vj", descriptor = "(Lclient!yf;B)V", line = 8883)
	static final void method28851(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 201819375;
		@Pc(8) Class390[] local8 = Class708.method36756();
		@Pc(11) Class392[] local11 = Class252.method25978();
		Class268.method26264(local8[arg0.anIntArray519[arg0.anInt5891 * -1497248091]], local11[arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1]], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 2], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 3], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 4], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 5], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 6], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 7], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 8], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 9], arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 10]);
	}

	@OriginalMember(owner = "client!nk", name = "adv", descriptor = "(Lclient!yf;I)V", line = 10159)
	static final void method28849(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= -1915563430;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		@Pc(23) int local23 = arg0.anIntArray519[arg0.anInt5891 * -1497248091 + 1];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = client.aClass531ArrayArray1[local23][local13].anInt5234 * -1340089267;
	}
}
