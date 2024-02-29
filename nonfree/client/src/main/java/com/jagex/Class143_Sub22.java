package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amd")
public class Class143_Sub22 extends Class143 {

	@OriginalMember(owner = "client!amd", name = "t", descriptor = "I")
	static final int anInt2186 = 0;

	@OriginalMember(owner = "client!amd", name = "w", descriptor = "I")
	static final int anInt2187 = 4;

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub22(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amd", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub22(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amd", name = "i", descriptor = "(B)V", line = 19)
	public void method15736() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amd", name = "e", descriptor = "()V", line = 19)
	public void method15737() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amd", name = "u", descriptor = "()V", line = 19)
	public void method15738() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amd", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 0;
	}

	@OriginalMember(owner = "client!amd", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 0;
	}

	@OriginalMember(owner = "client!amd", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 0;
	}

	@OriginalMember(owner = "client!amd", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 0;
	}

	@OriginalMember(owner = "client!amd", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amd", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amd", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amd", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amd", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 3;
	}

	@OriginalMember(owner = "client!amd", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amd", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amd", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amd", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amd", name = "o", descriptor = "()I", line = 35)
	public int method15739() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amd", name = "k", descriptor = "(I)I", line = 35)
	public int method15740() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amd", name = "f", descriptor = "()I", line = 35)
	public int method15741() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amd", name = "b", descriptor = "()I", line = 35)
	public int method15742() {
		return this.anInt2324 * 189295939;
	}
}
