package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!apk")
public class Class96_Sub11_Sub1 extends Class96_Sub11 {

	@OriginalMember(owner = "client!apk", name = "y", descriptor = "I")
	final int anInt2618;

	@OriginalMember(owner = "client!apk", name = "w", descriptor = "I")
	final int anInt2619;

	@OriginalMember(owner = "client!apk", name = "t", descriptor = "I")
	final int anInt2620;

	@OriginalMember(owner = "client!apk", name = "<init>", descriptor = "(Lclient!akv;)V", line = 11)
	Class96_Sub11_Sub1(@OriginalArg(0) Class77_Sub39 arg0) {
		super(arg0);
		this.anInt2618 = arg0.method22483() * 2105956489;
		this.anInt2619 = arg0.method22478() * -83975921;
		this.anInt2620 = arg0.method22483() * 1001074019;
	}

	@OriginalMember(owner = "client!apk", name = "w", descriptor = "()V", line = 18)
	@Override
	public void method19913() {
		Class589.aClass222Array1[this.anInt2618 * -718365255].method25755().method21080(this.anInt2769 * 1538714989, this.anInt2768 * 290996515 << 16, this.anInt2767 * 1055910679, this.anInt2620 * 2012724299, false, this.anInt2619 * 109587951);
	}

	@OriginalMember(owner = "client!apk", name = "c", descriptor = "(I)V", line = 18)
	@Override
	public void method19911() {
		Class589.aClass222Array1[this.anInt2618 * -718365255].method25755().method21080(this.anInt2769 * 1538714989, this.anInt2768 * 290996515 << 16, this.anInt2767 * 1055910679, this.anInt2620 * 2012724299, false, this.anInt2619 * 109587951);
	}

	@OriginalMember(owner = "client!apk", name = "y", descriptor = "()V", line = 18)
	@Override
	public void method19912() {
		Class589.aClass222Array1[this.anInt2618 * -718365255].method25755().method21080(this.anInt2769 * 1538714989, this.anInt2768 * 290996515 << 16, this.anInt2767 * 1055910679, this.anInt2620 * 2012724299, false, this.anInt2619 * 109587951);
	}
}
