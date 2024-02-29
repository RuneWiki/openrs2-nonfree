package com.jagex;

import java.io.File;
import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!amf")
public class Class143_Sub24 extends Class143 {

	@OriginalMember(owner = "client!amf", name = "q", descriptor = "I")
	static final int anInt2196 = 2;

	@OriginalMember(owner = "client!amf", name = "t", descriptor = "I")
	public static final int anInt2197 = 1;

	@OriginalMember(owner = "client!amf", name = "w", descriptor = "I")
	public static final int anInt2198 = 0;

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(Lclient!akq;)V", line = 13)
	public Class143_Sub24(@OriginalArg(0) Class77_Sub35 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!amf", name = "<init>", descriptor = "(ILclient!akq;)V", line = 17)
	public Class143_Sub24(@OriginalArg(0) int arg0, @OriginalArg(1) Class77_Sub35 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!amf", name = "i", descriptor = "(I)V", line = 21)
	public void method15782() {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_6) {
			this.anInt2324 = -647426346;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amf", name = "f", descriptor = "()V", line = 21)
	public void method15783() {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_6) {
			this.anInt2324 = -647426346;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amf", name = "u", descriptor = "()V", line = 21)
	public void method15784() {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_6) {
			this.anInt2324 = -647426346;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amf", name = "e", descriptor = "()V", line = 21)
	public void method15785() {
		if (this.aClass77_Sub35_44.method14391() == Class670.aClass670_6) {
			this.anInt2324 = -647426346;
		}
		if (this.anInt2324 * 189295939 < 0 || this.anInt2324 * 189295939 > 2) {
			this.anInt2324 = this.method16256() * 1823770475;
		}
	}

	@OriginalMember(owner = "client!amf", name = "w", descriptor = "()I", line = 26)
	@Override
	int method16260() {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "y", descriptor = "()I", line = 26)
	@Override
	int method16259() {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "t", descriptor = "()I", line = 26)
	@Override
	int method16257() {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "p", descriptor = "(I)I", line = 26)
	@Override
	int method16256() {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "g", descriptor = "(I)I", line = 30)
	@Override
	int method16267(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "r", descriptor = "(I)I", line = 30)
	@Override
	int method16266(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "s", descriptor = "(I)I", line = 30)
	@Override
	int method16265(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method16268(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "c", descriptor = "(II)I", line = 30)
	@Override
	int method16264(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!amf", name = "v", descriptor = "(Ljava/io/File;I)[B", line = 31)
	public static byte[] method15786(@OriginalArg(0) File arg0) {
		return Class156.method24209(arg0, (int) arg0.length());
	}

	@OriginalMember(owner = "client!amf", name = "q", descriptor = "(I)V", line = 34)
	@Override
	void method16262(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amf", name = "x", descriptor = "(I)V", line = 34)
	@Override
	void method16263(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amf", name = "d", descriptor = "(I)V", line = 34)
	@Override
	void method16261(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amf", name = "l", descriptor = "(II)V", line = 34)
	@Override
	void method16258(@OriginalArg(0) int arg0) {
		this.anInt2324 = arg0 * 1823770475;
	}

	@OriginalMember(owner = "client!amf", name = "k", descriptor = "(I)I", line = 38)
	public int method15787() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amf", name = "o", descriptor = "()I", line = 38)
	public int method15788() {
		return this.anInt2324 * 189295939;
	}

	@OriginalMember(owner = "client!amf", name = "gn", descriptor = "(Lclient!gm;Lclient!gh;Lclient!yf;I)V", line = 5717)
	static final void method15789(@OriginalArg(0) Class277 arg0, @OriginalArg(1) Class273 arg1, @OriginalArg(2) Class665 arg2) {
		arg0.anInt3888 = -642498273;
		arg0.anInt3889 = client.anInt3389 * 2118781167;
		arg0.anInt3919 = 0;
		if (arg0.anInt3927 * 1365669833 == -1 && !arg1.aBoolean662) {
			Class623.method32473(arg0.anInt3863 * -1278450723);
		}
	}
}
