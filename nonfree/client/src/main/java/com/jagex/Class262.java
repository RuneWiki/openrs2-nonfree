package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!fx")
public class Class262 implements Interface27 {

	@OriginalMember(owner = "client!fx", name = "fw", descriptor = "Lclient!pw;")
	public static Class478 aClass478_91;

	@OriginalMember(owner = "client!fx", name = "ol", descriptor = "Z")
	public static boolean aBoolean659;

	// $FF: synthetic field
	@OriginalMember(owner = "client!fx", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!fx", name = "p", descriptor = "Lclient!oe;")
	final Class438 aClass438_1;

	@OriginalMember(owner = "client!fx", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 291)
	Class262(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		if (arg1.method22483() == 65535) {
			this.aClass438_1 = null;
		} else {
			arg1.anInt3089 -= 1520029430;
			this.aClass438_1 = arg0.anInterface26_2.method25526().method1949(arg1);
		}
	}

	@OriginalMember(owner = "client!fx", name = "c", descriptor = "(Lclient!fd;)V", line = 300)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		if (this.aClass438_1 != null) {
			arg0.method26059().method35946((Class75) this.this$0.anInterface26_2.method25526().method18319(this.aClass438_1.anInt4927 * -608978823), this.aClass438_1.anObject19);
		}
	}

	@OriginalMember(owner = "client!fx", name = "p", descriptor = "(Lclient!fd;I)V", line = 300)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		if (this.aClass438_1 != null) {
			arg0.method26059().method35946((Class75) this.this$0.anInterface26_2.method25526().method18319(this.aClass438_1.anInt4927 * -608978823), this.aClass438_1.anObject19);
		}
	}

	@OriginalMember(owner = "client!fx", name = "v", descriptor = "(Lclient!fd;)V", line = 300)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		if (this.aClass438_1 != null) {
			arg0.method26059().method35946((Class75) this.this$0.anInterface26_2.method25526().method18319(this.aClass438_1.anInt4927 * -608978823), this.aClass438_1.anObject19);
		}
	}

	@OriginalMember(owner = "client!fx", name = "g", descriptor = "(Lclient!dx;Lclient!vm;IIII)V", line = 400)
	static void method26384(@OriginalArg(0) Class86 arg0, @OriginalArg(1) Class599 arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4) {
		@Pc(8) Class63 local8 = (Class63) Class118_Sub1.aClass35_Sub18_4.method18319(arg1.anInt5512 * 350336715);
		if (local8.anInt193 * 138454787 == -1) {
			return;
		}
		if (arg1.aBoolean819) {
			@Pc(25) int local25 = arg2 + arg1.anInt5528 * 1605976059;
			arg2 = local25 & 0x3;
		} else {
			arg2 = 0;
		}
		@Pc(40) Class83 local40 = local8.method917(arg0, arg2, arg1.aBoolean825);
		if (local40 == null) {
			return;
		}
		@Pc(49) int local49 = arg1.anInt5516 * -1082258489;
		@Pc(54) int local54 = arg1.anInt5529 * -1990374967;
		if ((arg2 & 0x1) == 1) {
			local49 = arg1.anInt5529 * -1990374967;
			local54 = arg1.anInt5516 * -1082258489;
		}
		@Pc(72) int local72 = local40.method18121();
		@Pc(75) int local75 = local40.method18198();
		if (local8.aBoolean18) {
			local72 = local49 * 4;
			local75 = local54 * 4;
		}
		if (local8.anInt192 * 2126510373 == 0) {
			local40.method18125(arg3, arg4 - (local54 - 1) * 4, local72, local75);
		} else {
			local40.method18129(arg3, arg4 - (local54 - 1) * 4, local72, local75, 0, local8.anInt192 * 2126510373 | 0xFF000000, 1);
		}
	}

	@OriginalMember(owner = "client!fx", name = "acg", descriptor = "(Lclient!yf;I)V", line = 9561)
	static final void method26385(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local13 & local23;
	}
}
