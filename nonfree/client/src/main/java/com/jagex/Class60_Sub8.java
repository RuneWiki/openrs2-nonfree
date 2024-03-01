package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aib")
public class Class60_Sub8 extends Class60 {

	@OriginalMember(owner = "client!aib", name = "s", descriptor = "I")
	public static final int anInt1852 = 1;

	@OriginalMember(owner = "client!aib", name = "x", descriptor = "I")
	public static final int anInt1853 = 0;

	@OriginalMember(owner = "client!aib", name = "u", descriptor = "I")
	public static final int anInt1854 = 2;

	@OriginalMember(owner = "client!aib", name = "<init>", descriptor = "(Lclient!aht;)V", line = 13)
	public Class60_Sub8(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aib", name = "<init>", descriptor = "(ILclient!aht;)V", line = 17)
	public Class60_Sub8(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aib", name = "v", descriptor = "(B)V", line = 21)
	public void method13315() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aib", name = "o", descriptor = "()V", line = 21)
	public void method13316() {
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aib", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return this.aClass3_Sub45_36.aClass60_Sub10_2.method13371() && Class14_Sub5.method3350(this.aClass3_Sub45_36.aClass60_Sub10_2.method13373()) ? 1 : 0;
	}

	@OriginalMember(owner = "client!aib", name = "t", descriptor = "(I)Z", line = 30)
	public boolean method13311() {
		return true;
	}

	@OriginalMember(owner = "client!aib", name = "f", descriptor = "()Z", line = 30)
	public boolean method13314() {
		return true;
	}

	@OriginalMember(owner = "client!aib", name = "i", descriptor = "()Z", line = 30)
	public boolean method13317() {
		return true;
	}

	@OriginalMember(owner = "client!aib", name = "z", descriptor = "(I)I", line = 34)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "a", descriptor = "(IB)I", line = 34)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "c", descriptor = "(I)I", line = 34)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aib", name = "l", descriptor = "(IB)V", line = 38)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aib", name = "j", descriptor = "(I)V", line = 38)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aib", name = "n", descriptor = "(I)V", line = 38)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aib", name = "at", descriptor = "()I", line = 42)
	public int method13312() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aib", name = "w", descriptor = "(I)I", line = 42)
	public int method13313() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aib", name = "k", descriptor = "()I", line = 42)
	public int method13318() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aib", name = "af", descriptor = "()I", line = 42)
	public int method13319() {
		return this.anInt2079 * -1373670555;
	}
}
