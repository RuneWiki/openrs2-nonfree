package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amc")
public class Class143_Sub21 extends Class143 {

	@OriginalMember(owner = "client!amc", name = "t", descriptor = "I")
	public static final int anInt2179 = 1;

	@OriginalMember(owner = "client!amc", name = "q", descriptor = "I")
	public static final int anInt2180 = 2;

	@OriginalMember(owner = "client!amc", name = "w", descriptor = "I")
	public static final int anInt2181 = 0;

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub21(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amc", name = "<init>", descriptor = "(ILclient!akq;)V", line = 17)
	public Class143_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amc", name = "i", descriptor = "(I)V", line = 21)
	public void method15712() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amc", name = "e", descriptor = "()V", line = 21)
	public void method15713() {
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amc", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method16256() {
		return this.aClass77_Sub35_44.aClass143_Sub6_1.method15113() && Class440.method28946(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amc", name = "y", descriptor = "()I", line = 25)
	@Override
	int method16259() {
		return this.aClass77_Sub35_44.aClass143_Sub6_1.method15113() && Class440.method28946(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amc", name = "w", descriptor = "()I", line = 25)
	@Override
	int method16260() {
		return this.aClass77_Sub35_44.aClass143_Sub6_1.method15113() && Class440.method28946(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amc", name = "t", descriptor = "()I", line = 25)
	@Override
	int method16257() {
		return this.aClass77_Sub35_44.aClass143_Sub6_1.method15113() && Class440.method28946(this.aClass77_Sub35_44.aClass143_Sub6_1.method15109()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!amc", name = "k", descriptor = "(I)Z", line = 30)
	public boolean method15714() {
		return true;
	}

	@OriginalMember(owner = "client!amc", name = "f", descriptor = "()Z", line = 30)
	public boolean method15715() {
		return true;
	}

	@OriginalMember(owner = "client!amc", name = "g", descriptor = "(I)I", line = 34)
	@Override
	public int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "r", descriptor = "(I)I", line = 34)
	@Override
	public int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "c", descriptor = "(II)I", line = 34)
	@Override
	public int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "s", descriptor = "(I)I", line = 34)
	@Override
	public int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amc", name = "l", descriptor = "(II)V", line = 38)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amc", name = "x", descriptor = "(I)V", line = 38)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amc", name = "q", descriptor = "(I)V", line = 38)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amc", name = "d", descriptor = "(I)V", line = 38)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amc", name = "u", descriptor = "(I)I", line = 42)
	public int method15716() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amc", name = "b", descriptor = "()I", line = 42)
	public int method15717() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amc", name = "o", descriptor = "()I", line = 42)
	public int method15718() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amc", name = "n", descriptor = "()I", line = 42)
	public int method15719() {
		return this.anInt2324 * 189295939;
	}
}
