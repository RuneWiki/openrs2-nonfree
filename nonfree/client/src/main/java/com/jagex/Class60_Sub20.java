package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ain")
public class Class60_Sub20 extends Class60 {

	@OriginalMember(owner = "client!ain", name = "x", descriptor = "I")
	public static final int anInt1921 = 0;

	@OriginalMember(owner = "client!ain", name = "s", descriptor = "I")
	public static final int anInt1922 = 1;

	@OriginalMember(owner = "client!ain", name = "u", descriptor = "I")
	public static final int anInt1923 = 2;

	@OriginalMember(owner = "client!ain", name = "y", descriptor = "I")
	public static final int anInt1924 = 3;

	@OriginalMember(owner = "client!ain", name = "b", descriptor = "I")
	public static final int anInt1925 = 4;

	@OriginalMember(owner = "client!ain", name = "<init>", descriptor = "(Lclient!aht;)V", line = 14)
	public Class60_Sub20(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ain", name = "<init>", descriptor = "(ILclient!aht;)V", line = 18)
	public Class60_Sub20(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ain", name = "v", descriptor = "(I)V", line = 22)
	public void method13661() {
		if (this.anInt2079 * -1373670555 < 0 && this.anInt2079 * -1373670555 > 4) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ain", name = "w", descriptor = "()V", line = 22)
	public void method13663() {
		if (this.anInt2079 * -1373670555 < 0 && this.anInt2079 * -1373670555 > 4) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ain", name = "h", descriptor = "()I", line = 26)
	@Override
	int method14602() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "p", descriptor = "(I)I", line = 26)
	@Override
	int method14603() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "s", descriptor = "()I", line = 26)
	@Override
	int method14604() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "u", descriptor = "()I", line = 26)
	@Override
	int method14605() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "b", descriptor = "()I", line = 26)
	@Override
	int method14615() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "x", descriptor = "()I", line = 26)
	@Override
	int method14607() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "y", descriptor = "()I", line = 26)
	@Override
	int method14606() {
		return this.aClass3_Sub45_36.method13003().method32853() > 1 ? 4 : 2;
	}

	@OriginalMember(owner = "client!ain", name = "c", descriptor = "(I)I", line = 31)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ain", name = "z", descriptor = "(I)I", line = 31)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ain", name = "a", descriptor = "(IB)I", line = 31)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ain", name = "l", descriptor = "(IB)V", line = 35)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ain", name = "j", descriptor = "(I)V", line = 35)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ain", name = "n", descriptor = "(I)V", line = 35)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ain", name = "i", descriptor = "()I", line = 39)
	public int method13660() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ain", name = "t", descriptor = "(I)I", line = 39)
	public int method13662() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ain", name = "o", descriptor = "()I", line = 39)
	public int method13664() {
		return this.anInt2079 * -1373670555;
	}
}
