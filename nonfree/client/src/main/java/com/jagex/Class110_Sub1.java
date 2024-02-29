package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!agt")
public class Class110_Sub1 extends Class110 {

	@OriginalMember(owner = "client!agt", name = "<init>", descriptor = "(Lclient!as;Lclient!pw;Lclient!pw;)V", line = 235)
	Class110_Sub1(@OriginalArg(0) Interface13 arg0, @OriginalArg(1) Class478 arg1, @OriginalArg(2) Class478 arg2) {
		super(arg0, arg1, arg2);
	}

	@OriginalMember(owner = "client!agt", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 239)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class234(arg0, this);
	}

	@OriginalMember(owner = "client!agt", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 239)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class234(arg0, this);
	}

	@OriginalMember(owner = "client!agt", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 239)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class234(arg0, this);
	}

	@OriginalMember(owner = "client!agt", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 239)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class234(arg0, this);
	}

	@OriginalMember(owner = "client!agt", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 239)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class234(arg0, this);
	}

	@OriginalMember(owner = "client!agt", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 243)
	@Override
	public Class method27822() {
		return Class234.class;
	}

	@OriginalMember(owner = "client!agt", name = "i", descriptor = "()Ljava/lang/Class;", line = 243)
	@Override
	public Class method27824() {
		return Class234.class;
	}

	@OriginalMember(owner = "client!agt", name = "no", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 7079)
	static final void method9164(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray7 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!agt", name = "oc", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;B)V", line = 7100)
	static final void method9165(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		@Pc(13) String local13 = (String) arg2.anObjectArray45[(arg2.anInt5781 -= 1460193483) * 1485266147];
		if (Class139.method14334(local13, arg2) != null) {
			local13 = local13.substring(0, local13.length() - 1);
		}
		arg0.anObjectArray17 = Class73.method1040(local13, arg2);
		arg0.aBoolean681 = true;
	}

	@OriginalMember(owner = "client!agt", name = "acv", descriptor = "(Lclient!yf;I)V", line = 9667)
	static final void method9166(@OriginalArg(0) Class665 arg0) {
		@Pc(13) String local13 = (String) arg0.anObjectArray45[(arg0.anInt5781 -= 1460193483) * 1485266147];
		@Pc(26) int local26 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		arg0.anObjectArray45[(arg0.anInt5781 += 1460193483) * 1485266147 - 1] = local13 + local26;
	}
}
