package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!hc")
public class Class309 {

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "Ljava/lang/String;")
	public String aString160;

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "Ljava/lang/String;")
	public String aString161;

	@OriginalMember(owner = "client!hc", name = "<init>", descriptor = "()V", line = 84)
	Class309() {
	}

	@OriginalMember(owner = "client!hc", name = "e", descriptor = "(Lclient!hw;I)V", line = 87)
	void method26824(@OriginalArg(0) Class326 arg0) {
		this.aString161 = arg0.method27307();
		this.aString160 = arg0.method27307();
	}

	@OriginalMember(owner = "client!hc", name = "m", descriptor = "(Lclient!hw;)V", line = 87)
	void method26825(@OriginalArg(0) Class326 arg0) {
		this.aString161 = arg0.method27307();
		this.aString160 = arg0.method27307();
	}

	@OriginalMember(owner = "client!hc", name = "n", descriptor = "(Lclient!hw;)V", line = 87)
	void method26826(@OriginalArg(0) Class326 arg0) {
		this.aString161 = arg0.method27307();
		this.aString160 = arg0.method27307();
	}

	@OriginalMember(owner = "client!hc", name = "k", descriptor = "(Lclient!hw;)V", line = 87)
	void method26827(@OriginalArg(0) Class326 arg0) {
		this.aString161 = arg0.method27307();
		this.aString160 = arg0.method27307();
	}

	@OriginalMember(owner = "client!hc", name = "aiq", descriptor = "(Lclient!yf;I)V", line = 11221)
	static final void method26828(@OriginalArg(0) Class681 arg0) {
		arg0.anInt5891 -= 1189701933;
		@Pc(13) int local13 = arg0.anIntArray519[arg0.anInt5891 * -1497248091];
		arg0.anIntArray519[(arg0.anInt5891 += 1189701933) * -1497248091 - 1] = Class110_Sub13.method8035(local13);
	}
}
