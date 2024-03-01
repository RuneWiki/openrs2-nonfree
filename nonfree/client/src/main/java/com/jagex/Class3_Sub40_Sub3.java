package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amc")
public class Class3_Sub40_Sub3 extends Class3_Sub40 {

	@OriginalMember(owner = "client!amc", name = "h", descriptor = "B")
	byte aByte86;

	@OriginalMember(owner = "client!amc", name = "x", descriptor = "B")
	byte aByte87;

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "Ljava/lang/String;")
	String aString101;

	// $FF: synthetic field
	@OriginalMember(owner = "client!amc", name = "this$0", descriptor = "Lclient!im;")
	final Class239 this$0;

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(Lclient!im;)V", line = 154)
	Class3_Sub40_Sub3(@OriginalArg(0) Class239 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!amc", name = "p", descriptor = "(Lclient!ahb;S)V", line = 157)
	@Override
	void method19099(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString101 = arg0.method20282();
		if (this.aString101 != null) {
			arg0.method20269();
			this.aByte86 = arg0.method20390();
			this.aByte87 = arg0.method20390();
		}
	}

	@OriginalMember(owner = "client!amc", name = "g", descriptor = "(Lclient!ahb;)V", line = 157)
	@Override
	void method19098(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString101 = arg0.method20282();
		if (this.aString101 != null) {
			arg0.method20269();
			this.aByte86 = arg0.method20390();
			this.aByte87 = arg0.method20390();
		}
	}

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "(Lclient!ahb;)V", line = 157)
	@Override
	void method19101(@OriginalArg(0) Class3_Sub41 arg0) {
		this.aString101 = arg0.method20282();
		if (this.aString101 != null) {
			arg0.method20269();
			this.aByte86 = arg0.method20390();
			this.aByte87 = arg0.method20390();
		}
	}

	@OriginalMember(owner = "client!amc", name = "a", descriptor = "(Lclient!ago;B)V", line = 166)
	@Override
	void method19100(@OriginalArg(0) Class3_Sub30 arg0) {
		arg0.aString47 = this.aString101;
		if (this.aString101 != null) {
			arg0.aByte59 = this.aByte86;
			arg0.aByte58 = this.aByte87;
		}
	}

	@OriginalMember(owner = "client!amc", name = "h", descriptor = "(Lclient!ago;)V", line = 166)
	@Override
	void method19102(@OriginalArg(0) Class3_Sub30 arg0) {
		arg0.aString47 = this.aString101;
		if (this.aString101 != null) {
			arg0.aByte59 = this.aByte86;
			arg0.aByte58 = this.aByte87;
		}
	}
}
