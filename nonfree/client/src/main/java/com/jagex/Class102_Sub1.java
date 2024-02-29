package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agf")
public class Class102_Sub1 extends Class102 {

	@OriginalMember(owner = "client!agf", name = "q", descriptor = "(IIIILclient!ve;I)V", line = 176)
	static final void method7920(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) Class594 arg4) {
		if (arg2 < 1 || arg3 < 1 || arg2 > client.aClass517_1.method30411() - 2 || arg3 > client.aClass517_1.method30417() - 2) {
			return;
		}
		if (client.aClass517_1.method30435() == null) {
			return;
		}
		@Pc(34) Interface61 local34 = client.aClass517_1.method30459().method12516(arg0, arg1, arg2, arg3);
		if (local34 == null) {
			return;
		}
		if (local34 instanceof Class104_Sub1_Sub1_Sub3) {
			((Class104_Sub1_Sub1_Sub3) local34).method12352(arg4);
		} else if (local34 instanceof Class104_Sub1_Sub4_Sub2) {
			((Class104_Sub1_Sub4_Sub2) local34).method13083(arg4);
		} else if (local34 instanceof Class104_Sub1_Sub2_Sub2) {
			((Class104_Sub1_Sub2_Sub2) local34).method11745(arg4);
		} else if (local34 instanceof Class104_Sub1_Sub3_Sub1) {
			((Class104_Sub1_Sub3_Sub1) local34).method12008(arg4);
		}
	}

	@OriginalMember(owner = "client!agf", name = "x", descriptor = "([I[Ljava/lang/Object;B)V", line = 183)
	public static void method7921(@OriginalArg(0) int[] arg0, @OriginalArg(1) Object[] arg1) {
		Class197.method25472(arg0, arg1, 0, arg0.length - 1);
	}

	@OriginalMember(owner = "client!agf", name = "<init>", descriptor = "(Lclient!pw;I)V", line = 328)
	Class102_Sub1(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!agf", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 332)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class302(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agf", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 332)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class302(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agf", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 332)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class302(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agf", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 332)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class302(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agf", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 332)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class302(arg0, arg1, this);
	}

	@OriginalMember(owner = "client!agf", name = "i", descriptor = "()Ljava/lang/Class;", line = 336)
	@Override
	public Class method27824() {
		return Class302.class;
	}

	@OriginalMember(owner = "client!agf", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 336)
	@Override
	public Class method27822() {
		return Class302.class;
	}

	@OriginalMember(owner = "client!agf", name = "vw", descriptor = "(Lclient!yf;B)V", line = 8449)
	static final void method7922(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 308999563;
	}
}
