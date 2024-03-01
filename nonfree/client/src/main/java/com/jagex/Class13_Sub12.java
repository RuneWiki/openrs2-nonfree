package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!acl")
public abstract class Class13_Sub12 extends Class13 {

	@OriginalMember(owner = "client!acl", name = "a", descriptor = "I")
	final int anInt2439;

	@OriginalMember(owner = "client!acl", name = "g", descriptor = "I")
	final int anInt2440;

	@OriginalMember(owner = "client!acl", name = "l", descriptor = "I")
	final int anInt2441;

	@OriginalMember(owner = "client!acl", name = "<init>", descriptor = "(Lclient!ahb;)V", line = 14)
	Class13_Sub12(@OriginalArg(0) Class3_Sub41 arg0) {
		super(arg0);
		this.anInt2439 = arg0.method20271() * -488152625;
		this.anInt2440 = arg0.method20271() * -575207003;
		this.anInt2441 = arg0.method20269() * -1012252545;
	}

	@OriginalMember(owner = "client!acl", name = "x", descriptor = "()Z", line = 21)
	@Override
	boolean method16891() {
		@Pc(7) Class520 local7 = Class19.aClass523_14.method29823(this.anInt2439 * -1230764753);
		@Pc(11) boolean local11 = local7.method29752();
		@Pc(19) Class440 local19 = Class110.aClass436_1.method27999(local7.anInt5294 * -1332447219);
		return local11 & local19.method28236();
	}

	@OriginalMember(owner = "client!acl", name = "l", descriptor = "(I)Z", line = 21)
	@Override
	boolean method16890() {
		@Pc(7) Class520 local7 = Class19.aClass523_14.method29823(this.anInt2439 * -1230764753);
		@Pc(11) boolean local11 = local7.method29752();
		@Pc(19) Class440 local19 = Class110.aClass436_1.method27999(local7.anInt5294 * -1332447219);
		return local11 & local19.method28236();
	}

	@OriginalMember(owner = "client!acl", name = "s", descriptor = "()Z", line = 21)
	@Override
	boolean method16893() {
		@Pc(7) Class520 local7 = Class19.aClass523_14.method29823(this.anInt2439 * -1230764753);
		@Pc(11) boolean local11 = local7.method29752();
		@Pc(19) Class440 local19 = Class110.aClass436_1.method27999(local7.anInt5294 * -1332447219);
		return local11 & local19.method28236();
	}

	@OriginalMember(owner = "client!acl", name = "l", descriptor = "(Ljava/lang/String;B)V", line = 115)
	static final void method16901(@OriginalArg(0) String arg0) {
		System.out.println("Error: " + Class242.method24752(arg0, "%0a", "\n"));
	}

	@OriginalMember(owner = "client!acl", name = "je", descriptor = "(Lclient!ahn;IZI)V", line = 5963)
	public static final void method16900(@OriginalArg(0) Class26_Sub1 arg0, @OriginalArg(1) int arg1, @OriginalArg(2) boolean arg2) {
		Class580.method33215(arg0, arg1, true, arg2);
	}
}
