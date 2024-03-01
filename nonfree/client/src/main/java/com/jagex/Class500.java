package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!uf")
public final class Class500 {

	@OriginalMember(owner = "client!uf", name = "hw", descriptor = "Lclient!ajx;")
	public static Class70_Sub1_Sub2 aClass70_Sub1_Sub2_12;

	@OriginalMember(owner = "client!uf", name = "<init>", descriptor = "()V", line = 8)
	Class500() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!uf", name = "k", descriptor = "(Lclient!vs;)V", line = 13)
	static void method29379(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString229;
	}

	@OriginalMember(owner = "client!uf", name = "at", descriptor = "(Lclient!vs;)V", line = 13)
	static void method29380(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString229;
	}

	@OriginalMember(owner = "client!uf", name = "ak", descriptor = "(Lclient!vs;)V", line = 13)
	static void method29426(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString229;
	}

	@OriginalMember(owner = "client!uf", name = "af", descriptor = "(Lclient!vs;)V", line = 13)
	static void method29434(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString229;
	}

	@OriginalMember(owner = "client!uf", name = "aa", descriptor = "(Lclient!vs;)V", line = 17)
	static void method29383(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString230;
	}

	@OriginalMember(owner = "client!uf", name = "ah", descriptor = "(Lclient!vs;)V", line = 17)
	static void method29384(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString230;
	}

