package com.jagex;

import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ab")
public class Class26 {

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
	public static int anInt123;

	@OriginalMember(owner = "client!ab", name = "<init>", descriptor = "()V", line = 8)
	Class26() throws Throwable {
		throw new Error();
	}

	@OriginalMember(owner = "client!ab", name = "c", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;II)Lclient!dx;", line = 13)
	public static Class86 method458(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		return new Class86_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;II)Lclient!dx;", line = 13)
	public static Class86 method459(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		return new Class86_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ab", name = "l", descriptor = "(Ljava/awt/Canvas;Lclient!dp;Lclient!eo;Lclient!md;Lclient!mp;Lclient!mn;II)Lclient!dx;", line = 13)
	public static Class86 method460(@OriginalArg(0) Canvas arg0, @OriginalArg(1) Class209 arg1, @OriginalArg(2) Interface24 arg2, @OriginalArg(3) Interface44 arg3, @OriginalArg(4) Interface47 arg4, @OriginalArg(5) Interface45 arg5, @OriginalArg(6) int arg6, @OriginalArg(7) int arg7) {
		return new Class86_Sub2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7);
	}

	@OriginalMember(owner = "client!ab", name = "v", descriptor = "(B)[I", line = 66)
	public static int[] method461() {
		return new int[] { Class611.anInt5569 * -1643399711, Class611.anInt5570 * -849564261, Class611.anInt5571 * 973015101 };
	}

	@OriginalMember(owner = "client!ab", name = "u", descriptor = "(Lclient!gh;Lclient!gm;I)V", line = 479)
	static void method462(@OriginalArg(0) Class273 arg0, @OriginalArg(1) Class277 arg1) {
		if (arg1 == null) {
			return;
		}
		@Pc(77) int local77;
		if (arg1.anInt3927 * 1365669833 == -1) {
			@Pc(112) Class277[] local112 = arg0.method26537();
			for (local77 = 0; local77 < local112.length && local112[local77] != arg1; local77++) {
			}
			if (local77 >= local112.length) {
				return;
			}
			Class684.method36267(local112, 0, local112, 1, local77);
			local112[0] = arg1;
			return;
		}
		@Pc(18) Class277 local18 = arg0.aClass277Array2[arg1.anInt3876 * -742015869 & 0xFFFF];
		if (local18 == null) {
			return;
		}
		if (local18.aClass277Array3 == local18.aClass277Array4) {
			local18.aClass277Array4 = new Class277[local18.aClass277Array3.length];
			local18.aClass277Array4[0] = arg1;
			Class684.method36267(local18.aClass277Array3, 0, local18.aClass277Array4, 1, arg1.anInt3927 * 1365669833);
			Class684.method36267(local18.aClass277Array3, arg1.anInt3927 * 1365669833 + 1, local18.aClass277Array4, arg1.anInt3927 * 1365669833 + 1, local18.aClass277Array3.length - arg1.anInt3927 * 1365669833 - 1);
			return;
		}
		local77 = 0;
		@Pc(80) Class277[] local80 = local18.aClass277Array4;
		while (local77 < local80.length && local80[local77] != arg1) {
			local77++;
		}
		if (local77 >= local80.length) {
			return;
		}
		Class684.method36267(local80, 0, local80, 1, local77);
		local80[0] = arg1;
	}

	@OriginalMember(owner = "client!ab", name = "a", descriptor = "(IIIIB)I", line = 1608)
	static final int method463(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(11) int local11 = 65536 - Class436.anIntArray463[arg2 * 8192 / arg3] >> 1;
		return (arg1 * local11 >> 16) + (arg0 * (65536 - local11) >> 16);
	}

	@OriginalMember(owner = "client!ab", name = "nm", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 7037)
	static final void method464(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray39 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!ab", name = "aex", descriptor = "(Lclient!yf;B)V", line = 9892)
	static final void method465(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = ((Class18) Class537.aClass35_Sub7_1.method18319(local12)).anInt69 * 1925627131;
	}

	@OriginalMember(owner = "client!ab", name = "ako", descriptor = "(Lclient!yf;I)V", line = 11414)
	static final void method466(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5781 -= 85613153;
		@Pc(14) String local14 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147];
		@Pc(25) String local25 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 1];
		@Pc(36) String local36 = (String) arg0.anObjectArray45[arg0.anInt5781 * 1485266147 + 2];
		@Pc(54) boolean local54 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307] == 1;
		Class96_Sub5.method7143(local14, local25, local36, local54);
	}
}
