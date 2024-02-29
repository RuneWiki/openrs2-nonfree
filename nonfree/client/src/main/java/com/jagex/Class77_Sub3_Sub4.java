package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aqw")
public class Class77_Sub3_Sub4 extends Class77_Sub3 {

	@OriginalMember(owner = "client!aqw", name = "w", descriptor = "B")
	byte aByte86;

	@OriginalMember(owner = "client!aqw", name = "y", descriptor = "I")
	int anInt2998;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqw", name = "this$0", descriptor = "Lclient!kv;")
	final Class367 this$0;

	@OriginalMember(owner = "client!aqw", name = "l", descriptor = "Ljava/lang/String;")
	String aString99;

	@OriginalMember(owner = "client!aqw", name = "<init>", descriptor = "(Lclient!kv;)V", line = 58)
	Class77_Sub3_Sub4(@OriginalArg(0) Class367 arg0) {
		this.this$0 = arg0;
		this.aString99 = null;
	}

	@OriginalMember(owner = "client!aqw", name = "p", descriptor = "(Lclient!akv;I)V", line = 61)
	@Override
	void method21806(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			arg0.method22510();
		}
		this.aString99 = arg0.method22520();
		this.anInt2998 = arg0.method22483() * 1399139691;
		this.aByte86 = arg0.method22481();
		arg0.method22510();
	}

	@OriginalMember(owner = "client!aqw", name = "v", descriptor = "(Lclient!akv;)V", line = 61)
	@Override
	void method21808(@OriginalArg(0) Class77_Sub39 arg0) {
		if (arg0.method22478() != 255) {
			arg0.anInt3089 -= -1387468933;
			arg0.method22510();
		}
		this.aString99 = arg0.method22520();
		this.anInt2998 = arg0.method22483() * 1399139691;
		this.aByte86 = arg0.method22481();
		arg0.method22510();
	}

	@OriginalMember(owner = "client!aqw", name = "c", descriptor = "(Lclient!ajy;I)V", line = 72)
	@Override
	void method21805(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(3) Class358 local3 = new Class358();
		local3.aString209 = this.aString99;
		local3.anInt4499 = this.anInt2998 * -305619187;
		local3.aByte149 = this.aByte86;
		arg0.method13624(local3);
	}

	@OriginalMember(owner = "client!aqw", name = "l", descriptor = "(Lclient!ajy;)V", line = 72)
	@Override
	void method21809(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(3) Class358 local3 = new Class358();
		local3.aString209 = this.aString99;
		local3.anInt4499 = this.anInt2998 * -305619187;
		local3.aByte149 = this.aByte86;
		arg0.method13624(local3);
	}

	@OriginalMember(owner = "client!aqw", name = "y", descriptor = "(Lclient!ajy;)V", line = 72)
	@Override
	void method21807(@OriginalArg(0) Class77_Sub25 arg0) {
		@Pc(3) Class358 local3 = new Class358();
		local3.aString209 = this.aString99;
		local3.anInt4499 = this.anInt2998 * -305619187;
		local3.aByte149 = this.aByte86;
		arg0.method13624(local3);
	}
}
