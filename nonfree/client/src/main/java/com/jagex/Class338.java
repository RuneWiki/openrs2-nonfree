package com.jagex;

import java.io.IOException;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!n")
public class Class338 {

	@OriginalMember(owner = "client!n", name = "x", descriptor = "Lclient!wv;")
	static Class563 aClass563_1;

	@OriginalMember(owner = "client!n", name = "a", descriptor = "[I")
	static int[] anIntArray421;

	@OriginalMember(owner = "client!n", name = "h", descriptor = "Lclient!s;")
	static Class448 aClass448_1;

	@OriginalMember(owner = "client!n", name = "p", descriptor = "I")
	static final int anInt4599 = 3;

	@OriginalMember(owner = "client!n", name = "s", descriptor = "Lclient!wg;")
	static Class550 aClass550_1;

	@OriginalMember(owner = "client!n", name = "y", descriptor = "Lclient!ww;")
	static Class564 aClass564_1;

	@OriginalMember(owner = "client!n", name = "at", descriptor = "I")
	static int anInt4600;

	@OriginalMember(owner = "client!n", name = "ba", descriptor = "Z")
	static boolean aBoolean719;

	@OriginalMember(owner = "client!n", name = "g", descriptor = "I")
	static int anInt4597 = 0;

	@OriginalMember(owner = "client!n", name = "l", descriptor = "I")
	static int anInt4598 = 0;

	@OriginalMember(owner = "client!n", name = "j", descriptor = "(IIIIB)Lclient!agq;", line = 17)
	public static Class3_Sub32 method26416(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(2) Class3_Sub32[] local2 = Class3_Sub32.aClass3_Sub32Array1;
		synchronized (Class3_Sub32.aClass3_Sub32Array1) {
			if (Class3_Sub32.anInt1341 * 2037424989 == 0) {
				return new Class3_Sub32(arg0, arg1, arg2, arg3);
			} else {
				Class3_Sub32.aClass3_Sub32Array1[(Class3_Sub32.anInt1341 -= -676345611) * 2037424989].method11704(arg0, arg1, arg2, arg3);
				return Class3_Sub32.aClass3_Sub32Array1[Class3_Sub32.anInt1341 * 2037424989];
			}
		}
	}

	@OriginalMember(owner = "client!n", name = "<init>", descriptor = "()V", line = 34)
	Class338() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!n", name = "i", descriptor = "()V", line = 39)
	public static void method26375() {
		if (2 == 1115111877 * client.anInt3039 && (!Class146.method23084() && !Class239.method24624())) {
			Class166.method23342(4);
		}
	}

	@OriginalMember(owner = "client!n", name = "o", descriptor = "()V", line = 39)
	public static void method26388() {
		if (2 == 1115111877 * client.anInt3039 && (!Class146.method23084() && !Class239.method24624())) {
			Class166.method23342(4);
		}
	}

	@OriginalMember(owner = "client!n", name = "f", descriptor = "()V", line = 45)
	static void method26376() {
		aClass448_1 = Class448.aClass448_2;
		aClass563_1 = Class563.aClass563_4;
		aClass550_1 = Class550.aClass550_12;
		Class13_Sub13.aClass555_1 = Class555.aClass555_7;
		Class415.aClass547_1 = Class547.aClass547_6;
		aClass564_1 = Class564.aClass564_5;
		Class603.aString246 = null;
	}

	@OriginalMember(owner = "client!n", name = "at", descriptor = "()Z", line = 55)
	static boolean method26377() {
		return aClass448_1 != null;
	}

	@OriginalMember(owner = "client!n", name = "af", descriptor = "()Z", line = 55)
	static boolean method26378() {
		return aClass448_1 != null;
	}

	@OriginalMember(owner = "client!n", name = "k", descriptor = "()Z", line = 55)
	static boolean method26394() {
		return aClass448_1 != null;
	}

