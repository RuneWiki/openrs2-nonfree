package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amj")
public class Class143_Sub27 extends Class143 {

	@OriginalMember(owner = "client!amj", name = "t", descriptor = "I")
	static final int anInt2217 = 255;

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "I")
	static final int anInt2218 = 0;

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub27(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amj", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub27(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amj", name = "i", descriptor = "(I)V", line = 19)
	public void method15898() {
		if (this.anInt2324 * 189295939 < 0 && this.anInt2324 * 189295939 > 255) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amj", name = "u", descriptor = "()V", line = 19)
	public void method15899() {
		if (this.anInt2324 * 189295939 < 0 && this.anInt2324 * 189295939 > 255) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amj", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 127;
	}

	@OriginalMember(owner = "client!amj", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 127;
	}

	@OriginalMember(owner = "client!amj", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 127;
	}

	@OriginalMember(owner = "client!amj", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 127;
	}

	@OriginalMember(owner = "client!amj", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amj", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amj", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amj", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amj", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amj", name = "e", descriptor = "()I", line = 35)
	public int method15900() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amj", name = "k", descriptor = "(I)I", line = 35)
	public int method15901() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amj", name = "f", descriptor = "()I", line = 35)
	public int method15902() {
		return this.anInt2324 * 189295939;
	}
}
