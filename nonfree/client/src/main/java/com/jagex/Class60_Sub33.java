package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ajc")
public class Class60_Sub33 extends Class60 {

	@OriginalMember(owner = "client!ajc", name = "s", descriptor = "I")
	static final int anInt2037 = 255;

	@OriginalMember(owner = "client!ajc", name = "x", descriptor = "I")
	static final int anInt2038 = 0;

	@OriginalMember(owner = "client!ajc", name = "<init>", descriptor = "(Lclient!aht;)V", line = 11)
	public Class60_Sub33(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!ajc", name = "<init>", descriptor = "(ILclient!aht;)V", line = 15)
	public Class60_Sub33(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!ajc", name = "v", descriptor = "(I)V", line = 19)
	public void method14178() {
		if (this.anInt2079 * -1373670555 < 0 && this.anInt2079 * -1373670555 > 255) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ajc", name = "w", descriptor = "()V", line = 19)
	public void method14180() {
		if (this.anInt2079 * -1373670555 < 0 && this.anInt2079 * -1373670555 > 255) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!ajc", name = "h", descriptor = "()I", line = 23)
	@Override
	int method14602() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "y", descriptor = "()I", line = 23)
	@Override
	int method14606() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "u", descriptor = "()I", line = 23)
	@Override
	int method14605() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "p", descriptor = "(I)I", line = 23)
	@Override
	int method14603() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "x", descriptor = "()I", line = 23)
	@Override
	int method14607() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "b", descriptor = "()I", line = 23)
	@Override
	int method14615() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "s", descriptor = "()I", line = 23)
	@Override
	int method14604() {
		return 127;
	}

	@OriginalMember(owner = "client!ajc", name = "a", descriptor = "(IB)I", line = 27)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ajc", name = "c", descriptor = "(I)I", line = 27)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ajc", name = "z", descriptor = "(I)I", line = 27)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!ajc", name = "l", descriptor = "(IB)V", line = 31)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ajc", name = "j", descriptor = "(I)V", line = 31)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ajc", name = "n", descriptor = "(I)V", line = 31)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!ajc", name = "t", descriptor = "(B)I", line = 35)
	public int method14179() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajc", name = "o", descriptor = "()I", line = 35)
	public int method14181() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!ajc", name = "i", descriptor = "()I", line = 35)
	public int method14182() {
		return this.anInt2079 * -1373670555;
	}
}
