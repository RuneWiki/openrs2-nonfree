package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!alg")
public class Class143_Sub5 extends Class143 {

	@OriginalMember(owner = "client!alg", name = "w", descriptor = "I")
	public static final int anInt2049 = 2;

	@OriginalMember(owner = "client!alg", name = "t", descriptor = "I")
	public static final int anInt2050 = 1;

	@OriginalMember(owner = "client!alg", name = "q", descriptor = "I")
	public static final int anInt2051 = 0;

	@OriginalMember(owner = "client!alg", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub5(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
		Class587.method31737(this.anInt2324 * 189295939);
	}

	@OriginalMember(owner = "client!alg", name = "<init>", descriptor = "(ILclient!akq;)V", line = 18)
	public Class143_Sub5(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
		Class587.method31737(this.anInt2324 * 189295939);
	}

	@OriginalMember(owner = "client!alg", name = "i", descriptor = "(I)V", line = 23)
	public void method15041() {
		if (this.aClass77_Sub35_44.method14392().method36352() < 245) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alg", name = "f", descriptor = "()V", line = 23)
	public void method15042() {
		if (this.aClass77_Sub35_44.method14392().method36352() < 245) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alg", name = "e", descriptor = "()V", line = 23)
	public void method15043() {
		if (this.aClass77_Sub35_44.method14392().method36352() < 245) {
			this.anInt2324 = 0;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!alg", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method16256() {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!alg", name = "y", descriptor = "()I", line = 28)
	@Override
	int method16259() {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!alg", name = "w", descriptor = "()I", line = 28)
	@Override
	int method16260() {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!alg", name = "t", descriptor = "()I", line = 28)
	@Override
	int method16257() {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!alg", name = "k", descriptor = "(S)Z", line = 33)
	public boolean method15044() {
		return this.aClass77_Sub35_44.method14392().method36352() >= 245;
	}

	@OriginalMember(owner = "client!alg", name = "g", descriptor = "(I)I", line = 38)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!alg", name = "c", descriptor = "(II)I", line = 38)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!alg", name = "s", descriptor = "(I)I", line = 38)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!alg", name = "r", descriptor = "(I)I", line = 38)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!alg", name = "z", descriptor = "(I)I", line = 38)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return this.aClass77_Sub35_44.method14392().method36352() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!alg", name = "l", descriptor = "(II)V", line = 43)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
		Class587.method31737(this.anInt2324 * 189295939);
	}

	@OriginalMember(owner = "client!alg", name = "x", descriptor = "(I)V", line = 43)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
		Class587.method31737(this.anInt2324 * 189295939);
	}

	@OriginalMember(owner = "client!alg", name = "q", descriptor = "(I)V", line = 43)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
		Class587.method31737(this.anInt2324 * 189295939);
	}

	@OriginalMember(owner = "client!alg", name = "d", descriptor = "(I)V", line = 43)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
		Class587.method31737(this.anInt2324 * 189295939);
	}

	@OriginalMember(owner = "client!alg", name = "u", descriptor = "(B)I", line = 48)
	public int method15045() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alg", name = "o", descriptor = "()I", line = 48)
	public int method15046() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!alg", name = "b", descriptor = "()I", line = 48)
	public int method15047() {
		return this.anInt2324 * 189295939;
	}
}
