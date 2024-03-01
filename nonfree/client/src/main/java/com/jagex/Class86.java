package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ba")
public class Class86 {

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "I")
	int anInt2928 = 128;

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "I")
	int anInt2929 = 128;

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "I")
	int anInt2930;

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "I")
	int anInt2932;

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "I")
	int anInt2931;

	@OriginalMember(owner = "client!ba", name = "x", descriptor = "I")
	int anInt2927;

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(I)V", line = 12)
	Class86(@OriginalArg(0) int arg0) {
		this.anInt2930 = arg0;
	}

	@OriginalMember(owner = "client!ba", name = "<init>", descriptor = "(IIIIII)V", line = 16)
	Class86(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5) {
		this.anInt2930 = arg0;
		this.anInt2928 = arg1;
		this.anInt2929 = arg2;
		this.anInt2932 = arg3;
		this.anInt2931 = arg4;
		this.anInt2927 = arg5;
	}

	@OriginalMember(owner = "client!ba", name = "p", descriptor = "()Lclient!ba;", line = 26)
	Class86 method21641() {
		return new Class86(this.anInt2930, this.anInt2928, this.anInt2929, this.anInt2932, this.anInt2931, this.anInt2927);
	}

	@OriginalMember(owner = "client!ba", name = "g", descriptor = "()Lclient!ba;", line = 26)
	Class86 method21643() {
		return new Class86(this.anInt2930, this.anInt2928, this.anInt2929, this.anInt2932, this.anInt2931, this.anInt2927);
	}

	@OriginalMember(owner = "client!ba", name = "a", descriptor = "(Lclient!ba;)V", line = 30)
	void method21642(@OriginalArg(0) Class86 arg0) {
		this.anInt2928 = arg0.anInt2928;
		this.anInt2929 = arg0.anInt2929;
		this.anInt2932 = arg0.anInt2932;
		this.anInt2931 = arg0.anInt2931;
		this.anInt2930 = arg0.anInt2930;
		this.anInt2927 = arg0.anInt2927;
	}

	@OriginalMember(owner = "client!ba", name = "l", descriptor = "(Lclient!ba;)V", line = 30)
	void method21644(@OriginalArg(0) Class86 arg0) {
		this.anInt2928 = arg0.anInt2928;
		this.anInt2929 = arg0.anInt2929;
		this.anInt2932 = arg0.anInt2932;
		this.anInt2931 = arg0.anInt2931;
		this.anInt2930 = arg0.anInt2930;
		this.anInt2927 = arg0.anInt2927;
	}

	@OriginalMember(owner = "client!ba", name = "h", descriptor = "(Lclient!ba;)V", line = 30)
	void method21645(@OriginalArg(0) Class86 arg0) {
		this.anInt2928 = arg0.anInt2928;
		this.anInt2929 = arg0.anInt2929;
		this.anInt2932 = arg0.anInt2932;
		this.anInt2931 = arg0.anInt2931;
		this.anInt2930 = arg0.anInt2930;
		this.anInt2927 = arg0.anInt2927;
	}
}