	@OriginalMember(owner = "client!n", name = "ak", descriptor = "(Ljava/lang/String;)V", line = 59)
	public static void method26379(@OriginalArg(0) String arg0) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_13, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		Class13_Sub13.aClass555_1 = Class555.aClass555_2;
	}

	@OriginalMember(owner = "client!n", name = "aa", descriptor = "(Ljava/lang/String;)V", line = 59)
	public static void method26380(@OriginalArg(0) String arg0) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_13, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		Class13_Sub13.aClass555_1 = Class555.aClass555_2;
	}

	@OriginalMember(owner = "client!n", name = "g", descriptor = "(B)I", line = 74)
	public static int method26414() {
		@Pc(2) Class64_Sub1 local2 = Class450.method28382();
		Class166.method23343(local2);
		return local2.method13085();
	}

	@OriginalMember(owner = "client!n", name = "ah", descriptor = "()V", line = 85)
	public static void method26373() {
		if (client.anInt3039 * 1115111877 == 16) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_49, client.aClass82_1.aClass577_2);
			client.aClass82_1.method21601(local11);
			Class415.aClass547_1 = Class547.aClass547_3;
			Class603.aString246 = null;
		}
	}

	@OriginalMember(owner = "client!n", name = "an", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", line = 93)
	public static void method26382(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_47, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg1);
		local11.aClass3_Sub41_Sub1_1.method20250(arg2);
		local11.aClass3_Sub41_Sub1_1.method20250(arg3 ? 1 : 0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg4);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		if (arg2 < 13) {
			client.aBoolean579 = true;
			Class70_Sub1.method14734();
		}
		aClass550_1 = Class550.aClass550_4;
	}

	@OriginalMember(owner = "client!n", name = "aj", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", line = 93)
	public static void method26385(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_47, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg1);
		local11.aClass3_Sub41_Sub1_1.method20250(arg2);
		local11.aClass3_Sub41_Sub1_1.method20250(arg3 ? 1 : 0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg4);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		if (arg2 < 13) {
			client.aBoolean579 = true;
			Class70_Sub1.method14734();
		}
		aClass550_1 = Class550.aClass550_4;
	}

	@OriginalMember(owner = "client!n", name = "as", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", line = 93)
	public static void method26410(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_47, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg1);
		local11.aClass3_Sub41_Sub1_1.method20250(arg2);
		local11.aClass3_Sub41_Sub1_1.method20250(arg3 ? 1 : 0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg4);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		if (arg2 < 13) {
			client.aBoolean579 = true;
			Class70_Sub1.method14734();
		}
		aClass550_1 = Class550.aClass550_4;
	}

	@OriginalMember(owner = "client!n", name = "ai", descriptor = "(Ljava/lang/String;Ljava/lang/String;IZLjava/lang/String;)V", line = 93)
	public static void method26411(@OriginalArg(0) String arg0, @OriginalArg(1) String arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3, @OriginalArg(4) String arg4) {
		if (client.anInt3039 * 1115111877 != 16) {
			return;
		}
		@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_47, client.aClass82_1.aClass577_2);
		local11.aClass3_Sub41_Sub1_1.method20251(0);
		@Pc(22) int local22 = local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
		local11.aClass3_Sub41_Sub1_1.method20260(arg0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg1);
		local11.aClass3_Sub41_Sub1_1.method20250(arg2);
		local11.aClass3_Sub41_Sub1_1.method20250(arg3 ? 1 : 0);
		local11.aClass3_Sub41_Sub1_1.method20260(arg4);
		local11.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
		local11.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local22, local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
		local11.aClass3_Sub41_Sub1_1.method20265(local11.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local22);
		client.aClass82_1.method21601(local11);
		if (arg2 < 13) {
			client.aBoolean579 = true;
			Class70_Sub1.method14734();
		}
		aClass550_1 = Class550.aClass550_4;
	}

	@OriginalMember(owner = "client!n", name = "ax", descriptor = "(I)V", line = 114)
	public static void method26381(@OriginalArg(0) int arg0) {
		if (client.anInt3039 * 1115111877 == 16) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_46, client.aClass82_1.aClass577_2);
			local11.aClass3_Sub41_Sub1_1.method20250(arg0);
			client.aClass82_1.method21601(local11);
		}
	}

	@OriginalMember(owner = "client!n", name = "av", descriptor = "(I)V", line = 114)
	public static void method26387(@OriginalArg(0) int arg0) {
		if (client.anInt3039 * 1115111877 == 16) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_46, client.aClass82_1.aClass577_2);
			local11.aClass3_Sub41_Sub1_1.method20250(arg0);
			client.aClass82_1.method21601(local11);
		}
	}

	@OriginalMember(owner = "client!n", name = "aq", descriptor = "(I)V", line = 114)
	public static void method26409(@OriginalArg(0) int arg0) {
		if (client.anInt3039 * 1115111877 == 16) {
			@Pc(11) Class3_Sub23 local11 = Class269.method25284(Class311.aClass311_46, client.aClass82_1.aClass577_2);
			local11.aClass3_Sub41_Sub1_1.method20250(arg0);
			client.aClass82_1.method21601(local11);
		}
	}

	@OriginalMember(owner = "client!n", name = "az", descriptor = "()Lclient!wg;", line = 126)
	public static Class550 method26374() {
		return aClass550_1 == null ? Class550.aClass550_12 : aClass550_1;
	}

	@OriginalMember(owner = "client!n", name = "al", descriptor = "()Lclient!wg;", line = 126)
	public static Class550 method26390() {
		return aClass550_1 == null ? Class550.aClass550_12 : aClass550_1;
	}

	@OriginalMember(owner = "client!n", name = "ao", descriptor = "()Lclient!wm;", line = 131)
	public static Class555 method26384() {
		return Class13_Sub13.aClass555_1 == null ? Class555.aClass555_7 : Class13_Sub13.aClass555_1;
	}

	@OriginalMember(owner = "client!n", name = "au", descriptor = "()Lclient!ww;", line = 136)
	public static Class564 method26383() {
		return aClass564_1 == null ? Class564.aClass564_5 : aClass564_1;
	}

	@OriginalMember(owner = "client!n", name = "ap", descriptor = "()Lclient!ww;", line = 136)
	public static Class564 method26392() {
		return aClass564_1 == null ? Class564.aClass564_5 : aClass564_1;
	}

	@OriginalMember(owner = "client!n", name = "ab", descriptor = "()Lclient!ww;", line = 136)
	public static Class564 method26393() {
		return aClass564_1 == null ? Class564.aClass564_5 : aClass564_1;
	}

	@OriginalMember(owner = "client!n", name = "ay", descriptor = "()Lclient!wd;", line = 141)
	public static Class547 method26398() {
		return Class415.aClass547_1 == null ? Class547.aClass547_6 : Class415.aClass547_1;
	}

	@OriginalMember(owner = "client!n", name = "ar", descriptor = "()Ljava/lang/String;", line = 146)
	public static String method26395() {
		return Class603.aString246;
	}

	@OriginalMember(owner = "client!n", name = "ag", descriptor = "()Ljava/lang/String;", line = 146)
	public static String method26396() {
		return Class603.aString246;
	}

	@OriginalMember(owner = "client!n", name = "am", descriptor = "()Ljava/lang/String;", line = 146)
	public static String method26397() {
		return Class603.aString246;
	}

	@OriginalMember(owner = "client!n", name = "ae", descriptor = "()Ljava/lang/String;", line = 146)
	public static String method26399() {
		return Class603.aString246;
	}

	@OriginalMember(owner = "client!n", name = "ad", descriptor = "()Ljava/lang/String;", line = 146)
	public static String method26400() {
		return Class603.aString246;
	}

	@OriginalMember(owner = "client!n", name = "aw", descriptor = "(Lclient!wg;)V", line = 150)
	static void method26401(@OriginalArg(0) Class550 arg0) {
		aClass550_1 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "ac", descriptor = "(Lclient!wg;)V", line = 150)
	static void method26402(@OriginalArg(0) Class550 arg0) {
		aClass550_1 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bw", descriptor = "(Lclient!wg;)V", line = 150)
	static void method26403(@OriginalArg(0) Class550 arg0) {
		aClass550_1 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bp", descriptor = "(Lclient!wm;)V", line = 154)
	static void method26404(@OriginalArg(0) Class555 arg0) {
		Class13_Sub13.aClass555_1 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bd", descriptor = "(Lclient!ww;)V", line = 158)
	static void method26405(@OriginalArg(0) Class564 arg0) {
		aClass564_1 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bm", descriptor = "(Ljava/lang/String;)V", line = 167)
	static void method26391(@OriginalArg(0) String arg0) {
		Class415.aClass547_1 = Class547.aClass547_4;
		Class603.aString246 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bs", descriptor = "(Ljava/lang/String;)V", line = 167)
	static void method26406(@OriginalArg(0) String arg0) {
		Class415.aClass547_1 = Class547.aClass547_4;
		Class603.aString246 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bf", descriptor = "(Ljava/lang/String;)V", line = 167)
	static void method26408(@OriginalArg(0) String arg0) {
		Class415.aClass547_1 = Class547.aClass547_4;
		Class603.aString246 = arg0;
	}

	@OriginalMember(owner = "client!n", name = "bt", descriptor = "()V", line = 172)
	static void method26389() {
		if (aClass448_1 == null) {
			return;
		}
		try {
			@Pc(10) short local10;
			if (anInt4598 * -254105187 == 0) {
				local10 = 250;
			} else {
				local10 = 2000;
			}
			anInt4597 += -632880231;
			if (anInt4597 * 389521577 > local10) {
				Class13_Sub20.method7228();
			}
			@Pc(63) int local63;
			if (aClass448_1 == Class448.aClass448_2) {
				client.aClass82_1.method21606(Class49.method9255(Class570.aClass585_5.method33272(), 15000), Class570.aClass585_5.aString242);
				client.aClass82_1.method21599();
				@Pc(44) Class3_Sub23 local44 = Class368.method26925();
				local44.aClass3_Sub41_Sub1_1.method20250(Class293.aClass293_1.anInt4371 * 946648601);
				local44.aClass3_Sub41_Sub1_1.method20251(0);
				local63 = local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local44.aClass3_Sub41_Sub1_1.method20251(797);
				local44.aClass3_Sub41_Sub1_1.method20251(1);
				anIntArray421 = Class25.method6478(local44);
				@Pc(83) int local83 = local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237;
				local44.aClass3_Sub41_Sub1_1.method20260(client.aString147);
				local44.aClass3_Sub41_Sub1_1.method20251(client.anInt3073 * -720912181);
				local44.aClass3_Sub41_Sub1_1.method20254(client.anInt3082 * 277198609);
				local44.aClass3_Sub41_Sub1_1.method20254(client.anInt3056 * -116258853);
				local44.aClass3_Sub41_Sub1_1.method20260(Class511.aString232);
				local44.aClass3_Sub41_Sub1_1.method20250(Class469.aClass530_2.method33765());
				local44.aClass3_Sub41_Sub1_1.method20250(client.aClass543_2.anInt5326 * 1050721143);
				Class527.method32429(local44.aClass3_Sub41_Sub1_1);
				@Pc(135) String local135 = client.aString145;
				local44.aClass3_Sub41_Sub1_1.method20250(local135 == null ? 0 : 1);
				if (local135 != null) {
					local44.aClass3_Sub41_Sub1_1.method20260(local135);
				}
				Class298.aClass3_Sub47_1.method13198(local44.aClass3_Sub41_Sub1_1);
				local44.aClass3_Sub41_Sub1_1.anInt2803 += -2137895021;
				local44.aClass3_Sub41_Sub1_1.method20296(anIntArray421, local83, local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237);
				local44.aClass3_Sub41_Sub1_1.method20265(local44.aClass3_Sub41_Sub1_1.anInt2803 * 62066237 - local63);
				client.aClass82_1.method21601(local44);
				client.aClass82_1.method21617();
				aClass448_1 = Class448.aClass448_3;
			}
			if (aClass448_1 == Class448.aClass448_3) {
				if (client.aClass82_1.method21621() == null) {
					Class13_Sub20.method7228();
					return;
				}
				if (!client.aClass82_1.method21621().method12856(1)) {
					return;
				}
				client.aClass82_1.method21621().method12848(client.aClass82_1.aClass3_Sub41_Sub1_2.aByteArray51, 0, 1);
				aClass563_1 = (Class563) Class356.method26649(Class63.method13052(), client.aClass82_1.aClass3_Sub41_Sub1_2.aByteArray51[0] & 0xFF);
				if (aClass563_1 == Class563.aClass563_6) {
					client.aClass82_1.aClass577_2 = new Class577(anIntArray421);
					@Pc(249) int[] local249 = new int[4];
					for (local63 = 0; local63 < 4; local63++) {
						local249[local63] = anIntArray421[local63] + 50;
					}
					client.aClass82_1.aClass577_3 = new Class577(local249);
					new Class577(local249);
					client.aClass82_1.aClass3_Sub41_Sub1_2.method19823(client.aClass82_1.aClass577_3);
					Class166.method23342(16);
					client.aClass82_1.method21599();
					client.aClass82_1.aClass3_Sub41_Sub1_2.anInt2803 = 0;
					client.aClass82_1.aClass301_3 = null;
					client.aClass82_1.aClass301_1 = null;
					client.aClass82_1.aClass301_4 = null;
					client.aClass82_1.anInt2918 = 0;
					Class424.aClass165_1.aClass460_1.method28564();
					Class60_Sub13.method13461();
				} else {
					client.aClass82_1.method21604();
				}
				client.aClass82_1.aClass301_2 = null;
				aClass448_1 = null;
			}
		} catch (@Pc(320) IOException local320) {
			Class13_Sub20.method7228();
		}
	}

	@OriginalMember(owner = "client!n", name = "bg", descriptor = "()V", line = 265)
	static void method26386() {
		client.aClass82_1.method21604();
		if (anInt4598 * -254105187 < 2) {
			Class570.aClass585_5.method33273();
			anInt4597 = 0;
			anInt4598 += 1274815669;
			aClass448_1 = Class448.aClass448_2;
		} else {
			aClass448_1 = null;
			aClass563_1 = Class563.aClass563_3;
			Class166.method23342(2);
		}
	}

	@OriginalMember(owner = "client!n", name = "bk", descriptor = "()V", line = 265)
	static void method26407() {
		client.aClass82_1.method21604();
		if (anInt4598 * -254105187 < 2) {
			Class570.aClass585_5.method33273();
			anInt4597 = 0;
			anInt4598 += 1274815669;
			aClass448_1 = Class448.aClass448_2;
		} else {
			aClass448_1 = null;
			aClass563_1 = Class563.aClass563_3;
			Class166.method23342(2);
		}
	}

	@OriginalMember(owner = "client!n", name = "br", descriptor = "()V", line = 265)
	static void method26412() {
		client.aClass82_1.method21604();
		if (anInt4598 * -254105187 < 2) {
			Class570.aClass585_5.method33273();
			anInt4597 = 0;
			anInt4598 += 1274815669;
			aClass448_1 = Class448.aClass448_2;
		} else {
			aClass448_1 = null;
			aClass563_1 = Class563.aClass563_3;
			Class166.method23342(2);
		}
	}

	@OriginalMember(owner = "client!n", name = "kt", descriptor = "(IIIZI)V", line = 10257)
	static final void method26415(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) boolean arg3) {
		if (Class33.method7569(arg0, null)) {
			Class68.method14036(Class178.aClass186Array1[arg0].aClass178Array8, -1, arg1, arg2, arg3);
		}
	}

	@OriginalMember(owner = "client!n", name = "anb", descriptor = "(Lclient!vs;I)V", line = 11462)
	static final void method26413(@OriginalArg(0) Class536 arg0) {
		Class510.aClass3_Sub45_37.method12999(Class510.aClass3_Sub45_37.aClass60_Sub33_1, arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
		Class26_Sub1_Sub1_Sub1.method16728();
		client.aBoolean573 = false;
	}
}
