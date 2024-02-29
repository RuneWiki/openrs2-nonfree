package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amp")
public class Class143_Sub33 extends Class143 {

	@OriginalMember(owner = "client!amp", name = "t", descriptor = "I")
	static final int anInt2256 = 1;

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "I")
	public static final int anInt2257 = 0;

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(Lclient!akq;)V", line = 11)
	public Class143_Sub33(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amp", name = "<init>", descriptor = "(ILclient!akq;)V", line = 15)
	public Class143_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amp", name = "i", descriptor = "(B)V", line = 19)
	public void method16040() {
		if (this.anInt2324 * 189295939 != 0 && this.anInt2324 * 189295939 != 1) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amp", name = "y", descriptor = "()I", line = 23)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "t", descriptor = "()I", line = 23)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "w", descriptor = "()I", line = 23)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "c", descriptor = "(II)I", line = 27)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "s", descriptor = "(I)I", line = 27)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "r", descriptor = "(I)I", line = 27)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "g", descriptor = "(I)I", line = 27)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amp", name = "d", descriptor = "(I)V", line = 31)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amp", name = "l", descriptor = "(II)V", line = 31)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amp", name = "x", descriptor = "(I)V", line = 31)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amp", name = "q", descriptor = "(I)V", line = 31)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amp", name = "k", descriptor = "(B)I", line = 35)
	public int method16041() {
		return this.anInt2324 * 189295939;
	}
}
