package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqk")
public class Class77_Sub3_Sub1 extends Class77_Sub3 {

	@OriginalMember(owner = "client!aqk", name = "w", descriptor = "I")
	int anInt2980;

	@OriginalMember(owner = "client!aqk", name = "y", descriptor = "B")
	byte aByte79;

	@OriginalMember(owner = "client!aqk", name = "t", descriptor = "Ljava/lang/String;")
	String aString91;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqk", name = "this$0", descriptor = "Lclient!kv;")
	final Class367 this$0;

	@OriginalMember(owner = "client!aqk", name = "l", descriptor = "I")
	int anInt2981;

	@OriginalMember(owner = "client!aqk", name = "<init>", descriptor = "(Lclient!kv;)V", line = 129)
	Class77_Sub3_Sub1(@OriginalArg(0) Class367 arg0) {
		this.this$0 = arg0;
		this.anInt2981 = -1684728147;
	}

	@OriginalMember(owner = "client!aqk", name = "v", descriptor = "(Lclient!akv;)V", line = 132)
	@Override
	void method21808(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22478();
		this.anInt2981 = arg0.method22483() * 1684728147;
		this.aByte79 = arg0.method22481();
		this.anInt2980 = arg0.method22483() * 864609147;
		arg0.method22510();
		this.aString91 = arg0.method22523();
		arg0.method22478();
	}

	@OriginalMember(owner = "client!aqk", name = "p", descriptor = "(Lclient!akv;I)V", line = 132)
	@Override
	void method21806(@OriginalArg(0) Class77_Sub39 arg0) {
		arg0.method22478();
		this.anInt2981 = arg0.method22483() * 1684728147;
		this.aByte79 = arg0.method22481();
		this.anInt2980 = arg0.method22483() * 864609147;
		arg0.method22510();
		this.aString91 = arg0.method22523();
		arg0.method22478();
	}

	@OriginalMember(owner = "client!aqk", name = "c", descriptor = "(Lclient!ajy;I)V", line = 142)
	@Override
	void method21805(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(7) Class358 local7 = arg0.aClass358Array1[this.anInt2981 * 850477787];
		local7.aByte149 = this.aByte79;
		local7.anInt4499 = this.anInt2980 * -1034456163;
		local7.aString209 = this.aString91;
	}

	@OriginalMember(owner = "client!aqk", name = "l", descriptor = "(Lclient!ajy;)V", line = 142)
	@Override
	void method21809(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(7) Class358 local7 = arg0.aClass358Array1[this.anInt2981 * 850477787];
		local7.aByte149 = this.aByte79;
		local7.anInt4499 = this.anInt2980 * -1034456163;
		local7.aString209 = this.aString91;
	}

	@OriginalMember(owner = "client!aqk", name = "y", descriptor = "(Lclient!ajy;)V", line = 142)
	@Override
	void method21807(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(7) Class358 local7 = arg0.aClass358Array1[this.anInt2981 * 850477787];
		local7.aByte149 = this.aByte79;
		local7.anInt4499 = this.anInt2980 * -1034456163;
		local7.aString209 = this.aString91;
	}

	@OriginalMember(owner = "client!aqk", name = "ail", descriptor = "(Lclient!yf;B)V", line = 10809)
	static final void method21601(@OriginalArg(0) Class665 arg0) {
		@Pc(2) Class77_Sub1_Sub8 local2 = Class261.method26362();
		if (local2 == null) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			return;
		}
		@Pc(20) boolean local20 = local2.method21862(Class136.anInt1674 + Class88.anInt610 * 204700261, Class349.anInt4496 * -1636630007 + Class136.anInt1675, Class674.anIntArray538);
		if (local20) {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anIntArray538[1];
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = Class674.anIntArray538[2];
		} else {
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
			arg0.anIntArray536[(arg0.anInt5784 += 308999563) * 2088438307 - 1] = -1;
		}
	}
}
