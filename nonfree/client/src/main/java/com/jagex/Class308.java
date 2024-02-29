package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hs")
public class Class308 implements Interface5 {

	@OriginalMember(owner = "client!hs", name = "ib", descriptor = "Lclient!ady;")
	public static Class80_Sub1_Sub2 aClass80_Sub1_Sub2_3;

	@OriginalMember(owner = "client!hs", name = "<init>", descriptor = "()V", line = 268)
	Class308() {
	}

	@OriginalMember(owner = "client!hs", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 271)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class303(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 271)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class303(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 271)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class303(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 271)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class303(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 271)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class303(arg0, arg1);
	}

	@OriginalMember(owner = "client!hs", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 275)
	@Override
	public Class method27822() {
		return Class303.class;
	}

	@OriginalMember(owner = "client!hs", name = "i", descriptor = "()Ljava/lang/Class;", line = 275)
	@Override
	public Class method27824() {
		return Class303.class;
	}

	@OriginalMember(owner = "client!hs", name = "e", descriptor = "(Lclient!agh;I)V", line = 568)
	static void method27265(@OriginalArg(0) Class104_Sub1_Sub1_Sub1 arg0) {
		if (arg0 instanceof Class104_Sub1_Sub1_Sub1_Sub1) {
			@Pc(5) Class104_Sub1_Sub1_Sub1_Sub1 local5 = (Class104_Sub1_Sub1_Sub1_Sub1) arg0;
			if (local5.aClass333_1 != null) {
				Class306.method27247(local5, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local5.aByte100);
			}
		} else if (arg0 instanceof Class104_Sub1_Sub1_Sub1_Sub2) {
			@Pc(26) Class104_Sub1_Sub1_Sub1_Sub2 local26 = (Class104_Sub1_Sub1_Sub1_Sub2) arg0;
			Class322.method27467(local26, Class346.aClass104_Sub1_Sub1_Sub1_Sub2_3.aByte100 != local26.aByte100);
		}
	}

	@OriginalMember(owner = "client!hs", name = "pj", descriptor = "(Lclient!yf;I)V", line = 7279)
	static final void method27266(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class277 local16 = Class155.method23628(local12);
		@Pc(22) Class273 local22 = Class35_Sub11.aClass273Array1[local12 >> 16];
		Class475.method29692(local16, local22, arg0);
	}

	@OriginalMember(owner = "client!hs", name = "asp", descriptor = "(Lclient!yf;I)V", line = 12724)
	static final void method27267(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(16) Class145_Sub1 local16 = Class527.method30680(local12);
		if (local16 != null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt2063 * -1395637313;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.aString61;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.method15085();
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.method15087();
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt2059 * 2098404975;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local16.anInt2066 * -663639827;
			arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local16.aString60;
			return;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = 0;
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = "";
	}
}
