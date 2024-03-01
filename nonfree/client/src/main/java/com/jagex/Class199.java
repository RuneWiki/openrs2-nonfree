package com.jagex;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gj")
public class Class199 {

	@OriginalMember(owner = "client!gj", name = "p", descriptor = "Lclient!gj;")
	static final Class199 aClass199_1 = new Class199(0);

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "Lclient!gj;")
	static final Class199 aClass199_2 = new Class199(1);

	@OriginalMember(owner = "client!gj", name = "g", descriptor = "I")
	final int anInt3689;

	@OriginalMember(owner = "client!gj", name = "<init>", descriptor = "(I)V", line = 8)
	Class199(@OriginalArg(0) int arg0) {
		this.anInt3689 = arg0 * 942241065;
	}

	@OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)Lclient!gj;", line = 13)
	public static Class199 method24131(@OriginalArg(0) int arg0) {
		if (arg0 == aClass199_1.anInt3689 * -1329465575) {
			return aClass199_1;
		} else if (arg0 == aClass199_2.anInt3689 * -1329465575) {
			return aClass199_2;
		} else {
			return null;
		}
	}

	@OriginalMember(owner = "client!gj", name = "fj", descriptor = "(I)V", line = 2332)
	public static void method24133() {
		if (Class350.aFrame3 != null) {
			return;
		}
		@Pc(6) int local6 = client.anInt3022 * 426445859;
		@Pc(10) int local10 = client.anInt3024 * 2076797327;
		@Pc(20) int local20 = client.anInt3026 * -2098608041 - Class128.anInt3317 * 2037417253 - local6;
		@Pc(30) int local30 = Class613.anInt5546 * -457495395 - Class575.anInt5428 * 1261116487 - local10;
		if (local6 <= 0 && local20 <= 0 && local10 <= 0 && local30 <= 0) {
			return;
		}
		try {
			@Pc(41) Container local41 = Class3_Sub45.method13019();
			@Pc(43) int local43 = 0;
			@Pc(45) int local45 = 0;
			if (local41 == Class212.aFrame2) {
				@Pc(51) Insets local51 = Class212.aFrame2.getInsets();
				local43 = local51.left;
				local45 = local51.top;
			}
			@Pc(60) Graphics local60 = local41.getGraphics();
			local60.setColor(Color.black);
			if (local6 > 0) {
				local60.fillRect(local43, local45, local6, Class613.anInt5546 * -457495395);
			}
			if (local10 > 0) {
				local60.fillRect(local43, local45, client.anInt3026 * -2098608041, local10);
			}
			if (local20 > 0) {
				local60.fillRect(client.anInt3026 * -2098608041 + local43 - local20, local45, local20, Class613.anInt5546 * -457495395);
			}
			if (local30 > 0) {
				local60.fillRect(local43, local45 + Class613.anInt5546 * -457495395 - local30, client.anInt3026 * -2098608041, local30);
			}
		} catch (@Pc(117) Exception local117) {
		}
	}

	@OriginalMember(owner = "client!gj", name = "jx", descriptor = "(Lclient!fo;Lclient!fw;Lclient!vs;B)V", line = 5763)
	static final void method24132(@OriginalArg(0) Class178 arg0, @OriginalArg(1) Class186 arg1, @OriginalArg(2) Class536 arg2) {
		@Pc(12) int local12 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		@Pc(25) int local25 = arg2.anIntArray496[(arg2.anInt5319 -= 312124549) * 960738381];
		if (local25 >= 1 && local25 <= 10) {
			arg0.method23439(local25 - 1, local12);
		}
	}

	@OriginalMember(owner = "client!gj", name = "kd", descriptor = "(Lclient!ahi;IIIIIIIIII)V", line = 10348)
	static final void method24134(@OriginalArg(0) Class3_Sub42 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9) {
		if (!Class33.method7569(arg1, null)) {
			return;
		}
		if (arg0 == null || arg0.method20199()) {
			@Pc(22) Class186 local22 = Class178.aClass186Array1[arg1];
			client.method22371(local22, local22.method23919(), -1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9);
		} else {
			Class490.method29244(arg0, true, false);
		}
	}
}
