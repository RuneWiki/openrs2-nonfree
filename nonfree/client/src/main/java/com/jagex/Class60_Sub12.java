package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aif")
public class Class60_Sub12 extends Class60 {

	@OriginalMember(owner = "client!aif", name = "x", descriptor = "I")
	public static final int anInt1877 = 2;

	@OriginalMember(owner = "client!aif", name = "s", descriptor = "I")
	public static final int anInt1878 = 1;

	@OriginalMember(owner = "client!aif", name = "u", descriptor = "I")
	public static final int anInt1879 = 0;

	@OriginalMember(owner = "client!aif", name = "<init>", descriptor = "(Lclient!aht;)V", line = 13)
	public Class60_Sub12(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
		Class68.method14033(this.anInt2079 * -1373670555);
	}

	@OriginalMember(owner = "client!aif", name = "<init>", descriptor = "(ILclient!aht;)V", line = 18)
	public Class60_Sub12(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
		Class68.method14033(this.anInt2079 * -1373670555);
	}

	@OriginalMember(owner = "client!aif", name = "v", descriptor = "(I)V", line = 23)
	public void method13429() {
		if (this.aClass3_Sub45_36.method13003().method32852() < 245) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aif", name = "o", descriptor = "()V", line = 23)
	public void method13430() {
		if (this.aClass3_Sub45_36.method13003().method32852() < 245) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aif", name = "i", descriptor = "()V", line = 23)
	public void method13435() {
		if (this.aClass3_Sub45_36.method13003().method32852() < 245) {
			this.anInt2079 = 0;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aif", name = "y", descriptor = "()I", line = 28)
	@Override
	int method14606() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "s", descriptor = "()I", line = 28)
	@Override
	int method14604() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "u", descriptor = "()I", line = 28)
	@Override
	int method14605() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "p", descriptor = "(I)I", line = 28)
	@Override
	int method14603() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "b", descriptor = "()I", line = 28)
	@Override
	int method14615() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "x", descriptor = "()I", line = 28)
	@Override
	int method14607() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "h", descriptor = "()I", line = 28)
	@Override
	int method14602() {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 0 : 2;
	}

	@OriginalMember(owner = "client!aif", name = "k", descriptor = "()Z", line = 33)
	public boolean method13432() {
		return this.aClass3_Sub45_36.method13003().method32852() >= 245;
	}

	@OriginalMember(owner = "client!aif", name = "t", descriptor = "(B)Z", line = 33)
	public boolean method13434() {
		return this.aClass3_Sub45_36.method13003().method32852() >= 245;
	}

	@OriginalMember(owner = "client!aif", name = "f", descriptor = "()Z", line = 33)
	public boolean method13436() {
		return this.aClass3_Sub45_36.method13003().method32852() >= 245;
	}

	@OriginalMember(owner = "client!aif", name = "a", descriptor = "(IB)I", line = 38)
	@Override
	public int method14599(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aif", name = "c", descriptor = "(I)I", line = 38)
	@Override
	public int method14608(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aif", name = "z", descriptor = "(I)I", line = 38)
	@Override
	public int method14609(@OriginalArg(0) int arg0) {
		return this.aClass3_Sub45_36.method13003().method32852() < 245 ? 3 : 1;
	}

	@OriginalMember(owner = "client!aif", name = "l", descriptor = "(IB)V", line = 43)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
		Class68.method14033(this.anInt2079 * -1373670555);
	}

	@OriginalMember(owner = "client!aif", name = "n", descriptor = "(I)V", line = 43)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
		Class68.method14033(this.anInt2079 * -1373670555);
	}

	@OriginalMember(owner = "client!aif", name = "j", descriptor = "(I)V", line = 43)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
		Class68.method14033(this.anInt2079 * -1373670555);
	}

	@OriginalMember(owner = "client!aif", name = "w", descriptor = "(I)I", line = 48)
	public int method13431() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aif", name = "at", descriptor = "()I", line = 48)
	public int method13433() {
		return this.anInt2079 * -1373670555;
	}
}
