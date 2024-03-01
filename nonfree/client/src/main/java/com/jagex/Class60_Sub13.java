package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aig")
public class Class60_Sub13 extends Class60 {

	@OriginalMember(owner = "client!aig", name = "u", descriptor = "I")
	static final int anInt1884 = 4;

	@OriginalMember(owner = "client!aig", name = "s", descriptor = "I")
	static final int anInt1885 = 1;

	@OriginalMember(owner = "client!aig", name = "x", descriptor = "I")
	static final int anInt1886 = 0;

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub13(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aig", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub13(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aig", name = "v", descriptor = "(I)V", line = 20)
	public void method13458() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 4) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aig", name = "h", descriptor = "()I", line = 24)
	@Override
	int method14602() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "x", descriptor = "()I", line = 24)
	@Override
	int method14607() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "s", descriptor = "()I", line = 24)
	@Override
	int method14604() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "u", descriptor = "()I", line = 24)
	@Override
	int method14605() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "y", descriptor = "()I", line = 24)
	@Override
	int method14606() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "b", descriptor = "()I", line = 24)
	@Override
	int method14615() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "p", descriptor = "(I)I", line = 24)
	@Override
	int method14603() {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "t", descriptor = "(I)Z", line = 28)
	public boolean method13459() {
		return true;
	}

	@OriginalMember(owner = "client!aig", name = "a", descriptor = "(IB)I", line = 32)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "c", descriptor = "(I)I", line = 32)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "z", descriptor = "(I)I", line = 32)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aig", name = "j", descriptor = "(I)V", line = 36)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aig", name = "l", descriptor = "(IB)V", line = 36)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aig", name = "n", descriptor = "(I)V", line = 36)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aig", name = "w", descriptor = "(I)I", line = 40)
	public int method13460() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aig", name = "a", descriptor = "(B)V", line = 59)
	static void method13461() {
		Class3_Sub1_Sub11.aClass581_17.method33222();
		Class3_Sub1_Sub11.aClass546_11.method32620();
		Class3_Sub1_Sub11.aClass546_10.method32620();
	}
}
