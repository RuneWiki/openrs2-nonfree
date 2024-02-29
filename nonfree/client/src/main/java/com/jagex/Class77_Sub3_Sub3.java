package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqr")
public class Class77_Sub3_Sub3 extends Class77_Sub3 {

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqr", name = "this$0", descriptor = "Lclient!kv;")
	final Class367 this$0;

	@OriginalMember(owner = "client!aqr", name = "l", descriptor = "I")
	int anInt2994;

	@OriginalMember(owner = "client!aqr", name = "<init>", descriptor = "(Lclient!kv;)V", line = 83)
	Class77_Sub3_Sub3(@OriginalArg(0) Class367 arg0) {
		this.this$0 = arg0;
		this.anInt2994 = -474983707;
	}

	@OriginalMember(owner = "client!aqr", name = "p", descriptor = "(Lclient!akv;I)V", line = 86)
	@Override
	void method21806(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2994 = arg0.method22483() * 474983707;
		arg0.method22478();
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			arg0.method22510();
		}
	}

	@OriginalMember(owner = "client!aqr", name = "v", descriptor = "(Lclient!akv;)V", line = 86)
	@Override
	void method21808(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2994 = arg0.method22483() * 474983707;
		arg0.method22478();
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			arg0.method22510();
		}
	}

	@OriginalMember(owner = "client!aqr", name = "y", descriptor = "(Lclient!ajy;)V", line = 95)
	@Override
	void method21807(@OriginalArg(0) Class77_Sub25 arg0) {
		arg0.method13625(this.anInt2994 * 1971840275);
	}

	@OriginalMember(owner = "client!aqr", name = "c", descriptor = "(Lclient!ajy;I)V", line = 95)
	@Override
	void method21805(@OriginalArg(0) Class77_Sub25 arg0) {
		arg0.method13625(this.anInt2994 * 1971840275);
	}

	@OriginalMember(owner = "client!aqr", name = "l", descriptor = "(Lclient!ajy;)V", line = 95)
	@Override
	void method21809(@OriginalArg(0) Class77_Sub25 arg0) {
		arg0.method13625(this.anInt2994 * 1971840275);
	}
}
