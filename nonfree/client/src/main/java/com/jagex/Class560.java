package com.jagex;

import java.awt.Point;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!tq")
public class Class560 {

	@OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
	public static final int anInt5281 = 2;

	@OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
	public static final int anInt5282 = 8;

	@OriginalMember(owner = "client!tq", name = "y", descriptor = "I")
	public static final int anInt5283 = 16;

	@OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
	public static final int anInt5284 = 1;

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "I")
	public static final int anInt5285 = 4;

	@OriginalMember(owner = "client!tq", name = "w", descriptor = "B")
	final byte aByte165;

	@OriginalMember(owner = "client!tq", name = "t", descriptor = "B")
	final byte aByte166;

	@OriginalMember(owner = "client!tq", name = "r", descriptor = "[I")
	final int[] anIntArray496;

	@OriginalMember(owner = "client!tq", name = "g", descriptor = "[I")
	final int[] anIntArray494;

	@OriginalMember(owner = "client!tq", name = "z", descriptor = "[I")
	final int[] anIntArray495;

	@OriginalMember(owner = "client!tq", name = "q", descriptor = "S")
	final short aShort178;

	@OriginalMember(owner = "client!tq", name = "x", descriptor = "S")
	final short aShort179;

	@OriginalMember(owner = "client!tq", name = "d", descriptor = "S")
	final short aShort180;

	@OriginalMember(owner = "client!tq", name = "s", descriptor = "S")
	final short aShort181;

	@OriginalMember(owner = "client!tq", name = "j", descriptor = "[S")
	final short[] aShortArray139;

	@OriginalMember(owner = "client!tq", name = "i", descriptor = "[S")
	final short[] aShortArray141;

	@OriginalMember(owner = "client!tq", name = "k", descriptor = "[S")
	final short[] aShortArray140;

	@OriginalMember(owner = "client!tq", name = "<init>", descriptor = "(Lclient!tk;IIIIIIIIIIIIII)V", line = 24)
	Class560(@OriginalArg(0) Class556 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7, @OriginalArg(8) int arg8, @OriginalArg(9) int arg9, @OriginalArg(10) int arg10, @OriginalArg(11) int arg11, @OriginalArg(12) int arg12, @OriginalArg(13) int arg13, @OriginalArg(14) int arg14) {
		this.aByte165 = (byte) arg1;
		this.aByte166 = (byte) arg2;
		this.anIntArray496 = new int[4];
		this.anIntArray494 = new int[4];
		this.anIntArray495 = new int[4];
		this.anIntArray496[0] = arg3;
		this.anIntArray496[1] = arg4;
		this.anIntArray496[2] = arg5;
		this.anIntArray496[3] = arg6;
		this.anIntArray494[0] = arg7;
		this.anIntArray494[1] = arg8;
		this.anIntArray494[2] = arg9;
		this.anIntArray494[3] = arg10;
		this.anIntArray495[0] = arg11;
		this.anIntArray495[1] = arg12;
		this.anIntArray495[2] = arg13;
		this.anIntArray495[3] = arg14;
		this.aShort178 = (short) (arg3 >> arg0.anInt5243 * 941710601);
		this.aShort179 = (short) (arg5 >> arg0.anInt5243 * 941710601);
		this.aShort180 = (short) (arg11 >> arg0.anInt5243 * 941710601);
		this.aShort181 = (short) (arg13 >> arg0.anInt5243 * 941710601);
		this.aShortArray139 = new short[4];
		this.aShortArray141 = new short[4];
		this.aShortArray140 = new short[4];
	}

	@OriginalMember(owner = "client!tq", name = "v", descriptor = "(I)V", line = 51)
	static void method31285() {
		Class73.aClass232_5.method25850();
	}

	@OriginalMember(owner = "client!tq", name = "b", descriptor = "(I)V", line = 260)
	static void method31286() {
		Class77_Sub7.aClass232_18.method25850();
	}

	@OriginalMember(owner = "client!tq", name = "fc", descriptor = "(II)V", line = 2455)
	static void method31287(@OriginalArg(0) int arg0) {
		if (Class35_Sub6.aClass77_Sub35_45.aClass143_Sub37_1.method16134() == 0) {
			arg0 = -1;
		}
		if (arg0 == client.anInt3474 * 851750459) {
			return;
		}
		if (arg0 != -1) {
			@Pc(21) Class652 local21 = (Class652) Class648.aClass35_Sub5_1.method18319(arg0);
			@Pc(25) Class89 local25 = local21.method32967();
			if (local25 == null) {
				arg0 = -1;
			} else {
				Class590.aClass523_1.setcustomcursor(Class470.aCanvas6, local25.method6686(true), local25.method6724(), local25.method6690(), new Point(local21.anInt5754 * -74444691, local21.anInt5752 * 458684327));
				client.anInt3474 = arg0 * -1746142477;
			}
		}
		if (arg0 == -1 && client.anInt3474 * 851750459 != -1) {
			Class590.aClass523_1.setcustomcursor(Class470.aCanvas6, null, -1, -1, new Point());
			client.anInt3474 = 1746142477;
		}
	}

	@OriginalMember(owner = "client!tq", name = "hs", descriptor = "(Lclient!agh;II)V", line = 4148)
	static void method31288(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0, @OriginalArg(1) int arg1) {
		if (arg0.anIntArray272 == null) {
			return;
		}
		@Pc(9) Class671 local9 = (Class671) Class457.method29479(Class671.method33202(), arg1);
		@Pc(16) int local16 = arg0.anIntArray272[local9.method33204()];
		if (local16 != arg0.aClass151_3.method23399()) {
			arg0.aClass151_3.method23405(local16, arg0.aClass151_3.method23426());
			arg0.anInt2877 = arg0.anInt2900 * -1267839587;
		}
	}

	@OriginalMember(owner = "client!tq", name = "pk", descriptor = "(Lclient!yf;I)V", line = 7391)
	static final void method31289(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class161.method24336(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!tq", name = "amt", descriptor = "(Lclient!yf;I)V", line = 11862)
	static final void method31290(@OriginalArg(0) Class665 arg0) {
		if (Class597.aClass107_Sub1_2.method8879() != Class321.aClass321_3) {
			throw new RuntimeException();
		}
		((Class149_Sub3) Class597.aClass107_Sub1_2.method8873()).method16718(arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307]);
	}
}
