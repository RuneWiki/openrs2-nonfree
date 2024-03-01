package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aii")
public class Class60_Sub15 extends Class60 {

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "I")
	static final int anInt1897 = -2;

	@OriginalMember(owner = "client!aii", name = "x", descriptor = "I")
	static final int anInt1898 = -3;

	@OriginalMember(owner = "client!aii", name = "<init>", descriptor = "(Lclient!aht;)V", line = 11)
	public Class60_Sub15(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aii", name = "<init>", descriptor = "(ILclient!aht;)V", line = 15)
	public Class60_Sub15(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aii", name = "v", descriptor = "(I)V", line = 19)
	public void method13517() {
		if (this.anInt2079 * -1373670555 < -3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aii", name = "o", descriptor = "()V", line = 19)
	public void method13519() {
		if (this.anInt2079 * -1373670555 < -3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aii", name = "w", descriptor = "()V", line = 19)
	public void method13520() {
		if (this.anInt2079 * -1373670555 < -3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aii", name = "i", descriptor = "()V", line = 19)
	public void method13521() {
		if (this.anInt2079 * -1373670555 < -3) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aii", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method14603() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "h", descriptor = "()I", line = 23)
	@Override
	int method14602() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "x", descriptor = "()I", line = 23)
	@Override
	int method14607() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "s", descriptor = "()I", line = 23)
	@Override
	int method14604() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "u", descriptor = "()I", line = 23)
	@Override
	int method14605() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "y", descriptor = "()I", line = 23)
	@Override
	int method14606() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "b", descriptor = "()I", line = 23)
	@Override
	int method14615() {
		return -2;
	}

	@OriginalMember(owner = "client!aii", name = "c", descriptor = "(I)I", line = 27)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!aii", name = "a", descriptor = "(IB)I", line = 27)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!aii", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!aii", name = "l", descriptor = "(IB)V", line = 31)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aii", name = "j", descriptor = "(I)V", line = 31)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aii", name = "n", descriptor = "(I)V", line = 31)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aii", name = "t", descriptor = "(I)I", line = 35)
	public int method13518() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aii", name = "f", descriptor = "()I", line = 35)
	public int method13522() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aii", name = "k", descriptor = "()I", line = 35)
	public int method13523() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aii", name = "si", descriptor = "(Lclient!vs;I)V", line = 7445)
	static final void method13524(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = client.method22372(local16).method11806();
	}

	@OriginalMember(owner = "client!aii", name = "kq", descriptor = "(III)V", line = 11004)
	static final void method13525(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1) {
		if (Class33.method7569(arg0, null)) {
			Class600.method33510(Class178.aClass186Array1[arg0].aClass178Array8, arg1);
		}
	}
}
