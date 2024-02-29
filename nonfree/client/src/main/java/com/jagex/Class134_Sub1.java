package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!akb")
public class Class134_Sub1 extends Class134 implements Interface5 {

	@OriginalMember(owner = "client!akb", name = "ai", descriptor = "Lclient!cy;")
	static Class83 aClass83_15;

	@OriginalMember(owner = "client!akb", name = "<init>", descriptor = "(Lclient!pw;)V", line = 118)
	Class134_Sub1(@OriginalArg(0) Class478 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!akb", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 122)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class579(arg0, this);
	}

	@OriginalMember(owner = "client!akb", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 122)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class579(arg0, this);
	}

	@OriginalMember(owner = "client!akb", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 122)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class579(arg0, this);
	}

	@OriginalMember(owner = "client!akb", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 122)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class579(arg0, this);
	}

	@OriginalMember(owner = "client!akb", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 122)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class579(arg0, this);
	}

	@OriginalMember(owner = "client!akb", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 126)
	@Override
	public Class method27822() {
		return Class579.class;
	}

	@OriginalMember(owner = "client!akb", name = "i", descriptor = "()Ljava/lang/Class;", line = 126)
	@Override
	public Class method27824() {
		return Class579.class;
	}

	@OriginalMember(owner = "client!akb", name = "aki", descriptor = "(Lclient!yf;I)V", line = 11352)
	static final void method13712(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		if (local12 < 0) {
			local12 = 0;
		}
		client.anInt3437 = (local12 + client.anInt3436 * -1871226189) * 1360231319;
	}
}
