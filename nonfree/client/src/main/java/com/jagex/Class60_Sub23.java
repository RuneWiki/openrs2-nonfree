package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aiq")
public class Class60_Sub23 extends Class60 {

	@OriginalMember(owner = "client!aiq", name = "x", descriptor = "I")
	public static final int anInt1944 = 1;

	@OriginalMember(owner = "client!aiq", name = "s", descriptor = "I")
	public static final int anInt1945 = 0;

	@OriginalMember(owner = "client!aiq", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub23(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aiq", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub23(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aiq", name = "v", descriptor = "(I)V", line = 20)
	public void method13746() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "o", descriptor = "()V", line = 20)
	public void method13750() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 1) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aiq", name = "h", descriptor = "()I", line = 24)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "x", descriptor = "()I", line = 24)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "s", descriptor = "()I", line = 24)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "u", descriptor = "()I", line = 24)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "b", descriptor = "()I", line = 24)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "y", descriptor = "()I", line = 24)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!aiq", name = "t", descriptor = "(I)Z", line = 28)
	public boolean method13747() {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373());
	}

	@OriginalMember(owner = "client!aiq", name = "f", descriptor = "()Z", line = 28)
	public boolean method13749() {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373());
	}

	@OriginalMember(owner = "client!aiq", name = "i", descriptor = "()Z", line = 28)
	public boolean method13751() {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373());
	}

	@OriginalMember(owner = "client!aiq", name = "k", descriptor = "()Z", line = 28)
	public boolean method13752() {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373());
	}

	@OriginalMember(owner = "client!aiq", name = "a", descriptor = "(IB)I", line = 33)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!aiq", name = "c", descriptor = "(I)I", line = 33)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!aiq", name = "z", descriptor = "(I)I", line = 33)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return Class341.method26458(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 3;
	}

	@OriginalMember(owner = "client!aiq", name = "n", descriptor = "(I)V", line = 38)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aiq", name = "l", descriptor = "(IB)V", line = 38)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aiq", name = "j", descriptor = "(I)V", line = 38)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aiq", name = "w", descriptor = "(B)I", line = 42)
	public int method13748() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aiq", name = "apz", descriptor = "(Lclient!vs;I)V", line = 11667)
	static final void method13754(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}

	@OriginalMember(owner = "client!aiq", name = "apl", descriptor = "(Lclient!vs;I)V", line = 11671)
	static final void method13753(@OriginalArg(0) Class536 arg0) {
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = 0;
	}
}
