package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqy")
public class Class77_Sub3_Sub5 extends Class77_Sub3 {

	@OriginalMember(owner = "client!aqy", name = "t", descriptor = "Ljava/lang/String;")
	String aString100;

	@OriginalMember(owner = "client!aqy", name = "y", descriptor = "B")
	byte aByte87;

	@OriginalMember(owner = "client!aqy", name = "w", descriptor = "I")
	int anInt2999;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqy", name = "this$0", descriptor = "Lclient!kv;")
	final Class367 this$0;

	@OriginalMember(owner = "client!aqy", name = "l", descriptor = "I")
	int anInt3000;

	@OriginalMember(owner = "client!aqy", name = "<init>", descriptor = "(Lclient!kv;)V", line = 105)
	Class77_Sub3_Sub5(@OriginalArg(0) Class367 arg0) {
		this.this$0 = arg0;
		this.anInt3000 = 2139578735;
	}

	@OriginalMember(owner = "client!aqy", name = "p", descriptor = "(Lclient!akv;I)V", line = 108)
	@Override
	void method21806(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt3000 = arg0.method22483() * -2139578735;
		this.aByte87 = arg0.method22481();
		this.anInt2999 = arg0.method22483() * -908374921;
		arg0.method22510();
		this.aString100 = arg0.method22523();
	}

	@OriginalMember(owner = "client!aqy", name = "v", descriptor = "(Lclient!akv;)V", line = 108)
	@Override
	void method21808(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt3000 = arg0.method22483() * -2139578735;
		this.aByte87 = arg0.method22481();
		this.anInt2999 = arg0.method22483() * -908374921;
		arg0.method22510();
		this.aString100 = arg0.method22523();
	}

	@OriginalMember(owner = "client!aqy", name = "l", descriptor = "(Lclient!ajy;)V", line = 116)
	@Override
	void method21809(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(7) Class358 local7 = arg0.aClass358Array1[this.anInt3000 * 291955313];
		local7.aByte149 = this.aByte87;
		local7.anInt4499 = this.anInt2999 * 1319933641;
		local7.aString209 = this.aString100;
	}

	@OriginalMember(owner = "client!aqy", name = "c", descriptor = "(Lclient!ajy;I)V", line = 116)
	@Override
	void method21805(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(7) Class358 local7 = arg0.aClass358Array1[this.anInt3000 * 291955313];
		local7.aByte149 = this.aByte87;
		local7.anInt4499 = this.anInt2999 * 1319933641;
		local7.aString209 = this.aString100;
	}

	@OriginalMember(owner = "client!aqy", name = "y", descriptor = "(Lclient!ajy;)V", line = 116)
	@Override
	void method21807(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(7) Class358 local7 = arg0.aClass358Array1[this.anInt3000 * 291955313];
		local7.aByte149 = this.aByte87;
		local7.anInt4499 = this.anInt2999 * 1319933641;
		local7.aString209 = this.aString100;
	}
}
