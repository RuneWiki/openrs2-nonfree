package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ahg")
public class Class60_Sub1 extends Class60 {

	@OriginalMember(owner = "client!ahg", name = "aw", descriptor = "I")
	public static int anInt1453;

	@OriginalMember(owner = "client!ahg", name = "<init>", descriptor = "(Lclient!aht;)V", line = 8)
	public Class60_Sub1(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ahg", name = "<init>", descriptor = "(ILclient!aht;)V", line = 12)
	public Class60_Sub1(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ahg", name = "v", descriptor = "(I)V", line = 16)
	public void method12642() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 4) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "w", descriptor = "()V", line = 16)
	public void method12643() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 4) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ahg", name = "p", descriptor = "(I)I", line = 20)
	@Override
	int method14603() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "h", descriptor = "()I", line = 20)
	@Override
	int method14602() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "x", descriptor = "()I", line = 20)
	@Override
	int method14607() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "s", descriptor = "()I", line = 20)
	@Override
	int method14604() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "y", descriptor = "()I", line = 20)
	@Override
	int method14606() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "u", descriptor = "()I", line = 20)
	@Override
	int method14605() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "b", descriptor = "()I", line = 20)
	@Override
	int method14615() {
		return 3;
	}

	@OriginalMember(owner = "client!ahg", name = "z", descriptor = "(I)I", line = 24)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ahg", name = "a", descriptor = "(IB)I", line = 24)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ahg", name = "c", descriptor = "(I)I", line = 24)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ahg", name = "n", descriptor = "(I)V", line = 28)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahg", name = "l", descriptor = "(IB)V", line = 28)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahg", name = "j", descriptor = "(I)V", line = 28)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ahg", name = "t", descriptor = "(I)I", line = 32)
	public int method12641() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ahg", name = "o", descriptor = "()I", line = 32)
	public int method12644() {
		return this.anInt2079 * -1373670555;
	}
}
