package com.jagex;

import java.awt.Image;
import java.awt.MediaTracker;
import java.awt.Toolkit;
import java.awt.image.PixelGrabber;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ca")
public class Class107 {

	@OriginalMember(owner = "client!ca", name = "jf", descriptor = "I")
	static int anInt2992;

	@OriginalMember(owner = "client!ca", name = "hi", descriptor = "Lclient!sg;")
	public static Class454 aClass454_3;

	@OriginalMember(owner = "client!ca", name = "<init>", descriptor = "()V", line = 4)
	Class107() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "(IIIB)V", line = 36)
	public static void method21921(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		Class293.method25561(new Class66_Sub1(arg0, arg1, arg2, client.anInt3087 * -1664017337, Class117.aClass51_2.anInt1113 * -1998186295, Class117.aClass51_2.anInt1115 * 196916579, Class117.aClass51_2.method9820(), Class117.aClass51_2.method9819(), Class398.aClass347_3.method26523()));
	}

	@OriginalMember(owner = "client!ca", name = "g", descriptor = "([Ljava/lang/String;[IB)V", line = 43)
	public static void method21922(@OriginalArg(0) String[] arg0, @OriginalArg(1) int[] arg1) {
		Class492.method29293(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!ca", name = "u", descriptor = "(IB)[I", line = 96)
	public static int[] method21928(@OriginalArg(0) int arg0) {
		@Pc(2) int[] local2 = new int[3];
		Class313.method25819(Class431.method27960(arg0));
		local2[0] = Class599.aCalendar2.get(5);
		local2[1] = Class599.aCalendar2.get(2);
		local2[2] = Class599.aCalendar2.get(1);
		return local2;
	}

	@OriginalMember(owner = "client!ca", name = "h", descriptor = "([BB)Lclient!co;", line = 110)
	static Class6 method21920(@OriginalArg(0) byte[] arg0) {
		if (arg0 == null) {
			throw new RuntimeException("");
		}
		while (true) {
			try {
				@Pc(11) Image local11 = Toolkit.getDefaultToolkit().createImage(arg0);
				@Pc(16) MediaTracker local16 = new MediaTracker(Class524.anApplet2);
				local16.addImage(local11, 0);
				local16.waitForAll();
				@Pc(26) int local26 = local11.getWidth(Class524.anApplet2);
				@Pc(30) int local30 = local11.getHeight(Class524.anApplet2);
				if (!local16.isErrorAny() && local26 >= 0 && local30 >= 0) {
					@Pc(47) int[] local47 = new int[local26 * local30];
					@Pc(59) PixelGrabber local59 = new PixelGrabber(local11, 0, 0, local26, local30, local47, 0, local26);
					local59.grabPixels();
					return Class613.aClass21_13.method17113(local47, 0, local26, local26, local30);
				}
				throw new RuntimeException("");
			} catch (@Pc(72) InterruptedException local72) {
			}
		}
	}

	@OriginalMember(owner = "client!ca", name = "n", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;", line = 318)
	static String method21926(@OriginalArg(0) String arg0) {
		@Pc(1) String local1 = null;
		@Pc(5) int local5 = arg0.indexOf("--> ");
		if (local5 >= 0) {
			local1 = arg0.substring(0, local5 + 4);
			arg0 = arg0.substring(local5 + 4);
		}
		if (arg0.startsWith("directlogin ")) {
			@Pc(30) int local30 = arg0.indexOf(" ", "directlogin ".length());
			if (local30 >= 0) {
				@Pc(35) int local35 = arg0.length();
				arg0 = arg0.substring(0, local30) + " ";
				for (@Pc(51) int local51 = local30 + 1; local51 < local35; local51++) {
					arg0 = arg0 + "*";
				}
			}
		}
		return local1 == null ? arg0 : local1 + arg0;
	}

	@OriginalMember(owner = "client!ca", name = "rv", descriptor = "(Lclient!vs;I)V", line = 7332)
	static final void method21927(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3507 * -1827200975;
	}

	@OriginalMember(owner = "client!ca", name = "aha", descriptor = "(Lclient!vs;B)V", line = 10366)
	static final void method21923(@OriginalArg(0) Class536 arg0) {
		@Pc(17) int local17 = client.anIntArrayArrayArray15[arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381]].length >> 1;
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local17;
	}

	@OriginalMember(owner = "client!ca", name = "alf", descriptor = "(Lclient!vs;I)V", line = 11117)
	static final void method21924(@OriginalArg(0) Class536 arg0) {
		Class155.method23174();
	}

	@OriginalMember(owner = "client!ca", name = "mu", descriptor = "(Ljava/lang/String;B)V", line = 11572)
	public static final void method21925(@OriginalArg(0) String arg0) {
		if (arg0 == null) {
			return;
		}
		@Pc(8) String local8 = Class65_Sub1.method13183(arg0, Class141.aClass623_1);
		if (local8 == null) {
			return;
		}
		for (@Pc(13) int local13 = 0; local13 < client.anInt3174 * 918731051; local13++) {
			@Pc(22) Class123 local22 = client.aClass123Array1[local13];
			@Pc(25) String local25 = local22.aString161;
			@Pc(30) String local30 = Class65_Sub1.method13183(local25, Class141.aClass623_1);
			if (Class574.method33111(arg0, local8, local25, local30)) {
				client.anInt3174 -= 649346435;
				for (@Pc(43) int local43 = local13; local43 < client.anInt3174 * 918731051; local43++) {
					client.aClass123Array1[local43] = client.aClass123Array1[local43 + 1];
				}
				client.anInt3052 = client.anInt3138 * 1482989417;
				@Pc(65) Class82 local65 = Class406.method27657();
				@Pc(71) Class3_Sub23 local71 = Class269.method25284(Class311.aClass311_82, local65.aClass577_2);
				local71.aClass3_Sub41_Sub1_1.method20250(Class43_Sub2.method8763(arg0));
				local71.aClass3_Sub41_Sub1_1.method20260(arg0);
				local65.method21601(local71);
				break;
			}
		}
	}
}
