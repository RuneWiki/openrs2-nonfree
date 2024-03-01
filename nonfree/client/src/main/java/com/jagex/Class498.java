package com.jagex;

import java.util.Queue;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ub")
final class Class498 implements Interface54 {

	@OriginalMember(owner = "client!ub", name = "qa", descriptor = "I")
	static int anInt5231;

	@OriginalMember(owner = "client!ub", name = "ha", descriptor = "Lclient!xl;")
	public static Class579 aClass579_1;

	@OriginalMember(owner = "client!ub", name = "bb", descriptor = "Ljava/lang/String;")
	public static String aString228;

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "(Z)V", line = 36)
	@Override
	public void method29351() {
	}

	@OriginalMember(owner = "client!ub", name = "p", descriptor = "(ZB)V", line = 36)
	@Override
	public void method29355(@OriginalArg(0) boolean arg0) {
	}

	@OriginalMember(owner = "client!ub", name = "g", descriptor = "(Z)V", line = 36)
	@Override
	public void method29353() {
	}

	@OriginalMember(owner = "client!ub", name = "h", descriptor = "(Z)V", line = 36)
	@Override
	public void method29352() {
	}

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "(III)V", line = 39)
	@Override
	public void method29356(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class516.aQueue4;
		synchronized (Class516.aQueue4) {
			Class516.aQueue4.add(Class585.method33282(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!ub", name = "u", descriptor = "(III)V", line = 39)
	@Override
	public void method29358(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class516.aQueue4;
		synchronized (Class516.aQueue4) {
			Class516.aQueue4.add(Class585.method33282(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!ub", name = "s", descriptor = "(III)V", line = 39)
	@Override
	public void method29354(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class516.aQueue4;
		synchronized (Class516.aQueue4) {
			Class516.aQueue4.add(Class585.method33282(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!ub", name = "a", descriptor = "(IIII)V", line = 39)
	@Override
	public void method29357(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2) {
		@Pc(3) int local3 = arg0 >> 16;
		@Pc(7) int local7 = arg0 & 0xFFFF;
		@Pc(10) Queue local10 = Class516.aQueue4;
		synchronized (Class516.aQueue4) {
			Class516.aQueue4.add(Class585.method33282(local3, local7, arg1, arg2));
		}
	}

	@OriginalMember(owner = "client!ub", name = "x", descriptor = "(II)Lclient!kf;", line = 53)
	public static Class275 method29362(@OriginalArg(0) int arg0) {
		return Class514.aClass48_6 == null ? null : Class514.aClass48_6.method9518().method25226(arg0);
	}

	@OriginalMember(owner = "client!ub", name = "l", descriptor = "(CLclient!vk;B)I", line = 104)
	static int method29360(@OriginalArg(0) char arg0, @OriginalArg(1) Class530 arg1) {
		@Pc(3) int local3 = arg0 << 4;
		if (Character.isUpperCase(arg0) || Character.isTitleCase(arg0)) {
			arg0 = Character.toLowerCase(arg0);
			local3 = (arg0 << 4) + 1;
		}
		if (arg0 == 241 && Class530.aClass530_6 == arg1) {
			local3 = 1762;
		}
		return local3;
	}

	@OriginalMember(owner = "client!ub", name = "k", descriptor = "(I)I", line = 656)
	public static final int method29361() {
		return (int) (1000000000L / (Class390.aLong229 * -6807432894711606595L));
	}

	@OriginalMember(owner = "client!ub", name = "iv", descriptor = "(IIIIIII)V", line = 5354)
	static final void method29363(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3) {
		@Pc(1) Class68[] local1 = client.aClass68Array1;
		for (@Pc(3) int local3 = 0; local3 < local1.length; local3++) {
			@Pc(11) Class68 local11 = local1[local3];
			if (local11 != null && local11.anInt2017 * 207391421 == 2) {
				Class55.method11859(local11.anInt2013 * 515621197, local11.anInt2009 * -2046314719, local11.anInt2011 * -1644403279, 0, local11.anInt2015 * 413212434, false, false);
				if (client.aFloatArray96[0] > -1.0F && client.anInt3034 % 20 < 10) {
					@Pc(59) Class6 local59 = Class331.aClass6Array12[local11.anInt2010 * 310804535];
					@Pc(69) int local69 = (int) ((float) arg0 + client.aFloatArray96[0] - 12.0F);
					@Pc(79) int local79 = (int) ((float) arg1 + client.aFloatArray96[1] - 28.0F);
					local59.method16783(local69, local79);
				}
			}
		}
	}

	@OriginalMember(owner = "client!ub", name = "nq", descriptor = "(Lclient!vs;I)V", line = 6630)
	static final void method29359(@OriginalArg(0) Class536 arg0) {
		@Pc(8) Class534 local8 = arg0.aBoolean822 ? arg0.aClass534_2 : arg0.aClass534_1;
		@Pc(11) Class178 local11 = local8.aClass178_18;
		@Pc(14) Class186 local14 = local8.aClass186_4;
		Class339.method26438(local11, local14, arg0);
	}
}
