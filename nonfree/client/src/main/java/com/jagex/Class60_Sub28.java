package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aiv")
public class Class60_Sub28 extends Class60 {

	@OriginalMember(owner = "client!aiv", name = "s", descriptor = "I")
	static final int anInt1979 = 1;

	@OriginalMember(owner = "client!aiv", name = "x", descriptor = "I")
	static final int anInt1980 = 0;

	@OriginalMember(owner = "client!aiv", name = "u", descriptor = "I")
	static final int anInt1981 = 3;

	@OriginalMember(owner = "client!aiv", name = "<init>", descriptor = "(Lclient!aht;)V", line = 13)
	public Class60_Sub28(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aiv", name = "<init>", descriptor = "(ILclient!aht;)V", line = 17)
	public Class60_Sub28(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aiv", name = "v", descriptor = "(I)V", line = 21)
	public void method13889() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aiv", name = "w", descriptor = "()V", line = 21)
	public void method13891() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aiv", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!aiv", name = "a", descriptor = "(IB)I", line = 29)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!aiv", name = "c", descriptor = "(I)I", line = 29)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!aiv", name = "z", descriptor = "(I)I", line = 29)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!aiv", name = "l", descriptor = "(IB)V", line = 34)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aiv", name = "n", descriptor = "(I)V", line = 34)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aiv", name = "j", descriptor = "(I)V", line = 34)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aiv", name = "i", descriptor = "()I", line = 38)
	public int method13888() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aiv", name = "f", descriptor = "()I", line = 38)
	public int method13890() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aiv", name = "o", descriptor = "()I", line = 38)
	public int method13892() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aiv", name = "t", descriptor = "(I)I", line = 38)
	public int method13893() {
		return this.anInt2079 * -1373670555;
	}
}
