package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!ga")
public class Class266 implements Interface25 {

	@OriginalMember(owner = "client!ga", name = "mc", descriptor = "Lclient!gm;")
	static Class277 aClass277_9;

	@OriginalMember(owner = "client!ga", name = "ci", descriptor = "Lclient!aar;")
	static Class17 aClass17_10;

	// $FF: synthetic field
	@OriginalMember(owner = "client!ga", name = "this$0", descriptor = "Lclient!fc;")
	final Class242 this$0;

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "Lclient!fa;")
	final Class241 aClass241_2;

	@OriginalMember(owner = "client!ga", name = "<init>", descriptor = "(Lclient!fc;Lclient!akv;)V", line = 131)
	Class266(@OriginalArg(0) Class242 arg0, @OriginalArg(1) Class77_Sub39 arg1) {
		this.this$0 = arg0;
		@Pc(13) boolean local13 = arg1.method22478() != 255;
		if (local13) {
			arg1.anInt3089 -= -1387468933;
		}
		this.aClass241_2 = new Class241(arg1, local13, true, arg0.anInterface26_2);
	}

	@OriginalMember(owner = "client!ga", name = "p", descriptor = "(Lclient!fd;I)V", line = 138)
	@Override
	public void method26978(@OriginalArg(0) Class243 arg0) {
		arg0.method26065(this.aClass241_2);
	}

	@OriginalMember(owner = "client!ga", name = "v", descriptor = "(Lclient!fd;)V", line = 138)
	@Override
	public void method26979(@OriginalArg(0) Class243 arg0) {
		arg0.method26065(this.aClass241_2);
	}

	@OriginalMember(owner = "client!ga", name = "c", descriptor = "(Lclient!fd;)V", line = 138)
	@Override
	public void method26977(@OriginalArg(0) Class243 arg0) {
		arg0.method26065(this.aClass241_2);
	}

	@OriginalMember(owner = "client!ga", name = "aej", descriptor = "(Lclient!yf;B)V", line = 9999)
	static final void method26466(@OriginalArg(0) Class665 arg0) {
		@Pc(12) int local12 = arg0.anIntArray536[(arg0.anInt5784 -= 308999563) * 2088438307];
		@Pc(18) Class18 local18 = (Class18) Class537.aClass35_Sub7_1.method18319(local12);
		@Pc(26) int local26;
		if (local18.aBoolean11) {
			local26 = local18.anInt106 * 510229545;
		} else if (local18.aBoolean7) {
			local26 = Class695.aClass635_1.anInt5711 * 1376086885;
		} else {
			local26 = Class695.aClass635_1.anInt5712 * -629529995;
		}
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = local26;
	}

	@OriginalMember(owner = "client!ga", name = "agn", descriptor = "(Lclient!yf;I)V", line = 10513)
	static final void method26467(@OriginalArg(0) Class665 arg0) {
		arg0.anInt5784 -= 617999126;
		@Pc(13) int local13 = arg0.anIntArray536[arg0.anInt5784 * 2088438307];
		@Pc(23) int local23 = arg0.anIntArray536[arg0.anInt5784 * 2088438307 + 1];
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class615.aClass465_1.method29551(local13).aCharArray4[local23];
	}

	@OriginalMember(owner = "client!ga", name = "anh", descriptor = "(Lclient!yf;B)V", line = 11981)
	static final void method26468(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class589.anInt5465 * 490572819;
	}

	@OriginalMember(owner = "client!ga", name = "arp", descriptor = "(Lclient!yf;I)V", line = 12439)
	static final void method26469(@OriginalArg(0) Class665 arg0) {
		arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class35_Sub6.aClass77_Sub35_45.aClass143_Sub6_1.method15109();
	}
}
