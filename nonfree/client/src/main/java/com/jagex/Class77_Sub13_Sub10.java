package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aqp")
public class Class77_Sub13_Sub10 extends Class77_Sub13 {

	@OriginalMember(owner = "client!aqp", name = "y", descriptor = "J")
	long aLong154;

	@OriginalMember(owner = "client!aqp", name = "l", descriptor = "I")
	int anInt2993;

	// $FF: synthetic field
	@OriginalMember(owner = "client!aqp", name = "this$0", descriptor = "Lclient!km;")
	final Class365 this$0;

	@OriginalMember(owner = "client!aqp", name = "y", descriptor = "(I)V", line = 139)
	public static final void method21676() {
		if (Class589.anInt5485 * 1114067909 != 2) {
			Class589.aClass82_3.method2014();
			Class449.method29229();
			Class305.method27241();
		}
	}

	@OriginalMember(owner = "client!aqp", name = "<init>", descriptor = "(Lclient!km;)V", line = 291)
	Class77_Sub13_Sub10(@OriginalArg(0) Class365 arg0) {
		this.this$0 = arg0;
	}

	@OriginalMember(owner = "client!aqp", name = "p", descriptor = "(Lclient!akv;I)V", line = 294)
	@Override
	void method21763(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2993 = arg0.method22500() * -1862790357;
		this.aLong154 = arg0.method22510() * 715967599180579137L;
	}

	@OriginalMember(owner = "client!aqp", name = "v", descriptor = "(Lclient!akv;)V", line = 294)
	@Override
	void method21765(@OriginalArg(0) Class77_Sub39 arg0) {
		this.anInt2993 = arg0.method22500() * -1862790357;
		this.aLong154 = arg0.method22510() * 715967599180579137L;
	}

	@OriginalMember(owner = "client!aqp", name = "l", descriptor = "(Lclient!kw;)V", line = 299)
	@Override
	void method21762(@OriginalArg(0) Class368 arg0) {
		arg0.method28214(this.anInt2993 * 233182083, this.aLong154 * 4872053265244917441L);
	}

	@OriginalMember(owner = "client!aqp", name = "c", descriptor = "(Lclient!kw;B)V", line = 299)
	@Override
	void method21764(@OriginalArg(0) Class368 arg0) {
		arg0.method28214(this.anInt2993 * 233182083, this.aLong154 * 4872053265244917441L);
	}

	@OriginalMember(owner = "client!aqp", name = "y", descriptor = "(Lclient!kw;)V", line = 299)
	@Override
	void method21766(@OriginalArg(0) Class368 arg0) {
		arg0.method28214(this.anInt2993 * 233182083, this.aLong154 * 4872053265244917441L);
	}

	@OriginalMember(owner = "client!aqp", name = "w", descriptor = "(Lclient!kw;)V", line = 299)
	@Override
	void method21767(@OriginalArg(0) Class368 arg0) {
		arg0.method28214(this.anInt2993 * 233182083, this.aLong154 * 4872053265244917441L);
	}
}
