package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aim")
public class Class60_Sub19 extends Class60 {

	@OriginalMember(owner = "client!aim", name = "<init>", descriptor = "(Lclient!aht;)V", line = 8)
	public Class60_Sub19(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aim", name = "<init>", descriptor = "(ILclient!aht;)V", line = 12)
	public Class60_Sub19(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aim", name = "o", descriptor = "()V", line = 15)
	public void method13634() {
	}

	@OriginalMember(owner = "client!aim", name = "v", descriptor = "(B)V", line = 15)
	public void method13636() {
	}

	@OriginalMember(owner = "client!aim", name = "w", descriptor = "()V", line = 15)
	public void method13637() {
	}

	@OriginalMember(owner = "client!aim", name = "y", descriptor = "()I", line = 18)
	@Override
	int method14606() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "h", descriptor = "()I", line = 18)
	@Override
	int method14602() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "p", descriptor = "(I)I", line = 18)
	@Override
	int method14603() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "x", descriptor = "()I", line = 18)
	@Override
	int method14607() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "s", descriptor = "()I", line = 18)
	@Override
	int method14604() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "u", descriptor = "()I", line = 18)
	@Override
	int method14605() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "b", descriptor = "()I", line = 18)
	@Override
	int method14615() {
		return 0;
	}

	@OriginalMember(owner = "client!aim", name = "a", descriptor = "(IB)I", line = 22)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aim", name = "z", descriptor = "(I)I", line = 22)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aim", name = "c", descriptor = "(I)I", line = 22)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aim", name = "l", descriptor = "(IB)V", line = 26)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aim", name = "n", descriptor = "(I)V", line = 26)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aim", name = "j", descriptor = "(I)V", line = 26)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aim", name = "t", descriptor = "(B)I", line = 30)
	public int method13635() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aim", name = "i", descriptor = "()I", line = 30)
	public int method13638() {
		return this.anInt2079 * -1373670555;
	}
}
