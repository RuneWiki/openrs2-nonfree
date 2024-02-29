package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aol")
public class Class54_Sub1 extends Class54 {

	@OriginalMember(owner = "client!aol", name = "<init>", descriptor = "(Lclient!pw;I)V", line = 127)
	Class54_Sub1(@OriginalArg(0) Class478 arg0, @OriginalArg(1) int arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aol", name = "j", descriptor = "(ILclient!as;)Lclient!am;", line = 131)
	@Override
	public Interface12 method27826(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class63(arg0, this);
	}

	@OriginalMember(owner = "client!aol", name = "d", descriptor = "(ILclient!as;B)Lclient!am;", line = 131)
	@Override
	public Interface12 method27821(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class63(arg0, this);
	}

	@OriginalMember(owner = "client!aol", name = "r", descriptor = "(ILclient!as;)Lclient!am;", line = 131)
	@Override
	public Interface12 method27827(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class63(arg0, this);
	}

	@OriginalMember(owner = "client!aol", name = "g", descriptor = "(ILclient!as;)Lclient!am;", line = 131)
	@Override
	public Interface12 method27823(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class63(arg0, this);
	}

	@OriginalMember(owner = "client!aol", name = "z", descriptor = "(ILclient!as;)Lclient!am;", line = 131)
	@Override
	public Interface12 method27825(@OriginalArg(0) int arg0, @OriginalArg(1) Interface13 arg1) {
		return new Class63(arg0, this);
	}

	@OriginalMember(owner = "client!aol", name = "s", descriptor = "(S)Ljava/lang/Class;", line = 135)
	@Override
	public Class method27822() {
		return Class63.class;
	}

	@OriginalMember(owner = "client!aol", name = "i", descriptor = "()Ljava/lang/Class;", line = 135)
	@Override
	public Class method27824() {
		return Class63.class;
	}

	@OriginalMember(owner = "client!aol", name = "xo", descriptor = "(Lclient!yf;B)V", line = 8719)
	static final void method17800(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class36 local18 = (Class36) Class663.aClass35_Sub21_1.method18319(local12);
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local18.method635();
	}

	@OriginalMember(owner = "client!aol", name = "kk", descriptor = "([Lclient!gm;IIIZI)V", line = 10880)
	public static void method17801(@OriginalArg(0) Class277[] arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) boolean arg4) {
		for (@Pc(1) int local1 = 0; local1 < arg0.length; local1++) {
			@Pc(9) Class277 local9 = arg0[local1];
			if (local9 != null && arg1 == local9.anInt3876 * -742015869) {
				Class91.method18663(local9, arg2, arg3, arg4);
				Class536.method30850(local9, arg2, arg3);
				if (local9.anInt3879 * -488164841 > local9.anInt3881 * 1500908359 - local9.anInt3874 * -881188269) {
					local9.anInt3879 = local9.anInt3881 * 98803281 - local9.anInt3874 * -1988664539;
				}
				if (local9.anInt3879 * -488164841 < 0) {
					local9.anInt3879 = 0;
				}
				if (local9.anInt3880 * 2142374941 > local9.anInt3882 * -166726847 - local9.anInt3875 * -1279656873) {
					local9.anInt3880 = local9.anInt3882 * -1667108235 - local9.anInt3875 * -226772989;
				}
				if (local9.anInt3880 * 2142374941 < 0) {
					local9.anInt3880 = 0;
				}
				if (local9.anInt3857 * -1960530827 == 0) {
					Class657.method33057(arg0, local9, arg4);
				}
			}
		}
	}
}
