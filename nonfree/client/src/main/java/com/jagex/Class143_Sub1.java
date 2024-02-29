package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ala")
public class Class143_Sub1 extends Class143 {

	@OriginalMember(owner = "client!ala", name = "bw", descriptor = "Ljava/lang/String;")
	public static String aString59;

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(Lclient!akq;)V", line = 8)
	public Class143_Sub1(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ala", name = "<init>", descriptor = "(ILclient!akq;)V", line = 12)
	public Class143_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ala", name = "i", descriptor = "(I)V", line = 16)
	public void method14910() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 4) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!ala", name = "t", descriptor = "()I", line = 20)
	@Override
	int method16257() {
		return 3;
	}

	@OriginalMember(owner = "client!ala", name = "p", descriptor = "(I)I", line = 20)
	@Override
	int method16256() {
		return 3;
	}

	@OriginalMember(owner = "client!ala", name = "w", descriptor = "()I", line = 20)
	@Override
	int method16260() {
		return 3;
	}

	@OriginalMember(owner = "client!ala", name = "y", descriptor = "()I", line = 20)
	@Override
	int method16259() {
		return 3;
	}

	@OriginalMember(owner = "client!ala", name = "c", descriptor = "(II)I", line = 24)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ala", name = "s", descriptor = "(I)I", line = 24)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ala", name = "r", descriptor = "(I)I", line = 24)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ala", name = "g", descriptor = "(I)I", line = 24)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ala", name = "z", descriptor = "(I)I", line = 24)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ala", name = "l", descriptor = "(II)V", line = 28)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ala", name = "q", descriptor = "(I)V", line = 28)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ala", name = "d", descriptor = "(I)V", line = 28)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ala", name = "x", descriptor = "(I)V", line = 28)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!ala", name = "u", descriptor = "()I", line = 32)
	public int method14911() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ala", name = "k", descriptor = "(I)I", line = 32)
	public int method14912() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ala", name = "e", descriptor = "()I", line = 32)
	public int method14913() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!ala", name = "f", descriptor = "()I", line = 32)
	public int method14914() {
		return this.anInt2324 * 189295939;
	}
}
