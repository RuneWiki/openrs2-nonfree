package com.jagex;

import org.openrs2.deob.annotation.OriginalArg;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import org.openrs2.deob.annotation.Pc;

@OriginalClass("client!aio")
public class Class60_Sub21 extends Class60 {

	@OriginalMember(owner = "client!aio", name = "u", descriptor = "I")
	public static final int anInt1930 = 2;

	@OriginalMember(owner = "client!aio", name = "x", descriptor = "I")
	public static final int anInt1931 = 0;

	@OriginalMember(owner = "client!aio", name = "s", descriptor = "I")
	public static final int anInt1932 = 1;

	@OriginalMember(owner = "client!aio", name = "<init>", descriptor = "(Lclient!aht;)V", line = 12)
	public Class60_Sub21(@OriginalArg(0) Class3_Sub45 arg0) {
		super(arg0);
	}

	@OriginalMember(owner = "client!aio", name = "<init>", descriptor = "(ILclient!aht;)V", line = 16)
	public Class60_Sub21(@OriginalArg(0) int arg0, @OriginalArg(1) Class3_Sub45 arg1) {
		super(arg0, arg1);
	}

	@OriginalMember(owner = "client!aio", name = "w", descriptor = "()V", line = 20)
	public void method13686() {
		if (this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2 && this.anInt2079 * -1373670555 == 2) {
			this.anInt2079 = 1116833389;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aio", name = "v", descriptor = "(I)V", line = 20)
	public void method13687() {
		if (this.aClass3_Sub45_36.aClass60_Sub30_1.method13950() == 2 && this.anInt2079 * -1373670555 == 2) {
			this.anInt2079 = 1116833389;
		}
		if (this.anInt2079 * -1373670555 < 0 || this.anInt2079 * -1373670555 > 2) {
			this.anInt2079 = this.method14603() * 1116833389;
		}
	}

	@OriginalMember(owner = "client!aio", name = "p", descriptor = "(I)I", line = 25)
	@Override
	int method14603() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "h", descriptor = "()I", line = 25)
	@Override
	int method14602() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "x", descriptor = "()I", line = 25)
	@Override
	int method14607() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "y", descriptor = "()I", line = 25)
	@Override
	int method14606() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "b", descriptor = "()I", line = 25)
	@Override
	int method14615() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "s", descriptor = "()I", line = 25)
	@Override
	int method14604() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "u", descriptor = "()I", line = 25)
	@Override
	int method14605() {
		return 2;
	}

	@OriginalMember(owner = "client!aio", name = "a", descriptor = "(IB)I", line = 29)
	@Override
	int method14599(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aio", name = "c", descriptor = "(I)I", line = 29)
	@Override
	int method14608(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aio", name = "z", descriptor = "(I)I", line = 29)
	@Override
	int method14609(@OriginalArg(0) int arg0) {
		return 1;
	}

	@OriginalMember(owner = "client!aio", name = "l", descriptor = "(IB)V", line = 33)
	@Override
	void method14598(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aio", name = "j", descriptor = "(I)V", line = 33)
	@Override
	void method14610(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aio", name = "n", descriptor = "(I)V", line = 33)
	@Override
	void method14611(@OriginalArg(0) int arg0) {
		this.anInt2079 = arg0 * 1116833389;
	}

	@OriginalMember(owner = "client!aio", name = "p", descriptor = "(IIIIIIIB)V", line = 35)
	public static void method13693(@OriginalArg(0) int arg0, @OriginalArg(1) int arg1, @OriginalArg(2) int arg2, @OriginalArg(3) int arg3, @OriginalArg(4) int arg4, @OriginalArg(5) int arg5, @OriginalArg(6) int arg6) {
		@Pc(1) Class3_Sub7 local1 = null;
		for (@Pc(6) Class3_Sub7 local6 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32768(); local6 != null; local6 = (Class3_Sub7) Class3_Sub7.aClass553_15.method32709()) {
			if (local6.anInt1191 * -53574091 == arg0 && arg1 == local6.anInt1187 * -1303695121 && local6.anInt1184 * -2103701847 == arg2 && arg3 == local6.anInt1183 * 1349018393) {
				local1 = local6;
				break;
			}
		}
		if (local1 == null) {
			local1 = new Class3_Sub7();
			local1.anInt1191 = arg0 * 1473846301;
			local1.anInt1183 = arg3 * 1240877353;
			local1.anInt1187 = arg1 * 665189903;
			local1.anInt1184 = arg2 * 449344921;
			if (arg1 >= 0 && arg2 >= 0 && arg1 < client.aClass370_1.method26943() && arg2 < client.aClass370_1.method27062()) {
				Class534.method32526(local1);
			}
			Class3_Sub7.aClass553_15.method32702(local1);
		}
		local1.anInt1182 = arg4 * -1796345009;
		local1.anInt1189 = arg5 * 1753941885;
		local1.anInt1188 = arg6 * 2047985235;
		local1.aBoolean255 = true;
		local1.aBoolean256 = false;
	}

	@OriginalMember(owner = "client!aio", name = "t", descriptor = "(I)I", line = 37)
	public int method13688() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aio", name = "f", descriptor = "()I", line = 37)
	public int method13689() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aio", name = "o", descriptor = "()I", line = 37)
	public int method13690() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aio", name = "i", descriptor = "()I", line = 37)
	public int method13691() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aio", name = "k", descriptor = "()I", line = 37)
	public int method13692() {
		return this.anInt2079 * -1373670555;
	}

	@OriginalMember(owner = "client!aio", name = "re", descriptor = "(Lclient!vs;I)V", line = 7326)
	static final void method13695(@OriginalArg(0) Class536 arg0) {
		@Pc(12) int local12 = arg0.anIntArray496[(arg0.anInt5319 -= 312124549) * 960738381];
		@Pc(16) Class178 local16 = Class375.method27235(local12);
		arg0.anIntArray496[(arg0.anInt5319 += 312124549) * 960738381 - 1] = local16.anInt3519 * 492943859;
	}

	@OriginalMember(owner = "client!aio", name = "aqf", descriptor = "(Lclient!vs;I)V", line = 12021)
	static final void method13694(@OriginalArg(0) Class536 arg0) {
		arg0.anInt5319 -= 936373647;
		@Pc(13) int local13 = arg0.anIntArray496[arg0.anInt5319 * 960738381];
		@Pc(23) int local23 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 1];
		@Pc(33) int local33 = arg0.anIntArray496[arg0.anInt5319 * 960738381 + 2];
		Class586.method33284(8, local13 << 16 | local23, local33, "");
	}
}
