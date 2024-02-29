package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!gl")
public class Class276 {

	@OriginalMember(owner = "client!gl", name = "sb", descriptor = "Lclient!co;")
	public static Class93 aClass93_1;

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "I")
	public final int anInt3844;

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "I")
	public final int anInt3843;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "[I")
	public final int[] anIntArray392;

	@OriginalMember(owner = "client!gl", name = "l", descriptor = "[I")
	public final int[] anIntArray393;

	@OriginalMember(owner = "client!gl", name = "y", descriptor = "Lclient!cd;")
	public final Class90 aClass90_1;

	@OriginalMember(owner = "client!gl", name = "w", descriptor = "I")
	final int anInt3845;

	@OriginalMember(owner = "client!gl", name = "v", descriptor = "(Lclient!ajq;Lclient!ajq;I)V", line = 30)
	public static void method26566(@OriginalArg(0) Class77_Sub1 arg0, @OriginalArg(1) Class77_Sub1 arg1) {
		if (arg0.aClass77_Sub1_61 != null) {
			arg0.method24069();
		}
		arg0.aClass77_Sub1_61 = arg1.aClass77_Sub1_61;
		arg0.aClass77_Sub1_62 = arg1;
		arg0.aClass77_Sub1_61.aClass77_Sub1_62 = arg0;
		arg0.aClass77_Sub1_62.aClass77_Sub1_61 = arg0;
	}

	@OriginalMember(owner = "client!gl", name = "f", descriptor = "(Lclient!gm;Lclient!cd;IIIILclient!cy;I)V", line = 791)
	static void method26567(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class90 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) Class83 arg6) {
		Class29.method500(arg0, arg1, arg2, arg3, arg4, arg5, arg6, 100.0D, Class311.aClass311_4, Class309.aClass309_4);
	}

	@OriginalMember(owner = "client!gl", name = "<init>", descriptor = "(II[I[ILclient!cd;I)V", line = 922)
	Class276(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int[] arg2, @OriginalArg(3) int[] arg3, @OriginalArg(4) Class90 arg4, @OriginalArg(5) int arg5) {
		this.anInt3844 = arg0 * 1660606455;
		this.anInt3843 = arg1 * 739591823;
		this.anIntArray392 = arg2;
		this.anIntArray393 = arg3;
		this.aClass90_1 = arg4;
		this.anInt3845 = arg5 * 45959763;
	}

	@OriginalMember(owner = "client!gl", name = "c", descriptor = "(II)Z", line = 932)
	public boolean method26568(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray393.length) {
			@Pc(11) int local11 = this.anIntArray393[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray392[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "p", descriptor = "(III)Z", line = 932)
	public boolean method26569(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (arg1 >= 0 && arg1 < this.anIntArray393.length) {
			@Pc(11) int local11 = this.anIntArray393[arg1];
			if (arg0 >= local11 && arg0 <= local11 + this.anIntArray392[arg1]) {
				return true;
			}
		}
		return false;
	}

	@OriginalMember(owner = "client!gl", name = "fs", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 5470)
	static final void method26570(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3896 = arg2.anIntArray536[(arg2.anInt5784 -= 308999563) * 2088438307] * -2116337403;
		Class461.method29531(arg0);
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class552.method30999(arg0.anInt3863 * -1278450723);
		}
	}

	@OriginalMember(owner = "client!gl", name = "il", descriptor = "(Lclient!yf;I)V", line = 6108)
	static final void method26571(@OriginalArg(0) Class665 arg0) {
		@Pc(8) Class662 local8 = arg0.aBoolean857 ? arg0.aClass662_1 : arg0.aClass662_2;
		@Pc(11) Class277 local11 = local8.aClass277_12;
		@Pc(14) Class273 local14 = local8.aClass273_4;
		Class283.method26703(local11, local14, arg0);
	}

	@OriginalMember(owner = "client!gl", name = "wr", descriptor = "(Lclient!yf;I)V", line = 8588)
	static final void method26572(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class60.aClass138_1.method14234();
	}

	@OriginalMember(owner = "client!gl", name = "zy", descriptor = "(Lclient!yf;B)V", line = 9142)
	static final void method26573(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = client.aClass243_1.method26054(local12).method25979().method36479();
	}

	@OriginalMember(owner = "client!gl", name = "akg", descriptor = "(Lclient!yf;B)V", line = 11262)
	static final void method26574(@OriginalArg(0) Class665 arg0) {
		Class298.method27055();
	}
}
