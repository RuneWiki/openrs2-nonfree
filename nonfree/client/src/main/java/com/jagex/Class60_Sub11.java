package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aie")
public class Class60_Sub11 extends Class60 {

	@OriginalMember(owner = "client!aie", name = "u", descriptor = "I")
	public static final int anInt1870 = 3;

	@OriginalMember(owner = "client!aie", name = "x", descriptor = "I")
	public static final int anInt1871 = 1;

	@OriginalMember(owner = "client!aie", name = "s", descriptor = "I")
	public static final int anInt1872 = 2;

	@OriginalMember(owner = "client!aie", name = "p", descriptor = "(J)V", line = 9)
	public static final void method13407(@OriginalArg(0) long arg0) {
		if (arg0 <= 0L) {
			return;
		}
		if (arg0 % 10L == 0L) {
			Class383.method27327(arg0 - 1L);
			Class383.method27327(1L);
		} else {
			Class383.method27327(arg0);
		}
	}

	@OriginalMember(owner = "client!aie", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub11(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aie", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub11(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aie", name = "v", descriptor = "(I)V", line = 20)
	public void method13401() {
		if (this.anInt2079 * -1373670555 < 1 || this.anInt2079 * -1373670555 > 3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aie", name = "o", descriptor = "()V", line = 20)
	public void method13402() {
		if (this.anInt2079 * -1373670555 < 1 || this.anInt2079 * -1373670555 > 3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aie", name = "w", descriptor = "()V", line = 20)
	public void method13404() {
		if (this.anInt2079 * -1373670555 < 1 || this.anInt2079 * -1373670555 > 3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aie", name = "h", descriptor = "()I", line = 24)
	@Override
	int method14602() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "b", descriptor = "()I", line = 24)
	@Override
	int method14615() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "s", descriptor = "()I", line = 24)
	@Override
	int method14604() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "x", descriptor = "()I", line = 24)
	@Override
	int method14607() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "y", descriptor = "()I", line = 24)
	@Override
	int method14606() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "u", descriptor = "()I", line = 24)
	@Override
	int method14605() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method14603() {
		return this.aClass3_Sub45_36.method13003().method32851() ? 3 : 2;
	}

	@OriginalMember(owner = "client!aie", name = "a", descriptor = "(IB)I", line = 28)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aie", name = "c", descriptor = "(I)I", line = 28)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aie", name = "z", descriptor = "(I)I", line = 28)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aie", name = "l", descriptor = "(IB)V", line = 32)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aie", name = "j", descriptor = "(I)V", line = 32)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aie", name = "n", descriptor = "(I)V", line = 32)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aie", name = "t", descriptor = "(I)I", line = 36)
	public int method13403() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aie", name = "i", descriptor = "()I", line = 36)
	public int method13405() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aie", name = "f", descriptor = "()I", line = 36)
	public int method13406() {
		return this.anInt2079 * -1373670555;
	}
}