	@OriginalMember(owner = "client!uf", name = "an", descriptor = "(Lclient!vs;)V", line = 17)
	static void method29385(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]).aString230;
	}

	@OriginalMember(owner = "client!uf", name = "a", descriptor = "([Ljava/lang/Object;III)Ljava/lang/String;", line = 20)
	public static String method29442(@OriginalArg(0) Object[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		if (arg2 == 0) {
			return "";
		} else if (arg2 == 1) {
			@Pc(11) CharSequence local11 = (CharSequence) arg0[arg1];
			return local11 == null ? "null" : local11.toString();
		} else {
			@Pc(23) int local23 = arg1 + arg2;
			@Pc(25) int local25 = 0;
			for (@Pc(27) int local27 = arg1; local27 < local23; local27++) {
				@Pc(35) CharSequence local35 = (CharSequence) arg0[local27];
				if (local35 == null) {
					local25 += 4;
				} else {
					local25 += local35.length();
				}
			}
			@Pc(52) StringBuilder local52 = new StringBuilder(local25);
			for (@Pc(54) int local54 = arg1; local54 < local23; local54++) {
				@Pc(62) CharSequence local62 = (CharSequence) arg0[local54];
				if (local62 == null) {
					local52.append("null");
				} else {
					local52.append(local62);
				}
			}
			return local52.toString();
		}
	}

	@OriginalMember(owner = "client!uf", name = "aj", descriptor = "(Lclient!vs;)V", line = 21)
	static void method29386(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5250 * -2015745853;
	}

	@OriginalMember(owner = "client!uf", name = "as", descriptor = "(Lclient!vs;)V", line = 21)
	static void method29387(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5250 * -2015745853;
	}

	@OriginalMember(owner = "client!uf", name = "ai", descriptor = "(Lclient!vs;)V", line = 25)
	static void method29388(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5253 * -483067595;
	}

	@OriginalMember(owner = "client!uf", name = "aq", descriptor = "(Lclient!vs;)V", line = 25)
	static void method29389(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5253 * -483067595;
	}

	@OriginalMember(owner = "client!uf", name = "ax", descriptor = "(Lclient!vs;)V", line = 33)
	static void method29391(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5251 * -1356074829;
	}

	@OriginalMember(owner = "client!uf", name = "az", descriptor = "(Lclient!vs;)V", line = 33)
	static void method29399(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5251 * -1356074829;
	}

	@OriginalMember(owner = "client!uf", name = "av", descriptor = "(Lclient!vs;)V", line = 33)
	static void method29435(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).anInt5251 * -1356074829;
	}

	@OriginalMember(owner = "client!uf", name = "al", descriptor = "(Lclient!vs;)V", line = 37)
	static void method29393(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray483 == null ? 0 : local15.anIntArray483.length;
	}

	@OriginalMember(owner = "client!uf", name = "ao", descriptor = "(Lclient!vs;)V", line = 37)
	static void method29398(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray483 == null ? 0 : local15.anIntArray483.length;
	}

	@OriginalMember(owner = "client!uf", name = "au", descriptor = "(Lclient!vs;)V", line = 42)
	static void method29397(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArray483[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "ab", descriptor = "(Lclient!vs;)V", line = 42)
	static void method29405(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArray483[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "ap", descriptor = "(Lclient!vs;)V", line = 42)
	static void method29425(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArray483[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "ay", descriptor = "(Lclient!vs;)V", line = 47)
	static void method29390(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29474(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "am", descriptor = "(Lclient!vs;)V", line = 47)
	static void method29400(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29474(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "ag", descriptor = "(Lclient!vs;)V", line = 47)
	static void method29436(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29474(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "ar", descriptor = "(Lclient!vs;)V", line = 56)
	static void method29401(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29472(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "ae", descriptor = "(Lclient!vs;)V", line = 56)
	static void method29402(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29472(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "ad", descriptor = "(Lclient!vs;)V", line = 60)
	static void method29431(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArrayArray60 == null ? 0 : local15.anIntArrayArray60.length;
	}

	@OriginalMember(owner = "client!uf", name = "ac", descriptor = "(Lclient!vs;)V", line = 65)
	static void method29378(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][0];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "aw", descriptor = "(Lclient!vs;)V", line = 65)
	static void method29404(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][0];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bp", descriptor = "(Lclient!vs;)V", line = 70)
	static void method29407(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][1];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bd", descriptor = "(Lclient!vs;)V", line = 70)
	static void method29408(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][1];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bs", descriptor = "(Lclient!vs;)V", line = 70)
	static void method29409(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][1];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bm", descriptor = "(Lclient!vs;)V", line = 70)
	static void method29410(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][1];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bw", descriptor = "(Lclient!vs;)V", line = 70)
	static void method29418(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).anIntArrayArray60[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]][1];
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bf", descriptor = "(Lclient!vs;)V", line = 75)
	static void method29411(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29493(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bk", descriptor = "(Lclient!vs;)V", line = 80)
	static void method29382(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray484 == null ? 0 : local15.anIntArray484.length;
	}

	@OriginalMember(owner = "client!uf", name = "bt", descriptor = "(Lclient!vs;)V", line = 80)
	static void method29412(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray484 == null ? 0 : local15.anIntArray484.length;
	}

	@OriginalMember(owner = "client!uf", name = "bg", descriptor = "(Lclient!vs;)V", line = 85)
	static void method29414(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray19[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "br", descriptor = "(Lclient!vs;)V", line = 85)
	static void method29415(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray19[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "bb", descriptor = "(Lclient!vs;)V", line = 85)
	static void method29416(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray19[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "by", descriptor = "(Lclient!vs;)V", line = 85)
	static void method29417(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray19[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "bl", descriptor = "(Lclient!vs;)V", line = 95)
	static void method29394(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray487 == null ? 0 : local15.anIntArray487.length;
	}

	@OriginalMember(owner = "client!uf", name = "bi", descriptor = "(Lclient!vs;)V", line = 95)
	static void method29419(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray487 == null ? 0 : local15.anIntArray487.length;
	}

	@OriginalMember(owner = "client!uf", name = "bu", descriptor = "(Lclient!vs;)V", line = 95)
	static void method29420(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray487 == null ? 0 : local15.anIntArray487.length;
	}

	@OriginalMember(owner = "client!uf", name = "ba", descriptor = "(Lclient!vs;)V", line = 95)
	static void method29421(@OriginalArg(0) Class536 arg0) {
		@Pc(15) Class503 local15 = Class239.aClass505_1.method29516(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local15.anIntArray487 == null ? 0 : local15.anIntArray487.length;
	}

	@OriginalMember(owner = "client!uf", name = "bo", descriptor = "(Lclient!vs;)V", line = 100)
	static void method29422(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray20[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "bc", descriptor = "(Lclient!vs;)V", line = 100)
	static void method29423(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray20[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "bn", descriptor = "(Lclient!vs;)V", line = 100)
	static void method29424(@OriginalArg(0) Class536 arg0) {
		arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).aStringArray20[arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]];
		arg0.anInt5319 -= 624249098;
	}

	@OriginalMember(owner = "client!uf", name = "bx", descriptor = "(Lclient!vs;)V", line = 105)
	static void method29392(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29486(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "be", descriptor = "(Lclient!vs;)V", line = 105)
	static void method29429(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29486(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bh", descriptor = "(Lclient!vs;)V", line = 105)
	static void method29433(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 2]).method29486(Class424.aClass165_1, arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]) ? 1 : 0;
		arg0.anInt5319 -= 312124549;
	}

	@OriginalMember(owner = "client!uf", name = "bj", descriptor = "(Lclient!vs;)V", line = 110)
	static void method29428(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29482(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "ck", descriptor = "(Lclient!vs;)V", line = 114)
	static void method29395(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29469(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "bq", descriptor = "(Lclient!vs;)V", line = 114)
	static void method29406(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29469(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "bz", descriptor = "(Lclient!vs;)V", line = 114)
	static void method29413(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29469(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "bv", descriptor = "(Lclient!vs;)V", line = 114)
	static void method29430(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29469(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "cm", descriptor = "(Lclient!vs;)V", line = 114)
	static void method29432(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29469(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "cu", descriptor = "(Lclient!vs;)V", line = 118)
	static void method29396(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29473(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "cj", descriptor = "(Lclient!vs;)V", line = 118)
	static void method29427(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1] = Class239.aClass505_1.method29516(arg0.anIntArray496[arg0.anInt5319 * 960738381 - 1]).method29473(Class424.aClass165_1) ? 1 : 0;
	}

	@OriginalMember(owner = "client!uf", name = "cl", descriptor = "(Lclient!vs;)V", line = 122)
	static void method29381(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (!local28.method33850()) {
			@Pc(82) int local82 = local28.anInt5585 * 100041865;
			if (local13 == -1) {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local82;
			} else {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class239.aClass505_1.method29516(local13).method29467(local23, local82);
			}
			return;
		}
		@Pc(35) String local35 = local28.aString248;
		if (local13 == -1) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local35;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(local13).method29468(local23, local35);
		}
	}

	@OriginalMember(owner = "client!uf", name = "cv", descriptor = "(Lclient!vs;)V", line = 122)
	static void method29403(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (!local28.method33850()) {
			@Pc(82) int local82 = local28.anInt5585 * 100041865;
			if (local13 == -1) {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local82;
			} else {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class239.aClass505_1.method29516(local13).method29467(local23, local82);
			}
			return;
		}
		@Pc(35) String local35 = local28.aString248;
		if (local13 == -1) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local35;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(local13).method29468(local23, local35);
		}
	}

	@OriginalMember(owner = "client!uf", name = "cq", descriptor = "(Lclient!vs;)V", line = 122)
	static void method29437(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 624249098;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(28) Class630 local28 = Class3_Sub20.aClass625_1.method33783(local23);
		if (!local28.method33850()) {
			@Pc(82) int local82 = local28.anInt5585 * 100041865;
			if (local13 == -1) {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local82;
			} else {
				arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class239.aClass505_1.method29516(local13).method29467(local23, local82);
			}
			return;
		}
		@Pc(35) String local35 = local28.aString248;
		if (local13 == -1) {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = local35;
		} else {
			arg0.anObjectArray42[(arg0.anInt5315 += 790013775) * 996806575 - 1] = Class239.aClass505_1.method29516(local13).method29468(local23, local35);
		}
	}

	@OriginalMember(owner = "client!uf", name = "gy", descriptor = "(I)V", line = 2488)
	static final void method29439() {
		Class555.aClass499_5.method29372(5);
		Class598.aClass575_5.method33147(5);
		Class585.aClass228_2.method24508(5);
		client.aClass370_1.method26954().method28494(5);
		Class498.aClass579_1.method33190(5);
		Class44_Sub3.aClass596_1.method33454(5);
		Class110.aClass436_1.method28012(5);
		Class19.aClass523_14.method29824(5);
		Class308.aClass70_Sub2_3.method33888(5);
		Class429.aClass70_Sub1_Sub1_2.method14253(5);
		Class419.aClass70_Sub1_Sub2_11.method14738(5);
		Class69.aClass70_Sub1_Sub2_9.method14738(5);
		Class135.aClass70_Sub1_Sub2_10.method14738(5);
		Class399.aClass428_1.method27915(5);
		Class107.aClass454_3.method28441(5);
		Class342.aClass629_3.method33837(5);
		Class3_Sub20.aClass625_1.method33785(5);
		Class369.aClass413_1.method27708(5);
		Class375.aClass200_1.method24137(5);
		Class16.aClass616_3.method33686(5);
		FileFilter_Sub1.aClass597_1.method33468(5);
		Class284.aClass465_1.method28629(5);
		Class623.aClass415_2.method27756(5);
		Class583.method33268(5);
		Class355.method26639(50);
		Class379.aClass312_1.method25811(50);
		Class148.method23117(5);
		Class11_Sub1.method816(5);
		client.aClass161_14.method23240(5);
		client.aClass161_15.method23240(5);
		Class250.aClass161_30.method23240(5);
		Class525.aClass161_61.method23240(5);
		client.aClass161_16.method23240(5);
	}

	@OriginalMember(owner = "client!uf", name = "hb", descriptor = "(I)V", line = 3719)
	static final void method29440() {
		for (@Pc(1) int local1 = 0; local1 < client.anInt3163 * 1758488217; local1++) {
			@Pc(10) int local10 = client.anIntArray303[local1];
			@Pc(16) Class3_Sub29 local16 = (Class3_Sub29) client.aClass581_21.method33217((long) local10);
			if (local16 != null) {
				@Pc(22) Class26_Sub1_Sub1_Sub1_Sub1 local22 = (Class26_Sub1_Sub1_Sub1_Sub1) local16.anObject2;
				Class536.method32541(local22, false);
			}
		}
	}

	@OriginalMember(owner = "client!uf", name = "i", descriptor = "(Lclient!vs;I)V", line = 3980)
	static final void method29441(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5318 += arg0.anIntArray497[-2140198955 * arg0.anInt5318] * -836839043;
	}

	@OriginalMember(owner = "client!uf", name = "aod", descriptor = "(Lclient!vs;B)V", line = 11539)
	static final void method29438(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = Class510.aClass3_Sub45_37.aClass60_Sub7_1.method13280();
	}
}
