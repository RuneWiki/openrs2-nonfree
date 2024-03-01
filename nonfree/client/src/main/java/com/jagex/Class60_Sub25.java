package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ais")
public class Class60_Sub25 extends Class60 {

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "I")
	static final int anInt1956 = 2;

	@OriginalMember(owner = "client!ais", name = "x", descriptor = "I")
	public static final int anInt1957 = 0;

	@OriginalMember(owner = "client!ais", name = "s", descriptor = "I")
	public static final int anInt1958 = 1;

	@OriginalMember(owner = "client!ais", name = "<init>", descriptor = "(Lclient!aht;)V", line = 13)
	public Class60_Sub25(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ais", name = "<init>", descriptor = "(ILclient!aht;)V", line = 17)
	public Class60_Sub25(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ais", name = "v", descriptor = "(I)V", line = 21)
	public void method13805() {
		if (this.aClass3_Sub45_36.method13002() == Class543.aClass543_5) {
			this.anInt2079 = -2061300518;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ais", name = "w", descriptor = "()V", line = 21)
	public void method13807() {
		if (this.aClass3_Sub45_36.method13002() == Class543.aClass543_5) {
			this.anInt2079 = -2061300518;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ais", name = "x", descriptor = "()I", line = 26)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "p", descriptor = "(I)I", line = 26)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "s", descriptor = "()I", line = 26)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "u", descriptor = "()I", line = 26)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "y", descriptor = "()I", line = 26)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "b", descriptor = "()I", line = 26)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "h", descriptor = "()I", line = 26)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "a", descriptor = "(IB)I", line = 30)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "c", descriptor = "(I)I", line = 30)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "z", descriptor = "(I)I", line = 30)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ais", name = "l", descriptor = "(IB)V", line = 34)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ais", name = "n", descriptor = "(I)V", line = 34)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ais", name = "j", descriptor = "(I)V", line = 34)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ais", name = "o", descriptor = "()I", line = 38)
	public int method13806() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ais", name = "t", descriptor = "(I)I", line = 38)
	public int method13808() {
		return this.anInt2079 * -1373670555;
	}
}
