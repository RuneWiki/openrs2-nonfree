package com.jagex;

import java.awt.Frame;
import java.awt.image.BufferedImage;
import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ko")
public class Class283 {

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "[I")
	public int[] anIntArray410;

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "Lclient!ams;")
	public Class3_Sub1_Sub13 aClass3_Sub1_Sub13_1;

	@OriginalMember(owner = "client!ko", name = "p", descriptor = "I")
	public int anInt4351;

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(Lclient!ahb;)Lclient!ko;", line = 13)
	public static Class283 method25446(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class283 local3 = new Class283();
		local3.anInt4351 = arg0.method20271() * -1424853715;
		local3.aClass3_Sub1_Sub13_1 = Class622.aClass580_2.method33211(local3.anInt4351 * 189047461);
		return local3;
	}

	@OriginalMember(owner = "client!ko", name = "a", descriptor = "(Lclient!ahb;)Lclient!ko;", line = 13)
	public static Class283 method25447(@OriginalArg(0) Class3_Sub41 arg0) {
		@Pc(3) Class283 local3 = new Class283();
		local3.anInt4351 = arg0.method20271() * -1424853715;
		local3.aClass3_Sub1_Sub13_1 = Class622.aClass580_2.method33211(local3.anInt4351 * 189047461);
		return local3;
	}

	@OriginalMember(owner = "client!ko", name = "g", descriptor = "(Lclient!wn;Ljava/awt/Frame;B)V", line = 52)
	public static void method25453(@OriginalArg(0) Class556 arg0, @OriginalArg(1) Frame arg1) {
		arg0.method32804();
		arg1.setVisible(false);
		arg1.dispose();
	}

	@OriginalMember(owner = "client!ko", name = "b", descriptor = "(Ljava/awt/image/BufferedImage;I)[I", line = 116)
	public static int[] method25454(@OriginalArg(0) BufferedImage arg0) {
		if (arg0.getType() != 10 && arg0.getType() != 0) {
			return arg0.getRGB(0, 0, arg0.getWidth(), arg0.getHeight(), null, 0, arg0.getWidth());
		}
		@Pc(8) Object local8 = null;
		@Pc(19) int[] local19 = arg0.getRaster().getPixels(0, 0, arg0.getWidth(), arg0.getHeight(), (int[]) local8);
		@Pc(26) int[] local26 = new int[arg0.getWidth() * arg0.getHeight()];
		@Pc(32) int local32;
		if (arg0.getType() == 10) {
			for (local32 = 0; local32 < local26.length; local32++) {
				local26[local32] = local19[local32] + (local19[local32] << 16) + (local19[local32] << 8) + -16777216;
			}
		} else {
			for (local32 = 0; local32 < local26.length; local32++) {
				@Pc(69) int local69 = local32 * 2;
				local26[local32] = (local19[local69] << 8) + (local19[local69] << 16) + local19[local69] + (local19[local69 + 1] << 24);
			}
		}
		return local26;
	}

	@OriginalMember(owner = "client!ko", name = "s", descriptor = "(I)Ljava/io/File;", line = 360)
	public static File method25449() {
		return Class510.aFile4;
	}

	@OriginalMember(owner = "client!ko", name = "v", descriptor = "(Lclient!de;Lclient!ug;I)I", line = 1567)
	static final int method25448(@OriginalArg(0) Class21 arg0, @OriginalArg(1) Class501 arg1) {
		if (arg1.anInt5235 * -1865535773 != -1) {
			return arg1.anInt5235 * -1865535773;
		}
		if (arg1.anInt5236 * -446644153 != -1) {
			@Pc(25) Class133 local25 = arg0.aClass134_7.method22906(arg1.anInt5236 * -446644153);
			if (!local25.aBoolean620) {
				return local25.aShort160;
			}
		}
		return arg1.anInt5237 * -1224008395;
	}

	@OriginalMember(owner = "client!ko", name = "hx", descriptor = "(Lclient!vs;B)V", line = 5409)
	static final void method25450(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class174.method23395(local16, local22, false, 1, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "mg", descriptor = "(Lclient!vs;I)V", line = 6346)
	static final void method25456(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		@Pc(22) Class186 local22 = Class178.aClass186Array1[local12 >> 16];
		Class403.method27632(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!ko", name = "ml", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 6381)
	static final void method25457(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray42[(arg2.anInt5315 -= 790013775) * 996806575];
		if (Class201.method24159(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray19 = Class484.method29109(local13, arg2);
		arg0.aBoolean644 = true;
	}

	@OriginalMember(owner = "client!ko", name = "alr", descriptor = "(Lclient!vs;S)V", line = 11127)
	static final void method25451(@OriginalArg(0) Class536 arg0) {
		Class288.method25511(arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]);
	}

	@OriginalMember(owner = "client!ko", name = "li", descriptor = "(Ljava/lang/String;I)Z", line = 11326)
	public static boolean method25455(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return false;
		}
		for (@Pc(6) int local6 = 0; local6 < client.anInt3042 * -1645830611; local6++) {
			if (arg0.equalsIgnoreCase(client.aClass313Array1[local6].aString202)) {
				return true;
			}
		}
		if (arg0.equalsIgnoreCase(Class245.aClass26_Sub1_Sub1_Sub1_Sub2_3.aString75)) {
			return true;
		} else {
			return false;
		}
	}

	@OriginalMember(owner = "client!ko", name = "ark", descriptor = "(Lclient!vs;I)V", line = 12096)
	static final void method25452(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(17) Class452 local17 = Class107.aClass454_3.method28448(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17.anInt5054 * -589352987;
	}
}
